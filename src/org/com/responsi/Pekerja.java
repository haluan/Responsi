package org.com.responsi;

public class Pekerja extends Orang implements Gaji {
	
	private int jamKerja;
	public Pekerja(String namaDepan, String namaBelakang, int umur, int jamKerja){
		super(namaDepan,namaBelakang, umur);
		this.jamKerja=jamKerja;
	}
	
	public int getJamKerja(){
		return this.jamKerja;
	}

	@Override
	public double getHonor() {
		int temp=0;
		if(jamKerja<=6){
			temp=jamKerja*honorPekerja;
		}else if(jamKerja>6){
			temp=jamKerja*6;
			int sisa;
			sisa=jamKerja-6;
			temp+=sisa*intensif;
		}
		return temp;
	}

}
