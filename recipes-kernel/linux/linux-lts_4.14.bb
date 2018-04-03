# Copyright (C) 2018 Nobuhiro Iwamatsu
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-4.14.y"

SRCREV = "9a2e216d9e892249b63d10603c75495749202df9"
LINUX_VERSION ?= "4.14.32"
PV = "${LINUX_VERSION}"
