DESCRIPTION = "The OctoMap library implements a 3D occupancy grid mapping approach. It provides data structures and mapping algorithms. The map is implemented using an Octree."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

SRC_URI = "https://github.com/ros-gbp/octomap-release/archive/release/hydro/octomap/1.6.1-0.tar.gz"
SRC_URI[md5sum] = "6d75597d760fc45187aca753dabaf691"
SRC_URI[sha256sum] = "8172c9cbfb915bdddfccec0e56ba14d20018346750ff006c96e1e665220f1bf0"

S = "${WORKDIR}/octomap-release-release-hydro-octomap-1.6.1-0"

inherit ros
inherit cmake
