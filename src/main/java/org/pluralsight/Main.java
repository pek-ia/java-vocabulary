package org.pluralsight;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Vocabulary!");

        DefinitionManager dm = new DefinitionFileManager("./dictionary/definitions-as.csv");

        List<Definition> dictionary = dm.getDictionary();
        for (Definition d: dictionary) {
            System.out.println(d.getWord());
            System.out.println("\t" + d.getDefinition());
        }
    }
}
