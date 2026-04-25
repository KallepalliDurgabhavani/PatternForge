package com.example.PatternForge.adapter;

public class LegacyGraphAdapter implements ChartWidget {
    private final LegacyGraphLib legacyGraphLib;

    public LegacyGraphAdapter(LegacyGraphLib legacyGraphLib) {
        this.legacyGraphLib = legacyGraphLib;
    }

    @Override
    public String draw() {
        return legacyGraphLib.plotGraph();
    }
}