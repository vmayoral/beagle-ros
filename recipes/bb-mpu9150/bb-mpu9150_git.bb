DESCRIPTION = "ROS package for the BeagleBone that publishes the Invensense MPU-9150 data into a topic"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "roscpp rospy std-msgs"
#RDEPENDS = "roscpp rospy std-msgs"

SRC_URI = "git://github.com/vmayoral/bb_mpu9150.git"

SRCREV = "${AUTOREV}"
PV = "1.0.0+gitr${SRCPV}"

S = "${WORKDIR}/git"

inherit catkin
