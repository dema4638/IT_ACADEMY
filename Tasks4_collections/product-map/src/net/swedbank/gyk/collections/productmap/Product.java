package net.swedbank.gyk.collections.productmap;

public class Product {

    private String id;
    private String name;


    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Product{id = %s, name = %s}", id, name);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null){
            return false;
        }
        if (!(o instanceof Product)) {
            return false;
        }
        Product product = (Product) o;
        return id.equals(product.id) && name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return 31 * id.hashCode() +
                name.hashCode();
    }
}
