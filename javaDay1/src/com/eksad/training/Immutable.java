package com.eksad.training;

import com.eksad.training.bean.Pensil;

public class Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pensil pensil = new Pensil("biru");
		System.out.println(pensil.getWarna());
		pensil.setWarna("Hitam");
		System.out.println(pensil.getWarna());
		
		

	}

}
