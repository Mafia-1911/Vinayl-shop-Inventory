import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Invoice {
    private ArrayList<Product> items;
    private LocalDateTime date;


    public Invoice() {
        this.items = new ArrayList<>();
        this.date = LocalDateTime.now();
    }


    public String getLocalDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return date.format(formatter);
    }


    public void addProduct(Product product) {
        items.add(product);
    }


    public void removeProduct(Product product) {
        items.remove(product);
    }


    public double calculatePriceWithoutDiscount() {
        double total = 0;
        for (Product product : items) {
            total += product.getPrice();
        }
        return total;
    }


    public boolean isFullHouseDiscountAvailable() {
        return items.size() > 10;
    }


    public double calculateDiscountPrice() {
        double total = calculatePriceWithoutDiscount();
        for (Product product : items) {
            total -= product.getPrice() * product.getDiscount();
        }
        if (isFullHouseDiscountAvailable()) {
            total *= 0.95;
        }
        return total;
    }


    public String getInvoice() {
        StringBuilder invoice = new StringBuilder();
        invoice.append("Invoice Date: ").append(getLocalDateTime()).append("\n");
        invoice.append("Items:\n");
        for (Product product : items) {
            invoice.append(product.toString()).append("\n");
        }
        invoice.append("Total Price without Discount: ").append(calculatePriceWithoutDiscount()).append("\n");
        invoice.append("Total Price with Discount: ").append(calculateDiscountPrice()).append("\n");
        return invoice.toString();
    }
}

