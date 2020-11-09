package org.example;


public class App 
{
    public static void main( String[] args )
    {

        Car referintaMasina = new Car();
     referintaMasina.nume = "  Ferrari";
     referintaMasina.vitezaMax =  300;
          referintaMasina.totalBenzina = 60;
          referintaMasina.consumMediu =  12.5;
          referintaMasina.distantaTotalaParcursa =  0;
          referintaMasina.daune =  true;
          referintaMasina.nrUsi =  2;
          referintaMasina.culoare = " Rosu";

        System.out.println("Proproetati masina: " + referintaMasina.nume);
        System.out.println("Viteaza maxima: " + referintaMasina.vitezaMax);
        System.out.println("Total benzina: " + referintaMasina.totalBenzina);
        System.out.println("Consum mediu: " + referintaMasina.consumMediu);
        System.out.println("Distanta totala: " + referintaMasina.distantaTotalaParcursa);
        System.out.println("Daune: " + referintaMasina.daune);
        System.out.println("Numar usi: " + referintaMasina.nrUsi);
        System.out.println("Culoare: " + referintaMasina.culoare);


        Car masina2 = new Car();
        masina2.nume = " Dacia";
        masina2.totalBenzina = 70;
        masina2.distantaTotalaParcursa = 100;

        System.out.println("Proproetati masina: " + masina2.nume);
        System.out.println("Viteaza maxima: " + masina2.vitezaMax);
        System.out.println("Total benzina: " + masina2.totalBenzina);
        System.out.println("Consum mediu: " + masina2.consumMediu);
        System.out.println("Distanta totala: " + masina2.distantaTotalaParcursa);
        System.out.println("Daune: " + masina2.daune);
        System.out.println("Numar usi: " + masina2.nrUsi);
        System.out.println("Culoare: " + masina2.culoare);

        System.out.println("Nume initial car1: " + referintaMasina.nume);
        referintaMasina.nume = "Audi";
        System.out.println("Nume final car1: " + referintaMasina.nume);


        referintaMasina = new Car();
        System.out.println("Numele noii masini: " + referintaMasina.nume);
        referintaMasina.nume = "BMW";


        referintaMasina = masina2;
        System.out.println("Numele masinii referinta din masina2: " + referintaMasina.nume);
        System.out.println("Numele masinii referinta din masina2: " + masina2.nume);


        masina2.nume = "Bugati";
        System.out.println(" Update  Numele masinii referinta din masina2: " + referintaMasina.nume);
        System.out.println("Update   Numele masinii referinta din masina2: " + masina2.nume);











    }
}
