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
public class categories {

    
    
    private String product_id;
    private String product_name;
    private String type; 
    private Double price; 
    private String status;
    
    public categories(String product_id, String product_name, String type, Double price,String status){
        
        this.product_id = product_id;
        this.product_name = product_name;
        this.type = type;
        this.price = price;
        this.status = status;
    }
    
    
    public String getProduct_id() {
        return product_id;
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
    public String getStatus() {
        return status;
    }
}
