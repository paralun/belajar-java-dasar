/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.contoh;

import java.util.Arrays;

public class Office {
    
    private final Person[] persons;

    public Office(Person ... persons) {
        this.persons = Arrays.copyOf(persons, persons.length);
    }

    @Override
    public String toString() {
        return String.format("%s{persons=%s}", getClass().getSimpleName(), Arrays.toString(persons));
    }

    public Person[] getPersons() {
        return persons;
    }
}
