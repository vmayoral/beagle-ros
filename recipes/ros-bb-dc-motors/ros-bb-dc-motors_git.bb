DESCRIPTION = "ROS package that publishes the Invensense MPU-9150 data into a topic"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=68b329da9893e34099c7d8ad5cb9c940"

DEPENDS = "rospy std-msgs"

SRC_URI = "git://github.com/vmayoral/ros_bb_dc_motors.git"

SRCREV = "${AUTOREV}"
PV = "1.0.0+gitr${SRCPV}"

S = "${WORKDIR}/git"

inherit catkin
