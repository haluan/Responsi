package org.com.responsi;

import java.awt.List;
import java.util.ArrayList;

public class Manager extends Orang implements Gaji{
	private int jamKerja;
	private ArrayList<Proyek> listProyek= new ArrayList<Proyek>();
	private ArrayList<Pekerja> pekerja=new ArrayList<Pekerja>();
	
	public Manager(String namaDepan, String namaBelakang, int umur, int jamKerja){
		super(namaDepan,namaBelakang, umur);
		this.jamKerja=jamKerja;
	}
	
	public int getJamKerja(){
		return this.jamKerja;
	}
	
	public void addPekerja(Pekerja p){
		pekerja.add(p);
	}
	
	public void addProyek(Proyek p){
		listProyek.add(p);
	}
	
	public void allPekerja(){
		System.out.println("Data Manager");
		System.out.println("=================");
		System.out.println("Nama      : "+this.getNamaDepan()+" "+this.getNamaBelakang());
		System.out.println("Jam Kerja : "+this.getJamKerja()+" Honor : Rp."+this.getHonor());
		System.out.println("Data Pegawai");
		System.out.println("=================");
		for(Pekerja p : pekerja){
			System.out.println("Nama      : "+p.getNamaDepan()+" "+p.getNamaBelakang());
			System.out.println("Jam Kerja : "+p.getJamKerja()+" Honor : Rp."+p.getHonor());
		}
		System.out.println("Data Proyek");
		System.out.println("=================");
		for(Proyek p : listProyek){
			System.out.println("Nama  : "+p.getNamaProyek());
			System.out.println("Waktu : "+p.getLamaProyek()+" hari");
			System.out.println("Biaya : Rp."+p.getBiayaProyek());
		}
	}

	@Override
	public double getHonor() {
		int temp=0;
		if(jamKerja<=6){
			temp=jamKerja*honorManager;
		}else if(jamKerja>6){
			temp=jamKerja*6;
			int sisa;
			sisa=jamKerja-6;
			temp+=sisa*intensif;
		}
		return temp;
	}

}
