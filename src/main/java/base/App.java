/*
 * UCF COP3330 Summer 2021 Assignment 1 Solution
 * Copyright 2021 Ursula Shaw
 */

package base;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your age? ");
        int age = in.nextInt();

        final String msg = age > 15
                ? "You are old enough to legally drive."
                : "You are not old enough to legally drive.";
        System.out.println(msg);
    }
}
