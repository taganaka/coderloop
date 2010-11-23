PROG := answerofeverything
MCS := mcs

all: Main.cs

	${MCS} -optimize+ $< -out:${PROG}.exe
	echo "#!/bin/bash" > ${PROG}
	echo "exec mono ${PROG}.exe \$$@" >> ${PROG}
	chmod +x ${PROG}
clean:
	rm -f ${PROG}.exe ${PROG}
