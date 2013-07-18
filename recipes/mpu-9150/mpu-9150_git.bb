DESCRIPTION = "Bitbake recipe to cross-compile the Linux-MPU9150 driver"
LICENSE = "MIT"
DEPENDS = ""
LIC_FILES_CHKSUM = "file://LICENSE;beginline=5;endline=5;md5=f2bd7dd4be639edf8691f886da4aca19"

SRC_URI = "git://github.com/vmayoral/linux-mpu9150.git \
            file://patch/0001-Modifications-to-Makefile-cross-to-cross-compile-usi.patch;striplevel=0"

# Package Revision, Update this whenever you change the recipe.
PR = "r0"  
SRCREV = "${AUTOREV}"


S = "${WORKDIR}/git"

inherit autotools

do_configure () {
    export OETMP="/home/victor/Escritorio/GSOC/setup-scripts/build/tmp-angstrom_v2012_12-eglibc"
    ln -s Makefile-cross Makefile
}

do_compile () {
  make
}

#do_install () {
#  DESTDIR=${D} oe_runmake install
#}
