package com.example.project;

public class owl {

    private String name;
    private String size;
    private String cost;
    private String category;
    private String location;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public owl(String name, String size, String cost, String category, String location) {
        this.name = name;
        this.size = size;
        this.cost = cost;
        this.category = category;
        this.location = location;
    }
}
