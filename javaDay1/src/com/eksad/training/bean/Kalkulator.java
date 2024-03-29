package com.eksad.training.bean;

import java.util.HashMap;
import java.util.Map;

public class Kalkulator {
	private Integer kiri;
	private Integer kanan;
	private Map<String, Perhitungan> perhitunganMap = new HashMap<String, Perhitungan>();
	
	public Integer getKiri() {
		return kiri;
	}
	public void setKiri(Integer kiri) {
		this.kiri = kiri;
	}
	public Integer getKanan() {
		return kanan;
	}
	public void setKanan(Integer kanan) {
		this.kanan = kanan;
	}
	public Integer proses() {
		return kiri + kanan;
	}
	
	public static Integer tambah(Integer kanan, Integer kiri) {
		return kiri + kanan;
	}
//	public static Integer kali(Integer kanan, Integer kiri) {
//		return kiri * kanan;
//	}
	public void daftarPerhitungan(String nama, Perhitungan perhitungan) {
		perhitunganMap.put(nama, perhitungan);
	}
	public String hitung(String nama) {
		Perhitungan perhitungan = perhitunganMap.get(nama);
		if (perhitungan != null)
			return perhitungan.hitung(kiri, kanan);
		else
			return "Operasi " + nama + " tidak dikenal";
	}
	
	
	
	
	
	
}
