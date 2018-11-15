import java.util.*;

import static java.lang.Math.abs;

public class KlasaTestowa {

    /*
     Metoda która przyjmuje ciąg znaków i zwraca ten sam ciąg znaków napisany samymi dużymi
     literami (patrz: metoda obiektu String - toUpperCase()), np. „Ala” zwróci: „ALA”.
    */
    public String stringUpperCase(String ciagZnakow) {
        System.out.print("Zadanie 1: ");
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
        System.out.print("Zadanie 2: najwyzszaLiczba: ");
        return Collections.singletonList(najwyszaLiczba);
    }

    /*//
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
        System.out.print("Zadanie 3: najmniejsza liczba to: ");
        return Collections.singletonList(najmniejszaLiczba);
    }

    // Metodę która przyjmie listę liczb i zwróci listę tych które są podzielne przez 3 bez reszty.

    public List<Integer> listaLiczbThird(List<Integer> wartosci) {
        List<Integer> listaLiczbPodzielnychPrzez3 = new ArrayList<>();
        for (Integer liczbyPodzielne : wartosci) {
            if (liczbyPodzielne % 3 == 0) {
                listaLiczbPodzielnychPrzez3.add(liczbyPodzielne);
            }
        }
        System.out.print("Zadanie 4: liczba podzielne przed 3: ");
        return listaLiczbPodzielnychPrzez3;
    }

    /*
    Zmodyfikuj poprzednią metodę tak aby przyjmowała listę liczb oraz cyfrę przez którą będziesz
dzielił liczby z listy i zwrócisz te które są przez nie podzielne bez reszty. Np. getDivisible(lista,
4) zwróci nową listę tych które były podzielne przez 4.
     */
    public List<Integer> listaLiczbThird = new ArrayList<>();

    public List<Integer> listaLiczbThird(List<Integer> wartosci, int mianownik) {

        for (Integer liczbyPodzielne : wartosci) {
            if (liczbyPodzielne % mianownik == 0) {
                listaLiczbThird.add(liczbyPodzielne);
            }
        }
        System.out.print("zadanie 5: liczby podzielne przed mianownik: " + mianownik + " od uzytkownika: ");
        return listaLiczbThird;
    }

    /*
    Metoda która przyjmie zakres od - do i zwróci wszystkie liczby nieparzyste.
     */
    public ArrayList<Integer> liczbyNieparzyste = new ArrayList<>();

    public ArrayList<Integer> liczbyNieparzyste(int min, int max) {
        for (int i = min; i <= max; i++)
            if (i % 2 != 0) {
                liczbyNieparzyste.add(i);
            }
        System.out.print("Zadanie 6: zwraca liczby nieparzyste: ");
        return liczbyNieparzyste;
    }

    /*
    Metoda która przyjmie zakres od - do i zwróci listę liczb pierwszych z tego przedziału.
     */
    public ArrayList<Integer> liczbyPierwsze = new ArrayList<>();

    public ArrayList<Integer> numbersPierwsze(int min, int max) {
        boolean pierwsze[] = new boolean[max];
        Arrays.fill(pierwsze, true);
        pierwsze[0] = false;
        pierwsze[1] = false;
        for (int i = 2; i <= max; i++) {

            for (int t = i + i; t < max; t = t + i) {
                pierwsze[t] = false;
            }
        }
        for (int r = 0; r < max; r++) {
            if (pierwsze[r]) {
                liczbyPierwsze.add(r);
            }
        }
        System.out.print("zadanie 7: liczby pierwsze: ");
        return liczbyPierwsze;
    }

    /*/
    Metodę która po wprowadzeniu ciągu znaków zwróci ile było słów.
     */
    public ArrayList<Integer> ciagZnakow = new ArrayList<>();

    public ArrayList<Integer> zwrotCiaguZnakow(String twojZnak) {
        StringTokenizer stringTokenizer = new StringTokenizer(twojZnak);
        int liczbaTokenow = stringTokenizer.countTokens();
        ciagZnakow.add(liczbaTokenow);
        System.out.print("zadanie 8: ile jest slow: ");
        return ciagZnakow;
    }
    /*
    Metoda która po wprowadzeniu ciągu znaków zwróci ile było liter.
     */

    public ArrayList<Integer> ciagLiter = new ArrayList<>();

    public ArrayList<Integer> zwrotCiaguLiter(String twojZnak) {
        ciagLiter.add(twojZnak.length());
        System.out.print("zadanie 9: ile jest liter w ciagu: ");
        return ciagLiter;
    }


    /*
    Metoda która przyjmie ciąg znaków i usunie z niego wszystkie spacje.
     */
    public String zwrotZnakuBezSpacji(String znakZeSpacjami) {
        System.out.print("zadanie 11: usuwanie spacji ze znaku: ");
        return znakZeSpacjami.replaceAll(" ", "");
    }
}



