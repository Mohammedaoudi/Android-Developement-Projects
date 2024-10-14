package com.tp4.cars.beans;

public class Car {
    private  int id;
    private String img;
    private String name;
    private float star;

    private static int comp;

    public Car(String img, String name, float star) {
        this.id = ++comp;
        this.img = img;
        this.name = name;
        this.star = star;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getStar() {
        return star;
    }

    public void setStar(float star) {
        this.star = star;
    }
}
