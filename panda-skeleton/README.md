# Fordítás

A program fordításához a számítógépen szükséges telepített szoftverek listája:

* Oracle Java SE 8 JDK *VAGY* OpenJDK 8

## A szoftver fordításának lépései **Windows** operációs rendszeren:

* Nyissunk egy parancssort (`cmd.exe`), és navigáljunk a skeleton gyökérmappájába
* Adjuk ki a `gradlew distribute` parancsot, és várjunk a `BUILD SUCCESSFUL` felirat megjelenésére

## A szoftver fordításának lépései **Linux** operációs rendszeren:

* Nyissunk egy terminal-t, és navigáljunk a skeleton gyökérmappájába
* Adjuk ki a `./gradlew distribute` parancsot, és várjunk a `BUILD SUCCESSFUL` felirat megjelenésére

## Troubleshooting

* Linux operációs rendszeren a skeleton gyökérmappájában található `gradlew` nevű fájl futtatható
attribútummal kell, hogy rendelkezzen. Ha ez nem így van, a `chmod +x gradlew` paranccsal javítható
a probléma
* A `PATH` környezeti változó értékében fel kell sorolni a JDK `bin` mappáját
* A `JAVA_HOME` és `JDK_HOME` környezeti változók a JDK gyökérkönyvtárára kell, hogy mutassanak
* A fordításhoz szükség lehet működő internetkapcsolatra is

# Futtatás

A program Windows operációs rendszer esetén parancssori környezetben, Linux operációs rendszer
esetén terminal környezetben futtatható. A futtatáshoz navigáljunk a skeleton gyökérmappájában 
található `build/libs` mappába, és adjuk ki a `java -jar panda-skeleton.jar` parancsot.