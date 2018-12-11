package utils;

import java.io.*;

//metody utilsowe mają być publiczne i statyczne dlatego zeby sie dostawac przez nazwe klasy a nie obiekty
public class Utils {

    public static void writeTxtToFile(String fileTxt, String text) throws FileNotFoundException {
        File file = new File(fileTxt);
        PrintWriter pw = new PrintWriter(fileTxt);
        pw.println(text);
        pw.flush(); // spuszczanie pliku
        pw.close(); //taki zapis musi być

    }

    public static String readTxtFile(String fileTxt) throws IOException {//klasa, która osbługuje piki katalogi,
        File file = new File(fileTxt);
        StringBuilder result = new StringBuilder(); //warto zapietać do budowania dużych stringów bardzo dużych

        if (file.exists()) { // sprawdza czy katalog/plik istnieje
            InputStream is = new FileInputStream(file); //implementacja interfejsu
            InputStreamReader isr = new InputStreamReader(is);// przyjmuje strumień is od góry
            BufferedReader reader = new BufferedReader(isr); //bufforowanie
            while (reader.ready()) {
                result.append(reader.readLine()).append(reader.ready() ? "\r\n" : ""); //zaleta dodaje do jednego obiektu, nie tworzy kolejnych obiektów jak String.
            }
        }
        return result.toString(); //zwracamy stringa
    }

    public static Object readObject(String someFile) throws IOException, ClassNotFoundException {
        File file = new File(someFile);
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        return objectInputStream.readObject();
    }

    public static void writeObject(String fileTxt, Object object) throws IOException {
        File file = new File(fileTxt);//możemy sprawdzić uprawnienia dostepu, sam w sobie nic nie zrobi
        OutputStream outputStream = new FileOutputStream(file); //
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(object);
        objectOutputStream.flush(); //zrzucanie pliku
        objectOutputStream.close(); //zamykanie pliku = bardzo ważna rzecz
        outputStream.close(); // tak samo zamykanie pliku bardzo wazna rzecz
    }
}
