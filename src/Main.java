import java.util.ArrayList;

import forge.Smith;
import products.Product;
import sorting.SortByWeight;


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Product> knight = new ArrayList <Product>();
		Smith Smith1 = new Smith();
		Smith1.createArmor( "���������", 10, 20, 60, knight );
		Smith1.createWeapon( "���", "������-�������", 5, 5, knight );
		Smith1.createArmor( "���������", 1, 1, 1, knight );
		Smith1.createWeapon( "���2", "������-�������", 10, 2, knight );
		System.out.println( "��� ���������� :" );
		Smith1.print( knight );
        knight.sort( new SortByWeight() );
        System.out.println("C ����������� :");
        Smith1.print( knight );
        Smith1.totalCost( knight );
	}
}
