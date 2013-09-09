DESCRIPTION = "wxWidgets is a cross platform application framework utilizing native widgets."
HOMEPAGE = "http://www.wxwidgets.org"

LICENSE = "wxWindows"
LIC_FILES_CHKSUM = "file://docs/licence.txt;md5=18346072db6eb834b6edbd2cdc4f109b"

DEPENDS = "webkit-gtk gstreamer gtk+ jpeg tiff libpng zlib expat libxinerama libglu"

SRC_URI = "${SOURCEFORGE_MIRROR}/wxwindows/wxWidgets-${PV}.tar.bz2"
SRC_URI[md5sum] = "e98c5f92805493f150656403ffef3bb0"
SRC_URI[sha256sum] = "b74ba96ca537cc5d049d21ec9ab5eb2670406a4aa9f1ea4845ea84a9955a6e02"

S = "${WORKDIR}/wxWidgets-${PV}"

inherit autotools pkgconfig binconfig

EXTRA_AUTORECONF = " -I ${S}/build/aclocal"
EXTRA_OECONF = " --without-sdl \
                 --with-opengl \
                 --enable-mediactrl=yes \
                 --enable-webviewwebkit=yes \
                 --disable-gpe \
                 --disable-visibility \
                 --disable-rpath \
               "

CXXFLAGS := "${@oe_filter_out('-fvisibility-inlines-hidden', '${CXXFLAGS}', d)}"

# Broken autotools :/
do_configure() {
   oe_runconf
}

# wx-config contains entries like this:
# this_prefix=`check_dirname "/build/v2013.06/build/tmp-angstrom_v2013_06-eglibc/work/cortexa8hf-vfp-neon-angstrom-linux-gnueabi/wxwidgets/2.9.5-r0/wxWidgets-2.9.5"`
do_install_prepend() {
   sed -i -e s:${S}:${STAGING_DIR_HOST}${prefix}:g ${S}/wx-config
}

# wx-config doesn't handle the suffixed libwx_media, xrc, etc, make a compat symlink
do_install_append() {
   for lib in adv aui core html media propgrid qa ribbon richtext stc webview xrc ; do
       ln -sf libwx_gtk2u_$lib-2.9.so.5.0.0 ${D}${libdir}/libwx_gtk2u_$lib-2.9.so
   done
}

SYSROOT_PREPROCESS_FUNCS = "wxwidgets_sysroot_preprocess"
wxwidgets_sysroot_preprocess () {
    sed -i -e 's,includedir="/usr/include",includedir="${STAGING_INCDIR}",g' ${SYSROOT_DESTDIR}${libdir}/wx/config/*
    sed -i -e 's,libdir="/usr/lib",libdir="${STAGING_LIBDIR}",g' ${SYSROOT_DESTDIR}${libdir}/wx/config/*
}

PACKAGESPLITFUNCS_prepend = " split_wxwidgets_packages "
python split_wxwidgets_packages () {
    libdir = d.expand('${libdir}')

    do_split_packages(d, libdir, '^libwx(.*)\.so\.*', 'libwx%s', 'wxWidgets %s library', extra_depends='', allow_links=True)
}

PACKAGESPLITFUNCS_append = " set_metapkg_rdepends "
python set_metapkg_rdepends () {
    import os

    pn = d.getVar('PN', True)
    metapkg = pn
    blacklist = [ pn, pn  '-locale', pn  '-dev', pn  '-dbg', pn  '-doc', pn  '-meta' ]
    metapkg_rdepends = []
    packages = d.getVar('PACKAGES', True).split()
    pkgdest = d.getVar('PKGDEST', True)
    for pkg in packages[1:]:
        if not pkg in blacklist and not pkg in metapkg_rdepends and not pkg.endswith('-dev') and not pkg.endswith('-dbg') and not pkg.count('locale') and not pkg.count('-staticdev'):
            # See if the package is empty by looking at the contents of its PKGDEST subdirectory. 
            # If this subdirectory is empty, then the package is.
            # Empty packages do not get added to the meta package's RDEPENDS
            pkgdir = os.path.join(pkgdest, pkg)
            if os.path.exists(pkgdir):
                dir_contents = os.listdir(pkgdir) or []
            else:
                dir_contents = []
            is_empty = len(dir_contents) == 0
            if not is_empty:
                metapkg_rdepends.append(pkg)
    d.setVar('RDEPENDS_'  metapkg, ' '.join(metapkg_rdepends))
    d.setVar('DESCRIPTION_'  metapkg, pn  ' meta package')
}

FILES_${PN} = "${bindir} ${libdir}/wx/config"
FILES_${PN}-dev = "${libdir}/wx/include ${datadir}/bakefile"
