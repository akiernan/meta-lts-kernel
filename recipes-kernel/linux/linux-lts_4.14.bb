# Copyright (C) 2018 Nobuhiro Iwamatsu
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-4.14.y"

SRCREV = "fc72a4171174dd6b7ddefe5eeaa12cec9a162704"
LINUX_VERSION ?= "4.14.40"
PV = "${LINUX_VERSION}"
