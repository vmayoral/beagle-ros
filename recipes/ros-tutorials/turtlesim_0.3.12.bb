DESCRIPTION = "Turtlesim tutorials, recipe for cross-compiling ROS package"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp std-srvs qt4-embedded"

SRC_URI = "https://github.com/ros/ros_tutorials/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "ef7df23dd0c566b1052f0a1657bbc47a"
SRC_URI[sha256sum] = "94ac9aa8b8186f36e7cb889001c3a96ee144a93e46f46e39e1b3730441085a69"

S = "${WORKDIR}/ros_tutorials-${PV}/${ROS_BPN}"

inherit catkin
