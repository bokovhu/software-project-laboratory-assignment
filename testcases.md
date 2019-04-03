A prototipus tesztesetei:
1. Create Tiles
2. Create Items
3. Create Animals
4. Move orangutan to safe tile
5. Move panda to safe tile
6. Move orangutan to broken tile
7. Move panda to broken tile alone
8. Move panda to broken tile in line
9. Move orangutan to exit tile alone
10. Move orangutan to exit tile with pandas
11. Orangutan uses wardrobe alone
12. Orangutan uses wardrobe with pandas
13. Panda uses wardrobe
14. Panda sleeps alone
15. Panda sleeps in line
16. Panda gets scared alone
17. Panda gets scared in line
18. Panda jumps alone on safe tile
19. Panda jumps in line on safe tile
-------------20. Panda jumps alone on fragile tile------ ez nem fontos
21. Panda jumps in line on fragile tile
22. Panda jumps alone on broken tile
23. Panda jumps in line on broken tile
24. Orangutan lets go
25. Orangutan steals from Orangutan


7.2.2	Bemeneti nyelv
A tesztket leíró nyelv az SQL-hez hasonló. Minden sort ;-vel kell lezárni. A parancsszavakhoz tartozhatnak opciók, ezek az egyes parancsok leírásai alatt megtalálhatóak.

ADD
Leírás: Egy objektum hozzáadása a tesztesethez.
Opciók: 
•	A hozzáadandó objektum
Objektum	Leírás	Opciók, paraméterek
TILE	Egy csempe	ENTRANCE, EXIT, FRAGILE
PANDA	Egy panda	COWARD, SLEEPY, JUMPY
ORANGUTAN	Egy orángután	-
WARDROBE	Egy szekrény	-
VENDINGMACHINE	Egy csokiautomata	-
GAMEMACHINE	Egy játékautomata	-
COUCH	Egy fotel	-
Egy objektumhoz egyszerre több opció is megadható, de a parancsértelmezés során nem lesz minden esetben helyes (pl. pandának logikailag egy tulajdonsága lehet). Az objektumokhoz tartozó opciók a WITH kivételével az objektum megnevezése előtt állnak. A WITH ID az objektumok megkülönböztetéséhez használt, kötelező opció.
•	ONTO: Az objektum az ONTO opció után megadott TILE-ra kerül.
Példák: 
ADD ENTRANCE TILE WITH ID 0;
ADD EXIT TILE WITH ID 1;
ADD FRAGILE TILE WITH ID 2;
ADD TILE WITH ID 3;
ADD COWARD PANDA WITH ID 6 ONTO TILE 2;
ADD ORANGUTAN WITH ID 7 ONTO TILE 0;

CONNECT
Leírás: Csempék és szekrények összekötéséhez használt parancs. Csempét csempével (szomszédosak), illetve szekrényt szekrénnyel lehet összekötni. A két objektum, amiket összekötünk, ID-jukkal együtt szerepelnek és a WITH kulcsszó választja el őket.
Opciók: 
•	A két összekötni kívánt objektum WITH kulcsszóval köztük
Példák: 
CONNECT TILE 0 WITH TILE 2;
CONNECT TILE 2 WITH TILE 3;
CONNECT TILE 2 WITH TILE 4;
CONNECT TILE 3 WITH TILE 5;
CONNECT TILE 4 WITH TILE 5;

USE
Leírás: Egy használható tárgyat használtat a megadott állattal.
Opciók: -
Példák: 
USE WARDROBE WITH ID 2 BY ORANGUTAN WITH ID 3;

MOVE
Leírás: Egy mozgatható objektumot(orángután vagy panda) mozgat a kijelölt csempére.
Opciók: -
Példák: 
MOVE ORANGUTAN WITH ID 7 TO TILE 2;

PUSH
Leírás: Elmenti az állapotot a stack tetejére. Ezzel a beállítások elmentődnek, és erre az állapotra a lényegi lépések után visszaállhatunk.
Opciók: -

BEGIN
Leírás: A teszteset lényegi lépéseit leíró rész kezdetét jelzi.
Opciók: -

END
Leírás: A teszteset lényegi lépéseit leíró rész végét jelzi.
Opciók: -

POP
Leírás: A stack tetején lévő állapotot visszaállítja.
Opciók: -

SET paraméter érték
Leírás: Beálltja egy paraméter értékét.
Opciók: 
Paraméter	Leírás	Lehetséges értékek
random	A véletlenszerűség ki -és bekapcsolására. Valójában a random értéket használó függvények seedjének konstansra állítását állítja be.	on / off
Példa:
SET random on;

/save
Leírás: A command buffer eddig begépelt tartalmát elmenti a paraméterként kapott szöveges fájlba, ahonnan az betölthető.
Opciók: A fájl neve.
Példa: 
/save test_01.txt;

/print
Leírás: A paraméterként kapott szöveges fájlba elmenti a lefuttatott teszteset kimenetét. Amennyiben paraméter nélkül kerül meghívásra, a kimenetet a standard outputra í®ja ki.
Opciók: A fájl neve (nem kötelező).
Példa: 
/print output_01.txt;

/load
Leírás: A command bufferbe betölti a paraméterként kapott szöveges fájl tartalmát.
Opciók: A fájl neve.
Példa: 
/load oldfile.txt;

/clear
Leírás: Az összes eddigi lépést és beállítást eltörli, viszaállítja a rendszert alapállapotára.
Opciók: -

#
Leírás: Kommentet jelöl.
7.2.3	Kimeneti nyelv
A tesztek kiemenetének formátuma minden esetben ugyanolyan, függetlenül a bevitt konfigurációtól és parancsoktól. A kimenet a lefutás utáni állapotokat tükrözi.
A kimenet 4 szekcióra osztott:
•	A csempék állapota: soronként egy csempe jelenlegi állapotát mutatja. A sor felépítése:
	a csempe paraméterei
	a csempe id-ja
	a csempén jelenleg álló állat és id-ja zárójelben
	a csempén jelenleg elhelyezett tárgy és id-ja zárójelben
A csempék szekciójának kezdete a [TILES] címmel jelzett.
•	Az állatok állapota: soronként egy állat jelenlegi állapotát mutatja. A sor felépítése:
	az állat paraméterei
	az állat id-ja
	a csempe, paraméterei és id-ja, amin az állat áll
	[a fotel, amiben az állat alszik – csak fáradékony panda esetén van jelentőssége]
	az állatot vezető állat és id-ja
	az állat által vezetett állat és id-ja
	[az állat theftTimer-e (lsd. feljebb) – csak orángután esetén van jelentőssége]
Az állatok szekciójának kezdete az [ANIMALS] címmel jelzett.
•	A tárgyak állapota: soronként egy tárgy jelenlegi állapotát mutatja. A sor felépítése:
	a tárgy és id-ja
	a csempe, paraméterei és id-ja, amin a tárgy el van helyezve
A tárgyak szekciójának kezdetét az [ITEMS] cím jelzi.
•	 A kapcsolatok, szomszédsági viszonyok szekciója: A jelenlegi felépített szomszédsági viszonyokat mutatja. A lehetséges viszonyok:
		állatok vezetett és vezető viszonya
		szomszédos csempék
		szekrények és párjaik
Soronként egy viszonyt látunk a kimeneten. Egy sor felépítése:
	az első objektum és id-ja
	CONNECTED WITH kulcsszó
	a második objektum és id-ja
Ennek a szekciónak az elejét a [CONNECTIONS] cím jelzi.

Egy példa a kimenetre:

[TILES]

FRAGILE EXIT ENTRANCE TILE ID = 0 CURRENTANIMAL = (SLEEPY PANDA 13) CURRENTITEM = (WARDROBE 31)
FRAGILE TILE ID = 1 CURRENTANIMAL = (NULL) CURRENTITEM = (NULL)
TILE ID = 2 CURRENTANIMAL = (ORANGUTAN 14) CURRENTITEM = (NULL)
TILE ID = 3 CURRENTANIMAL = (NULL) CURRENTITEM = (WARDROBE 32)

[ANIMALS]

SLEEPY PANDA ID = 13 STANDINGON = (TILE 0) SLEEPINGIN = (NULL) LEADERANIMAL = (NULL) GUIDEDANIMAL = (NULL)
ORANGUTAN ID = 14 STANDINGON = (TILE 2) LEADERANIMAL = (NULL) GUIDEDANIMAL = (NULL) THEFTTIMER = 3

[ITEMS]

WARDROBE ID = 31 PLACEDON = (TILE 0)
WARDROBE ID = 32 PLACEDON = (TILE 3)

[CONNECTIONS]

TILE 0 CONNECTED WITH TILE 1
TILE 1 CONNECTED WITH TILE 2
TILE 2 CONNECTED WITH TILE 3
WARDROBE 31 CONNECTED WITH WARDROBE 32

