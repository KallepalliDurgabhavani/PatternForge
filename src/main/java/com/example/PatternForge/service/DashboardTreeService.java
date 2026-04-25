package com.example.PatternForge.service;

import com.example.PatternForge.patterns.ContainerNode;
import com.example.PatternForge.patterns.DashboardComponent;
import com.example.PatternForge.patterns.WidgetNode;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DashboardTreeService {
    private final Map<String, DashboardComponent> nodeMap = new HashMap<>();
    private final ContainerNode root = new ContainerNode("root");

    public DashboardTreeService() {
        nodeMap.put(root.getId(), root);
    }

    public DashboardComponent getRoot() {
        return root;
    }

    public List<DashboardComponent> getTree() {
        return root.getChildren();
    }

    public ContainerNode createContainer(String id) {
        ContainerNode container = new ContainerNode(id);
        nodeMap.put(id, container);
        return container;
    }

    public WidgetNode createWidget(String id) {
        WidgetNode widget = new WidgetNode(id);
        nodeMap.put(id, widget);
        return widget;
    }

    public void addChild(String containerId, String childId) {
        DashboardComponent container = nodeMap.get(containerId);
        DashboardComponent child = nodeMap.get(childId);
        if (!(container instanceof ContainerNode)) {
            throw new IllegalArgumentException("Not a container: " + containerId);
        }
        ((ContainerNode) container).add(child);
    }

    public void removeNode(String id) {
        DashboardComponent node = nodeMap.get(id);
        if (node == null || node == root) return;
        // Remove from parent's children
        for (DashboardComponent comp : nodeMap.values()) {
            if (comp instanceof ContainerNode) {
                ((ContainerNode) comp).remove(node);
            }
        }
        nodeMap.remove(id);
    }

    public String renderAll() {
        return root.render();
    }

    public DashboardComponent getNode(String id) {
        return nodeMap.get(id);
    }
}
