DESCRIPTION = "pluginlib_tutorials, recipe for cross-compiling ROS package"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;md5=2c7380f81b579591c828290e015a51e8"

DEPENDS = "roscpp pluginlib"
RDEPENDS = "roscpp pluginlib"

SRC_URI = "git://github.com/ros/common_tutorials.git;branch=hydro-devel"

SRCREV = "${AUTOREV}"
PV = "1.0.0+gitr${SRCREV}"

S = "${WORKDIR}/git/pluginlib_tutorials"

inherit catkin
