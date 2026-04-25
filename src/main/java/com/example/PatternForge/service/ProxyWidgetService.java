package com.example.PatternForge.service;

import com.example.PatternForge.proxy.*;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProxyWidgetService {
    private final Map<String, AuditWidgetProxy> widgetMap = new HashMap<>();
    private final Map<String, AccessControlProxy> accessMap = new HashMap<>();
    private String currentRole = "user";
    private int counter = 1;

    public String createProxyWidget() {
        VideoWidget videoWidget = new VideoWidget();
        LazyWidgetProxy lazyProxy = new LazyWidgetProxy(videoWidget);
        AccessControlProxy accessProxy = new AccessControlProxy(lazyProxy);
        AuditWidgetProxy auditProxy = new AuditWidgetProxy(accessProxy);
        String id = "proxy-" + (counter++);
        widgetMap.put(id, auditProxy);
        accessMap.put(id, accessProxy);
        return id;
    }

    public String loadWidget(String id) {
        AuditWidgetProxy auditProxy = widgetMap.get(id);
        if (auditProxy == null) throw new IllegalArgumentException("Widget not found: " + id);
        return auditProxy.load();
    }

    public boolean getProxyState(String id) {
        AuditWidgetProxy auditProxy = widgetMap.get(id);
        if (auditProxy == null) throw new IllegalArgumentException("Widget not found: " + id);
        return auditProxy.isLoaded();
    }

    public void setRole(String role) {
        this.currentRole = role;
        for (AccessControlProxy proxy : accessMap.values()) {
            proxy.setRole(role);
        }
    }

    public String getRole() {
        return currentRole;
    }

    public List<String> getAuditLog(String id) {
        AuditWidgetProxy auditProxy = widgetMap.get(id);
        if (auditProxy == null) throw new IllegalArgumentException("Widget not found: " + id);
        return auditProxy.getAuditLog();
    }
}
