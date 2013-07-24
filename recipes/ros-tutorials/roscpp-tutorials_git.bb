DESCRIPTION = "roscpp_tutorials, recipe to cross-compile ROS package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp"

SRC_URI = "git://github.com/ros-gbp/ros_tutorials-release.git;branch=release/hydro/roscpp_tutorials"

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin
