package day4;

import java.io.*;

public class FileIO {
    private String txtFile = "file.txt";

    public static void main(String[] args) throws IOException {
        FileIO fileIO = new FileIO();
//        fileIO.writeTxtToFile("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod term.");

        String result = fileIO.readTxtFile3();

        System.out.println(result);
    }

    private void writeTxtToFile(String text) throws FileNotFoundException {
        File file = new File(txtFile);
        PrintWriter pw = new PrintWriter(txtFile);
        pw.println(text);
        pw.flush(); // spuszczanie pliku
        pw.close(); //taki zapis musi być

    }

    private void readTxtFile() throws IOException {//klasa, która osbługuje piki katalogi,
        File file = new File(txtFile);
        if (file.exists()) { // sprawdza czy katalog/plik istnieje
            InputStream is = new FileInputStream(file); //implementacja interfejsu
            InputStreamReader isr = new InputStreamReader(is);// przyjmuje strumień is od góry
            BufferedReader reader = new BufferedReader(isr); //bufforowanie
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        }
    }


    private String readTxtFile2() throws IOException {//klasa, która osbługuje piki katalogi,
        File file = new File(txtFile);
        String result = "";

        if (file.exists()) { // sprawdza czy katalog/plik istnieje
            InputStream is = new FileInputStream(file); //implementacja interfejsu
            InputStreamReader isr = new InputStreamReader(is);// przyjmuje strumień is od góry
            BufferedReader reader = new BufferedReader(isr); //bufforowanie
            while (reader.ready()) {
                result += reader.readLine(); //
                result += reader.ready() ? "\r\n" : ""; // cyz jest ready musi być sprawdzone i sprawdza czy jest ostatnia lnijka czy nie jak jesr eady czyli wczytal
            }

        }
        return result;
    }

    private String readTxtFile3() throws IOException {//klasa, która osbługuje piki katalogi,
        File file = new File(txtFile);
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


}
//StringBuilder = tylko jednowątkowo
//StringBuffer = wielowatkowe ale mniej wydajnie
//oprogramowanie lazy, które robi coś co jest potrzebne a nie jak go wywoałmy przykład Youtube