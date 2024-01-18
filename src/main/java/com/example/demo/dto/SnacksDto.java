package com.example.demo.dto;

public enum SnacksDto {
    DRIED_FOOD(4, 4), JELLY_SNACKS(10, 3), LIQUID_SNACKS(10, 3), COOKED_UNSEASONED_BEEF(10, 10), COOKED_UNSEASONED_CHICKEN(7, 10), PUREED_BROCCOLI(5, 7), PUREED_PUMPKIN(3, 6);

    private final int levelOfDeliciousness;
    private final int levelOfHealthiness;

    SnacksDto(final int levelOfDeliciousness, final int levelOfHealthiness) {
        this.levelOfDeliciousness = levelOfDeliciousness;
        this.levelOfHealthiness = levelOfHealthiness;
    }

    public int getLevelOfDeliciousness() {
        return levelOfDeliciousness;
    }

    public int getLevelOfHealthiness() {
        return levelOfHealthiness;
    }

}
