import java.util.ArrayList;

import forge.Smith;
import products.Product;
import sorting.SortByWeight;


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Product> knight = new ArrayList <Product>();
		Smith Smith1 = new Smith();
		Smith1.createArmor( "Нагрудник", 10, 20, 60, knight );
		Smith1.createWeapon( "Меч", "Колоще-режущее", 5, 5, knight );
		Smith1.createArmor( "Наплечник", 1, 1, 1, knight );
		Smith1.createWeapon( "Меч2", "Колоще-режущее", 10, 2, knight );
		System.out.println( "Без сортировки :" );
		Smith1.print( knight );
        knight.sort( new SortByWeight() );
        System.out.println("C сортировкой :");
        Smith1.print( knight );
        Smith1.totalCost( knight );
	}
}
