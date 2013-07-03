# Activate the pwm through the ehrpwm2B module in the BB.
#   Note: this probably won't work in the BBB

echo am33xx_pwm > /sys/devices/bone_capemgr.7/slots
echo bone_pwm_P8_13 > /sys/devices/bone_capemgr.7/slots
# 20000000= 0.02 seconds
echo 20000000 > /sys/devices/ocp.2/pwm_test_P8_13.9/period
# 10000000 = 0.01 seconds
echo 10000000 > /sys/devices/ocp.2/pwm_test_P8_13.9/duty
