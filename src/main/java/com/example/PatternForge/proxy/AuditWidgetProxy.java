package com.example.PatternForge.proxy;

import java.util.ArrayList;
import java.util.List;

public class AuditWidgetProxy implements HeavyWidget {
    private final HeavyWidget widget;
    private final List<String> auditLog = new ArrayList<>();

    public AuditWidgetProxy(HeavyWidget widget) {
        this.widget = widget;
    }

    @Override
    public String load() {
        String result = widget.load();
        auditLog.add("load() called: " + result);
        return result;
    }

    @Override
    public boolean isLoaded() {
        return widget.isLoaded();
    }

    public List<String> getAuditLog() {
        return new ArrayList<>(auditLog);
    }
}