package com.example.PatternForge.decorator;

import com.example.PatternForge.patterns.DashboardComponent;
import java.util.List;

public abstract class WidgetDecorator implements DashboardComponent {
    protected final DashboardComponent component;

    public WidgetDecorator(DashboardComponent component) {
        this.component = component;
    }

    @Override
    public String getId() {
        return component.getId();
    }

    @Override
    public void add(DashboardComponent child) {
        component.add(child);
    }

    @Override
    public void remove(DashboardComponent child) {
        component.remove(child);
    }

    @Override
    public List<DashboardComponent> getChildren() {
        return component.getChildren();
    }
}
