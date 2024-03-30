/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

/**
 *
 * @author mf291
 */
import java.io.Serializable;
import java.util.List;

public class Product implements Serializable {
    private String id;
    private String name;
    private String color; // Menambahkan atribut color untuk warna
    private double shoeSize; // Menambahkan atribut shoeSize untuk ukuran sepatu
    private List<ProductItem> items;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) { // Perubahan nama metode
        this.name = name;
    }

    public void setItems(List<ProductItem> items) {
        this.items = items;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setShoeSize(double shoeSize) {
        this.shoeSize = shoeSize;
    }

    @Override
    public String toString() {
        StringBuilder productStringBuilder = new StringBuilder();
        productStringBuilder.append("Produk: \n");
        productStringBuilder.append("Id=").append(id).append("\n");
        productStringBuilder.append("Nama=").append(name).append("\n");
        productStringBuilder.append("=======================\n");
        productStringBuilder.append("Product Item:\n");
        
        for (ProductItem item : items) {
            productStringBuilder.append(item.toString());
        }
        
        return productStringBuilder.toString();
    }
}

