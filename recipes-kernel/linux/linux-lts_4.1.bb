# Copyright (C) 2018 Nobuhiro Iwamatsu
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-4.1.y"

SRCREV = "c4ff7514e71ddb85d05f262cd40f841f494775c8"
LINUX_VERSION ?= "4.1.52"
PV = "${LINUX_VERSION}"
