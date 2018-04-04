KBRANCH ?= "v4.1/standard/base"

require linux-lts_4.1.bb

# board specific branches
KBRANCH_qemuarm  ?= "v4.1/sstandard/arm-versatile-926ejs"
KBRANCH_qemuarm64 ?= "v4.1/sstandard/qemuarm64"
KBRANCH_qemumips ?= "v4.1/sstandard/mti-malta32"
KBRANCH_qemuppc  ?= "v4.1/sstandard/qemuppc"
KBRANCH_qemux86  ?= "v4.1/sstandard/base"
KBRANCH_qemux86-64 ?= "v4.1/sstandard/base"
KBRANCH_qemumips64 ?= "v4.1/sstandard/mti-malta64"

SRCREV_meta ?= "4e12cb8f8e06636f2058ea0ab3096ed38228a88b"
SRC_URI += "git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=yocto-4.1;destsuffix=${KMETA}"

KMETA = "kernel-meta"
KCONF_BSP_AUDIT_LEVEL = "2"

COMPATIBLE_MACHINE = "qemuarm|qemuarm64|qemux86|qemuppc|qemumips|qemumips64|qemux86-64"

# Functionality flags
KERNEL_EXTRA_FEATURES ?= "features/netfilter/netfilter.scc"
KERNEL_FEATURES_append = " ${KERNEL_EXTRA_FEATURES}"
KERNEL_FEATURES_append_qemuall=" cfg/virtio.scc"
KERNEL_FEATURES_append_qemux86=" cfg/sound.scc cfg/paravirt_kvm.scc"
KERNEL_FEATURES_append_qemux86-64=" cfg/sound.scc cfg/paravirt_kvm.scc"
KERNEL_FEATURES_append = " ${@bb.utils.contains("TUNE_FEATURES", "mx32", " cfg/x32.scc", "" ,d)}"
