# Copyright (C) 2018 Nobuhiro Iwamatsu
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-4.9.y"

SRCREV = "cdd48f386d7e6671e7cc21e517ae258b298ec877"
LINUX_VERSION ?= "4.9.131"
PV = "${LINUX_VERSION}"
