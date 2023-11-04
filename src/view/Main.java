package view;

import controller.hashController;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Random rnd = new Random();
        hashController hash = new hashController();
        try {
            for (int i = 1; i <= 40; i++) {
                hash.add(rnd.nextInt(999));
            }
            hash.print();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
