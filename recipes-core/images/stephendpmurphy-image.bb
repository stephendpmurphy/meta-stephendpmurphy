SUMMARY = "A custom layer for setting my own Yocto config"

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

# Set a larger rootfs to 400MiB
IMAGE_OVERHEAD_FACTOR ?= "1.0"
IMAGE_ROOTFS_SIZE ?= "409600"

#include our custom app
IMAGE_INSTALL += "yocto-test-app"
