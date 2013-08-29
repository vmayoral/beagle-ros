DESCRIPTION = "Beginner_tutorials, talker/listener ROS package"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "roscpp catkin rospy std-msgs"
RDEPENDS_${PN} = "roscpp rospy std-msgs"

SRC_URI = "git://github.com/vmayoral/beginner_tutorials.git"

SRCREV = "${AUTOREV}"
PV = "1.0.0+gitr${SRCPV}"

S = "${WORKDIR}/git"

inherit catkin
