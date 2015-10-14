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
		list.add(new Weapon ("Меч", "Колоще-режущее", 5, 5));
		list.add(new Weapon ("Меч2", "Колоще-режущее", 10, 2));
		list.add(new Armor ("Нагрудник", 10, 20, 60));
		list.add(new Armor ("Наплечник", 1, 1, 1));
		System.out.println("Без сортировки");
		for(Product i : list) 
            System.out.println("имя: " + i.getName() + " стоимость: " + i.getCost() + " вес: " + i.getWeight());
        System.out.println("Сортируем по весу");
        list.sort(new SortByWeight());
        for(Product i : list) 
               System.out.println("имя: " + i.getName() + " стоимость: " + i.getCost() + " вес: " + i.getWeight());   
	}

}
