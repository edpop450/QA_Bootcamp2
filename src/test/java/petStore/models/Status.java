package petStore.models;

import lombok.Getter;

@Getter
public enum Status {
    PLACED("placed");

    private final String status;
    Status(String status) {
        this.status = status;
    }
}