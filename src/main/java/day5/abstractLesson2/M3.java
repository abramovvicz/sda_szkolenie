package day5.abstractLesson2;

public class M3 extends Bmw {
    @Override
    public void setName(String name) {
        super.setName("m3 " + name);
    }
    public void setText(){
        System.out.println("wypisz tekst z m3");
    }
}
