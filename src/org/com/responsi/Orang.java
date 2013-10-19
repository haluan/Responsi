package org.com.responsi;

public class Orang {
	private String namaDepan, namaBelakang;
	public Orang(String namaDepan, String namaBelakang, int umur){
		this.namaDepan=namaDepan;
		this.namaBelakang=namaBelakang;
		this.umur=umur;
	}
	private int umur;
	public String getNamaDepan() {
		return namaDepan;
	}
	
	public String getNamaBelakang() {
		return namaBelakang;
	}
	
	public int getUmur() {
		return umur;
	}
	
	
	
	

}
