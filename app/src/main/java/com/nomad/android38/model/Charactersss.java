package com.nomad.android38.model;

import java.io.Serializable;

public class Charactersss implements Serializable {
    private String name;
    private String live;
    private Integer image;

    public Charactersss(String name, String live, Integer image) {
        this.name = name;
        this.live = live;
        this.image = image;
    }

    public Charactersss(String name, String live) {
        this.name = name;
        this.live = live;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLive() {
        return live;
    }

    public void setLive(String live) {
        this.live = live;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
