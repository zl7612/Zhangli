package com.homework.Homework_09;

public class LabelPoint extends Point{
    private String label;

    public LabelPoint(double x, double y, String label) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return super.toString() + "label=" + label;
    }
}
