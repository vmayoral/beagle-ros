DESCRIPTION = "The URDF (U-Robot Description Format) library provides core data structures and a simple XML parsers for populating the class data structures from an URDF file."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"
DEPENDS = ""

SRC_URI = "git://github.com/vmayoral/urdfdom.git"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit catkin

