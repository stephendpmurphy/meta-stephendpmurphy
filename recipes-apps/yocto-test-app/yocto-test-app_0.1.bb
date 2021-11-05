SUMMARY = "Custom app built by Yocto"
DESCRIPTION = "Test for pulling github source code and built into a custom yocto build"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# Where to find the source files (can be local, Github, etc)
SRC_URI = "git://github.com/stephendpmurphy/yocto-custom-app.git;branch=main"
SRCREV = "9e6990aefabb28ba9d03d1b6228da9dcd22e12b8"

# Where to keep the downloaded source files (tmp/work ...)
S = "${WORKDIR}/git"

# Pass arguments to linker
TARGET_CC_ARCH += "${LDFLAGS}"

inherit pkgconfig cmake
