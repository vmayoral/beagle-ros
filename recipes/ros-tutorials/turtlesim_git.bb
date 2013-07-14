DESCRIPTION = "Beginner_tutorials, talker/listener ROS package"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;md5=aefb1cb30ddb164145ac0d90fdc34f61"

DEPENDS = "roscpp"

SRC_URI = "git://github.com/ros/ros_tutorials.git;branch=groovy-devel"

SRCREV = "${AUTOREV}"
PV = "1.0.0+gitr${SRCREV}"

S = "${WORKDIR}/git/turtlesim"

inherit catkin
