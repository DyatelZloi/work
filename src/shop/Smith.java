package shop;
import java.util.ArrayList;
import products.Armor;
import products.Product;
import products.Weapon;

public class Smith {
	
    public int totalCost = 0;
    public String totalName = "";
    
    Smith(){
    	
    }
    
    public void createWeapon(String name, String damageType, int cost, int weight){
    	new Weapon(name, damageType, cost, weight);
    }
    
    public void createArmor(String name, int cost, int weight, int protection){
        new Armor(name, cost, weight, protection);
    }
    
    public int totalCost(ArrayList<Product> productList){
    	for (Product product : productList){
            totalCost += product.getCost();
        }
    	return totalCost;
    }
    
    public String totalName(ArrayList<Product> productList){
    	for (Product product : productList){
            totalName += product.getName() + " ";
        }
    	return totalName;
    }
}
