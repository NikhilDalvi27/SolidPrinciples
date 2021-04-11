package DependencyInversion;

public class ProductCatalog0 {
    public void listAllProducts(){

        SqlRepository0 sqlRepository0 = new SqlRepository0();
        //todo this is Higher Module
        // Depending Upon the Lower Module
        sqlRepository0.getAllProductNames();
    }
}
