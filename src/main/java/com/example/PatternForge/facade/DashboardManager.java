package com.example.PatternForge.facade;

import java.util.ArrayList;
import java.util.List;

public class DashboardManager {
    private final LayoutEngine layoutEngine;
    private final ThemeEngine themeEngine;
    private final WidgetRegistry widgetRegistry;
    private final RenderEngine renderEngine;
    private final List<String> callLog = new ArrayList<>();

    public DashboardManager() {
        this.layoutEngine = new LayoutEngine();
        this.themeEngine = new ThemeEngine();
        this.widgetRegistry = new WidgetRegistry();
        this.renderEngine = new RenderEngine();
    }

    public String createDashboard() {
        StringBuilder sb = new StringBuilder();
        sb.append(layoutEngine.layout()).append(", ");
        callLog.add("LayoutEngine.layout()");
        sb.append(themeEngine.theme()).append(", ");
        callLog.add("ThemeEngine.theme()");
        sb.append(widgetRegistry.register()).append(", ");
        callLog.add("WidgetRegistry.register()");
        sb.append(renderEngine.render());
        callLog.add("RenderEngine.render()");
        return sb.toString();
    }

    public List<String> getCallLog() {
        return new ArrayList<>(callLog);
    }
}
