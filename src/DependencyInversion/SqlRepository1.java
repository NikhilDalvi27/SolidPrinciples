package DependencyInversion;

import java.util.Arrays;
import java.util.List;

public class SqlRepository1 implements ProductRepository {
    public List<String>getAllProductNames(){

        return Arrays.asList("soap","toothpaste");
    }
}