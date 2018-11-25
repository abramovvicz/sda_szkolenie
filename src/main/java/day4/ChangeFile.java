package day4;

import java.io.*;

public class ChangeFile {

    public static void main(String[] args) throws IOException {
        ChangeFile file = new ChangeFile();
        String a = file.changeFile();
        file.writeTxtToFile(a);
    }


    //metoda składa się z modyfikatora = skad ta klasa jest widoczna
    // void czy zwraca czy nie
    //nazwa metody

    private void writeTxtToFile(String text) throws FileNotFoundException {
        File file = new File("nowyPlik.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println(text);
        pw.flush(); // spuszczanie pliku
        pw.close(); //taki zapis musi być

    }

    private String changeFile() throws IOException {//klasa, która osbługuje piki katalogi,
        File file = new File("plik.txt");
        StringBuilder result = new StringBuilder(); //warto zapietać do budowania dużych stringów bardzo dużych

        if (file.exists()) { // sprawdza czy katalog/plik istnieje
            InputStream is = new FileInputStream(file); //implementacja interfejsu
            InputStreamReader isr = new InputStreamReader(is);// przyjmuje strumień is od góry
            BufferedReader reader = new BufferedReader(isr); //bufforowanie
            while (reader.ready()) {

                String s = reader.readLine();
                s = s.toUpperCase();
                result.append(s).append(reader.ready() ? "\r\n" : ""); //zaleta dodaje do jednego obiektu, nie tworzy kolejnych obiektów jak String.

            }


        }
        return result.toString(); //zwracamy stringa
    }
}