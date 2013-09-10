DESCRIPTION = "This package provides a set of typedef's that allow using Eigen datatypes in STL containers."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

SRC_URI = "https://github.com/ros-gbp/eigen_stl_containers-release/archive/release/hydro/eigen_stl_containers/0.1.4-0.tar.gz"
SRC_URI[md5sum] = "21ee9025108b7f784269857f631f6e3f"
SRC_URI[sha256sum] = "95576fd37b2bdf6e61332e05d1bbcdf39092f045083a7cceabb2fe4993972b64"

S = "${WORKDIR}/eigen_stl_containers-release-release-hydro-eigen_stl_containers-0.1.4-0"

inherit catkin 
