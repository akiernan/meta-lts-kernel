# Copyright (C) 2018 Nobuhiro Iwamatsu
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-4.14.y"

SRCREV = "1aa1166efaceef8972045b4aa25e6e0ab96d8a30"
LINUX_VERSION ?= "4.14.62"
PV = "${LINUX_VERSION}"
