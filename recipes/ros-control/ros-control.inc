SRC_URI = "https://github.com/ros-controls/ros_control/archive/${PV}.tar.gz;downloadfilename=ros_control-${PV}.tar.gz"
SRC_URI[md5sum] = "f4d2b3a25817bfd988ac27bcf7ac8876"
SRC_URI[sha256sum] = "49d869d75ecaa76fecc27bbe043636bbb185d9bb65a1d454e68e77cec9ee1744"

S = "${WORKDIR}/ros_control-${PV}/${ROS_BPN}"

inherit catkin
