DESCRIPTION = "Official Open Asset Import Library Repository. Loads more than thirty 3D file formats into one unified and clean data structure."
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;beginline=3;endline=3;md5=0845b18c7c5e276a148b3f18486c1031"

#DEPENDS = "rospy std-msgs"

SRC_URI = "git://github.com/assimp/assimp"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

#inherit catkin
inherit cmake
