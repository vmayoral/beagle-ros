# This script installs ROS hydro from the cross-compiled packages stored at the "ipks"
# directory within the beagle-ros code.
#-----------------------------------------------------------
# Execute this script from the Beagle-ROS scripts/ directory
#-----------------------------------------------------------

echo ""
echo "Warning: This script will install a fixed verion of ROS and some functionalities might be outdated. Use the other scripts to get an updated installation."
echo ""

opkg install ../ipks/
opkg install ../ipks/catkin
opkg install ../ipks/rosbag*
opkg install ../ipks/rosbash* 
opkg install ../ipks/rosboost-cfg*
opkg install ../ipks/rosbuild*
opkg install ../ipks/rosclean*
opkg install ../ipks/rosconsole*
opkg install ../ipks/roscpp*
opkg install ../ipks/roscpp-commonlisp*
opkg install ../ipks/roscpp-serialization*
opkg install ../ipks/roscpp-traits*
opkg install ../ipks/roscreate*
opkg install ../ipks/rosgraph*
opkg install ../ipks/rosgraph-msgs*
opkg install ../ipks/rosgraph-msgs-commonlisp*
opkg install ../ipks/roslang*
opkg install ../ipks/roslaunch*
opkg install ../ipks/roslib*
opkg install ../ipks/rosmake*
opkg install ../ipks/rosmaster*
opkg install ../ipks/rosmsg*
opkg install ../ipks/rosnode*
opkg install ../ipks/rosout*
opkg install ../ipks/rospack*
opkg install ../ipks/rosparam*
opkg install ../ipks/rospy*
opkg install ../ipks/rosservice*
opkg install ../ipks/rostest*
opkg install ../ipks/rostime*
opkg install ../ipks/rostopic*
opkg install ../ipks/rosunit*
opkg install ../ipks/roswtf*
opkg install ../ipks/python-rosdep *
opkg install ../ipks/python-rospkg*
opkg install ../ipks/python-catkin-pkg*
opkg install ../ipks/python-rosinstall*
