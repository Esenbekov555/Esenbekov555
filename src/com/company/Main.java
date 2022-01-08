package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Implementation im = new Implementation();
        while (true) {
            im.print();
            im.catAction();
            im.print();
        }
    }
}
