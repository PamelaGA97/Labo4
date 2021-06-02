public class SimpleProduct extends AbstractProduct{
    protected String band;

    public SimpleProduct(String name, double price, String band) {
        super(name, price);
        this.band = band;
    }


    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }
}
