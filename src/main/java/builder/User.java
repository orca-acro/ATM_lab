package builder;

import lombok.Builder;
import lombok.ToString;

@Builder @ToString
public class User {
    private String name;
    private int age;
    private String gender;
    private double weight;
    private double height;
    private String race;
}
