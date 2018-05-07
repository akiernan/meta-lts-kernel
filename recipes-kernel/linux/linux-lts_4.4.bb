# Copyright (C) 2018 Nobuhiro Iwamatsu
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-4.4.y"

SRCREV = "8719027e78c77c31d338c616265caeb25887cf84"
LINUX_VERSION ?= "4.4.131"
PV = "${LINUX_VERSION}"
