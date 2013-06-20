BEAGLE-ROS project
==================

This project is part of the Google Summer of Code (GSOC) 2013.
The aim is to work in the integration of the Robot Operative System (ROS) and the BeagleBone. Both ROS and the BeagleBone are great tools and increasingly being used in robotics. Having both of them working together in a easy way would be a great asset. A lot of users show their interest for ARM ROS integration. Some made a couple of tutorials about how to install ROS on Ubuntu on the BeagleBoard however this documentation is getting a bit old fashioned and probably not the right way. There's also some code to use lightweight versions of ROS but again, roboticists might not be looking for a light-ROS device but a fully functional one.
Suggested by Koen Kooi (BeagleBoard forums) the meta-ros project looks quite promising. Their aim is to provide ROS in an OpenEmbedded Linux system and clearly they ask for coders and people interested which seems a great starting point.

USAGE
=====

Get an Angstrom distribution following http://www.angstrom-distribution.org/building-angstrom.

Put the MLO, u-boot and FS in the SD card as explained in http://downloads.angstrom-distribution.org/demo/beaglebone/.

source the ros-angstrom.sh.



ROADMAP
=======

Below the roadmap planned is presented (June 17th - September 17th):
-> Preparation weeks                    : Complete documentation required by GSOC, set up working environment (blog, code repositories, set up Angstrom in the Beaglebone, start getting familiar with the meta-ros code)
/////////////////////////////////////////////////////////////////////

* week 1 (17th June - 23rd June)       : Deploying and testing meta-ROS (goal: get rosping working).

* week 2 (24th June - 30th June)       : Deploying and testing meta-ROS: ROS Tutorials at http://www.ros.org/wiki/ROS/Tutorials  (from the 1-4, 5-end)

* week 3 (1st July - 7th July)         : Same. Address issues.

* week 4 (8th July - 14th July)        : Same.

* week 5 (15th July - 21st July)       : Same.

* week 6 (22nd July - 28th July)       : Get started with capes & ROS. There's no real need to rewrite drivers for ROS. Assuming that there're already drivers for the capes, it will be required just to publish that information to a ROS topic. In the following weeks I'm expecting one by one to create ROS interfaces to access the different capes.

* week 7 (29th July - 4th August)      : Audio Cape

* week 8 (5th August - 11th August)    : Same.

* week 9 (12th August - 18th August)   : Motors and IMU.

* week 10 (19th August - 25th August)  : Same. 

* week 11 (26th August - 1st Septemb)  : Documentation.

* week 12 (2nd Septemb - 8th Septemb)  : Documentation. Overall review. 

* week 13 (9th Septemb - 15th Septemb) : Overall review and analysis of the Beagle-ROS integration. 

    

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
