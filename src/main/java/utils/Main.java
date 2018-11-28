package utils;

import day3.Car;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException {
//        Utils.writeTxtToFile("newFile.txt", "tworzymy nowy plik ");
        String s = Utils.readTxtFile("newFile.txt");
        System.out.println(s);
        Car car = new Car("audi", "czarny", 300);
        Utils.writeObject("Car.dat", car);
    }
}
