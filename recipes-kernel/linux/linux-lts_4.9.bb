# Copyright (C) 2018 Nobuhiro Iwamatsu
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-4.9.y"

SRCREV = "eedaf21fb32353c81ea5eb7c910a1acd958523d1"
LINUX_VERSION ?= "4.9.95"
PV = "${LINUX_VERSION}"
