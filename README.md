Quick maven-based Java setup to be used:
* For quick experimentation of new ideas/technologies in new branches
* As the basis of _proper_ new Java/maven projects, by cloning this repo

It includes dependencies to `Junit` and `log4j2`, with `log4j2` configuration in `src/main/resources/log4j2.xml`.

To execute main class (example):
```bash
$ mvn exec:java -Dexec.mainClass="org.lrodero.Experiment"
```

To run code style checker (results are in `target/site/checkstyle.html`):
```bash
$ mvn checkstyle:checkstyle
```

