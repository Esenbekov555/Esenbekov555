package com.company;

import com.google.gson.Gson;

import java.io.*;

public class JsonSerializer {
    public static Cat[] getCat() throws IOException {
        Gson gson = new Gson();
        try(Reader reader = new FileReader("Cats.json")){
            Cat[] cats = gson.fromJson(reader, Cat[].class);
            return cats;
        }
    }

        public static void writeCat(Cat[] cats) throws IOException {
        Gson gson = new Gson();
        try(Writer writer = new FileWriter("Cats.json")){
            String json = gson.toJson(cats);
            writer.write(json);
        }
    }


}
