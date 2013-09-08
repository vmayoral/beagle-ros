DESCRIPTION = "The URDF (U-Robot Description Format) headers provides core data structure headers for URDF."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;beginline=2;endline=2;md5=4899473e78369893d3ddc4a151717465"

DEPENDS = ""

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d8b7dae7e3c19b290cf7d42f50f0cca0"
SRC_URI[sha256sum] = "6b1f27b002c6d897b43ed57988133f40aac093a2a6e84d9bf08ed36a13b401ae"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
