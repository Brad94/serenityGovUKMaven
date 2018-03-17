package model;

public enum Category {
    Driving("Driving and transport");

    Category(String label) {
        this.label = label;
    }

    private final String label;

    public String label() {
        return label;
    }

}
