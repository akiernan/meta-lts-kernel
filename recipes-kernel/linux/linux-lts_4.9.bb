# Copyright (C) 2018 Nobuhiro Iwamatsu
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-4.9.y"

SRCREV = "f080bba272b1e3f9bbf0b6c1acef3efaf16b631d"
LINUX_VERSION ?= "4.9.92"
PV = "${LINUX_VERSION}"
