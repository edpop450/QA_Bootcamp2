package petStore.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor@NoArgsConstructor@Getter@Setter
public class Order {
    private int id;
    private int quantity;
    private int petID;
    private String date;
    private String status;

    public Order(int i, int i1, int i2, String currentDateTimeInFormat, String status, boolean b) {
    }
}
