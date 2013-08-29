Recipes:
==================

The following directories contain bitbake recipes for cross-compiling different ROS packages.

##Summary:

| Recipe        | Status (cross-compilation)       | Test (BeagleBone) |
|:-------------:| ------------- | ------------ |
| beginner-tutorials| Ok| Ok |
| ros-tutorials | Turtlesim doesn't cross-compile. Seems like findQT4 cmake macro is broken | Ok* |
| common-tutorials | turtle-actionlib doesn't cross-compile (turtlesim). | Ok*|
| linux-mpu9150 | Ok| Ok |
| bb-mpu9150 | Ok| Ok |
| bb-dc-motors | Ok| Ok |
| bb-sharp-ir | Ok| Ok|
| bb-altimeter | Ok| Code seems to work but there're some issues with the sensor data |
| **cmake-modules** | Ok| |
| **control-msgs** | Ok| |
| **control-toolbox** | Ok| |
| **realtime-tools** | Ok| |
| **robot-model** | WIP | |
| **rosconsole-bridge** | Ok| |
| **ros-control** | Ok| |
| **ros-controllers** | WIP | |
| **tinyxml** | Ok| |
| **urdfdom** | Ok | |
| **urdfdom-headers** | Ok| |
| ros-mpu9150 | Ok| Ok. **Deprecated**|
| ros-bb-dc-motors | Ok| Ok. **Deprecated**|

    *WIP: Work In Progress*
    *Tested what compiles
    **(bold): Packages out of the scope of the GSOC**


##Recipes list:

* **beginner-tutorials**: A simple talker/listerner ROS package written in python. ([code](https://github.com/vmayoral/beginner_tutorials), [docs](https://github.com/vmayoral/beginner_tutorials/blob/master/README.md))

* **ros-tutorials**: This package attempts to show the features of ROS step-by-step, including using messages, servers, parameters, etc. ([code](https://github.com/ros/ros_tutorials), [docs](http://ros.org/wiki/ros_tutorials))

* **common-tutorials**: common_tutorials: actionlib_tutorials | nodelet_tutorial_math | pluginlib_tutorials | turtle_actionlib. ([code](https://github.com/ros/common_tutorials), [docs](http://www.ros.org/wiki/common_tutorials))

* **linux-mpu9150**: recipe to cross-compile the Invensense MPU-9150 driver. ([code](https://github.com/Pansenti/linux-mpu9150))

* **bb-mpu9150**: recipe to cross-compile a ROS package that publishes the Invensense MPU-9150 data into a ROS Topic. ([code](https://github.com/vmayoral/bb_mpu9150))

* **bb-dc-motors**: recipe to cross-compile a ROS package that activates a DC motor on the BB using the adafruit's library. ([code](https://github.com/vmayoral/bb_dc_motors))

* **bb-sharp-ir**: recipe to cross-compile a ROS package that creates a node that harvest the data from the Sharp IR GP2Y0A21YK0F sensor and publishes it to a topic. ([code](https://github.com/vmayoral/bb_sharp_ir))

* **bb-altimeter**: recipe to cross-compile a bb_altimeter ROS package which publishes to altimeter MPL3115A2 values into a topic. ([code](https://github.com/vmayoral/bb_altimeter))

* **cmake-modules**: A common repository for CMake Modules which are not distributed with CMake but are commonly used by ROS packages. ([code](https://github.com/ros/cmake_modules))

* **control-msgs**: control_msgs contains base messages and actions useful for controlling robots.  It provides representations for controller setpoints and joint and cartesian trajectories. ([code](https://github.com/ros-controls/control_msgs.git))

* **control-toolbox**: The control toolbox contains modules that are useful across all controllers. ([code](https://github.com/ros-controls/control_toolbox/))

* **realtime-tools**:This package contains a set of tools that can be used from a hard realtime thread, without breaking the realtime behavior.  The tools currently only provides the realtime publisher, which makes it possible to publish messages to a ROS topic from a realtime thread. ([code](https://github.com/ros-controls/realtime_tools))

* **robot-model**: robot_model contains packages for modeling various aspects of robot information, specified in the Xml Robot Description Format (URDF). The core package of this stack is urdf, which parses URDF files, and constructs an object model (C++) of the robot. ([code](https://github.com/ros/robot_model.git))

* **rosconsole-bridge**: rosconsole_bridge is a package used in conjunction with console_bridge and rosconsole for connecting console_bridge-based logging to rosconsole-based logging. ([code](https://github.com/ros/rosconsole_bridge))

* **ros-control**: A set of packages that include controller interfaces, controller managers, transmissions, hardware_interfaces and the control_toolbox. ([code](https://github.com/ros-controls/ros_control.git))

* **ros-controller**: Library of ros controllers. ([code](https://github.com/ros-controls/ros_controllers.git))

* **tinyxml**: TinyXML is a simple, small, C++ XML parser that can be easily integrated into other programs.([code](git://github.com/vmayoral/tinyxml.git))

* **urdfdom**: The URDF (U-Robot Description Format) library provides core data structures and a simple XML parsers for populating the class data structures from an URDF file. ([code](https://github.com/ros/urdfdom/))

* **urdfdom-headers**: The URDF (U-Robot Description Format) headers provides core data structure headers for URDF. ([code](https://github.com/ros/urdfdom_headers))

-------
### Deprecated:

* **ros-mpu9150**: recipe to cross-compile a ROS package that publishes the Invensense MPU-9150 data into a ROS Topic. ([code](https://github.com/vmayoral/ros-mpu9150))

* **ros-bb-dc-motors**: recipe to cross-compile a ROS package that activates a DC motor on the BB using the adafruit's library. ([code](https://github.com/vmayoral/ros_bb_dc_motors))

------




##Installing the recipes
The easiest way to install the recipes is to `git clone` the beagle-ros code directly into the Angstrom `sources/` directory and add the beagle-ros as a layer:
* Edit `conf/bblayers.conf`
* add `${TOPDIR}/sources/beagle-ros \` to the `BASELAYERS` variable

It's also possible to add the recipes inside of the meta-ros code. There're instructions in https://github.com/vmayoral/beginner_tutorials/blob/master/README.md of how to put these recipes in the meta-ros file structure.

##Cross-compiling the recipes
From the `TOPDIR` of Angstrom run `bitbake <recipe-name>`. For example:
* `bitbake beginner-tutorials`
* `bitbake roscpp-tutorials`

