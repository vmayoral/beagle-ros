DESCRIPTION = "turtle_actionlib, recipe for cross-compiling ROS package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;md5=2ae5ecab1aa3baefe574ee44d91ec0b5"

DEPENDS = "roscpp actionlib \
            actionlib-msgs \
            angles \
            message-generation \
            rosconsole \
            roscpp \
            std-msgs \
            turtlesim"

RDEPENDS_${PN} = "actionlib actionlib-msgs \
            angles \
            message-runtime \
            rosconsole \
            roscpp \
            std-msgs \
            turtlesim"


require common-tutorials.inc
