all:
	javac Answerofeverything.java
	echo "#!/bin/bash" > answerofeverything
	echo "java -cp ./ Answerofeverything \"\$$@"\" >> answerofeverything
	chmod +x answerofeverything
