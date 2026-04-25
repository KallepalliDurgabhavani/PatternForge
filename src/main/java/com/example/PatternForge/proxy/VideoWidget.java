package com.example.PatternForge.proxy;

public class VideoWidget implements HeavyWidget {
    private boolean loaded = false;

    @Override
    public String load() {
        loaded = true;
        return "VideoWidget loaded";
    }

    @Override
    public boolean isLoaded() {
        return loaded;
    }
    
}

