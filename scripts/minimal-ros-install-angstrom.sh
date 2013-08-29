#!/bin/sh

#echo "updating the Angstrom feed to eu.feeds.angstrom-distribution..."
#echo "src/gz base http://eu.feeds.angstrom-distribution.org/feeds/v2012.12/ipk/eglibc/armv7a-vfp-neon/base" > /etc/opkg/base-feed.conf
#echo "updating the python feed to eu.feeds..."
#echo "src/gz python http://eu.feeds.angstrom-distribution.org/feeds/v2012.12/ipk/eglibc/armv7a-vfp-neon/python" > /etc/opkg/python-feed.conf

# update the feeds
opkg update

# Necessary packages:
opkg install python-core
#opkg install python-dev
#opkg install kernel-dev
#opkg install kernel-headers

# ROS related packages

opkg install catkin
opkg install rosbag
opkg install rosbash 
opkg install rosboost-cfg
opkg install rosbuild
opkg install rosclean
opkg install rosconsole
opkg install roscpp
opkg install roscpp-commonlisp
opkg install roscpp-serialization
opkg install roscpp-traits
opkg install roscreate
opkg install rosgraph
opkg install rosgraph-msgs
opkg install rosgraph-msgs-commonlisp
opkg install roslang
opkg install roslaunch
opkg install roslib
opkg install rosmake
opkg install rosmaster
opkg install rosmsg
opkg install rosnode
opkg install rosout
opkg install rospack
opkg install rosparam
opkg install rospy
opkg install rosservice
opkg install rostest
opkg install rostime
opkg install rostopic
opkg install rosunit
opkg install roswtf
opkg install python-rosdep 
opkg install python-rospkg
opkg install python-catkin-pkg
opkg install python-rosinstall

echo "Setting up the environment..."
cat passwd > /etc/passwd
echo "source .bashrc" >> ~/.bash_profile
cat bashrc >> ~/.bashrc
echo "127.0.0.1     beaglebone      beaglebone" >> /etc/hosts
touch /usr/.catkin

