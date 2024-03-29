public abstract class AbstractProduct {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    protected String name;
    protected double price;

    public AbstractProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
