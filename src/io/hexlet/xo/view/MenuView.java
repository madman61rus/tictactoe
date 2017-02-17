package io.hexlet.xo.view;

import java.util.Scanner;

/**
 * Created by vkompaniec on 17.02.17.
 */
public class MenuView {

    final int START_CODE = 1;
    final int LOAD_CODE = 2;
    final int SETTING_CODE = 3;
    final int EXIT_CODE = 4;

    public int ShowMenuWithResult () {
        System.out.println(START_CODE + " - Start");
        System.out.println(LOAD_CODE + " - Load");
        System.out.println(SETTING_CODE + " - Settings");
        System.out.println(EXIT_CODE + " - Exit");
        System.out.print("> ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case START_CODE :
                System.out.println("START !");
                break;
            case LOAD_CODE:
                System.out.println("Load !");
                break;
            case SETTING_CODE:
                System.out.println("Settings !");
                break;
            case EXIT_CODE:
                System.out.println("EXIT !");
                break;
            default:
                System.out.println("Really ?");
                break;
        }

    }
}
