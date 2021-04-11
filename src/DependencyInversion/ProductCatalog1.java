package DependencyInversion;

public class ProductCatalog1 {
    public void listAllProducts(){

        //todo use the FactoryClass to get the Object
        ProductRepository productRepository = ProductFactory.create();
        //todo ProductCatalog now no longer depends upon sqlRepository
        // both HighLevel Module(ProductCatalog1) and Lowlevel Module(Sqlrepository1)
        // now depend upon the abstraction...i.e. the Interface

        productRepository.getAllProductNames();
    }
}
