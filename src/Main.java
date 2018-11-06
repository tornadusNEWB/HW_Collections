import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        KlasaTestowa klasaTestowa = new KlasaTestowa();
        System.out.println(klasaTestowa.stringUpperCase("kot"));



        List<Integer> wartosci = new ArrayList<>();
        wartosci.add(100);
        wartosci.add(66);
        wartosci.add(33);
        wartosci.add(-11);
        wartosci.add(-55);
        wartosci.add(55);

        System.out.println(klasaTestowa.listaLiczb(wartosci));
        System.out.println(klasaTestowa.listaLiczbSecond(wartosci));
        System.out.println(klasaTestowa.listaLiczbThird(wartosci,5));

    }
}
