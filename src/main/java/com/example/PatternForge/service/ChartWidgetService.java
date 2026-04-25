package com.example.PatternForge.service;

import com.example.PatternForge.adapter.*;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ChartWidgetService {
    private final Map<String, ChartWidget> chartWidgets = new HashMap<>();
    private final Map<String, List<String>> adapterTrace = new HashMap<>();
    private int counter = 1;

    public String createChartWidget(String type) {
        String id = "chart-" + (counter++);
        ChartWidget widget;
        switch (type) {
            case "legacy":
                widget = new LegacyGraphAdapter(new LegacyGraphLib());
                break;
            case "old":
                widget = new OldChartAdapter(new OldChartLib());
                break;
            default:
                throw new IllegalArgumentException("Unknown chart type: " + type);
        }
        chartWidgets.put(id, widget);
        adapterTrace.put(id, new ArrayList<>(List.of("Created with type: " + type)));
        return id;
    }

    public String drawChart(String id) {
        ChartWidget widget = chartWidgets.get(id);
        if (widget == null) throw new IllegalArgumentException("Widget not found: " + id);
        String result = widget.draw();
        adapterTrace.get(id).add("draw() called: " + result);
        return result;
    }

    public List<String> getAdapterTrace(String id) {
        return adapterTrace.getOrDefault(id, List.of("No trace found"));
    }
}
