package sia.tacocloud;

import java.util.List;
import lombok.Data;

@Data
public class Taco {
    public String name;
    private List<Ingredient> ingredients;
}
