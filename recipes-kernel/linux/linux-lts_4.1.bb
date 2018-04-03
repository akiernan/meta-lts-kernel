# Copyright (C) 2018 Nobuhiro Iwamatsu
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-4.1.y"

SRCREV = "2d61e08a1024d0cf15c26889285004e46c9f0b14"
LINUX_VERSION ?= "4.1.51"
PV = "${LINUX_VERSION}"
