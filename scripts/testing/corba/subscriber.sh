#!/bin/bash
for i in $(eval echo "{1..$1}")
do
  bash /opt/jacorb-3.9/bin/jaco -cp "/opt/jacorb-3.9/lib/*:$PROJECT_HOME/target/classes" -DORBInitRef.NameService=corbaloc::$NAME_SERVICE_IP:2809/NameService -Dcustom.props=$PROJECT_HOME/config/orb.properties PublishSubscribe.SubscriberApp 0 99 100000 &
done
