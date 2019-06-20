package com.eksad.training;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsTest {
	public static void main(String[] args) {
// Collection -List
		List<Integer> integerList = new ArrayList<Integer>();	
		
		//add elements to List
		integerList.add(1);
		integerList.add(2);
		integerList.add(4);
		integerList.add(6);
		integerList.add(9);
		// find index of array elemnts
		System.out.println(integerList.indexOf(1));
		// add element to spesific index
		integerList.add(0,8);
		integerList.remove((Integer)2);
		for (Integer integer : integerList) {
			System.out.println(integer);
		}
		System.out.println("-----------------------------");
//--------------------------------------------------
		
		List<String> stringList = new ArrayList<String>();
		stringList.add("Ayam");
		stringList.add("Kucing");
		stringList.add("Jerapah");
		stringList.add("Gajah");
		stringList.add("Ayam Lagi");
		
		// add element to spesific index
		stringList.add(3,"Buaya");
		// replace element
		stringList.set(2, "Bebek");
		//remove element
		stringList.remove(0);
		stringList.remove("Gajah");
				
		System.out.println("Index of kucing:" + stringList.indexOf("Kucing"));
		for (String str : stringList) {
			System.out.println(str);
		}
//---------------------------------------------------
		//Collections Set, HashSet urutan data acak
		//Collections Set, LinkedHashSet urutan data sesuai dengan urutan elemen yg di add
		//Collections Set, TreeSet urutan data sesuai dengan abjad
		Set<String> stringSet = new HashSet<String>();
		
		//add element
		
		stringSet.add("Honda");
		stringSet.add("yamaha");
		stringSet.add("Suzuki");
		stringSet.add("Ducati");
		stringSet.add("KTM");
		//remove element	
		stringSet.remove("Suzuki");
		
		for (String merk : stringSet) {
			System.out.println(merk);
		}
		System.out.println("-----------------------");
		Set<String> strSet = new LinkedHashSet<String>();
		strSet.add("Honda");
		strSet.add("yamaha");
		strSet.add("Suzuki");
		strSet.add("Ducati");
		strSet.add("KTM");
		for (String merk : strSet) {
			System.out.println(merk);
		}
		
		System.out.println("-----------------------");
		Set<String> strTreeSet = new TreeSet<String>();
		Set<String> descSet = ((TreeSet<String>) strTreeSet).descendingSet();
		String[] arr = new String[5];
		int i=0;
		strTreeSet.add("Honda");
		strTreeSet.add("yamaha");
		strTreeSet.add("Suzuki");
		strTreeSet.add("Ducati");
		strTreeSet.add("KTM");
		
		for (String merk : strTreeSet) {
			arr[i] = merk;
			System.out.println(merk);
			i++;
		}
		for (String merk : arr) {
			System.out.println(merk);
		}
// 		Queue
		System.out.println("========================");
		Queue<String> queue = new LinkedList<String>();
		// add element
		queue.add("John");
		queue.add("Mark");
		queue.add("Aceng");
		queue.add("Sodaranya Aceng");
		queue.add("Lukas Art");
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		queue.add("Tukang Ojeknya Aceng");
		System.out.println("===");
		for (String orang : queue) {
			System.out.println(orang);
		}
	}
}
