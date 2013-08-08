DESCRIPTION = "The URDF (U-Robot Description Format) headers provides core data structure headers for URDF."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

SRC_URI = "https://github.com/ros-gbp/urdfdom_headers-release/archive/release/hydro/urdfdom_headers/${PV}.tar.gz;downloadfilename=${BP}.tar.gz"
SRC_URI[md5sum] = "421da4dd3c432697dc3ba8d8083300f1"
SRC_URI[sha256sum] = "63bcca7cf1eb123e59dc906f1718deb6310cb8c3303e15c232e2d25959147013"

S = "${WORKDIR}/urdfdom_headers-release-release-hydro-urdfdom_headers"

inherit catkin
