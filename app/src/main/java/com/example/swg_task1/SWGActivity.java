package com.example.swg_task1;

import android.graphics.Bitmap;

public class SWGActivity {
    private String name;
    private String description;
    private int evtImage;

    public SWGActivity(String name, String description, int evtImage) {
        this.name = name;
        this.description = description;
        this.evtImage = evtImage;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getEvtImage() {
        return evtImage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEvtImage(int evtImage) {
        this.evtImage = evtImage;
    }
}
