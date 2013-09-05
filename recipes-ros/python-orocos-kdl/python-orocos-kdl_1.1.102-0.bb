DESCRIPTION = "Orocos Kinematics and Dynamics Library (KDL) develops an application independent framework for modelling and computation of kinematic chains, such as robots, biomechanical human models, computer-animated figures, machine tools, etc. It provides class libraries for geometrical objects (point, frame, line,... ), kinematic chains of various families (serial, humanoid, parallel, mobile,... ), and their motion specification and interpolation.."
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://manifest.xml;beginline=9;endline=9;md5=4899473e78369893d3ddc4a151717465"


SRC_URI = "https://github.com/smits/orocos-kdl-release/archive/release/hydro/python_orocos_kdl/${PV}.tar.gz;downloadfilename=${BP}.tar.gz"
SRC_URI[md5sum] = "66398bd31b32f5ade7f46f4de0f28230"
SRC_URI[sha256sum] = "adc16d4f9194a3ed0b04c01824ea52e7dd86ec321af0e06549294d4e9b9d96b7"

#S = "${WORKDIR}/orocos_kdl-${PV}"
S = "${WORKDIR}/orocos-kdl-release-release-hydro-python_orocos_kdl-${PV}"

#SRC_URI += "file://0001-CMakelists-urdf_parser-fix.patch;striplevel=1;name=patch"
#SRC_URI[patch.md5sum] = "3f4af4f833044c287e17ba136f5c84c8"
#SRC_URI[patch.sha256sum] = "2cace49c2d02dffb4648d8333db2716b21691c69a30fc68a4d10f317ee0d6e4a"

#inherit ros

inherit cmake
