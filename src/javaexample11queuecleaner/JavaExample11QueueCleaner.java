package javaexample11queuecleaner;

import java.io.InputStreamReader;

public class JavaExample11QueueCleaner {

    public static void main(String[] args) {

        System.out.print("Please enter two characters. Then, press enter: ");

        char a1 = ' ', a2 = ' ', a3 = ' ';
        try (
                InputStreamReader in = new InputStreamReader(System.in);) {

            a1 = (char) in.read();
            a2 = (char) in.read();

            in.read(); // this is for the "enter" char
            
            in.read(); // not necessary. It is used in some plattforms which produce two chars for "enter".

            System.out.print("Enter a third char: ");
            a3 = (char) in.read();

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        System.out.println("First char: " + a1);
        System.out.println("Second char: " + a2);
        System.out.println("Third char: " + a3);

    }

}
