import lombok.Getter;

@Getter
public class Author {
    public String name;
    public String email;

    public Author(String name, String email){
        this.name = name;
        this.email = email;
    }
}
