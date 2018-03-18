package model;

public enum Link {
    Driving("Driving and transport"),
	StudentFinance("Student finance");

    Link(String label) {
        this.label = label;
    }

    private final String label;

    public String label() {
        return label;
    }

}
