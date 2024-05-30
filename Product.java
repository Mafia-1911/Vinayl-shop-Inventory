public abstract class Product {
    private String name;
    public int productId;
    public double price;
    public String genre;
    public int yearPublished;
    public double discount;


    public Product(String name, int productId, double price, String genre, int yearPublished, double discount) {
        this.name = name;
        this.productId = productId;
        this.price = price;
        this.genre = genre;
        this.yearPublished = yearPublished;
        this.discount = discount;
    }

    // Getters and Setters
    public String getName() { return name; }
    public int getProductId() { return productId; }
    public double getPrice() { return price; }
    public String getGenre() { return genre; }
    public int getYearPublished() { return yearPublished; }
    public double getDiscount() { return discount; }

    public void setName(String name) { this.name = name; }
    public void setProductId(int productId) { this.productId = productId; }
    public void setPrice(double price) { this.price = price; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setYearPublished(int yearPublished) { this.yearPublished = yearPublished; }
    public void setDiscount(double discount) { this.discount = discount; }

    // Get information about the product
    public String getInfo() {
        return String.format("Name: %s, ID: %d, Price: %.2f, Genre: %s, Year: %d, Discount: %.2f",
                name, productId, price, genre, yearPublished, discount);
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
