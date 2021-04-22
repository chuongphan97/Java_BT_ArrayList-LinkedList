import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class ProductManagerLinkedList {
    private LinkedList<Product> products = new LinkedList<>();
    private int size = 0;
    public ProductManagerLinkedList(){

    }

    public LinkedList<Product> getProducts() {
        return products;
    }

    public void setProducts(LinkedList<Product> products) {
        this.products = products;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ProductManagerLinkedList(LinkedList<Product> products) {
        this.products = products;
    }

    public void add(Product p){
        products.add(p);
        size++;
    }

    public int indexOf(Product p){
        return products.indexOf(p);
    }

    public void replace(Product p, Product newProduct){
        while (products.contains(p)){
            int index = products.indexOf(p);
            products.remove(p);
            products.add(index,newProduct);
        }
    }

    public void remove(Product p){
        products.remove(p);
    }

    public Product get(int index){
       return products.get(index);
    }

    public void sortName(){
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getName().compareTo(o2.getName()) < 0){
                    return -1;
                } else if (o1.getName().compareTo(o2.getName()) > 0){
                    return 1;
                }else return 0;
            }
        });
    }

    public void sortId(){
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getId() - o2.getId() > 0){
                    return 1;
                } else if (o1.getId() - o2.getId() < 0){
                    return -1;
                }   else return 0;
            }
        });
    }

    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.println("Id: "+ getProducts().get(i).getId() + ", Name: "+ getProducts().get(i).getName());
        }
    }

}
