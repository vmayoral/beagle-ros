DESCRIPTION = "ROS package for the BeagleBone that created a Node to control a DC motor. This package uses the adafruit-python-io library"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=68b329da9893e34099c7d8ad5cb9c940"

DEPENDS = "rospy std-msgs"

SRC_URI = "git://github.com/vmayoral/bb_dc_motors"

SRCREV = "${AUTOREV}"
PV = "1.0.0+gitr${SRCPV}"

S = "${WORKDIR}/git"

inherit catkin
