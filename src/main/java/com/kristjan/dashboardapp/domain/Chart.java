package com.kristjan.dashboardapp.domain;

import java.util.List;

public class Chart {

    private String htmlId;
    private String type;
    private String title;
    private String label;
    private List<String> backgroundColor;
    private List<String> borderColor;
    private List<String> labels;
    private List<Integer> data;
    private Coordinates coordinates;

    public Chart() {
    }

    public Chart(String htmlId, String type, String title, String label, List<String> backgroundColor, List<String> borderColor, List<String> labels, List<Integer> data, Coordinates coordinates) {
        this.htmlId = htmlId;
        this.type = type;
        this.title = title;
        this.label = label;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
        this.labels = labels;
        this.data = data;
        this.coordinates = coordinates;
    }

    public String getHtmlId() {
        return htmlId;
    }

    public void setHtmlId(String htmlId) {
        this.htmlId = htmlId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<String> getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(List<String> backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public List<String> getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(List<String> borderColor) {
        this.borderColor = borderColor;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

}
