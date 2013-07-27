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

RDEPENDS = "actionlib actionlib_msgs \
            angles \
            message_runtime \
            rosconsole \
            roscpp \
            std_msgs \
            turtlesim"


require common-tutorials.inc
