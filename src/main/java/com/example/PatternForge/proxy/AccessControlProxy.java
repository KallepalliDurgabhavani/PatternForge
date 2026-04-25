package com.example.PatternForge.proxy;

public class AccessControlProxy implements HeavyWidget {
    private final HeavyWidget widget;
    private String role = "user";

    public AccessControlProxy(HeavyWidget widget) {
        this.widget = widget;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String load() {
        if ("admin".equals(role)) {
            return widget.load();
        }
        return "Access denied";
    }

    @Override
    public boolean isLoaded() {
        return widget.isLoaded();
    }
}