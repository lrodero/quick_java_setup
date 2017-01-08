Quick maven-based Java setup to be used:
* For quick experimentation of new ideas/technologies in new branches
* As the basis of _proper_ new Java/maven projects, by cloning this repo

The basic configuration is defined in `root/pom.xml`, which is intended to serve as a parent project. It includes dependencies to `Junit` and `log4j2`. `log4j2` configuration is located in `src/main/resources/log4j2.xml`. To change your project configuration (_e.g._ adding new dependencies) it is suggested to edit the project definition at `./pom.xml` and leave the parent project at `root/pom.xml` unchanged.

To execute main class (example):
```bash
$ mvn exec:java -Dexec.mainClass="org.lrodero.Experiment"
```

To run code style checker (results are in `target/site/checkstyle.html`):
```bash
$ mvn checkstyle:checkstyle
```

