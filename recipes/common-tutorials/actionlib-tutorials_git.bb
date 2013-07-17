DESCRIPTION = "actionlib_tutorials, recipe for cross-compiling ROS package"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;md5=5ddc79b852c682e8749cb298f8d98b8f"

DEPENDS = "roscpp actionlib message_generation std-msgs actionlib_msgs"
RDEPENDS = "roscpp actionlib message_runtime"

SRC_URI = "git://github.com/ros/common_tutorials.git;branch=hydro-devel"

SRCREV = "${AUTOREV}"
PV = "1.0.0+gitr${SRCREV}"

S = "${WORKDIR}/git/actionlib_tutorials"

inherit catkin
