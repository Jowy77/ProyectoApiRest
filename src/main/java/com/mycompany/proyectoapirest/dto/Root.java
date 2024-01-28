package com.mycompany.proyectoapirest.dto;

class Cat {

    public String official;
    public String common;

    public Cat(String official, String common) {
        this.official = official;
        this.common = common;
    }

    @Override
    public String toString() {
        return "Cat{"
                + "official='" + official + '\''
                + ", common='" + common + '\''
                + '}';
    }
}

class NativeName {

    public Cat cat;

    public NativeName(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "NativeName{"
                + "cat=" + cat
                + '}';
    }
}

class Name {

    public String common;
    public String official;
    public NativeName nativeName;

    public Name(String common, String official, NativeName nativeName) {
        this.common = common;
        this.official = official;
        this.nativeName = nativeName;
    }

    @Override
    public String toString() {
        return "Name{"
                + "common='" + common + '\''
                + ", official='" + official + '\''
                + ", nativeName=" + nativeName
                + '}';
    }
}

public class Root {

    public Name name;

    public Root(Name name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Root{"
                + "name=" + name
                + '}';
    }
}
