DESCRIPTION = "Beginner tutorials II, add two ints server/client ROS package"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;md5=a278f77eff1c03418afd9e581b64ff19"

DEPENDS = "roscpp"

SRC_URI = "https://github.com/vmayoral/beginner_tutorials2.git"

SRCREV = "${AUTOREV}"
PV = "1.0.0+gitr${SRCPV}"

S = "${WORKDIR}/git"

inherit catkin
