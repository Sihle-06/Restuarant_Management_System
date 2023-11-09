/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restuarant_management_systems;

/**
 *
 * @author S993540
 */
public class product {

    /**
     * @return the id
     */
    
    private Integer id;
    private String productId;
    private String product_name;
    private String type; 
    private Double price; 
    private Integer quantity;
    
    
    
    public product(Integer id,String productId, String product_name, String type, Double price, Integer quantity){
        this.id = id;
        this.productId = productId;
        this.product_name = product_name;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }
    
    public Integer getId() {
        return id;
    }


    public String getProductId() {
        return productId;
    }

    public String getProduct_name() {
        return product_name;
    }

    public String getType() {
        return type;
    }

    public Double getPrice() {
        return price;
    }
    public Integer getQuantity() {
        return quantity;
    }
    
    
}
