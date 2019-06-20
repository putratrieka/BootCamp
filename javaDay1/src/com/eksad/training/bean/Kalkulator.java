package com.eksad.training.bean;

public class Kalkulator {
	private Integer kiri;
	private Integer kanan;
	
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
	
}
