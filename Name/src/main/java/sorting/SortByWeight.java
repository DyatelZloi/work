package sorting;

import java.util.Comparator;
import products.Product;

public class SortByWeight implements Comparator <Product>{

	public int compare(Product arg0, Product arg1) {
			int price1 = arg0.getWeight();
	        int price2 = arg1.getWeight();
	        
	        if(price1 > price2) {
	               return 1;
	        }
	        else if(price1 < price2) {
	               return -1;
	        }
	        else {
	               return 0;
	        }
	}
	
  
}
