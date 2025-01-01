package com.project;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class PermutationsTest {

    @Test
    public void testPermutationsList() {

        ArrayList<String> permutations =new ArrayList<>();
        permutations.add("car");
        permutations.add("cra");
        permutations.add("acr");
        permutations.add("arc");
        permutations.add("rca");
        permutations.add("rac");

        assertEquals(permutations, Permutations.permutationsList("car"));

    }

    @Test
    public void testPermutationsListUnique() {

        ArrayList<String> permutations =new ArrayList<>();
        permutations.add("ulll");
        permutations.add("llul");
        permutations.add("lull");
        permutations.add("lllu");

        assertEquals(permutations, Permutations.permutationsListUnique("lull"));

    }

}
