package day7.enums;

public class KolorSingle {
    public final static KolorSingle RED = new KolorSingle("czerwony");
    public final static KolorSingle GREEN = new KolorSingle("zielony");
    public final static KolorSingle YELLOW = new KolorSingle("żółty");
    private KolorSingle(String kolor) {
        System.out.println(kolor);
    }
}
