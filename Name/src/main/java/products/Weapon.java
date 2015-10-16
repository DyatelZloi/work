package products;

public class Weapon extends Product{
	
	protected String damageType;
	
    public Weapon (String name, String damageType, int cost, int weight){
        this.setName(name);
        this.setDamageType(damageType);
        this.setCost(cost);
        this.setWeight(weight);
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
