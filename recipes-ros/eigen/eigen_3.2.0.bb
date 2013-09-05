DESCRIPTION = "Eigen is a C++ template library for linear algebra: vectors, matrices, and related algorithms. It is versatile, fast, elegant and works on many platforms (OS/Compilers)."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING.BSD;md5=4899473e78369893d3ddc4a151717465"


SRC_URI = "hg://bitbucket.org/eigen/eigen;module=eigen;rev=${PV}"
SRC_URI[md5sum] = "ead8714d324df55c8e0b74a6b0b9acf7"
SRC_URI[sha256sum] = "dd57564d5273fba15fd7925b08459f03ebb0ce0d65e18e72877ce2d7810bf0d7"

S = "${WORKDIR}/${PN}"

SRC_URI += "file://in-source-build-allowed.patch;striplevel=1;name=patch"
SRC_URI[patch.md5sum] = "3f4af4f833044c287e17ba136f5c84c8"
SRC_URI[patch.sha256sum] = "2cace49c2d02dffb4648d8333db2716b21691c69a30fc68a4d10f317ee0d6e4a"

inherit cmake
