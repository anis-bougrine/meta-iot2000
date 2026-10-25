#
# Common configuration for all MACHINES of the intel-quark type
#

DEFAULTTUNE ?= "i586-nlp-32"
require conf/machine/include/x86/tune-i586-nlp.inc
require conf/machine/include/x86/x86-base.inc

# gnutls padlock code uses CMOV instruction in assembly which
# is not valid for Quark.
EXTRA_OECONF:append:pn-gnutls-intel-quark = " --disable-padlock"
EXTRA_OECONF:append:pn-openssl-intel-quark = " no-asm"
