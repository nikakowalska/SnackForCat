package com.example.demo.dto;

public abstract class CatsDto {
    private String name;
    private int age;
    private int weight;

    public CatsDto(final String name, final int age, final int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public abstract int maxWeight();

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(final int weight) {
        this.weight = weight;
    }

}
