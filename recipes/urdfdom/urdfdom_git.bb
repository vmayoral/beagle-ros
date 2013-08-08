DESCRIPTION = "The URDF (U-Robot Description Format) library provides core data structures and a simple XML parsers for populating the class data structures from an URDF file."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;beginline=2;endline=2;md5=4899473e78369893d3ddc4a151717465"

DEPENDS = ""

SRC_URI = "git://github.com/vmayoral/urdfdom.git"

SRCREV = "${AUTOREV}"
PV = "1.0.0+gitr${SRCPV}"

S = "${WORKDIR}/git"

