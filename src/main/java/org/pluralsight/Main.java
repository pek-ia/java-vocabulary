package org.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Vocabulary!");
        DefinitionFileManager dfm = new DefinitionFileManager();
        ArrayList<Definition> dictionary = dfm.getDictionary();
        System.out.println(dictionary);
    }
}
