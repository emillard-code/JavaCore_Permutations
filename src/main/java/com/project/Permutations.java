package com.project;

import java.util.ArrayList;

public class Permutations {

    private static final ArrayList<String> permutationList = new ArrayList<>();

    // This class is not meant to be instantiated.
    private Permutations() {

    }

    public static ArrayList<String> permutationsList(String string) {

        generatePermutations(string, "");
        ArrayList<String> permutationsArrayList = new ArrayList<>(permutationList);
        permutationList.clear();

        return permutationsArrayList;

    }

    private static void generatePermutations(String string, String permutation) {

        if (string.isEmpty()) {

            permutationList.add(permutation);

            return;

        }

        for (int i = 0; i < string.length(); i++) {

            char permutationCharacter = string.charAt(i);

            String leftoverCharacters = string.substring(0, i) + string.substring(i + 1);
            generatePermutations(leftoverCharacters, permutation + permutationCharacter);

        }

    }

}
