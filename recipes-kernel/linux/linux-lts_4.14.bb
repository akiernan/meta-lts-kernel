# Copyright (C) 2018 Nobuhiro Iwamatsu
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-4.14.y"

SRCREV = "672f07d8274ba5978be693710efd55f230777193"
LINUX_VERSION ?= "4.14.35"
PV = "${LINUX_VERSION}"
