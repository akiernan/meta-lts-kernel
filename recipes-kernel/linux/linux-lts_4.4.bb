# Copyright (C) 2018 Nobuhiro Iwamatsu
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-4.4.y"

SRCREV = "dbb78762365d0e506110f50dd5a0b95d11e46bf8"
LINUX_VERSION ?= "4.4.128"
PV = "${LINUX_VERSION}"
