DESCRIPTION = "Turtlesim tutorials, recipe for cross-compiling ROS package"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;md5=8891559d2aeb3b57ce150c57c8555241"

DEPENDS = "roscpp std-srvs qt4-embedded"

SRC_URI = "https://github.com/ros/ros_tutorials/archive/0.3.12.tar.gz"
SRC_URI[md5sum] = "ef7df23dd0c566b1052f0a1657bbc47a"

SRCREV = "0.3.12"
PV = "1.0.0+${SRCREV}"

S = "${WORKDIR}/ros_tutorials-0.3.12/turtlesim"

inherit catkin
