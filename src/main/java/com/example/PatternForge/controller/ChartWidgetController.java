package com.example.PatternForge.controller;

import com.example.PatternForge.service.ChartWidgetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/widget")
public class ChartWidgetController {
    private final ChartWidgetService chartWidgetService;

    public ChartWidgetController(ChartWidgetService chartWidgetService) {
        this.chartWidgetService = chartWidgetService;
    }

    @PostMapping("/chart")
    public ResponseEntity<String> createChart(@RequestBody Map<String, String> body) {
        String type = body.get("type");
        String id = chartWidgetService.createChartWidget(type);
        return ResponseEntity.ok(id);
    }

    @GetMapping("/{id}/adapter-trace")
    public List<String> getAdapterTrace(@PathVariable String id) {
        return chartWidgetService.getAdapterTrace(id);
    }
}
