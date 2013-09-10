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
| ros-mpu9150 | Ok| Ok. **Deprecated**|
| ros-bb-dc-motors | Ok| Ok. **Deprecated**|

    WIP: Work In Progress
    *Tested what compiles

Also some further work which is not in the scope of the GSOC:

| Recipe        | Status (cross-compilation)       | Test (BeagleBone) |
|:-------------:| ------------- | ------------ |
| **cmake-modules** | Ok| |
| **control-msgs** | Ok| |
| **control-toolbox** | Ok| |
| **realtime-tools** | Ok| |
| **robot-model** | collada-urdf and kdl-parser still with issues. | |
| **rosconsole-bridge** | Ok| |
| **ros-control** | Ok| |
| **ros-controllers** | Ok | |
| **tinyxml** | Ok| |
| **urdfdom** | Ok | |
| **urdfdom-headers** | Ok| |
| **assimp** | Ok| |
| **orocos-kdl** | Ok | |
| **python-orocos-kdl** | WIP| |
| **libqhull** | Ok | |
| **collada-dom** | Ok | |
| **eigen-stl-containers** | Ok | |
| **geometric-shapes** | Ok | |
| **libglu** | Ok | |
| **octomap** | Ok | |

    (bold): Packages out of the scope of the GSOC


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

