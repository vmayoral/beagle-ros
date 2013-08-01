DESCRIPTION = "Bitbake recipe to cross-compile the Linux-MPU9150 driver (https://github.com/Pansenti/linux-mpu9150)"
LICENSE = "MIT"
DEPENDS = ""
LIC_FILES_CHKSUM = "file://LICENSE;beginline=5;endline=5;md5=f2bd7dd4be639edf8691f886da4aca19"

SRC_URI = "git://github.com/vmayoral/linux-mpu9150.git \
            file://patch/0001-Modifications-to-Makefile-cross-to-cross-compile-usi.patch"

# Package Revision, Update this whenever you change the recipe.
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

do_configure () {
    export OETMP="/home/victor/Escritorio/GSOC/setup-scripts/build/tmp-angstrom_v2012_12-eglibc"
    ln -s Makefile-cross Makefile
}

do_compile () {
#    make 
    oe_runmake
}

do_install () {
     install -d ${D}${bindir}
     install -m 0755 imu ${D}${bindir}
     install -m 0755 imucal ${D}${bindir}
}
