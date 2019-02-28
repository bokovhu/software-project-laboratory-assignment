3.3 Osztályok leírása

3.3.1 Animal (abstract)
Felelősség
Egy állat. Az állatok mindig egy csempén állnak, és tudnak mozogni egy szomszédos csempére. Az állatok csak akkor tudnak egyik csempéről mozogni a másikra, ha a másik csempén éppen semmilyen állat sem tartózkodik. Amennyiben van a célcsempén állat, az állat típusa alapján különböző interakciók történhetnek.
Interfészek
•	Updatable
Attribútumok
•	Tile standingOn: Az a csempe, amin az állat éppen áll
•	Animal leaderAnimal: Az állatot vezető állat.
•	Animal guidedAnimal: Az az állat, amit ez az állat vezet.
Metódusok
•	void collideWithAnimal (Animal animal): Egy állattal való ütközést kezel. Alapesetben üres.
•	void collideWithPanda (Animal panda): Egy pandával való ütközést kezel. Alapesetben üres, amennyiben egy panda próbál egy állat által már elfoglalt csempére lépni, ezt nem teheti meg.
•	void collideWithOrangutan (Animal orangutan): Egy orángutánnal való ütközést kezel. Alapesetben üres.
•	void kill (): Megöli az állatot, ezzel az állat megszűnik létezni.
•	void startLeading (Animal leader): Az adott állatot a paraméterként kapott állat elkezdi vezetni. Beállítja a paraméterként kapott állatot leaderAnimal-jének.
•	void stopLeading (): Az adott állat elveszti vezetőjét. Ezzel a LeaderAnimal null lesz.
•	void moveTo (Tile targetTile): Az állat a megadott csempe felé lép.
•	void use (Item item): Az állat használja a megadott tárgyat (meghívja a tárgy use függvényét).
•	void update(): Az Updatable interface update() függvényének implementációja, alapesetben üres (az update() csak a szabad pandák esetében hat ténylegesen).
•	goToSleep(Tile where): Az állatot elküldi aludni a paraméterként kapott csempére.
•	void jump(): Az állat ugrik egyet a jelenlegi csempéjén.
•	void scare(): Az állat megijed.
•	void setLeaderAnimal(Animal animal): A paraméterként kapott állatot beállítja leaderAnimal-nek.
•	Animal getLeaderAnimal(): Visszatér az állatat vezető állattal (leaderAnimal).
•	void setGuidedAnimal(Animal animal): Beállítja a paraméterként kapott állatot guidedAnimal-nek.
•	Animal getGuidedAnimal(): Visszatér azzal az állattal, amit az állat vezet (guidedAnimal).
•	void setTile (Tile tile): A paraméterként kapott csempét beállítja az állat jelenlegi csempéjének.
•	Tile getTile(): Visszatér azzal a csempével, amin az állat jelenleg áll.

3.3.2 BeepWave
Felelősség
Egy játékgép csilingelése hatására létrejövő hullám. Ez a hullám megijeszti az ijedős pandákat.
Ősosztályok
•	Wave
Metódusok
•	void hit(Animal animal): A paraméterént kapott állatot megijeszti.

3.3.3 ChocolateVendingMachine
Felelősség
Egy csokiautomata. A csokiautomata véletlenszerű időközönként sípol, ekkor egy JumpyWave típusú hullámot kelt a csempéjén.
Ősosztályok
•	Item
Interfészek
•	Updatable
Metódusok
•	void update (): Véletlenszerű időközönként JumpyWave hullámot kelt a csempéjén.

3.3.4 Couch
Felelősség
Egy fotel. A fotel folyamatosan SleepyWave típusú hullámokat kelt a csempéjében, ezzel csalogatva a közelben lévő pandákat. Egy panda akkor tud a fotelbe lefeküdni aludni, ha a fotel nincs még elfoglalva. Ha a fotel már el van foglalva, a fotel nem kelt semmilyen hullámot.
Ősosztályok
•	Item
Interfészek
•	Updatable
Attribútumok
•	Boolean isTaken: Megadja, hogy a fotel foglalt e. Alapesetben HAMIS, inicializáláskor a fotel szabad.
Metódusok
•	void update (): Minden híváskor SleepyWave típusú hullámot kelt a csempéjén. Ha már alszik egy panda a fotelben, a függvény nem csinál semmit.
•	void use (Animal animal): Egy állatot csapdába ejt, elalszik a fotelben (meghívja annak goToSleep() metódusát). 

3.3.5 CowardPanda
Felelősség
Egy ijedős panda.
Ősosztályok
•	Panda
Metódusok
•	void scare(): A panda elengedi az előtte ás mögötte menő panda mancsát, mivel megijed.

3.3.6 GameMachine
Felelősség
Egy játékgép. A játékgép véletlenszerű időközönként csillingel, ekkor egy BeepWave típusú hullámot kelt a csempéjében.
Ősosztályok
•	Item
Interfészek
•	Updatable
Metódusok
•	void update (): Véletlenszerű időközönként BeepWave típusú hullámot kelt a csempéjén.

3.3.7 Item (abstract)
Felelősség
Egy, az emeleten elhelyezett tárgy. Minden tárgy az emelet valamely csempéjén van. Az állatok képesek a tárgyakat használni. Bizonyos tárgyak maguktól csinálnak dolgokat véletlenszerű időközönként. A tárgyak nem mozgathatóak, inicilizálásuk után a helyzetük változatlan marad a játék végéig.
Interfészek
•	Updatable
Attribútumok
•	Tile placedOn: Az a csempe, ahová a tárgy el van helyezve
Metódusok
•	void update (): Az Updatable interface-ből származó függvény implementációja. Lévén, hogy a tárgy egy nagyon általános fogalom, az alapértelmezett implementációja a függvénynek nem csinál semmit.
•	void use (Animal user): Arra való, hogy egy állat "használja" (interakcióba lépjen) az adott tárggyal. A függvény egyetlen paramétere a használó állat.
•	void setPlacedOn (Tile tile): Beállítja a paraméterként kapott csempét a tárgy csempéjének.
•	Tile getPlacedOn(): Visszatér a tárgy csempéjével.

3.3.8 JumpyPanda
Felelősség
Egy ugrálós panda.
Ősosztályok
•	Panda
Metódusok
•	void jump(): A panda elengedi az előtte ás mögötte menő panda mancsát, és ugrik egyet. Az ugrás következtében a csempe, amin áll, veszít élettartamából (amennyiben törékeny).

3.3.9 JumpyWave
Felelősség
Egy csokiautomata sípolása hatására létrejövő hullám. Ez a hullám megijeszti és felugrasztja az ugrálós pandákat.
Ősosztályok
•	Wave
Metódusok
•	void hit(Animal animal): A paraméterént kapott állatot ugrasztja és megijeszti.

3.3.10 Level
Felelősség
Az emelet. Az emeleten csempék találhatóak.
Attribútumok
•	Tile [] tiles: Az emeleten található csempék
•	Tile startTile: A bejárat csempe.
•	Tile exitTile: A kijárat csempe. Erre rálépve az orangután a bejárat csempén jelenik meg. ??
Metódusok
•	void addTile(Tile tile): A paraméterként kapott csempét hozzáadja a csempék listájához.
•	Tile getStartTile(): Visszatér a bejárat csepével.
•	void setStartTile(Tile tile): Beállítja a paraméterként kapott csempét a bejárat csempének.
•	Tile getExitTile(): Visszatér a kijárat csempével.
•	void setExitTile(Tile tile): Beállítja a paraméterként kapott csempét a kijárat csempének.

3.3.11 Orangutan
Felelősség
Egy orángután. Az orángutánt a játékos irányítja. Az orángután egy pandával való összeütközéskor elkezdi vezetni az ütközött pandát.
Ősosztályok
•	Animal
Interfészek
•	Updatable
Metódusok
•	void CollideWithAnimal (Animal animal): Egy állattal való összeütközést kezel, vagyis meghívja a paraméterként kapott állat CollideWithOrangutan metódusát, önmagát átadva paraméterként.
•	void CollideWithPanda (Animal animal): Egy pandával való összeütközést kezel. Nem tesz semmit, ugyanis csak az orángután panda felé mozdulására tudja őt megfogni, fordítva nem.

3.3.12 Panda (abstract)
Felelősség
Egy panda. A pandák véletlenszerűen mozognak az emeleten, egészen addig, amíg egy állat el nem kezdi vezetni őket. Ezután követik a vezetőjüket. A pandák képesek reagálni a csempéjükön érzékelhető hullámokra annak függvényében, hogy milyen tulajdonsággal rendelkeznek. A fáradékony pandák le tudnak feküdni egy fotelbe aludni, ezután nem ébreszthetőek fel.
Ősosztályok
•	Animal
Interfészek
•	Updatable
Attribútumok
•	Boolean isAsleep: Megadja, hogy a panda alszik e. Alapesetben FALSE, a panda inicializáláskor ébren van.
Metódusok
•	void collideWithPanda (Animal panda): Egy másik pandával való összeütközést kezel. A függvény semmit sem teszt, hiszen csak az orángutánnal való ütközés generál állapotváltozást.
•	void collideWithOrangutan (Animal orangutan): Egy orángutánnal való összeütközést kezel. Ekkor a leaderAnimal az adott orángután lesz, az orángután által előzőleg vezetett állat lesz a guidedAnimal, és a guidedAnimal leaderAnimal-je lesz ez a panda.
•	void update (): A szabad panda véletlen időközönként szomszédos csempe felé lép. Amennyiben a panda vezetve van vagy elaludt, az update() nem befolyásolja.

3.3.13 Portal
Felelősség
Egy átjáró. Az átjáró össze van kötve egy másik átjáróval, és minden átjáróhoz hozzá van rendelve az a csempe, ahol az átjáró van. Az átjárók segítségével lehet nem feltétlenül szomszédos csempére mozogni. A kijáraton és bejáraton találhatóak átjárók, melyek össze vannak kötve, így amikor egy állat kimegy a kijáraton, a bejáraton jelenik meg. A szekrényekben is van egy-egy átjáró, ezek a szekrény párjában lévő átjáróval vannak összekötve.
Attribútumok
•	Tile place: Az a csempe, ahol az átjáró van.
•	Portal otherEnd: Az átjáró másik vége.
Metódusok
•	void enter (Animal animal): Átmozgatja az állatot az átjáró másik végén található csempére. Ekkor az állat a portál másik végének csempéjén jelenik meg.
•	void setOtherEnd(Portal portal): A paraméterként kapott portált beállítja a portal másik végének. 
•	Portal getOtherEnd(): Visszatér a portál másik végével.
•	void setPlace(Tile place): A paraméterként kapott csempét beállítja a portál helyének.
•	Tile getPlace(): Visszatér a portál helyével.

3.3.14 SleepyPanda
Felelősség
Egy fáradékony panda.
Ősosztályok
•	Panda
Metódusok
•	void goToSleep(Tile where): A panda elengedi az előtte ás mögötte menő panda mancsát, és elmegy aludni a paraméterként kapott csempére. Miután elalszik, többé nem mozdul, nem fogható meg vagy mozdítható el a játék végéig. Beállítja a panda isAsleep attribútumát IGAZ-ra.

3.3.15 SleepyWave
Felelősség
A fotelből minden update() hatására létrejövő hullám. Ez a hullám a fáradékony pandákat elküldi aludni a forrása felé (forrása az a csempe, ahol az a fotel van, ami a hullámot gerjeszti).
Ősosztályok
•	Wave
Metódusok
•	void hit(Animal animal): A paraméterént kapott aludni küldi a forrása felé.

3.3.16 Tile
Felelősség
Egy csempe az emeleten. A csempéken egy időben állhat pontosan egy állat, és egy tárgy. A csempét jellemzi az élettartama, mely törékeny csempék esetén minden körben, amikor egy állat rálép az adott csempére csökken, illetve akkor is csökken, ha a csempén egy panda ugrik. Ha a csempe nem törékeny, az élettartama nem változik a játék során.
Attribútumok
•	Tile [] neighbours: A csempével szomszédos csempék (azok a csempék, amikre erről a csempéről lehet mozogni).
•	boolean isFragile: Megadja, hogy törékeny-e az adott csempe.
•	int life: A csempe hátralévő életét adja meg. Ha eléri a nullát, a csempe összetört, és minden rálépő állat meghal.
•	Animal currentAnimal: A csempén jelenleg álló állat.
•	Item currentItem: A csempén jelenleg álló tárgy.
Metódusok
•	boolean accept (Animal animal): A paraméterként kapott állatot próbálja “befogadni”. Amennyiben a csempén éppen nem tartózkodik állat, a bemenet állatot átmozgatja erre a csempére, és IGAZ értékkel tér vissza. Ellenkező esetben a mozgás nem történik meg, és HAMIS értékkel tér vissza.
•	spawnWave (Wave wave): A paraméterként kapott hullámot közvetíti a szomszédos csempékre.
•	pushWave (Wave wave): A hullámot továbbtolja a szomszédos csempékre, ezzel a hullám hatást gyakorol a csempéken lévő állatokra (amennyiben azok tulajdonságai ezt megengedik).
•	void damage (): A csempe élettartamát csökkenti, ha az törékeny.
•	void setlife(int life): Beállítja a csempe élettartamát.
•	int getlife(): Visszatér a csempe élettartamával.
•	void addNeighbour(Tile tile): Hozzáad egy csempét a szomszédok listájához.
•	void setCurrentAnimal(Animal animal): Beállítja a paraméterként kapott állatot a csempén lévő állatnak.
•	Animal getCurrentAnimal(): Visszatér a csempén tartózkodó állattal.
•	void setCurrentItem(Item item): Beállítja a paraméterként kapott tárgyat a csempén lévő tárgynak.
•	Item getCurrentItem():  Visszatér a csempén lévő tárggyal.

3.3.17 Timer (singleton)
Felelősség
A Timer feladata egységnyi időnként értesíteni a frissíthető dolgokat.
Attribútumok
•	Updatable[] updatables: A frossíthető dolgok listája.
Metódusok
•	void tick(): Frissíti a frissíthető dolgokat.
•	void add (Updatable updatable): Hozzáad egy frissíthető dolgot a listához.
•	void remove(Updatable updatable): Kitöröl egy frissíthető dolgot a listáról.

3.3.18 Updatable (interface)
Felelősség
A frissíthető dolgokat egységidőnként frissíti a Timer.
Metódusok
•	void update(): Frissíti az adott dolgot.

3.3.19 Wardrobe
Felelősség
Egy szekrény. A szekrényeket jellemzi színük, minden színből pontosan kettő szekrény található a pályán. Amikor egy állat interakcióba lép egy szekrénnyel, az állat a szekrény ugyanolyan színű párjánál jelenik meg.
Ősosztályok
•	Item
Interfészek
•	Updatable
Attribútumok
•	Portal portal: A szekrényhez tartozó átjáró. Az átjáró másik oldala az azonos színű szekrényben van.
•	int color: A szekrény színe.
Metódusok
•	void send (Animal user): A használó állatot átküldi az átjáróján.
•	void setPortal(Portal portal): A paraméterként kapott portált beállítja a portáljának.
•	Portal getPortal(): Visszatér a portáljával.
•	void setColor(int color): A paraméterként kapott számot (színazonosítót) beállítja színének.
•	int getColor(): Visszatér a szekrény színével (színének azonosítójával).

3.3.20 Wave (abstract)
Felelősség
Egy tárgy által kibocsátott hullám. A hullámok a típusuk alapján más hatást érnek el, azokkal az állatokkal más történik így, akiket elérnek.
Egy hullám az őt kibocsátó tárgy csempéjén és annak szomszédain tud hatást kiváltani.
Attribútumok
•	Tile origin: A hullám forrásának csempéje.
Metódusok
•	void hit (Animal animal): A hullám elér egy állathoz, aminek hatására meghívja annak megfelelő függvényét. A függvény típusa a hullám típusától függ.
•	void setOrigin(Tile origin): A paraméterként kapott csempét beállítja a hullám eredetének (a csempe, ahol kibocsátódott).
•	Tile getOrigin(): Visszatér a hullám eredetével.

