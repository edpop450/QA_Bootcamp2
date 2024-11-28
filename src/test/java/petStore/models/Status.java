package petStore.models;

import lombok.Getter;

@Getter
public enum Status {
    PLACED("placed"),
    APPROVED("approved"),
    DELIVERED("delivered");

    private final String status;
    Status(String status) {
        this.status = status;
    }
}