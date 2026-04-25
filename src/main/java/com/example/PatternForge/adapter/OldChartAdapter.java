package com.example.PatternForge.adapter;

public class OldChartAdapter implements ChartWidget {
    private final OldChartLib oldChartLib;

    public OldChartAdapter(OldChartLib oldChartLib) {
        this.oldChartLib = oldChartLib;
    }

    @Override
    public String draw() {
        return oldChartLib.renderChart();
    }
}