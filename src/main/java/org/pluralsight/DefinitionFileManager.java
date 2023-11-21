package org.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class DefinitionFileManager implements DefinitionManager {

    private final String filename;

    public DefinitionFileManager(String filename) {
        this.filename = filename;
    }

    @Override
    public List<Definition> getDictionary() {
        List<Definition> dictionary = new LinkedList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String input;
            while ((input = reader.readLine()) != null){
                String[] vals = input.split("\\|");
                Definition d = new Definition(vals[0], vals[1]);
                dictionary.add(d);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return dictionary;
    }
}
