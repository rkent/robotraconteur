// Copyright 2011-2019 Wason Technology, LLC
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

%rr_intrusive_ptr(RobotRaconteur::LogRecord)
%shared_ptr(RobotRaconteur::LogRecordHandler)
%shared_ptr(RobotRaconteur::FileLogRecordHandler)

%shared_ptr(RobotRaconteur::RobotRaconteurNode)

namespace RobotRaconteur
{
    %rename(WrappedRRLogRecord) RRLogRecord;
    class RRLogRecord
    {
    public:
        //boost::weak_ptr<RobotRaconteur::RobotRaconteurNode> Node;
        RR_PROPERTY(Node)
        %extend
        {
            boost::shared_ptr<RobotRaconteur::RobotRaconteurNode> GetNode()
            {
                return $self->Node.lock();
            }
            void SetNode(boost::shared_ptr<RobotRaconteur::RobotRaconteurNode> node)
            {
                $self->Node = node;
            }
        }
        RobotRaconteur_LogLevel Level;
        RobotRaconteur_LogComponent Component;
        std::string ComponentName;
        std::string ComponentObjectID;
        int64_t Endpoint;
        std::string ServicePath;
        std::string Member;
        std::string Message;
        boost::posix_time::ptime Time;
        std::string SourceFile;
        uint32_t SourceLine;
        std::string ThreadID;
        std::string FiberID;
    };
}