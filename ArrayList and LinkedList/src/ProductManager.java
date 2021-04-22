import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;

public class ProductManager  {
    private ArrayList<Product> products = new ArrayList<>();
    private int size = 0;
    public ProductManager() {
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ProductManager(ArrayList<Product> products) {
        this.products = products;
    }
    public void add(Product product){
        products.add(product);
        size++;
    }

    public int indexOf(Product product){
        return products.indexOf(product);
    }
    public void replace(Product product, Product newProduct){
        while (products.contains(product)) {
            int index = products.indexOf(product);
            products.remove(product);
            products.add(index, newProduct);
        }
    }

    public void delete(Product product){
        products.remove(product);
    }
    public Product get(int index){
        return products.get(index);
    }


    public void sortName(){
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getName().compareTo(o2.getName())>0){
                    return 1;
                } else if (o1.getName().compareTo(o2.getName())<0) return -1;
                        else return 0;
            }
        });
    }

    public void sortId(){
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getId() - o2.getId() > 0) {
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
