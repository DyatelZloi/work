package products;

public class Armor extends Product{
	
	protected int protection;
	
    public Armor (String name, int cost, int weight, int protection){
        this.setName(name);
        this.setCost(cost);
        this.setWeight(weight);
        this.protection = protection;
    }
    
    @Override
    public int getCost(){
        return cost;
    }
	
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public int getWeight() {	
        return weight;
    }    
}
