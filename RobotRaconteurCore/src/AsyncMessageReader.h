// Copyright 2011-2018 Wason Technology, LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

#include "RobotRaconteur/Message.h"
#include <vector>
#include <queue>
#include <boost/shared_array.hpp>

#include "RobotRaconteur/AsyncMessageIO.h"

#pragma once

namespace RobotRaconteur
{
	class ROBOTRACONTEUR_CORE_API AsyncMessageReaderImpl : public AsyncMessageReader
	{
	public:
		enum state_type
		{
			//Read message
			Message_init = 0,
			Message_done,

			//Read header
			MessageHeader_init,
			MessageHeader_headersize,
			MessageHeader_flags,
			MessageHeader_protocolversionminor,
			MessageHeader_substream,
			MessageHeader_substreamseq1,
			MessageHeader_substreamseq2,
			MessageHeader_fragment1,
			MessageHeader_fragment2,
			MessageHeader_fragment3,
			MessageHeader_unreliableexp1,
			MessageHeader_unreliableexp2,
			MessageHeader_priority,
			MessageHeader_routing1,
			MessageHeader_routing2,
			MessageHeader_routing3,
			MessageHeader_routing4,
			MessageHeader_endpoint1,
			MessageHeader_endpoint2,
			MessageHeader_metainfo,
			MessageHeader_messageid1,
			MessageHeader_messageid2,
			MessageHeader_stringtable1,
			MessageHeader_stringtable2,
			MessageHeader_stringtable3,
			MessageHeader_entrycount,
			MessageHeader_transportspecific1,
			MessageHeader_transportspecific2,
			Message_readentries,

			//Read entry
			MessageEntry_init,
			MessageEntry_finishread,
			MessageEntry_entrysize,
			MessageEntry_entryflags,
			MessageEntry_entrytype,
			MessageEntry_servicepathstr,
			MessageEntry_servicepathcode,
			MessageEntry_membernamestr,
			MessageEntry_membernamecode,
			MessageEntry_entrystreamid,
			MessageEntry_requestid,
			MessageEntry_error,
			MessageEntry_metainfo,
			MessageEntry_timespec1,
			MessageEntry_timespec2,
			MessageEntry_elementcount,
			MessageEntry_readelements,

			//Read element
			MessageElement_init,
			MessageElement_elementsize,
			MessageElement_elementflags,
			MessageElement_elementnamestr,
			MessageElement_elementnamecode,
			MessageElement_elementnumber,
			MessageElement_elementtype,
			MessageElement_elementtypestr,
			MessageElement_elementtypecode,
			MessageElement_sequencenumber,
			MessageElement_metainfo,
			MessageElement_datacount,
			MessageElement_readdata,
			MessageElement_finishreaddata,
			//Read Data
			MessageElement_readarray1,
			MessageElement_readarray2,
			MessageElement_readstruct1,
			MessageElement_readstruct2,
			MessageElement_readstruct3,
			MessageElement_readvector1,
			MessageElement_readvector2,
			MessageElement_readvector3,
			MessageElement_readdictionary1,
			MessageElement_readdictionary2,
			MessageElement_readdictionary3,
			MessageElement_readmultiarray1,
			MessageElement_readmultiarray2,
			MessageElement_readmultiarray3,
			MessageElement_readlist1,
			MessageElement_readlist2,
			MessageElement_readlist3,
			MessageElement_readpod1,
			MessageElement_readpod2,
			MessageElement_readpod3,
			MessageElement_readpodarray1,
			MessageElement_readpodarray2,
			MessageElement_readpodarray3,
			MessageElement_readpodmultidimarray1,
			MessageElement_readpodmultidimarray2,
			MessageElement_readpodmultidimarray3,
			MessageElement_readnamedarrayarray1,
			MessageElement_readnamedarrayarray2,
			MessageElement_readnamedarrayarray3,
			MessageElement_readnamedarraymultidimarray1,
			MessageElement_readnamedarraymultidimarray2,
			MessageElement_readnamedarraymultidimarray3,
			//Read header string
			Header_readstring,

			//Version 2 pad
			MessageEntry_pad
			
		};			

		class state_data
		{
		public:
			state_type state;
			state_type pop_state;
			size_t limit;
			RR_SHARED_PTR<void> data;
			size_t param1;
			size_t param2;

			state_data();			
		};

	protected:
		uint16_t version;
		std::vector<state_data> state_stack;

		//Buffer to read headers
		boost::shared_array<uint8_t> buf;
		size_t buf_len;
		size_t buf_avail_pos;
		size_t buf_read_pos;		

		const_buffers other_bufs;
		
		std::queue<RR_SHARED_PTR<Message> > read_messages;

		size_t message_pos;		

	public:

		AsyncMessageReaderImpl();
        virtual ~AsyncMessageReaderImpl() {}

		size_t& message_len();

		state_type& state();		
		
		template<typename T>
		T* data()
		{
			return static_cast<T*>(state_stack.back().data.get());
		}
		
		size_t& param1();
		size_t& param2();

		size_t& limit();
		size_t distance_from_limit();

		void pop_state();
		void push_state(state_type new_state, state_type pop_state, size_t relative_limit, RR_SHARED_PTR<void> data, size_t param1 = 0, size_t param2 = 0);
				
		void prepare_continue(const const_buffers& other_buf, size_t& other_bufs_used);

		size_t available();
		bool read_all_bytes(void* p, size_t len);
		size_t read_some_bytes(void* p, size_t len);
		bool peek_byte(uint8_t& b);		
		template<typename T> bool read_number(T& number)	{ /*TODO: handle big endian*/ return read_all_bytes(&number, sizeof(T));	}
		bool read_uint_x(uint32_t& number);
		bool read_uint_x2(uint64_t& number);
		bool read_int_x(int32_t& number);
		bool read_int_x2(int64_t& number);
		bool read_string(std::string& str, state_type next_state);
		bool read_string(std::string& str); //next_state=state()++
		bool read_string3(std::string& str, state_type next_state);
		bool read_string3(std::string& str); //next_state=state()++
		
		virtual void Reset();
		virtual return_type Read(const const_buffers& other_bufs, size_t& other_bufs_used, size_t continue_read_len, mutable_buffers& next_continue_read_bufs);
		virtual return_type Read3(const const_buffers& other_bufs, size_t& other_bufs_used, size_t continue_read_len, mutable_buffers& next_continue_read_bufs);

		virtual bool MessageReady();
		virtual RR_SHARED_PTR<Message> GetNextMessage();

	};
}
