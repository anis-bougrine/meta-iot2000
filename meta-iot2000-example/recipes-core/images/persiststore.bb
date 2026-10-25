LICENSE = "MIT"

FILES_${PN} += "/data"

do_install:append () {
	install -d "${D}/data"
}
