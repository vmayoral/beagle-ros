DESCRIPTION = "This package contains generic definitions of geometric shapes and bodies. Shapes represent only the form of an object. Bodies are shapes at a particular pose. Routines such as point containment and ray intersections are provided."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "boost shape-msgs shape-tools octomap assimp libeigen2 libqhull console-bridge random-numbers eigen-stl-containers resource-retriever"

SRC_URI = "https://github.com/ros-planning/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9c248026c6886194318b086185852a40"
SRC_URI[sha256sum] = "9a537ebc9b82db1528e72e5220ea2a8d2b31ae0ac1eff514c9691102f929975e"

SRC_URI += "file://0001-test-CMakeLists-fix.patch;striplevel=1;name=patch"
SRC_URI[patch.md5sum] = "5c4cade8dbbea2c8266bdc7ef980451e"
SRC_URI[patch.sha256sum] = "ce1ff34eeba310a8df10f0e4a848e8e784819030d15b483254257e65e5d033d7"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
