SRC_URI = "https://github.com/ros-controls/ros_controllers/archive/${PV}.tar.gz;downloadfilename=ros_controllers-${PV}.tar.gz"
SRC_URI[md5sum] = "fbb5ec0cf5f7120438fe70353eb7cd98"
SRC_URI[sha256sum] = "ef5217c711a0de2ff3a6b97e6d9fbac9fc02cfbea2120e703c1217eda84c9f78"

S = "${WORKDIR}/ros_controllers-${PV}/${ROS_BPN}"

inherit catkin
