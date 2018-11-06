import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KlasaTestowa {

    /*
     Metoda która przyjmuje ciąg znaków i zwraca ten sam ciąg znaków napisany samymi dużymi
     literami (patrz: metoda obiektu String - toUpperCase()), np. „Ala” zwróci: „ALA”.
    */
    public String stringUpperCase(String ciagZnakow) {

        return ciagZnakow.toUpperCase();
    }
    /*
    Metoda która przyjmuje listę liczb i zwraca największą z nich.
     */

    public List<Integer> listaLiczb(List<Integer> wartosci) {
        int najwyszaLiczba = wartosci.get(0);

        for (int i = 0; i < wartosci.size(); i++) {
            int liczba = wartosci.get(i);
            if (liczba > najwyszaLiczba) {
                najwyszaLiczba = liczba;
            }
        }
        System.out.println("najwyzsza liczba to:");
        return Collections.singletonList(najwyszaLiczba);
    }

    /*
    Metodę która przyjmuje listę liczb i zwraca najmniejszą z nich.
     */
    public List<Integer> listaLiczbSecond(List<Integer> wartosci) {

        int najmniejszaLiczba = wartosci.get(0);
        for (int i = 0; i < wartosci.size(); i++) {
            int liczba = wartosci.get(i);
            if (liczba < najmniejszaLiczba) {
                najmniejszaLiczba = liczba;
            }
        }
        System.out.println("najmniejsza liczba to:");
        return Collections.singletonList(najmniejszaLiczba);
    }

    // Metodę która przyjmie listę liczb i zwróci listę tych które są podzielne przez 3 bez reszty.
//    public List<Integer> listaLiczbThird(List<Integer> wartosci) {
//
//        for (Integer liczbyPodzielne : wartosci) {
//            if (liczbyPodzielne % 3 == 0) {
//                List<Integer> listaLiczbPodzielnychPrzez3 = new ArrayList<>();
//                listaLiczbPodzielnychPrzez3.add(liczbyPodzielne);
//                System.out.println(listaLiczbPodzielnychPrzez3);
//            }
//        }
//        return null;
//    }

    /*
    Zmodyfikuj poprzednią metodę tak aby przyjmowała listę liczb oraz cyfrę przez którą będziesz
dzielił liczby z listy i zwrócisz te które są przez nie podzielne bez reszty. Np. getDivisible(lista,
4) zwróci nową listę tych które były podzielne przez 4.
     */
    public List<Integer> listaLiczbThird(List<Integer> wartosci, int mianownik) {

        for (Integer liczbyPodzielne : wartosci) {
            if (liczbyPodzielne % mianownik == 0) {
                List<Integer> listaLiczbPodzielnychPrzezMianownik = new ArrayList<>();
                listaLiczbPodzielnychPrzezMianownik.add(liczbyPodzielne);
                System.out.print("liczby podzielne podane przez mianownik uzytkownika");
                System.out.println(listaLiczbPodzielnychPrzezMianownik);
            }
        }
        return null;
    }
}


