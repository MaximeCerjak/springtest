package com.example.demo.model;

public class Etudiant {
    private int id;
    private String name;
    private int age;

    public Etudiant() {
    }

    public Etudiant(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void display() {
        System.out.println("Etudiant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}');
    }

    public void display(String message) {
        System.out.println(message + " Etudiant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}');
    }
}
