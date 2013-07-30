DESCRIPTION = "ROS package that publishes the Invensense MPU-9150 data into a topic"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=05c8b019cf5b0834bc5e547a14f26ca3"

DEPENDS = "roscpp rospy std-msgs"
#RDEPENDS = "roscpp rospy std-msgs"

SRC_URI = "git://github.com/vmayoral/ros-mpu9150"

#SRCREV = "${AUTOREV}"
#PV = "1.0.0+gitr${SRCPV}"

S = "${WORKDIR}/git"

inherit catkin
