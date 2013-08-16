#!/bin/sh

# Necessary packages:
opkg remove python-core --force-depends

# ROS related packages
opkg remove catkin --force-depends
opkg remove rosbag --force-depends
opkg remove rosbash  --force-depends
opkg remove rosboost-cfg --force-depends
opkg remove rosbuild --force-depends
opkg remove rosclean --force-depends
opkg remove rosconsole --force-depends
opkg remove roscpp --force-depends
opkg remove roscpp-commonlisp --force-depends
opkg remove roscpp-serialization --force-depends
opkg remove roscpp-traits --force-depends
opkg remove roscreate --force-depends
opkg remove rosgraph --force-depends
opkg remove rosgraph-msgs --force-depends
opkg remove rosgraph-msgs-commonlisp --force-depends
opkg remove roslang --force-depends
opkg remove roslaunch --force-depends
opkg remove roslib --force-depends
opkg remove rosmake --force-depends
opkg remove rosmaster --force-depends
opkg remove rosmsg --force-depends
opkg remove rosnode --force-depends
opkg remove rosout --force-depends
opkg remove rospack --force-depends
opkg remove rosparam --force-depends
opkg remove rospy --force-depends
opkg remove rosservice --force-depends
opkg remove rostest --force-depends
opkg remove rostime --force-depends
opkg remove rostopic --force-depends
opkg remove rosunit --force-depends
opkg remove roswtf --force-depends
opkg remove python-rosdep  --force-depends
opkg remove python-rospkg --force-depends
opkg remove python-catkin-pkg --force-depends
opkg remove python-rosinstall --force-depends
