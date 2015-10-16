package products;

public class Weapon extends Product{
	
	protected String damageType;
	
    public Weapon (String name, String damageType, int cost, int weight){
        this.name = name;
        this.damageType = damageType;
        this.cost = cost;
        this.weight = weight;
    }

	/**
	 * @return the damageType
	 */
    
	public String getDamageType() {
		return damageType;
	}

	/**
	 * @param damageType the damageType to set
	 */
	
	public void setDamageType(String damageType) {
		this.damageType = damageType;
	}
}
