package oops.inheritance.product;

public class Product {
    // since fields are private
    // we create getter and setter to access and change the values
    private int id;
    private String name;
    private int price;

    // default constructor
    public Product() {}

    // param/args constructor
    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
