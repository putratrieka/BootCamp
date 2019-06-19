package com.eksad.training.bean;

public class Kertas {
	private String ukuran;
	private String isi = "";
	
	public String getUkuran() {
		return ukuran;
	}
	public void setUkuran(String ukuran) {
		this.ukuran = ukuran;
	}
	
	public void tulis(Pensil pensil, String text) {
		isi = isi + "["+pensil.getWarna()+"]"+text;
	}
	public String getIsi() {
		return isi;
	}

	
	
	
}
