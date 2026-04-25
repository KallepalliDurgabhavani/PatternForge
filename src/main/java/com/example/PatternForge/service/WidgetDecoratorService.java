package com.example.PatternForge.service;

import com.example.PatternForge.decorator.*;
import com.example.PatternForge.model.RenderResult;
import com.example.PatternForge.patterns.DashboardComponent;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class WidgetDecoratorService {
    private final Map<String, List<String>> widgetDecorators = new HashMap<>();

    public List<String> getDecorators(String widgetId) {
        return widgetDecorators.getOrDefault(widgetId, new ArrayList<>());
    }

    public void addDecorator(String widgetId, String type) {
        widgetDecorators.computeIfAbsent(widgetId, k -> new ArrayList<>()).add(type);
    }

    public void removeDecorator(String widgetId, String type) {
        widgetDecorators.computeIfPresent(widgetId, (k, v) -> { v.remove(type); return v; });
    }

    public void reorderDecorators(String widgetId, List<String> newOrder) {
        widgetDecorators.put(widgetId, new ArrayList<>(newOrder));
    }

    public DashboardComponent decorate(DashboardComponent base, String widgetId) {
        List<String> decorators = widgetDecorators.getOrDefault(widgetId, new ArrayList<>());
        DashboardComponent decorated = base;
        for (String type : decorators) {
            switch (type) {
                case "border" -> decorated = new BorderDecorator(decorated);
                case "shadow" -> decorated = new ShadowDecorator(decorated);
                case "log" -> decorated = new LoggingDecorator(decorated);
            }
        }
        return decorated;
    }

    public RenderResult renderDecorated(DashboardComponent base, String widgetId) {
        DashboardComponent decorated = decorate(base, widgetId);
        return new RenderResult(widgetId, decorated.render());
    }
}
