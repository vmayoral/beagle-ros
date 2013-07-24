DESCRIPTION = "Beginner_tutorials, talker/listener ROS package"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;md5=05c8b019cf5b0834bc5e547a14f26ca3"

DEPENDS = "roscpp catkin rospy std-msgs"
RDEPENDS = "roscpp rospy std-msgs"

SRC_URI = "git://github.com/vmayoral/beginner_tutorials.git"

SRCREV = "${AUTOREV}"
PV = "1.0.0+gitr${SRCPV}"

S = "${WORKDIR}/git"

inherit catkin
