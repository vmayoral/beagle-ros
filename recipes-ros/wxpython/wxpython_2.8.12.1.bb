DESCRIPTION = "Python wxWidgets bindings"
SECTION = "devel/python"
LICENSE = "LGPLv2+"
LIC_FILES_CHKSUM = "file://${WORKDIR}/wxPython-src-${PV}/docs/licence.txt;md5=fe0b3b96f56813aa7819bff294868cb1"
#TODO deal with wxWidgets license exception

DEPENDS = "wxwidgets"
RDEPENDS_${PN} = "python-pycairo python-codecs python-netclient"
PR = "r0"

SRC_URI = "${SOURCEFORGE_MIRROR}/wxpython/wxPython-src-${PV}.tar.bz2"

SRC_URI[md5sum] = "8c06c5941477beee213b4f2fa78be620"
SRC_URI[sha256sum] = "1f3f153d9f1504c6ce2d2c4b23e940b8f58b81f4cba35cda1a5bb31142243cd0"

S = "${WORKDIR}/wxPython-src-${PV}/wxPython"

inherit pkgconfig distutils

EXTRA_BUILD = "BUILD_GLCANVAS=0 \
               BUILD_STC=0 \
               BUILD_GIZMOS=0 \
               WX_CONFIG=${STAGING_DIR_TARGET}${libdir}/wx/config/i586-poky-linux-gtk2-unicode-release-2.8"

EXTRA_INSTALL = "--root=${D} \
                 --prefix=${prefix} \
                 --install-lib=${PYTHON_SITEPACKAGES_DIR} \
                 --install-data=${datadir}"
#TODO make WX_CONFIG script name independent

do_compile() {
    sed -i 's|WXPREFIX\s*\=.*|WXPREFIX = "${D}"|' ${S}/config.py
    export STAGING_LIBDIR=${STAGING_LIBDIR}
    export STAGING_INCDIR=${STAGING_INCDIR}
    BUILD_SYS=${BUILD_SYS} HOST_SYS=${HOST_SYS} \
    ${STAGING_BINDIR_NATIVE}/python-native/python setup.py build ${EXTRA_BUILD}
}

do_install() {
    export STAGING_LIBDIR=${STAGING_LIBDIR}
    export STAGING_INCDIR=${STAGING_INCDIR}
    BUILD_SYS=${BUILD_SYS} HOST_SYS=${HOST_SYS} \
    ${STAGING_BINDIR_NATIVE}/python-native/python setup.py install ${EXTRA_BUILD} ${EXTRA_INSTALL}

    # Add a demo
    install -d ${D}${bindir}
    cp -r ${S}/demo ${D}${bindir}/demo
}
