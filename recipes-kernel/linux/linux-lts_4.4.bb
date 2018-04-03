# Copyright (C) 2018 Nobuhiro Iwamatsu
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-4.4.y"

SRCREV = "8ff8cb8ec27effc5a0b04fee2c383b231a19f691"
LINUX_VERSION ?= "4.4.126"
PV = "${LINUX_VERSION}"
