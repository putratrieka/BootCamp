package com.eksad.training;

import com.eksad.training.bean.Bos;
import com.eksad.training.bean.Kalkulator;
import com.eksad.training.bean.Kendaraan;
import com.eksad.training.bean.Perhitungan;

public class Lambda {
	public static void main(String[] args) {
		//cara 1 DENGAN mendefenisikan kedalam variable baru
		// Annonimous Class
		Kalkulator kalkulator = new Kalkulator();
		Kendaraan kendaraan = new Kendaraan() {			
			@Override
			public String maju() {
				// TODO Auto-generated method stub
				return "Ayo bg Gojek";
			}
		};
		Bos bos = new Bos();
		bos.naikKendaraan(kendaraan);
		// cara kedua, TANPA mendefenisikan kedalam variable baru
		Bos bos2 = new Bos();
		bos2.naikKendaraan(new Kendaraan() {
			
			@Override
			public String maju() {
				// TODO Auto-generated method stub
				return "Gojek lagi bg....";
			}
		});
		bos.naikKendaraan(kendaraan);
		System.out.println("========================");
		//cara 3 functional programming
		bos.naikKendaraan(()->"Ajo Gojek");
		bos.naikKendaraan(()->{
			String bgGojek = "Faisal";
			return "Ayo bang " + bgGojek;
		});
		//========================================================
		Perhitungan penjumlahan = new Perhitungan() {
			
			@Override
			public String hitung(Integer left, Integer right) {
				// TODO Auto-generated method stub
				return " Hasil "+(left + right);
			}
		};
		
		System.out.println(penjumlahan.hitung(7, 11));
		//========================================================
		//lambda (->)	
		Perhitungan perkalian = (a,b) ->"Hasil Perkalian "+(a*b);
		Perhitungan pembagian = (a,b) ->"Hasil Pembagian "+ (a.doubleValue()/b.doubleValue());
		
//		System.out.println(perkalian.hitung(7, 11));
//		System.out.println(pembagian.hitung(7, 11));
		//====================================================================================
		kalkulator.daftarPerhitungan("tambah", penjumlahan);
		kalkulator.daftarPerhitungan("kali", perkalian);
		kalkulator.daftarPerhitungan("bagi", pembagian);
		kalkulator.setKanan(45);
		kalkulator.setKiri(13);
		
		System.out.println(kalkulator.hitung("bagi"));
		
		System.out.println(kalkulator.hitung("bagi"));
		System.out.println(kalkulator.hitung("kali"));
		System.out.println(kalkulator.hitung("tambah"));
		
	}
}
