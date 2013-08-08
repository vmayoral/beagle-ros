DESCRIPTION = "control_msgs contains base messages and actions useful for controlling robots.  It provides representations for controller setpoints and joint and cartesian trajectories.."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=40e3d865780ec900fda526e6c2aef395"

DEPENDS = "message-generation std-msgs trajectory-msgs geometry-msgs actionlib-msgs"

SRC_URI = "git://github.com/ros-controls/control_msgs.git"

SRCREV = "${AUTOREV}"
PV = "1.0.0+gitr${SRCPV}"

S = "${WORKDIR}/git/control_msgs"

inherit catkin
