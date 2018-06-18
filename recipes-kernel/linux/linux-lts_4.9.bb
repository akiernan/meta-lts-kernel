# Copyright (C) 2018 Nobuhiro Iwamatsu
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-4.9.y"

SRCREV = "8e52b94e19d82e2be4f3bf3699c8f39f4c6cc478"
LINUX_VERSION ?= "4.9.109"
PV = "${LINUX_VERSION}"
