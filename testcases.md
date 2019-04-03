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


# 1. Create Tiles

## Bemenet:

`<ADD FRAGILE TILE WITH ID 1;>`
`<ADD EXIT TILE WITH ID 2;>`
`<ADD START TILE WITH ID 3;>`

`<CONNECT TILE 1 WITH TILE 2;>`
`<CONNECT TILE 2 WITH TILE 3;>`
`<CONNECT TILE 1 WITH TILE 3;>`

/print

## Elvárt kimenet:

[TILES]

`<FRAGILE TILE ID = 1 CURRENTANIMAL = (NULL) CURRENTITEM = (NULL)>`
`<EXIT TILE ID = 2 CURRENTANIMAL = (NULL) CURRENTITEM = (NULL)>`
`<START TILE ID = 3 CURRENTANIMAL = (NULL) CURRENTITEM = (NULL)>`

[CONNECTIONS]

`<TILE 1 CONNECTED WITH TILE 2>`
`<TILE 2 CONNECTED WITH TILE 3>`
`<TILE 1 CONNECTED WITH TILE 3>`


