package day5;

import java.io.*;

public class ObjectIO {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectIO objectIO = new ObjectIO();
//        Animal animal = objectIO.setAnimal();
//        objectIO.writeAniaml(animal);
        Animal animal = objectIO.readAnimal();
        System.out.println(animal);
    }

    private Animal setAnimal() {

        Animal zebra = new Animal("czarny", "kot", "Gniewomir");
        //return  new Animal("czarny", "kot", "Gniewomir" ); //anonimowo zwracanie obiektu
        return zebra;
    }


    private Animal readAnimal() throws IOException, ClassNotFoundException {
        File file = new File("animal.dat");
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Animal animal = (Animal) objectInputStream.readObject();
        return animal;
    }

    private void writeAniaml(Animal animal) throws IOException {
        File file = new File("animal.dat");//możemy sprawdzić uprawnienia dostepu, sam w sobie nic nie zrobi
        OutputStream outputStream = new FileOutputStream(file); //
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(animal);
        objectOutputStream.flush(); //zrzucanie pliku
        objectOutputStream.close(); //zamykanie pliku = bardzo ważna rzecz
        outputStream.close(); // tak samo zamykanie pliku bardzo wazna rzecz
    }
}


///zapisaywanie ystawień i ich ustawięń korzysta sie z zapisywania do Obiektu