package com.example.PatternForge.patterns;

import java.util.List;

public interface DashboardComponent {
    String getId();
    String render();
    void add(DashboardComponent child);
    void remove(DashboardComponent child);
    List<DashboardComponent> getChildren();
}
