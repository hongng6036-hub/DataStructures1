package com.tts;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practice {
    public static void main(String[] args) {
        int N = 1;
        int i  = 1;
        int result = 1;

        for (i = 1; i < 11; i++) {
            result = N*i;
            System.out.println(N + "x" + i + "=" + result);
        }
    }
}