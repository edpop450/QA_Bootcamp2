package petStore.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Pet {
    private int id;
    private Category cat;
    private String name;
    private ArrayList<String> photoURLS;
    private ArrayList<Tag> tags;
    private String status;
}
