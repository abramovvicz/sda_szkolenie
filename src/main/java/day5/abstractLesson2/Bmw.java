package day5.abstractLesson2;

public class Bmw extends Car { //tylko raz można rozszerzać w klasach abstrakcyjnych a w interejsie tak
    @Override
    void writeSth() {
        System.out.println("BMW");
    }
}
