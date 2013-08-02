ros-mpu9150
===========

Bitbake recipe that cross-compiles the ros_mpu9150 ROS package. The `ros_mpu9150` publishes the Invensense MPU-9150 data into a ROS topic. Take a look at the [source code](https://github.com/vmayoral/ros-mpu9150)

This ROS package makes use of the [linux-mpu9150](https://github.com/Pansenti/linux-mpu9150) userspace driver. This driver can individually be installed using this [recipe](https://github.com/vmayoral/beagle-ros/tree/master/recipes/linux-mpu9150) or it can also be cross-compiled (or even natively compiled) using the instructions provided with the driver.

The recipe ships the following files:

* **random**: a simple example of a ROS node that creates random strings.

* **mpu9150_node**: The ROS node that publishes the MPU9150 data into the topic mpu9150_topic

* **accelcal.txt**: The accelerometer calibration file.

* **magcal.txt**: The magnetometer calibration file.

* **linux-mpu9150** (directory): The userspace driver of the MPU9150 code. The source can be compiled using the instructions provided at the README file.

##Usage:

```
Usage: ./mpu9150_node [options]                                                 
  -b <i2c-bus>          The I2C bus number where the IMU is. The default is 1 t.
  -s <sample-rate>      The IMU sample rate in Hz. Range 2-50, default 10.      
  -y <yaw-mix-factor>   Effect of mag yaw on fused yaw data.                    
                           0 = gyro only                                        
                           1 = mag only                                         
                           > 1 scaled mag adjustment of gyro data               
                           The default is 4.                                    
  -a <accelcal file>    Path to accelerometer calibration file. Default is ./act
  -m <magcal file>      Path to mag calibration file. Default is ./magcal.txt   
  -v                    Verbose messages                                        
  -h                    Show this help                                          
                                                                                
Example: ./mpu9150_node -b3 -s20 -y10                      
```
