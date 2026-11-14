package com.example.university_pizzery.enums;

public enum Role {
    CUSTOMER("Zákazník"),
    COOK("Kuchár"),
    COURIER("Kuriér"),
    ADMIN("Administrátor");

    private final String label;

    Role(String label) {
        this.label = label;
    }

    public String getLabel() { return label; }
}