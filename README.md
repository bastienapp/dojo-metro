# Métro

Un métro arrive en gare : il contient des rames qui chacune peuvent contenir `x` personnes maximum.
Devant le métro, `y` personnes attendent en file indienne et veulent entrer dans le métro.

Créer une méthode `count` qui, pour un métro, une capacité maximum des rames et une file d'attente, retourne le nombre de personnes qui ont pu entrer dans le métro.

* Métro : [42, 50, 47, 48]
* Chaque rame contient 50 personnes maximum
* File d'attente : 68 personnes
* 13 personnes sont entrées dans le métro


Rappel des commandes junit :

    javac -cp .:junit-4.12.jar MetroTest.java
    java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore MetroTest
