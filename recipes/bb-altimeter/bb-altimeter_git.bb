DESCRIPTION = "ROS package for the BeagleBone that fetches the altimeter MPL3115A2 sensor information and publishes to a topic"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=68b329da9893e34099c7d8ad5cb9c940"

DEPENDS = "rospy std-msgs"

SRC_URI = "git://github.com/vmayoral/bb_altimeter"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit catkin
