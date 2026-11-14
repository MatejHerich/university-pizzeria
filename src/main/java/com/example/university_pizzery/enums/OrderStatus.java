package com.example.university_pizzery.enums;

public enum OrderStatus {
    NEW("Nová", "status-new"),
    IN_PREPARATION("V príprave", "status-in-preparation"),
    READY("Pripravená", "status-ready"),
    OUT_FOR_DELIVERY("Na rozvoze", "status-out-for-delivery"),
    DELIVERED("Doručená", "status-delivered"),
    CANCELLED("Zrušená", "status-cancelled");

    private final String label;
    private final String badgeClass;

    OrderStatus(String label, String badgeClass) {
        this.label = label;
        this.badgeClass = badgeClass;
    }

    public String getLabel() { return label; }
    public String getBadgeClass() { return badgeClass; }
}
