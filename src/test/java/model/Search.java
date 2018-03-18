package model;

public enum Search {
    StudentFinance("Student finance");

    Search(String label) {
        this.label = label;
    }

    private final String label;

    public String label() {
        return label;
    }

}