# Copyright (C) 2018 Nobuhiro Iwamatsu
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-4.9.y"

SRCREV = "04cd74a759bf381f8f2c12e9ddb5fe8d0651c483"
LINUX_VERSION ?= "4.9.99"
PV = "${LINUX_VERSION}"
