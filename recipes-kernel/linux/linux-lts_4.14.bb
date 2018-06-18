# Copyright (C) 2018 Nobuhiro Iwamatsu
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-4.14.y"

SRCREV = "cda6fd4d9382205bb792255cd56a91062d404bc0"
LINUX_VERSION ?= "4.14.50"
PV = "${LINUX_VERSION}"
