package net.swedbank.gyk.collections.productset;

import java.time.LocalDateTime;

public class Product {

    private String id;
    private String name;
    private LocalDateTime lastAppearsOn;

    public Product(String id, String name, LocalDateTime lastAppearsOn) {
        this.id = id;
        this.name = name;
        this.lastAppearsOn = lastAppearsOn;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
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

    public String toString() {
        return String.format("Product{id = %s, name = %s, lastAppearsOn = %s}", id, name, lastAppearsOn);
    }
}
