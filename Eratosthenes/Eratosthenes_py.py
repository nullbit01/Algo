
#Spunem ca un numar natural x este prim daca si numai daca x > 1 si singurii sai divizori sunt 1 si x.

#Cerinta
#Dandu-se un numar natural N, sa se determine numarul numerelor prime mai mici sau egale cu N.

#Date de intrare
#Fisierul de intrare ciur.in contine o singura linie pe care se afla numarul N.

#Date de iesire
#In fisierul de iesire ciur.out se va scrie pe prima linie raspunsul cerut.

#Restrictii
#2 ≤ N ≤ 2 000 000



fi = open("ciur.in", "r")
fo = open("ciur.out", "w")

cnt = 0
N = int(fi.read(2))

fi.close()

prim = [1]*2000005

for i in range(2, N):
    if prim[i] == 1:
        cnt += 1
        for j in range(i+i, N, i):
            prim[j] = 0

fo.write(str(cnt))

fo.close()
