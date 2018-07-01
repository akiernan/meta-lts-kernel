# Copyright (C) 2018 Nobuhiro Iwamatsu
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-4.9.y"

SRCREV = "c806e0856941597f058b4a527d77dbc0000c513c"
LINUX_VERSION ?= "4.9.110"
PV = "${LINUX_VERSION}"
