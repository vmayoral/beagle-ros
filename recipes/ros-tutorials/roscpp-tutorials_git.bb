DESCRIPTION = "roscpp_tutorials, recipe to cross-compile ROS package"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp"

SRC_URI = "git://github.com/ros/ros_tutorials.git;branch=groovy-devel"

SRCREV = "${AUTOREV}"
PV = "1.0.0+gitr${SRCREV}"

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin
