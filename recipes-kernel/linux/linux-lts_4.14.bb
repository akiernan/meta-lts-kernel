# Copyright (C) 2018 Nobuhiro Iwamatsu
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-4.14.y"

SRCREV = "7d6240f0fb85430ae4f490824fdf8d0a078dfcd2"
LINUX_VERSION ?= "4.14.39"
PV = "${LINUX_VERSION}"
