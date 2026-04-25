package com.example.PatternForge.controller;

import com.example.PatternForge.service.ProxyWidgetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/widget")
public class ProxyWidgetController {
    private final ProxyWidgetService proxyWidgetService;

    public ProxyWidgetController(ProxyWidgetService proxyWidgetService) {
        this.proxyWidgetService = proxyWidgetService;
    }

    @PostMapping("/{id}/load")
    public ResponseEntity<String> loadWidget(@PathVariable String id) {
        String result = proxyWidgetService.loadWidget(id);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}/proxy-state")
    public ResponseEntity<Boolean> getProxyState(@PathVariable String id) {
        return ResponseEntity.ok(proxyWidgetService.getProxyState(id));
    }

    @PutMapping("/session/role")
    public ResponseEntity<String> setRole(@RequestBody Map<String, String> body) {
        String role = body.get("role");
        proxyWidgetService.setRole(role);
        return ResponseEntity.ok("Role set to " + role);
    }

    @GetMapping("/audit-log")
    public List<String> getAuditLog(@RequestParam String id) {
        return proxyWidgetService.getAuditLog(id);
    }
}
