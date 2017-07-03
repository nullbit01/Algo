#ClassicTask
#Dandu-se trei valori A, B, C, sa se calculeze A la puterea B modulo C.

#Date de intrare
#Fişierul de intrare classictask.in va contine pe singura sa linie valorile A, B, C.

#Date de ieşire
#În fişierul de ieşire classictask.out se va afla valoarea ceruta.

#Restricţii
#1 ≤ A, B, C ≤ 1018
#X modulo Y se refera la restul impartirii numarului X la numarul Y.

fi = open("classictask.in", "r")
fo = open("classictask.out", "w")

for line in fi:
    line = line.split()

A = int(line[0])
B = int(line[1])
C = int(line[2])

fi.close()

M = 1999999973
N = A
sol = 1
i = 0

while (1 << i) <= B:
    if ((1 << i) & B) > 0:
        sol = (sol * N) % C
    N = (N * N) % C
    i += 1

fo.write(str(sol))

fo.close()


