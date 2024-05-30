public abstract class StockableProduct extends Product implements Stockable {
    public int numberOfItemsStocked;


    public StockableProduct(String name, int productId, double price, String genre, int yearPublished, double discount, int numberOfItemsStocked) {
        super(name, productId, price, genre, yearPublished, discount);
        this.numberOfItemsStocked = numberOfItemsStocked;
    }


    public int getNumberOfItemsStocked() { return numberOfItemsStocked; }
    public void setNumberOfItemsStocked(int numberOfItemsStocked) { this.numberOfItemsStocked = numberOfItemsStocked; }

    @Override
    public void addStock(int num) {
        this.numberOfItemsStocked += num;
    }

    @Override
    public void removeStock(int num) {
        if (num <= this.numberOfItemsStocked) {
            this.numberOfItemsStocked -= num;
        } else {
            System.out.println("Not enough stock to remove.");
        }
    }

    @Override
    public void editStock(int num) {
        this.numberOfItemsStocked = num;
    }

    @Override
    public String toString() {
        return super.toString() + ", Stock: " + numberOfItemsStocked;
    }
}

