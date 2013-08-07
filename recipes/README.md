Recipes:
==================

The following directories contain bitbake recipes for cross-compiling different ROS packages.

##Recipes list:

* **beginner-tutorials**: A simple talker/listerner ROS package written in python. ([code](https://github.com/vmayoral/beginner_tutorials), [docs](https://github.com/vmayoral/beginner_tutorials/blob/master/README.md))

* **ros-tutorials**: This package attempts to show the features of ROS step-by-step, including using messages, servers, parameters, etc. ([code](https://github.com/ros/ros_tutorials), [docs](http://ros.org/wiki/ros_tutorials))

* **common-tutorials**: common_tutorials: actionlib_tutorials | nodelet_tutorial_math | pluginlib_tutorials | turtle_actionlib. ([code](https://github.com/ros/common_tutorials), [docs](http://www.ros.org/wiki/common_tutorials))

* **linux-mpu9150**: recipe to cross-compile the Invensense MPU-9150 driver. ([code](https://github.com/Pansenti/linux-mpu9150))

* **bb-mpu9150**: recipe to cross-compile a ROS package that publishes the Invensense MPU-9150 data into a ROS Topic. ([code](https://github.com/vmayoral/bb_mpu9150))

* **bb-dc-motors**: recipe to cross-compile a ROS package that activates a DC motor on the BB using the adafruit's library. ([code](https://github.com/vmayoral/bb_dc_motors))

* **bb-sharp-IR**: recipe to cross-compile a ROS package that created a node that harvest the data from the Sharp IR GP2Y0A21YK0F sensor and publishes it to a topic. ([code](https://github.com/vmayoral/bb_sharp_IR))

-------
[ **These recipes are deprecated** ]

* **ros-mpu9150**: recipe to cross-compile a ROS package that publishes the Invensense MPU-9150 data into a ROS Topic. ([code](https://github.com/vmayoral/ros-mpu9150))

* **ros-bb-dc-motors**: recipe to cross-compile a ROS package that activates a DC motor on the BB using the adafruit's library. ([code](https://github.com/vmayoral/ros_bb_dc_motors))

##Installing the recipes
The easiest way to install the recipes is to `git clone` the beagle-ros code directly into the Angstrom `sources/` directory and add the beagle-ros as a layer:
* Edit `conf/bblayers.conf`
* add `${TOPDIR}/sources/beagle-ros \` to the `BASELAYERS` variable

It's also possible to add the recipes inside of the meta-ros code. There're instructions in https://github.com/vmayoral/beginner_tutorials/blob/master/README.md of how to put these recipes in the meta-ros file structure.

##Cross-compiling the recipes
From the `TOPDIR` of Angstrom run `bitbake <recipe-name>`. For example:
* `bitbake beginner-tutorials`
* `bitbake roscpp-tutorials`

LICENSE:
=======

The MIT License (MIT)

Copyright (c) 2013 Víctor Mayoral Vilches.
Mentored by Koen Kooi.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
