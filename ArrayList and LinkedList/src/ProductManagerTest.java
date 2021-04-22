public class ProductManagerTest {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product1 = new Product(1,"chuoi");
        Product product2 = new Product(2,"thom");
        Product product3 = new Product(3,"bom");
        productManager.add(product1);
        productManager.add(product2);
        productManager.add(product3);
        productManager.sortName();
        productManager.sortId();
        productManager.display();
    }
}
