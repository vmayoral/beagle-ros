DESCRIPTION = "Hardware interface."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=e8e3efc45e752e4fbc6361c8b1a55689"

DEPENDS = "rostest roscpp hardware-interface urdfdom"

require ros-control.inc

SRC_URI += "file://0001-joint-limits-interface-CMakeLists-fix.patch;striplevel=2;name=patch"
SRC_URI[patch.md5sum] = "9001c9c5336587b00b15510445d63100"
SRC_URI[patch.sha256sum] = "e3708e8f5d974d8d386ea7c361fd568c297bba36c1e5f92ff49565f2fd529131"
