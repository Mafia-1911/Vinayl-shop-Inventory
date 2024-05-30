public class Game extends StockableProduct {
    private String developers;


    public Game(String name, int productId, double price, String genre, int yearPublished, double discount, int numberOfItemsStocked, String developers) {
        super(name, productId, price, genre, yearPublished, discount, numberOfItemsStocked);
        this.developers = developers;
    }


    public String getDevelopers() { return developers; }
    public void setDevelopers(String developers) { this.developers = developers; }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Developers: " + developers;
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
