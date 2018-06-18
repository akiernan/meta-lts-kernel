# Copyright (C) 2018 Nobuhiro Iwamatsu
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-4.4.y"

SRCREV = "0bd2bedb3501db249b347e5acbfd3415bd7667a5"
LINUX_VERSION ?= "4.4.138"
PV = "${LINUX_VERSION}"
