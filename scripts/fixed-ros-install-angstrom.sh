# This script installs ROS hydro from the cross-compiled packages stored at the "ipks"
# directory within the beagle-ros code.

echo ""
echo "Warning: This script will install a fixed verion of ROS and some functionalities might be outdated. Use the other scripts to get an updated installation."
echo ""


opkg install ../ipks/
