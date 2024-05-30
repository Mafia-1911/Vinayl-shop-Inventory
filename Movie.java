public class Movie extends StockableProduct {
    private String directors;


    public Movie(String name, int productId, double price, String genre, int yearPublished, double discount, int numberOfItemsStocked, String directors) {
        super(name, productId, price, genre, yearPublished, discount, numberOfItemsStocked);
        this.directors = directors;
    }


    public String getDirectors() { return directors; }
    public void setDirectors(String directors) { this.directors = directors; }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Directors: " + directors;
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
