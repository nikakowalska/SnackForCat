package com.example.demo.dto;

public class FeedScheduleDto {
    private boolean morningFeed;
    private boolean eveningFeed;
    private final int MIN_BALANCE_OF_HEALTH = 7;
    private final int MIN_BALANCE_OF_HAPPINESS = 6;
    private String alert;

    public FeedScheduleDto(final boolean morningFeed, final boolean eveningFeed, final String alert) {
        this.morningFeed = morningFeed;
        this.eveningFeed = eveningFeed;
        this.alert = alert;
    }

    public boolean isMorningFeed() {
        return morningFeed;
    }

    public void setMorningFeed(final boolean morningFeed) {
        this.morningFeed = morningFeed;
    }

    public boolean isEveningFeed() {
        return eveningFeed;
    }

    public void setEveningFeed(final boolean eveningFeed) {
        this.eveningFeed = eveningFeed;
    }

    public int getMIN_BALANCE_OF_HEALTH() {
        return MIN_BALANCE_OF_HEALTH;
    }

    public int getMIN_BALANCE_OF_HAPPINESS() {
        return MIN_BALANCE_OF_HAPPINESS;
    }

    public String getAlert() {
        return alert;
    }

    public void setAlert(final String alert) {
        this.alert = alert;
    }

    @Override
    public String toString() {
        return "FeedScheduleDto{" +
                "morningFeed=" + morningFeed +
                ", eveningFeed=" + eveningFeed +
                ", MIN_BALANCE_OF_HEALTH=" + MIN_BALANCE_OF_HEALTH +
                ", MIN_BALANCE_OF_FUN=" + MIN_BALANCE_OF_HAPPINESS +
                ", alert='" + alert + '\'' +
                '}';
    }
}
