A nyelv definíciója itt van: https://drive.google.com/drive/u/0/folders/1mcYym1SzXJYcjwaNAyH9Y4dG5J-te5zM

A prototipus tesztesetei:
1. Create Tiles [x]
2. Create Items [ ]
3. Create Animals [ ]
4. Move orangutan to safe tile [ ]
5. Move panda to safe tile [ ]
6. Move orangutan to broken tile [ ]
7. Move panda to broken tile alone [ ]
8. Move panda to broken tile in line [ ]
9. Move orangutan to exit tile alone [ ]
10. Move orangutan to exit tile with pandas [ ]
11. Orangutan uses wardrobe alone [ ]
12. Orangutan uses wardrobe with pandas [ ]
13. Panda uses wardrobe [ ]
14. Panda sleeps alone [ ]
15. Panda sleeps in line [ ]
16. Panda gets scared alone [ ] 
17. Panda gets scared in line [ ] 
18. Panda jumps alone on safe tile [ ]
19. Panda jumps in line on safe tile [ ]
~~20. Panda jumps alone on fragile tile~~
21. Panda jumps in line on fragile tile [ ]
22. Panda jumps alone on broken tile [ ]
23. Panda jumps in line on broken tile [ ]
24. Orangutan lets go [ ]
25. Orangutan steals from Orangutan [ ]


## 1. Create Tiles

#### Bemenet:

`ADD FRAGILE TILE WITH ID 1;`
`ADD EXIT TILE WITH ID 2;`
`ADD START TILE WITH ID 3;`

`CONNECT TILE 1 WITH TILE 2;`
`CONNECT TILE 2 WITH TILE 3;`
`CONNECT TILE 1 WITH TILE 3;`

`/print`

#### Elvárt kimenet:

[TILES]

`FRAGILE TILE ID = 1 CURRENTANIMAL = (NULL) CURRENTITEM = (NULL)`
`EXIT TILE ID = 2 CURRENTANIMAL = (NULL) CURRENTITEM = (NULL)`
`START TILE ID = 3 CURRENTANIMAL = (NULL) CURRENTITEM = (NULL)`

[CONNECTIONS]

`<TILE 1 CONNECTED WITH TILE 2>`
`<TILE 2 CONNECTED WITH TILE 3>`
`<TILE 1 CONNECTED WITH TILE 3>`

## 2. Create items

#### Bemenet:

`ADD TILE WITH ID 1;`
`ADD TILE WITH ID 2;`
`ADD VENDINGMACHINE WITH ID 3 ONTO TILE 1;`

`/print`

#### Elvárt kimenet:

[TILES]

`TILE ID = 1 CURRENTANIMAL = (NULL) CURRENTITEM = (VENDINGMACHINE 3)`
`TILE ID = 2 CURRENTANIMAL = (NULL) CURRENTITEM = (NULL)`

[ITEMS]

`WARDROBE ID = 4 PLACEDON = (TILE 2)`
`VENDINGMACHINE ID = 3 PLACEDON = (TILE 1)`

## 3. Create animals

#### Bemenet:

`ADD TILE WITH ID 1;`
`ADD TILE WITH ID 2;`
`ADD COWARD PANDA WITH ID 3 ONTO TILE 1;`
`ADD ORANGUTAN WITH ID 4 ONTO TILE 2;`

`/print`

#### Elvárt kimenet:

## 4. Move orangutan on safe tile

#### Bemenet:

`ADD TILE WITH ID 1;`
`ADD TILE WITH ID 2;`
`ADD ORANGUTAN WITH ID 3 ONTO TILE 1;`

`CONNECT TILE 1 WITH TILE 2;`

`BEGIN;`
`MOVE ORANGUTAN WITH ID 3 ONTO TILE 2;` 
`END;`

`/print`

#### Elvárt kimenet:

## 5. Move panda on safe tile

#### Bemenet:

`ADD TILE WITH ID 1;`
`ADD TILE WITH ID 2;`
`ADD SLEEPY PANDA WITH ID 3 ONTO TILE 1;`

`CONNECT TILE 1 WITH TILE 2;`

`BEGIN;`
`MOVE SLEEPY PANDA WITH ID 3 ONTO TILE 2;` 
`END;`

`/print`

#### Elvárt kimenet:

## 6. Move orangutan on broken tile

#### Bemenet:

`ADD TILE WITH ID 1;`
`ADD BROKEN TILE WITH ID 2;`
`ADD ORANGUTAN WITH ID 3 ONTO TILE 1;`

`CONNECT TILE 1 WITH TILE 2;`

`MOVE ORANGUTAN WITH ID 3 ONTO TILE 2;` 

`/print`

#### Elvárt kimenet:

## 7. Move panda on broken tile alone

#### Bemenet:

`ADD TILE WITH ID 1;`
`ADD BROKEN TILE WITH ID 2;`
`ADD SLEEPY PANDA WITH ID 3 ONTO TILE 1;`

`CONNECT TILE 1 WITH TILE 2;`

`BEGIN;`
`MOVE SLEEPY PANDA WITH ID 3 ONTO TILE 2;` 
`END;`

`/print`

#### Elvárt kimenet:

## 8. Move panda on broken tile in line

#### Bemenet:

`ADD TILE WITH ID 1;`
`ADD TILE WITH ID 2;`
`ADD FRAGILE TILE WITH ID 3 WITH LIFE 1;`
`ADD TILE WITH ID 4;`
`ADD ORANGUTAN WITH ID 5 ONTO TILE 3;`
`ADD SLEEPY PANDA WITH ID 6 ONTO TILE 1;`
`ADD SLEEPY PANDA WITH ID 7 ONTO TILE 2;`

`CONNECT TILE 1 WITH TILE 2;`
`CONNECT TILE 2 WITH FRAGILE TILE 3;`
`CONNECT FRAGILE TILE 3 WITH TILE 4;`

`BEGIN;`
`MOVE ORANGUTAN WITH ID 5 ONTO TILE 2;`
`MOVE ORANGUTAN WITH ID 5 ONTO TILE 4;`
`END;`

`/print`

#### Elvárt kimenet:

## 9. Move orangutan to exit tile alone

#### Bemenet:


`ADD TILE WITH ID 1;`
`ADD EXIT TILE WITH ID 2;`
`ADD ORANGUTAN WITH ID 3 ONTO TILE 1;`

`CONNECT TILE 1 WITH TILE 2;`

`MOVE ORANGUTAN WITH ID 3 ONTO TILE 2;` 

`/print`

#### Elvárt kimenet:

## 10. Move orangutan to exit tile with pandas

#### Bemenet:

`ADD TILE WITH ID 1;`
`ADD TILE WITH ID 2;`
`ADD EXIT TILE WITH ID 3;`
`ADD ORANGUTAN WITH ID 4 ONTO TILE 2;`
`ADD SLEEPY PANDA WITH ID 5 ONTO TILE 1;`

`CONNECT TILE 1 WITH TILE 2;`
`CONNECT TILE 2 WITH TILE 3;`

`BEGIN;`
`MOVE ORANGUTAN WITH ID 4 ONTO TILE 1;`
`MOVE ORANGUTAN WITH ID 4 ONTO TILE 3;`
`END;`

`/print`

#### Elvárt kimenet:

## 11. Orangutan uses wardrobe alone

#### Bemenet:

`ADD TILE WITH ID 1;`
`ADD TILE WITH ID 2;`
`ADD TILE WITH ID 3;`
`ADD ORANGUTAN WITH ID 3 ONTO TILE 1;`
`ADD WARDROBE WITH ID 4 ONTO TILE 2;`
`ADD WARDROBE WITH ID 5 ONTO TILE 3;`

`CONNECT TILE 1 WITH TILE 2;`
`CONNECT WARDROBE 4 WITH WARDROBE 5;`

`BEGIN;`
`MOVE ORANGUTAN WITH ID 3 ONTO TILE 2;` 
`USE WARDROBE WITH ID 4 BY ORANGUTAN WITH ID 3;`
`END;`

`/print`

#### Elvárt kimenet:

## 12. Orangutan uses wardrobe with pandas

#### Bemenet:

`ADD TILE WITH ID 1;`
`ADD TILE WITH ID 2;`
`ADD TILE WITH ID 3;`
`ADD TILE WITH ID 4;`
`ADD ORANGUTAN WITH ID 5 ONTO TILE 2;`
`ADD SLEEPY PANDA WITH ID 6 ONTO TILE 1;`
`ADD WARDROBE WITH ID 7 ONTO TILE 3;`
`ADD WARDROBE WITH ID 8 ONTO TILE 4;`

`CONNECT TILE 1 WITH TILE 2;`
`CONNECT TILE 2 WITH TILE 3;`
`CONNECT WARDROBE 7 WITH WARDROBE 8`;

`BEGIN;`
`MOVE ORANGUTAN WITH ID 4 ONTO TILE 1;`
`MOVE ORANGUTAN WITH ID 4 ONTO TILE 3;`
`USE WARDROBE WITH ID 7 BY ORANGUTAN WITH ID 5;`
`END;`

`/print`

#### Elvárt kimenet:

## 13. Panda uses wardrobe

#### Bemenet:

`ADD TILE WITH ID 1;`
`ADD TILE WITH ID 2;`
`ADD TILE WITH ID 3;`
`ADD SLEEPY PANDA WITH ID 3 ONTO TILE 1;`
`ADD WARDROBE WITH ID 4 ONTO TILE 2;`
`ADD WARDROBE WITH ID 5 ONTO TILE 3;`

`CONNECT TILE 1 WITH TILE 2;`
`CONNECT WARDROBE 4 WITH WARDROBE 5;`

`BEGIN;`
`MOVE SLEEPY PANDA WITH ID 3 ONTO TILE 2;`
`USE WARDROBE WITH ID 4 BY SLEEPY PANDA WITH ID 3;`
`END;`

`/print`

#### Elvárt kimenet:

## 14. Panda sleeps alone

#### Bemenet:

`ADD TILE WITH ID 1;`
`ADD TILE WITH ID 2;`
`ADD TILE WITH ID 3;`
`ADD SLEEPY PANDA WITH ID 3 ONTO TILE 1;`
`ADD WARDROBE WITH ID 4 ONTO TILE 2;`
`ADD WARDROBE WITH ID 5 ONTO TILE 3;`

`CONNECT TILE 1 WITH TILE 2;`
`CONNECT WARDROBE 4 WITH WARDROBE 5;`

`BEGIN;`
`MOVE SLEEPY PANDA WITH ID 3 ONTO TILE 2;`
`USE WARDROBE WITH ID 4 BY SLEEPY PANDA WITH ID 3;`
`END;`

`/print`

#### Elvárt kimenet:

## 15. Panda sleeps in line

#### Bemenet:

`/load sleep_test.txt`

`BEGIN;`
`MOVE ORANGUTAN WITH ID 7 ONTO TILE 4;`
`END;`

`/print`

#### Elvárt kimenet:

## 16. Panda gets scared alone

#### Bemenet:
`ADD TILE WITH ID 1;`
`ADD TILE WITH ID 2;`
`ADD VENDINGMACHINE WITH ID 3 ONTO TILE 1;`
`ADD COWARD PANDA WITH ID 4 ONTO TILE 2;`

`CONNECT TILE 1 WITH TILE 2;`

`BEGIN;`
`WORK VENDINGMACHINE WITH ID 3;`
`END;`

`/print`

#### Elvárt kimenet:

## 17. Panda gets scared in line

#### Bemenet:
`/load scare_test.txt`

`BEGIN;`
`MOVE ORANGUTAN WITH ID 7 ONTO TILE 4;`
`WORK VENDINGMACHINE WITH ID 8;`
`END;`

#### Elvárt kimenet:

## 18. Panda jumps alone on safe tile

#### Bemenet:

`ADD TILE WITH ID 1;`
`ADD TILE WITH ID 2;`
`ADD GAMEMACHINE WITH ID 3 ONTO TILE 1;`
`ADD JUMPY PANDA WITH ID 4 ONTO TILE 2;`

`CONNECT TILE 1 WITH TILE 2;`

`BEGIN;`
`WORK GAMEMACHINE WITH ID 3;`
`END;`

`/print`

#### Elvárt kimenet:

## 19. Panda jumps in line on safe tile

#### Bemenet:

`/load jumpy_safe_test.txt`

`BEGIN;`
`MOVE ORANGUTAN WITH ID 7 ONTO TILE 4;`
`WORK GAMEMACHINE WITH ID 8;`
`END;`

`/print`

#### Elvárt kimenet:

## 20. Panda jumps alone on fragile tile

#### Bemenet:

`ADD TILE WITH ID 1;`
`ADD FRAGILE TILE WITH ID 2 WITH LIFE 5;`
`ADD GAMEMACHINE WITH ID 3 ONTO TILE 1;`
`ADD JUMPY PANDA WITH ID 4 ONTO TILE 2;`

`CONNECT TILE 1 WITH TILE 2;`

`BEGIN;`
`WORK GAMEMACHINE WITH ID 3;`
`END;`

`/print`

#### Elvárt kimenet:

## 21. Panda jumps in line on fragile tile

#### Bemenet:

`/load jumpy_fragile_test.txt`

`BEGIN;`
`MOVE ORANGUTAN WITH ID 7 ONTO TILE 4;`
`WORK GAMEMACHINE WITH ID 8;`
`END;`

#### Elvárt kimenet:

## 22. Panda jumps alone on broken tile

#### Bemenet:

`ADD TILE WITH ID 1;`
`ADD FRAGILE TILE WITH ID 2 WITH LIFE 1;`
`ADD GAMEMACHINE WITH ID 3 ONTO TILE 1;`
`ADD JUMPY PANDA WITH ID 4 ONTO TILE 2;`

`CONNECT TILE 1 WITH TILE 2;`

`BEGIN;`
`WORK GAMEMACHINE WITH ID 3;`
`END;`

`/print`


#### Elvárt kimenet:

## 23. Panda jumps in line on broken tile

#### Bemenet:

`/load jumpy_broken_test.txt`

`BEGIN;`
`MOVE ORANGUTAN WITH ID 7 ONTO TILE 4;`
`WORK GAMEMACHINE WITH ID 8;`
`END;`

#### Elvárt kimenet:

## 24. Orangutan lets go

#### Bemenet:

#### Elvárt kimenet:

## 25. Orangutan steals from orangutan

#### Bemenet:

#### Elvárt kimenet:


