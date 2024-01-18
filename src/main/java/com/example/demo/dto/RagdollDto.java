package com.example.demo.dto;

public class RagdollDto extends CatsDto{
    public RagdollDto(final String name, final int age, final int weight) {
        super(name, age, weight);
    }
    @Override
    public int maxWeight() {
        return 5;
    }

    @Override
    public void setName(final String name) {
        super.setName(name);
    }

    @Override
    public void setAge(final int age) {
        super.setAge(age);
    }

    @Override
    public void setWeight(final int weight) {
        super.setWeight(weight);
    }
}
