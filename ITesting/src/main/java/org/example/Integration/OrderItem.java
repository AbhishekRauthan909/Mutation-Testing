package org.example.Integration;

public class OrderItem {
    private String productId;
    private int quantity;
    private double unitPrice;

    public OrderItem(String productId, int quantity, double unitPrice)
    {
        this.productId = productId;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double calculateTotal()
    {
        return quantity * unitPrice;
    }

    // Getters
    public String getProductId()
    {

        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}
