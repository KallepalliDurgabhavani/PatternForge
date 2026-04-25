package com.example.PatternForge.service;

import com.example.PatternForge.facade.DashboardManager;
import org.springframework.stereotype.Service;

@Service
public class DashboardFacadeService {
    private final DashboardManager dashboardManager = new DashboardManager();

    public String createDashboard() {
        return dashboardManager.createDashboard();
    }

    public java.util.List<String> getCallLog() {
        return dashboardManager.getCallLog();
    }
}
