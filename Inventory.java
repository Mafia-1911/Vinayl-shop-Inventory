import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Inventory {
    private ArrayList<StockableProduct> stockableProduct = new ArrayList<>();

    Inventory() {

    }

    public void addItem(StockableProduct SP) {
        stockableProduct.add(SP);

    }

    public void removeItem(int productID) {
        // search through the array list and delete
        for (int i = 0; i < stockableProduct.size(); i++) {
            if (productID == (stockableProduct.get(i).productId)) {
                stockableProduct.remove(i);
            }
        }
    }

    public Product getItem(int productID) {
        for (int i = 0; i < stockableProduct.size(); i++) {
            if (productID == (stockableProduct.get(i).productId)) {
                stockableProduct.get(i).toString();// printin it
                stockableProduct.get(i).removeStock(1);
                return stockableProduct.get(i);
            }
        }
        System.out.println("Sorry item not found");
        // if none found return the first one
        return stockableProduct.get(1);

    }

    public void addProductStock(int productID, int numberOfNewStock) {
        // searching for the product
        for (int i = 0; i < stockableProduct.size(); i++) {
            if (stockableProduct.get(i).productId == productID) {
                stockableProduct.get(i).numberOfItemsStocked = numberOfNewStock;
            }
        }
    }

    // sorting the arraylist of objects by property
    public void sortByPrice() {
        //
//        Collections.sort(stockableProduct, new Comparator<StockableProduct>() {
//            public int compare(StockableProduct sp, StockableProduct sp2) {
//                return Double.valueOf(sp.price).compareTo(sp2.price);
//            }
//        });
        Collections.sort(stockableProduct, Comparator.comparingDouble(Product::getPrice));

    }
    public void printInventory() {
        for (StockableProduct item : stockableProduct) {
            System.out.println(item);
        }
    }
    public void sortByAvailable() {
        Collections.sort(stockableProduct, Comparator.comparingInt(StockableProduct::getNumberOfItemsStocked).reversed());
    }

    public void sortByAvailableStock() {
        Collections.sort(stockableProduct, new Comparator<StockableProduct>() {
            public int compare(StockableProduct sp, StockableProduct sp2) {
                return Integer.valueOf(sp.numberOfItemsStocked).compareTo(sp2.numberOfItemsStocked);
            }
        });
    }

}
