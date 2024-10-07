/*
* File: Rombatl.java
* Author: Ambrus Zsolt
* Copyright: 2024, Ambrus Zsolt
* Group: Szoft II/I/N
* Date: 2024-10-06
* Github: https://github.com/ZsoltAmbrus
* Licenc: GNU GPL
*/
import java.util.Scanner;
public class Rombatl{
    /**
     * Rombusz területét számoló függvény, beolvassa a rombusz két átlóját, majd kiszámolja a területét.
     */
    public void RombuszTer(){

        System.out.println("Rombusz terület számoló.");
        Scanner scanner = new Scanner(System.in);
        System.out.println(); System.out.println("Első átlo: ");
        String elsoBe = scanner.nextLine();
        Double egyatlo = Double.valueOf(elsoBe);
        System.out.println("Második átlo: ");                               
        String mBe = scanner.nextLine();
        Double ksatlo = Double.valueOf(mBe); 
        Double osszesen = (1.0/2.0) * egyatlo * ksatlo;
        System.out.println("A területe: " + osszesen);
        scanner.close();

    }
}