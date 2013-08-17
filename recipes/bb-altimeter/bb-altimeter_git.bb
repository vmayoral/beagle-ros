DESCRIPTION = "ROS package for the BeagleBone that fetches the altimeter MPL3115A2 sensor information and publishes to a topic"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "rospy std-msgs"

SRC_URI = "git://github.com/vmayoral/bb_altimeter"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit catkin
