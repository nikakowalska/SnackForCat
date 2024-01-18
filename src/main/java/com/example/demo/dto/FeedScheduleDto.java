package com.example.demo.dto;

public class FeedScheduleDto {
    private boolean morningFeed;
    private boolean eveningFeed;

    private String alert;

    //local time
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
                ", alert='" + alert + '\'' +
                '}';
    }
}
