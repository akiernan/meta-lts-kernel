# Copyright (C) 2018 Nobuhiro Iwamatsu
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-4.9.y"

SRCREV = "eff40cb1908ba6ba604068d6273584fc28e3bac8"
LINUX_VERSION ?= "4.9.98"
PV = "${LINUX_VERSION}"
