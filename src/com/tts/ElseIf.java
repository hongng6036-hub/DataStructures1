package com.tts;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a number");
        int N = scanner.nextInt();
  //      scanner.skip("dnasudaoidad?");
    //    scanner.close();

        //Odd number
        if (N %2 == 1) {
            System.out.println("This is odd.");;
        }         //Even number
        else if (N %2 == 0 && N>1 && N<6) {
            System.out.println("Not Weird");
        } else if (N%2 ==0 && N>5 && N<21) {
            System.out.println("Weird");
        } else if (N%2 ==0 && N > 20) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Hi");
        }
    }
}
