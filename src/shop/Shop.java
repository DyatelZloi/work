package shop;

import java.util.ArrayList;
import products.Armor;
import products.Product;
import products.Weapon;
import sorting.SortByWeight;


public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(new Weapon ("���", "������-�������", 5, 5));
		list.add(new Weapon ("���2", "������-�������", 10, 2));
		list.add(new Armor ("���������", 10, 20, 60));
		list.add(new Armor ("���������", 1, 1, 1));
		System.out.println("��� ����������");
		for(Product i : list) 
            System.out.println("���: " + i.getName() + " ���������: " + i.getCost() + " ���: " + i.getWeight());
        System.out.println("��������� �� ����");
        list.sort(new SortByWeight());
        for(Product i : list) 
               System.out.println("���: " + i.getName() + " ���������: " + i.getCost() + " ���: " + i.getWeight());   
	}

}
