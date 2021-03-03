package com.classExercise;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PentaxCollectionsTest {
    PentaxCollections pentaxCollections;

    @BeforeEach
    void setUp() {
        pentaxCollections = new PentaxCollections();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void pentaxList(){
        List<String> pentax = new ArrayList<>();
        pentax.add("Sukanmi");
        pentax.add("Lasuite");
        pentax.add("Onyi");
        Iterator<String> names = pentax.iterator();
        while(names.hasNext()){
            System.out.println();
        }
    }

    @Test
    void pentaxSet(){
        SortedSet<String> lasuites = new TreeSet<>();
        lasuites.add("Mr. 10%");
        lasuites.add("Dimeji");
        lasuites.add("Chijioke");
        assertTrue(lasuites.size() == 3);
        lasuites.remove("Mr. 10%");
        assertTrue(lasuites.size() == 2);

        Iterator<String> wimps = lasuites.iterator();
        while (wimps.hasNext())
            System.out.println(wimps.next());

        String name = lasuites.first();
        assertTrue(name.equals("Chijioke"));
        name = lasuites.last();
        assertTrue(name.equals("Dimeji"));

    }

    @Test
    void pentaxMap(){
        Map<String, String> pentaxWimps = new HashMap<>();
        pentaxWimps.put("SCV5001", "Dami");
        pentaxWimps.put("SCV5010", "Kenny");
        pentaxWimps.put("SCV5003", "Lasuite");

        Set<String> pentaxIds = pentaxWimps.keySet();
        assertTrue(pentaxIds.size() == 3);
        Iterator<String> keys = pentaxIds.iterator();
        while (keys.hasNext()){
            String key = keys.next();
            String value = pentaxWimps.get(key);
        }
    }

}