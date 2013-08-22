DESCRIPTION = "The package contains the Turtlesim tutorials. Turtlesim is a tool made for teaching ROS and ROS packages."

SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp std-srvs qt4-embedded roslib geometry-msgs"

#inherit qt4x11
require ros-tutorials.inc
