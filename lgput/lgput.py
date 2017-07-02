#Ridicare la putere in timp logaritmic
#Dandu-se doua numere naturale N si P, se cere sa se calculeze restul impartirii lui NP la 1999999973.

#Date de intrare
#Fisierul de intrare lgput.in va contine 2 numere N si P.

#Date de iesire
#In fisierul de iesire lgput.out va fi scris un singur numar reprezentand restul impartirii lui NP la 1999999973.

#Restrictii
#2 ≤ N, P ≤ 2^32

fi = open("lgput.in", "r")
fo = open("lgput.out", "w")

for line in fi:
    line = line.split()

N = int(line[0])
P = int(line[1])

fi.close()

M = 1999999973
A = N
sol = 1
i = 0

while (1 << i) <= P:
    if ((1 << i) & P) > 0:
        sol = (sol * A) % M
    A = (A * A) % M
    i += 1
    
fo.write(str(sol))

fo.close()


