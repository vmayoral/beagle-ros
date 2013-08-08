DESCRIPTION = "This package contains a set of tools that can be used from a hard realtime thread, without breaking the realtime behavior.  The tools currently only provides the realtime publisher, which makes it possible to publish messages to a ROS topic from a realtime thread."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp rospy"

SRC_URI = "git://github.com/ros-controls/realtime_tools.git"

SRCREV = "${AUTOREV}"
PV = "1.0.0+gitr${SRCPV}"

S = "${WORKDIR}/git"

inherit catkin
