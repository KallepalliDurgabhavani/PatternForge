package com.example.PatternForge.proxy;

public class LazyWidgetProxy implements HeavyWidget {
    private final VideoWidget videoWidget;
    private boolean loaded = false;

    public LazyWidgetProxy(VideoWidget videoWidget) {
        this.videoWidget = videoWidget;
    }

    @Override
    public String load() {
        if (!loaded) {
            loaded = true;
            return videoWidget.load();
        }
        return "Already loaded";
    }

    @Override
    public boolean isLoaded() {
        return loaded;
    }
}