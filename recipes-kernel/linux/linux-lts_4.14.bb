# Copyright (C) 2018 Nobuhiro Iwamatsu
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-4.14.y"

SRCREV = "e6abbe80c8838e9c0bdb51835e6218008fa49386"
LINUX_VERSION ?= "4.14.74"
PV = "${LINUX_VERSION}"
