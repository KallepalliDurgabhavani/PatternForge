package com.example.PatternForge.controller;

import com.example.PatternForge.model.RenderResult;
import com.example.PatternForge.patterns.DashboardComponent;
import com.example.PatternForge.service.DashboardTreeService;
import com.example.PatternForge.service.WidgetDecoratorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/widget")
public class WidgetDecoratorController {
    private final WidgetDecoratorService decoratorService;
    private final DashboardTreeService dashboardTreeService;

    public WidgetDecoratorController(WidgetDecoratorService decoratorService, DashboardTreeService dashboardTreeService) {
        this.decoratorService = decoratorService;
        this.dashboardTreeService = dashboardTreeService;
    }

    @GetMapping("/{id}/decorators")
    public List<String> getDecorators(@PathVariable String id) {
        return decoratorService.getDecorators(id);
    }

    @PostMapping("/{id}/decorators")
    public ResponseEntity<String> addDecorator(@PathVariable String id, @RequestBody Map<String, String> body) {
        decoratorService.addDecorator(id, body.get("type"));
        return ResponseEntity.ok("Decorator added");
    }

    @DeleteMapping("/{id}/decorators/{type}")
    public ResponseEntity<String> removeDecorator(@PathVariable String id, @PathVariable String type) {
        decoratorService.removeDecorator(id, type);
        return ResponseEntity.ok("Decorator removed");
    }

    @PutMapping("/{id}/decorators/reorder")
    public ResponseEntity<String> reorderDecorators(@PathVariable String id, @RequestBody List<String> newOrder) {
        decoratorService.reorderDecorators(id, newOrder);
        return ResponseEntity.ok("Decorators reordered");
    }

    @GetMapping("/{id}/render")
    public RenderResult renderDecorated(@PathVariable String id) {
        DashboardComponent base = dashboardTreeService.getNode(id);
        return decoratorService.renderDecorated(base, id);
    }
}
