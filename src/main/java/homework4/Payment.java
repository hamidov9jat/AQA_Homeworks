package homework4;

/*
Task 6. Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.
 */
class Payment {
    private static class Purchase {
        private String product;
        private double price;

        public Purchase(String product, double price) {
            this.product = product;
            this.price = price;
        }

        public String getProduct() {
            return product;
        }

        public double getPrice() {
            return price;
        }
    }

    private double totalAmount = 0;

    public void addPurchase(String product, double price) {
        Purchase purchase = new Purchase(product, price);
        totalAmount += purchase.getPrice();
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
