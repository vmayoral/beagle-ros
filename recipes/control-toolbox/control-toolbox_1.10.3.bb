DESCRIPTION = "The control toolbox contains modules that are useful across all controllers."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rosconsole tf roscpp angles message-generation \
            dynamic-reconfigure libtinyxml realtime-tools message-filters"

SRC_URI = "https://github.com/ros-controls/control_toolbox/archive/${PV}.tar.gz;downloadfilename=${BP}.tar.gz"
SRC_URI += "file://0001-crosscompile-CATKIN_ENABLE_TESTING-fix.patch;striplevel=1"

SRC_URI[md5sum] = "73ceaadbbcf2b8aa11aaaea7512bfeed"
SRC_URI[sha256sum] = "cbdb189d12f0907e846f774d81e234ce61492ee9df386dde98948ef29c8e1974"

S = "${WORKDIR}/control_toolbox-${PV}"

inherit catkin
