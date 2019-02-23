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

### 3.3.1 Animal

#### Felelősség

Egy állat. Az állatok mindig egy csempén állnak, és tudnak mozogni egy szomszédos csempére. Az állatok csak akkor tudnak egyik csempéről mozogni a másikra, ha a másik csempén éppen semmilyen állat sem tartózkodik. Az különböző állatok különbözőféleképpen reagálnak egy másik állattal való összeütközésre.

#### Ősosztályok

-

#### Interfészek

* `Updatable`

#### Attribútumok

* `Tile standingOn`: Az a csempe, amin az állat éppen áll

#### Metódusok

* `void update()`: Az Updatable interface-ből származó függvény implementációja
* `void collideWithPanda (Animal panda)`: Egy pandával való ütközést kezel
* `void collideWithOrangutan (Animal orangutan)`: Egy orángutánnal való ütközést kezel

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
