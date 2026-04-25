package com.example.PatternForge.controller;

import com.example.PatternForge.service.DashboardFacadeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/facade")
public class DashboardFacadeController {
    private final DashboardFacadeService dashboardFacadeService;

    public DashboardFacadeController(DashboardFacadeService dashboardFacadeService) {
        this.dashboardFacadeService = dashboardFacadeService;
    }

    @PostMapping("/create-dashboard")
    public ResponseEntity<String> createDashboard() {
        String result = dashboardFacadeService.createDashboard();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/call-log")
    public List<String> getCallLog() {
        return dashboardFacadeService.getCallLog();
    }
}
