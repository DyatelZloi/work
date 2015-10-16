package products;
public abstract class Product {
		
    protected int cost;
    protected int weight;
    protected String name;
    
    Product(){
    }
	
    public Product (String name, int cost){
        this.setName(name);
        this.setCost(cost);
    }

	/**
	 * @return the cost
	 */
    
	public int getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	
	public void setCost(int cost) {
		this.cost = cost;
	}

	/**
	 * @return the weight
	 */
	
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * @return the name
	 */
	
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	
	public void setName(String name) {
		this.name = name;
	}
}
