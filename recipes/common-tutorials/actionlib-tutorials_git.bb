DESCRIPTION = "actionlib_tutorials, recipe for cross-compiling ROS package"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;md5=4c0f5c93b71a6885338434f5e5c2b466"

DEPENDS = "roscpp"

SRC_URI = "git://github.com/ros/common_tutorials/tree/hydro-devel/actionlib_tutorials;branch=hydro-devel"

SRCREV = "${AUTOREV}"
PV = "1.0.0+gitr${SRCREV}"

S = "${WORKDIR}/git/roscpp_tutorials"

inherit catkin
