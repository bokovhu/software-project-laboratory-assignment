# 3. Analízis modell kidolgozása

## 3.1 Objektum katalógus

### 3.1.1 Hullám

A hullámot jellemzi az eredete (a hullám eredete egy csempe), a hullám típusa (csilingelés, sípolás, vagy álmosító sugárzás), illetve élettartama. A hullám élettartama egységnyi időnként csökken, és ha eléri a nullát, a hullám megszűnik létezni.

### 3.1.2 Panda

A panda tudja, hogy melyik csempén áll. Véletlenszerű időközönként egy szomszédos csempére próbál lépni, amennyiben ez lehetséges (nincs a kiválasztott szomszéd csempén útjában álló állat). A panda érzékszerveinek használatával képes a csempéjén érzékelhető hullámokra reagálni, és a hullám típusától és saját tulajdonságától függően megijedhet, ugorhat, vagy elmehet aludni. Ha a pandát már vezetik, akkor véletlenszerű mozgás helyett mindig az őt vezető állatot követi, azaz amikor az őt vezető állat mozog, ő a vezető állat által előzőleg elfoglalt csempére lép.

### 3.1.3 Orángután

Az orángután tudja, hogy melyik csempén áll, és amikor utasítják, egy kiválasztott szomszédos csempére lép át, amennyiben ez lehetséges. Ha az orángután olyan csempe felé mozdul, ahol áll panda, akkor megfogja a pandát. Ha az orángután meghal, vége a játéknak.

### 3.1.4 Csokiautomata

A csokiautomata egy csempére van telepítve, és a csokiautomata tisztában van pontos helyzetével. Véletlenszerű időközönként síphullámot gerjeszt az alatta lévő csempében, ami a csempe szomszédjaiig terjed. A csokiautomata nem tud mozogni.

### 3.1.5 Játékgép

A játékgép egy csempén van, és a játékgép úgy van bekonfigurálva, hogy tudja, melyik csempén. Véletlenszerű időközönként csilingel, azaz az alatta lévő csempében csilinghullámot gerjeszt, ami a csempe szomszédjaiig terjed. A játékgép nem tud mozogni.

### 3.1.6 Szekrény

A szekrény olyan tárgy, amelybe be lehet lépni és amiből ki lehet lépni. A szekrénynek van pontosan egy párja, ami szintén szekrény. A szekrénybe való belépés után az állat (panda vagy orángután) a párjából fog kilépni. 
A kilépés azt jelenti, hogy az állat arra a csempére lép, amelyen a szekrény áll.

### 3.1.7 Fotel

A fotel egy csempén van, és a fotel tudja, hogy melyiken. Egységnyi időnként próbálja csábítani a közelben lévő pandákat egy kis délutáni szunyókára úgy, hogy az alatta lévő csempében álmosító sugár segítségével a fáradékony pandák hatodik érzékére ható álmosító hullámot kelt, ami a csempe szomszédjaiig terjed. A fotel nem tud mozogni.

### 3.1.8 Csempe

A játéktér padlójának egy eleme. Egy időben lehet rajta 0 vagy 1 db állat (orángután vagy panda) és 0 vagy 1 db tárgy (csokiautomata, fotel, játékgép vagy szekrény).
A csempének tetszőleges számú szomszéd csempéje van (sokszög alakú csempék). Szomszéd csempe olyan, aminek közös oldala van a csempével.
Egy csempéről tudható, hogy az adott pillanatban milyen hullám(ok) hatása(i) érvényes(ek) rajta, azaz befolyásolhatják a rajta álló pandát.

### 3.1.9 Törékeny csempe

Olyan csempe, aminek van élettartama (kezdetben ez 20). Amikor rálépnek, vagy egy ijedős panda ugrik rajta egyet (amikor rajta tartózkodik és megijed), az élettartama csökken. Ha 0-ra csökken, a csempe összetörik.Az összetört csempére lépő állat meghal.

### 3.1.10 Bejárat

A bejárat olyan tárgy, amelyből ki lehet lépni. Az orángután itt lép be a pályára, miután a kijáraton kilépett. A bejárat egy csempén van.

### 3.1.11 Kijárat

A kijárat olyan tárgy, amelybe bele lehet lépni. Ha az orángután belelép, a vezetett pandái száma után megfelelő számú pont lesz jóváírva számára. A kijáratba belépés után az orángután a bejáraton lép ki.

```
[Az objektumkatalógus alapján kiindulva kell megalkotni az objektumorientált analízis modellt. A 3.2, 3.3, 3.4, 3.5 alfejezetek ugyanannak a modellnek a különböző nézetei, ezért egyidőben, egymással összefüggésben készülnek. Megtörténik az objektumkatalógusban tárgyalt objektumok felelősségének formalizálása osztályokká, attribútumokká, metódusokká . Csak publikus metódusok szerepelhetnek. Megjelennek az interfészek, az öröklés, az absztrakt osztályok. Segédosztályokra még nincs szükség.]
```

## 3.2 Statikus struktúra diagramok

```
[Az objektum katalógusban szereplő objektumokat megvalósító osztályok kapcsolatait és publikus metódusait bemutató osztálydiagram(ok). Tipikus hibalehetőségek: csillag-topológia, szigetek.]
```

## 3.3 Osztályok leírása

Osztályok:

* Animal (absztrakt) -- valami, ami tud mozogni
* Orángután: Animal
* Panda: Animal
* Tárgy(absztrakt)
* Interdimenzionális átjáró : Interface -- valami, amibe be lehet lépni és/vagy ki lehet lépni belőle
* Fotel: Tárgy
* Szekrény: Tárgy, Átjáró (oda-vissza megvalósítva)
* Csokiautomata: Tárgy
* Játékgép: Tárgy
* Bejárat: Tárgy, Átjáró (csak kilépésre)
* Kijárat: Tárgy, Átjáró (csak belépésre)
* Csempe
* Törékeny csempe: Csempe

### 3.3.1 Animal _(abstract)_

#### Felelősség

Egy állat. Az állatok mindig egy csempén állnak, és tudnak mozogni egy szomszédos csempére. Az állatok csak akkor tudnak egyik csempéről mozogni a másikra, ha a másik csempén éppen semmilyen állat sem tartózkodik. Az különböző állatok különbözőféleképpen reagálnak egy másik állattal való összeütközésre.

#### Ősosztályok

-

#### Interfészek

* `Updatable`

#### Attribútumok

* `Tile standingOn`: Az a csempe, amin az állat éppen áll
* `Animal leaderAnimal`: Az állatot vezető állat.
* `Animal guidedAnimal`: Az az állat, amit ez az állat vezet.

#### Metódusok

* `void update()`: Az `Updatable` interface-ből származó függvény implementációja
* `void collideWithPanda (Animal panda)`: Egy pandával való ütközést kezel
* `void collideWithOrangutan (Animal orangutan)`: Egy orángutánnal való ütközést kezel
* `void kill ()`: Megöli az állatot. Ekkor az állat egyben meg is szűnik létezni.
* `void startLeading (Animal leader)`: Az adott állatot a paraméterként kapott állat elkezdi vezetni
* `void stopLeading ()`: Az adott állat elveszti vezetőjét

### 3.3.2 Tile

#### Felelősség

Egy csempe az emeleten. A csempéken egy időben állhat pontosan egy állat, és egy tárgy. A csempét jellemzi a “rongáltsága”, mely törékeny csempék esetén minden körben, amikor egy állat rálép az adott csempére csökken, illetve akkor is csökken, ha a csempén egy panda ugrik.

#### Ősosztályok

-

#### Interfészek

-

#### Attribútumok

* `Tile [] neighbours`: A csempével szomszédos csempék (azok a csempék, amikre erről a csempéről lehet mozogni)
* `boolean isFragile`: Megadja, hogy törékeny-e az adott csempe
* `int life`: A csempe hátralévő életét (a rongáltság inverze) adja meg. Ha eléri a nullát, a csempe összetört, és minden rálépő állat meghal.
* `Wave [] waves`: A csempén jelenleg érzékelhető hullámok

#### Metódusok

* `boolean accept (Animal animal)`: A paraméterként kapott állatot próbálja “befogadni”. Amennyiben a csempén éppen nem tartózkodik állat, a bemenet állatot átmozgatja erre a csempére, és IGAZ értékkel tér vissza. Ellenkező esetben a mozgás nem történik meg, és HAMIS értékkel tér vissza.
* `spawnWave (Wave wave)`: A paraméterként kapott hullámot közvetíti a szomszédos csempékre

### 3.3.3 Wave

#### Felelősség

Egy érzékelhető hullám. A hullámokat a pandák tudják érzékelni érzékszerveik segítségével, és attól függően vált ki belőlük bizonyos reakciót, hogy a pandák milyen tulajdonsággal rendelkeznek.

#### Ősosztályok

-

#### Interfészek

* `Updatable`

#### Attribútumok

* `Tile origin`: Az a csempe, ahonnan a hullám ered
* `WaveType type`: Megadja a hullám típusát (a panda a különböző típusú hullámokra másképp reagál)
* `int life`: Megadja a hullám “életét”. Egységidőnként csökken eggyel, és ha eléri a nullát, a hullám megszűnik létezni.

#### Metódusok

-

### 3.3.4 Updatable _(interface)_

#### Felelősség

A frissíthető dolgokat egységidőnként frissíti a `Timer`.

#### Ősosztályok

-

#### Interfészek

-

#### Attribútumok

-

#### Metódusok

* `void update()`: Frissíti az adott dolgot

### 3.3.5 WaveType _(enum)_

#### Felelősség

A hullámok lehetséges típusai.

#### Ősosztályok

-

#### Interfészek

-

#### Attribútumok

* `RINGING`: Az adott hullám egy játékgéptől eredő csillingelés
* `BEEPING`: Az adott hullám egy csokiautomatától eredő sípolás
* `SLEEPING`: Az adott hullám egy foteltől eredő álmosító hullám

#### Metódusok

-

### 3.3.6 PandaTrait _(enum)_

#### Felelősség

A pandák lehetséges tulajdonságainak felsorolása.

#### Ősosztályok

-

#### Interfészek

-

#### Attribútumok

* `COWARD`: A panda egy _ijedős_ panda, azaz a játékgép csillingelésére megijed.
* `JUMPY`: A panda egy _ugrálós_ panda, azaz a csokiautomata sípolására ugrik egyet.
* `SLEEPY`: A panda egy _fáradékony_ panda, azaz ha egy elfoglalatlan fotel közelébe érkezik, ledől oda aludni.

#### Metódusok

-

### 3.3.7 Portal

#### Felelősség

Egy átjáró. Az átjáró össze van kötve egy másik átjáróval, és minden átjáróhoz hozzá van rendelve az a csempe, ahol az átjáró van. Az átjárók segítségével lehet nem feltétlenül szomszédos csempére mozogni. A kijáraton és bejáraton találhatóak átjárók, melyek össze vannak kötve, így amikor egy állat kimegy a kijáraton, a bejáraton jelenik meg. A szekrényekben is van egy-egy átjáró, ezek a szekrény párjában lévő átjáróval vannak összekötve.

#### Ősosztályok

-

#### Interfészek

-

#### Attribútumok

* `Tile place`: Az a csempe, ahol az átjáró van
* `Portal otherEnd`: Az átjáró másik vége

#### Metódusok

* `void enter (Animal animal)`: Átmozgatja az állatot az átjáró másik végén található csempére

### 3.3.8 Item _(abstract)_

#### Felelősség

Egy, az emeleten elhelyezett _tárgy_. Minden tárgy az emelet valamely csempéjén van. Az állatok képesek a tárgyakat használni. Bizonyos tárgyak maguktól csinálnak dolgokat véletlenszerű időközönként.

#### Ősosztályok

-

#### Interfészek

* `Updatable`

#### Attribútumok

* `Tile placedOn`: Az a csempe, ahová a tárgy el van helyezve

#### Metódusok

* `void update ()`: Az `Updatable` interface-ből származó függvény implementációja. Lévén, hogy a tárgy egy nagyon általános fogalom, az alapértelmezett implementációja a függvénynek nem csinál semmit.
* `void use (Animal user)`: Arra való, hogy egy állat "használja" (interakcióba lépjen) az adott tárggyal. A függvény egyetlen paramétere a használó állat

### 3.3.9 Wardrobe

#### Felelősség

Egy szekrény. A szekrényeket jellemzi színük, minden színből pontosan kettő szekrény található a pályán. Amikor egy állat interakcióba lép egy szekrénnyel, az állat a szekrény ugyanolyan színű párjánál jelenik meg.

#### Ősosztályok

* `Item`

#### Interfészek

* `Updatable`

#### Attribútumok

* `Portal portal`: A szekrényhez tartozó átjáró. Az átjáró másik oldala az azonos színű szekrényben van.
* `int color`: A szekrény színe

#### Metódusok

* `void use (Animal user)`: A használó állatot átküldi az átjáróján.

### 3.3.10 GameMachine

#### Felelősség

Egy játékgép. A játékgép véletlenszerű időközönként csillingel, ekkor egy `RINGING` típusú hullámot kelt a csempéjében.

#### Ősosztályok

* `Item`

#### Interfészek

* `Updatable`

#### Attribútumok

-

#### Metódusok

* `void update ()`: Véletlenszerű időközönként `RINGING` típusú hullámot kelt a csempéjében.

### 3.3.11 ChocolateVendingMachine

#### Felelősség

Egy csokiautomata. A csokiautomata véletlenszerű időközönként sípol, ekkor egy `BEEPING` típusú hullámot kelt a csempéjében.

#### Ősosztályok

* `Item`

#### Interfészek

* `Updatable`

#### Attribútumok

-

#### Metódusok

* `void update ()`: Véletlenszerű időközönként `BEEPING` típusú hullámot kelt a csempéjében.

### 3.3.12 Couch

#### Felelősség

Egy fotel. A fotel folyamatosan `SLEEPING` típusú hullámokat kelt a csempéjében, ezzel csalogatva a közelben lévő pandákat. Egy panda akkor tud a fotelbe lefeküdni aludni, ha a fotel nincs még elfoglalva. Ha a fotel már el van foglalva, a fotel nem kelt semmilyen hullámot.

#### Ősosztályok

* `Item`

#### Interfészek

* `Updatable`

#### Attribútumok

* `Panda sleepingPanda`: A jelenleg a fotelben alvó panda.

#### Metódusok

* `void update ()`: Minden híváskor `SLEEPING` típusú hullámot kelt a csempéjében, amennyiben még nem alszik panda benne. Ha már alszik egy panda a fotelben, a függvény nem csinál semmit.

### 3.3.13 Panda

#### Felelősség

Egy panda. A pandák véletlenszerűen mozognak az emeleten, egészen addig, amíg egy állat el nem kezdi vezetni őket. Ezután követik a vezetőjüket. A pandák képesek reagálni a csempéjükön érzékelhető hullámokra annak függvényében, hogy milyen tulajdonsággal rendelkeznek. A (fáradékony) pandák le tudnak feküdni egy fotelbe aludni, ezután nem ébreszthetőek fel.

#### Ősosztályok

* `Animal`

#### Interfészek

* `Updatable`

#### Attribútumok

* `PandaTrait trait`: A panda tulajdonsága. Ez határozza meg, hogy az egyes hullámokra miként reagál egy adott panda.
* `Couch sleepingIn`: Az a fotel, ahol a panda éppen alszik.

#### Metódusok

* `boolean reactToWave (Wave wave)`: Reagál egy adott hullámra. _IGAZ_ értékkel tér vissza, ha a tulajdonságai függvényében az adott panda valóban reagál a hullámra, _HAMIS_ értékkel, ha nem. A reakció okozta állapotváltozás is ebben a függvényben realizálódik (azaz ebben a függvényben ijed meg, ugrik, vagy tér nyugovóra a panda).
* `void collideWithPanda (Animal panda)`: Egy másik pandával való összeütközést kezel. A függvény semmit sem teszt, hiszen csak az orángutánnal való ütközés generál állapotváltozást.
* `void collideWithOrangutan (Animal orangutan)`: Egy orángutánnal való összeütközést kezel. Ekkor a `leaderAnimal` az adott orángután lesz, az orángután által előzőleg vezetett állat lesz a `guidedAnimal`, és a `guidedAnimal` `leaderAnimal`-ja lesz ez a panda.

### 3.3.14 Orangutan

#### Felelősség

Egy orángután. Az orángutánt a játékos irányítja. Az orángután egy pandával való összeütközéskor elkezdi vezetni az ütközött pandát.

#### Ősosztályok

* `Animal`

#### Interfészek

* `Updatable`

#### Attribútumok

-

#### Metódusok

TODO: Itt kérdéses, hogy kell-e bármilyen függvényt felülírni.

### 3.3.15 ExitTile

#### Felelősség

Egy kijárati csempe. Ezen a csempén található egy átjáró, és amikor egy állat rálép erre a csempére, az adott állat a bejárati csempén jelenik meg. A rálépő állat által vezetett állatláncért a játékos pontokat szerez, és az orángutánon kívül az összes vezetett állat a láncban megmenekül.

#### Ősosztályok

* `Tile`

#### Interfészek

-

#### Attribútumok

* `Portal portal`: A bejárati csempére vezető átjáró. Az átjáró másik oldala a bejárati csempén van, de a bejárati csempe azt az átjárót nem ismeri, így ez implicit módon egy "egyirányú" átjáró.

#### Metódusok

* `boolean accept (Animal animal)`: Mindig _IGAZ_ értékkel tér vissza. A rálépő állat vezetett láncáért pontokat ad a játékosnak, és a lépett állatot beviszi az átjárójába.

### 3.3.16 Level

#### Felelősség

Az emelet. Az emeleten csempék találhatóak.

#### Ősosztályok

-

#### Interfészek

-

#### Attribútumok

* `Tile [] tiles`: Az emeleten található csempék
* `Tile startTile`: A bejárat csempe
* `ExitTile exitTile`: A kijárat csempe

#### Metódusok

-

## 3.4 Szekvencia diagramok

```
[Inicializálásra, use-case-ekre, belső működésre. Konzisztens kell legyen az előző alfejezettel. Minden metódus, ami ott szerepel, fel kell tűnjön valamelyik szekvenciában. Minden metódusnak, ami szekvenciában szerepel, szereplnie kell a valamelyik osztálydiagramon. Fontos, hogy az aktor use-case-eitől bármelyik diagramhoz el lehessen jutni a metódushívások követésével.]
```

## 3.5 State-chartok

```
[Csak azokhoz az osztályokhoz, ahol van értelme. Egyetlen állapotból álló state-chartok ne szerepeljenek. A játék működését bemutató state-chart-ot készíteni tilos.]
```

## 3.6 Napló

| Kezdet | Időtartam | Résztvevők | Leírás |
| --- | --- | --- | ---
| 2018.02.21 14:50 | 20 perc | Kovács <br> Kovács <br> Szentpéteri <br> Zundel | Értekezlet <br> Döntések: |
| 2018.02.22 15:20 | 30 perc | Kovács | |
| 2018.02.22 14:30 | 35 perc | Kovács | |
