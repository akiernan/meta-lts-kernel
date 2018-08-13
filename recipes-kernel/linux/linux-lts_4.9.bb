# Copyright (C) 2018 Nobuhiro Iwamatsu
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-4.9.y"

SRCREV = "8f21ecb4249a0914aea08bef1befca9019a3b44b"
LINUX_VERSION ?= "4.9.119"
PV = "${LINUX_VERSION}"
