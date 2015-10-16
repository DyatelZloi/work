package forge;

import java.util.ArrayList;

import products.Armor;
import products.Product;
import products.Weapon;

public class Smith {
	
    protected int totalCost;
    protected String totalName;
    
    public int getTotalCost() {
		return totalCost;
	}

	public String getTotalName() {
		return totalName;
	}

    public Smith(){
    }
    
    public void createWeapon(String name, String damageType, int cost, int weight, ArrayList<Product> productList){
    	productList.add(new Weapon(name, damageType, cost, weight));
    }
    
    public void createArmor(String name, int cost, int weight, int protection, ArrayList<Product> productList){
	    productList.add(new Armor(name, cost, weight, protection));
    }
    
    public void totalCost(ArrayList<Product> productList){
    	for (Product product : productList)
            totalCost += product.getCost();
    	System.out.println("Общая стоимость = " + getTotalCost());
    }
    
    public String totalName(ArrayList<Product> productList){
    	for (Product product : productList){
            totalName += product.getName() + " ";
        }
    	return totalName;
    }
    
    public void print (ArrayList<Product> productList){
    	for(Product i : productList) 
            System.out.println("имя: " + i.getName() + ", стоимость: " + i.getCost() + " вес: " + i.getWeight());
    }
    
    public void searchByCost(ArrayList<Product> productList, int a, int b){
    	for(Product product : productList)
    		if (product.getCost() > a && product.getCost() < b)
    			System.out.println("Имя продукта - " + product.getName() + ", стоимость - " + product.getCost());
    }
}
