DESCRIPTION = "nodelet_tutorial_math, recipe for cross-compiling ROS package"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;md5=e9a21ae1da6f704b4933741142a12769"

DEPENDS = "roscpp"

SRC_URI = "git://github.com/ros/common_tutorials.git;branch=hydro-devel"

SRCREV = "${AUTOREV}"
PV = "1.0.0+gitr${SRCREV}"

S = "${WORKDIR}/git/nodelet_tutorial_math"

inherit catkin
