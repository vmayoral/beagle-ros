DESCRIPTION = "turtle_actionlib, recipe for cross-compiling ROS package"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;md5=2ae5ecab1aa3baefe574ee44d91ec0b5"

DEPENDS = "roscpp actionlib \
            actionlib_msgs \
            angles \
            message_generation \
            rosconsole \
            roscpp \
            std_msgs \
            turtlesim"

SRC_URI = "git://github.com/ros/common_tutorials.git;branch=hydro-devel"

SRCREV = "${AUTOREV}"
PV = "1.0.0+gitr${SRCREV}"

S = "${WORKDIR}/git/turtle_actionlib"

inherit catkin
