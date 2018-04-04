KBRANCH ?= "v4.9/standard/base"

require linux-lts_4.9.bb

# board specific branches
KBRANCH_qemuarm  ?= "v4.9/sstandard/arm-versatile-926ejs"
KBRANCH_qemuarm64 ?= "v4.9/sstandard/qemuarm64"
KBRANCH_qemumips ?= "v4.9/sstandard/mti-malta32"
KBRANCH_qemuppc  ?= "v4.9/sstandard/qemuppc"
KBRANCH_qemux86  ?= "v4.9/sstandard/base"
KBRANCH_qemux86-64 ?= "v4.9/sstandard/base"
KBRANCH_qemumips64 ?= "v4.9/sstandard/mti-malta64"

SRCREV_meta ?= "0774eacea2a7d3a150594533b8c80d0c0bfdfded"
SRC_URI += "git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=yocto-4.9;destsuffix=${KMETA}"

KMETA = "kernel-meta"
KCONF_BSP_AUDIT_LEVEL = "2"

KERNEL_DEVICETREE_qemuarm = "versatile-pb.dtb"

COMPATIBLE_MACHINE = "qemuarm|qemuarm64|qemux86|qemuppc|qemumips|qemumips64|qemux86-64"

# Functionality flags
KERNEL_EXTRA_FEATURES ?= "features/netfilter/netfilter.scc"
KERNEL_FEATURES_append = " ${KERNEL_EXTRA_FEATURES}"
KERNEL_FEATURES_append_qemuall=" cfg/virtio.scc"
KERNEL_FEATURES_append_qemux86=" cfg/sound.scc cfg/paravirt_kvm.scc"
KERNEL_FEATURES_append_qemux86-64=" cfg/sound.scc cfg/paravirt_kvm.scc"
KERNEL_FEATURES_append = " ${@bb.utils.contains("TUNE_FEATURES", "mx32", " cfg/x32.scc", "" ,d)}"
