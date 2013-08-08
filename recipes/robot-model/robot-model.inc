SRC_URI = "https://github.com/ros/robot_model/archive/${PV}.tar.gz;downloadfilename=robot_model-${PV}.tar.gz"
SRC_URI[md5sum] = "3891362268244bb87c9dfee358fc2c2b"
SRC_URI[sha256sum] = "3763a5dfd31f78118358e5c93dc583884cd76055fb5ed3772c3d3ffa6b27584e"

S = "${WORKDIR}/robot_model-${PV}/${ROS_BPN}"

inherit catkin
