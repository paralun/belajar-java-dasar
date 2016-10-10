/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.contoh;

public class Person {

    private String frstName;
    private String lastName;
    private String email;

    public Person() {
    }

    public Person(String frstName, String lastName, String email) {
        this.frstName = frstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFrstName() {
        return frstName;
    }

    public void setFrstName(String frstName) {
        this.frstName = frstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%s[email=%s, first name=%s, last name=%s]",
                getClass().getSimpleName(), email, frstName, lastName);
    }
}
