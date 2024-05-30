public class Music extends StockableProduct {
    private String artists;


    public Music(String name, int productId, double price, String genre, int yearPublished, double discount, int numberOfItemsStocked, String artists) {
        super(name, productId, price, genre, yearPublished, discount, numberOfItemsStocked);
        this.artists = artists;
    }


    public String getArtists() { return artists; }
    public void setArtists(String artists) { this.artists = artists; }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Artists: " + artists;
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
