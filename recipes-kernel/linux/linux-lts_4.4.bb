# Copyright (C) 2018 Nobuhiro Iwamatsu
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-4.4.y"

SRCREV = "9c6cd3f3a4b8194e82fa927bc00028c7a505e3b3"
LINUX_VERSION ?= "4.4.159"
PV = "${LINUX_VERSION}"
