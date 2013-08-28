DESCRIPTION = "TinyXML is a simple, small, C++ XML parser that can be easily integrated into other programs."
SECTION = "devel"
LICENSE = "zlib"
LIC_FILES_CHKSUM = "file://readme.txt;beginline=478;endline=478;md5=29dacac0a4e80cceba5575a58c425ab7"

DEPENDS = ""

SRC_URI = "git://github.com/vmayoral/tinyxml.git"

SRCREV = "${AUTOREV}"
PV = "1.0.0+gitr${SRCPV}"

S = "${WORKDIR}/git"

#inherit catkin
