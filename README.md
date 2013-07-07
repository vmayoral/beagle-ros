BEAGLE-ROS project
==================

This project is part of the Google Summer of Code (GSOC) 2013.
The aim is to work in the integration of the Robot Operative System (ROS) and the BeagleBone. Both ROS and the BeagleBone are great tools and increasingly being used in robotics. Having both of them working together in a easy way would be a great asset. A lot of users show their interest for ARM ROS integration. Some made a couple of tutorials about how to install ROS on Ubuntu on the BeagleBoard however this documentation is getting a bit old fashioned and probably not the right way. There's also some code to use lightweight versions of ROS but again, roboticists might not be looking for a light-ROS device but a fully functional one.

##Description of the files:

* LICENSE: License of the code.

* README.md: Readme document.

* scripts: Scripts to automate processes.

* docs: Documentation.

* lib: Libraries used.

* patches: Patches. 

* recipes: OpenEmbedded recipes.

* packages: ROS packages.

USAGE
=====

* Get an Angstrom distribution following http://www.angstrom-distribution.org/building-angstrom.

* Put the MLO, u-boot and FS in the SD card as explained in http://downloads.angstrom-distribution.org/demo/beaglebone/.

* Install all the packages for ROS in Angstrom sourcing `scripts/install-ros-angstrom.sh`.

* source `/usr/setup.bash`.

* run `roscore`.
    

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
