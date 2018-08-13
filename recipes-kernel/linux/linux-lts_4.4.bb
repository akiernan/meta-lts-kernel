# Copyright (C) 2018 Nobuhiro Iwamatsu
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-4.4.y"

SRCREV = "8404ae6c8c9ff23a06cf38112e83002e1088bfe1"
LINUX_VERSION ?= "4.4.147"
PV = "${LINUX_VERSION}"
