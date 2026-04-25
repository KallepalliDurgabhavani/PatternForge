package com.example.PatternForge.patterns;

import java.util.Collections;
import java.util.List;

public class WidgetNode implements DashboardComponent {
    private final String id;

    public WidgetNode(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String render() {
        return "WidgetNode: " + id;
    }

    @Override
    public void add(DashboardComponent child) {
        throw new UnsupportedOperationException("Cannot add child to WidgetNode");
    }

    @Override
    public void remove(DashboardComponent child) {
        throw new UnsupportedOperationException("Cannot remove child from WidgetNode");
    }

    @Override
    public List<DashboardComponent> getChildren() {
        return Collections.emptyList();
    }
}
