package OopTest.Ogrenci;

public class Ogrenci {
    public int id;
    public String name;
    public String surName;
    public int age;

    public Ogrenci()
    {

    }

    public Ogrenci(String name, int id, String surName, int age) {
        this.name = name;
        this.id = id;
        this.surName = surName;
        this.age = age;
    }
}
