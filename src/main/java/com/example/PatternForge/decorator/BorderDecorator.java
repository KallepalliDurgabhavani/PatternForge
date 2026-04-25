package com.example.PatternForge.decorator;

import com.example.PatternForge.patterns.DashboardComponent;

public class BorderDecorator extends WidgetDecorator {
    public BorderDecorator(DashboardComponent component) {
        super(component);
    }

    @Override
    public String render() {
        return "[Border] " + component.render();
    }
}