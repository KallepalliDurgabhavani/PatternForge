package com.example.PatternForge.decorator;

import com.example.PatternForge.patterns.DashboardComponent;

public class ShadowDecorator extends WidgetDecorator {
    public ShadowDecorator(DashboardComponent component) {
        super(component);
    }

    @Override
    public String render() {
        return "[Shadow] " + component.render();
    }
}