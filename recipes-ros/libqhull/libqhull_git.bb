DESCRIPTION = "Qhull is a general dimension convex hull program that reads a set of points from stdin, and outputs the smallest convex set that contains the points to stdout.  It also generates Delaunay triangulations, Voronoi diagrams, furthest-site Voronoi diagrams, and halfspace intersections about a point."
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING.txt;md5=4d4e8c0754b225e2c78cfdd911e8b09e"


SRC_URI = "git://github.com/manctl/qhull"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit cmake
