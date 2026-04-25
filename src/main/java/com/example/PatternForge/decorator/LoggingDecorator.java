package com.example.PatternForge.decorator;

import com.example.PatternForge.patterns.DashboardComponent;

public class LoggingDecorator extends WidgetDecorator {
    public LoggingDecorator(DashboardComponent component) {
        super(component);
    }

    @Override
    public String render() {
        System.out.println("Rendering widget: " + component.getId());
        return "[Log] " + component.render();
    }
}