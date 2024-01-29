package com.mycompany.proyectoapirest.dto;

import java.util.ArrayList;

class Idd {
    public String root;
    public ArrayList<String> suffixes;

    @Override
    public String toString() {
        return "{\n"
                + "  \"root\": \"" + root + "\",\n"
                + "  \"suffixes\": " + suffixes + "\n"
                + "}";
    }
}

class Name {
    public String common;
    public String official;

    @Override
    public String toString() {
        return "{\n"
                + "  \"common\": \"" + common + "\",\n"
                + "  \"official\": \"" + official + "\"\n"
                + "}";
    }
}

public class Root {
    public Name name;
    public ArrayList<String> tld;
    public String cca2;
    public String ccn3;
    public String cca3;
    public String cioc;
    public boolean independent;
    public String status;
    public boolean unMember;
    public Idd idd;
    public ArrayList<String> capital;
    public ArrayList<String> altSpellings;

    @Override
    public String toString() {
        return "{\n"
                + "  \"name\": " + name + ",\n"
                + "  \"tld\": " + tld + ",\n"
                + "  \"cca2\": \"" + cca2 + "\",\n"
                + "  \"ccn3\": \"" + ccn3 + "\",\n"
                + "  \"cca3\": \"" + cca3 + "\",\n"
                + "  \"cioc\": \"" + cioc + "\",\n"
                + "  \"independent\": " + independent + ",\n"
                + "  \"status\": \"" + status + "\",\n"
                + "  \"unMember\": " + unMember + ",\n"
                + "  \"idd\": " + idd + ",\n"
                + "  \"capital\": " + capital + ",\n"
                + "  \"altSpellings\": " + altSpellings + "\n"
                + "}\n";
    }
}
