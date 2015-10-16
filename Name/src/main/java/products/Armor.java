package products;

public class Armor extends Product{
	
	protected int protection;
	
    public int getProtection() {
		return protection;
	}

	public void setProtection(int protection) {
		this.protection = protection;
	}

	public Armor (String name, int cost, int weight, int protection){
        this.setName(name);
        this.setCost(cost);
        this.setWeight(weight);
        this.setProtection(protection);
    }
}