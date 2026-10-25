DESCRIPTION = "Tool to switch between the com port modes"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${IOT2000_MIT_LICENSE};md5=838c366f69b72c5df05c96dff79b35f2"

SRC_URI = "file://switchmode.c"

S = "${UNPACKDIR}"
INSTDIR = "/usr/bin/"

FILES:${PN} = "${INSTDIR}*"

do_compile() {
	${CC} ${CFLAGS} ${LDFLAGS} ${UNPACKDIR}/switchmode.c -o ${B}/switchserialmode
}

do_install() {
	install -d ${D}${INSTDIR}
	install -m 755 ${B}/switchserialmode ${D}${INSTDIR}
}
