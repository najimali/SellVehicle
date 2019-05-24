package com.dextroxd.sellvehicle.Model;

public class ModelCard
{
    String imageUrl;
    String cost;
    String title;
    boolean like;
    String description;
    String location;
    public ModelCard(String imageUrl, String cost, String title, boolean like, String description, String location) {
        this.imageUrl = imageUrl;
        this.cost = cost;
        this.title = title;
        this.like = like;
        this.description = description;
        this.location = location;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getCost() {
        return cost;
    }

    public String getTitle() {
        return title;
    }

    public boolean isLike() {
        return like;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }
}
