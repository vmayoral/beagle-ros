DESCRIPTION = "Beginner_tutorials, talker/listener ROS package"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://ros_tutorials/package.xml;md5=485c8885ffa5f1575c970c0547a8c142"

DEPENDS = "roscpp"

SRC_URI = "git://github.com/ros/ros_tutorials.git"

SRCREV = "${AUTOREV}"
PV = "1.0.0+gitr${SRCREV}"

S = "${WORKDIR}/git/rospy_tutorials"

inherit catkin
