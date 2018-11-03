import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class KlasaTestowa {

    /*
     Metoda która przyjmuje ciąg znaków i zwraca ten sam ciąg znaków napisany samymi dużymi
     literami (patrz: metoda obiektu String - toUpperCase()), np. „Ala” zwróci: „ALA”.
    */
    public String StringUpperCase(String ciagZnakow) {

        return ciagZnakow.toUpperCase();
    }
    /*
    Metoda która przyjmuje listę liczb i zwraca największą z nich.
     */

    public ArrayList<Integer> listaLiczb() {
        ArrayList<Integer> dodajLiczbe = new ArrayList<>();
        dodajLiczbe.add(77);
        dodajLiczbe.add(12);
        dodajLiczbe.add(13);
        dodajLiczbe.add(2222);
        dodajLiczbe.add(5);
        dodajLiczbe.add(7779);

        //System.out.println(Collections.max(dodajLiczbe));
        //System.out.println(Collections.min(dodajLiczbe));

        int najwyszaLiczba = dodajLiczbe.get(0);
        int najmniejszaLiczba = dodajLiczbe.get(0);

        for (int i = 0; i < dodajLiczbe.size(); i++) {
            int liczba = dodajLiczbe.get(i);
            if (liczba > najwyszaLiczba) {
                najwyszaLiczba = liczba;
            }
            if (liczba < najmniejszaLiczba) {
                najmniejszaLiczba = liczba;
            }
        }
        System.out.println(najwyszaLiczba);
        System.out.println(najmniejszaLiczba);

        return dodajLiczbe;
    }
}
