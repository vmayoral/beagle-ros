DESCRIPTION = "control_msgs contains base messages and actions useful for controlling robots.  It provides representations for controller setpoints and joint and cartesian trajectories.."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=40e3d865780ec900fda526e6c2aef395"

DEPENDS = "message-generation std-msgs trajectory-msgs geometry-msgs actionlib-msgs"

SRC_URI = "https://github.com/ros-controls/control_msgs/archive/${PV}.tar.gz;downloadfilename=${BP}.tar.gz"
SRC_URI[md5sum] = "aeb714ca2cddc7d1a20a4bc67b0e1b10"
SRC_URI[sha256sum] = "7d7eb32a98dbb10ecca7de28dbfc403974966f0e5f435e9798e3277d1acbf77f"

S = "${WORKDIR}/control_msgs-${PV}/${ROS_BPN}"

inherit catkin
