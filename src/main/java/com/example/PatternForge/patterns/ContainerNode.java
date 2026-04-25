package com.example.PatternForge.patterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContainerNode implements DashboardComponent {
    private final String id;
    private final List<DashboardComponent> children = new ArrayList<>();

    public ContainerNode(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String render() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContainerNode: ").append(id).append(" [");
        for (DashboardComponent child : children) {
            sb.append(child.render()).append(", ");
        }
        if (!children.isEmpty()) sb.setLength(sb.length() - 2);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public void add(DashboardComponent child) {
        if (detectCircularReference(child)) {
            throw new IllegalArgumentException("Circular reference detected: " + child.getId());
        }
        children.add(child);
    }

    @Override
    public void remove(DashboardComponent child) {
        children.remove(child);
    }

    @Override
    public List<DashboardComponent> getChildren() {
        return Collections.unmodifiableList(children);
    }

    private boolean detectCircularReference(DashboardComponent child) {
        if (child == this) return true;
        for (DashboardComponent c : child.getChildren()) {
            if (detectCircularReference(c)) return true;
        }
        return false;
    }
}
