package com.example.PatternForge.controller;

import com.example.PatternForge.patterns.DashboardComponent;
import com.example.PatternForge.service.DashboardTreeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {
    private final DashboardTreeService dashboardTreeService;

    public DashboardController(DashboardTreeService dashboardTreeService) {
        this.dashboardTreeService = dashboardTreeService;
    }

    @GetMapping("/tree")
    public List<DashboardComponent> getTree() {
        return dashboardTreeService.getTree();
    }

    @PostMapping("/container")
    public DashboardComponent createContainer(@RequestBody Map<String, String> body) {
        return dashboardTreeService.createContainer(body.get("id"));
    }

    @PostMapping("/widget")
    public DashboardComponent createWidget(@RequestBody Map<String, String> body) {
        return dashboardTreeService.createWidget(body.get("id"));
    }

    @PutMapping("/{containerId}/add/{childId}")
    public ResponseEntity<String> addChild(@PathVariable String containerId, @PathVariable String childId) {
        dashboardTreeService.addChild(containerId, childId);
        return ResponseEntity.ok("Child added");
    }

    @DeleteMapping("/node/{id}")
    public ResponseEntity<String> removeNode(@PathVariable String id) {
        dashboardTreeService.removeNode(id);
        return ResponseEntity.ok("Node removed");
    }

    @PostMapping("/render-all")
    public String renderAll() {
        return dashboardTreeService.renderAll();
    }
}
