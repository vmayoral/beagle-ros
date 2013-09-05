DESCRIPTION = "Kinematics and Dynamics Library: Orocos project to supply RealTime usable kinematics and dynamics code, it contains code for rigid body kinematics calculations and representations for kinematic structures and their inverse and forward kinematic solvers."
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://manifest.xml;beginline=9;endline=9;md5=4899473e78369893d3ddc4a151717465"


SRC_URI = "https://github.com/smits/orocos-kdl-release/archive/release/hydro/orocos_kdl/${PV}.tar.gz;downloadfilename=${BP}.tar.gz"
SRC_URI[md5sum] = "ead8714d324df55c8e0b74a6b0b9acf7"
SRC_URI[sha256sum] = "dd57564d5273fba15fd7925b08459f03ebb0ce0d65e18e72877ce2d7810bf0d7"

S = "${WORKDIR}/orocos-kdl-release-release-hydro-orocos_kdl-${PV}"

#SRC_URI += "file://0001-CMakelists-urdf_parser-fix.patch;striplevel=1;name=patch"
#SRC_URI[patch.md5sum] = "3f4af4f833044c287e17ba136f5c84c8"
#SRC_URI[patch.sha256sum] = "2cace49c2d02dffb4648d8333db2716b21691c69a30fc68a4d10f317ee0d6e4a"

#inherit ros

inherit cmake
