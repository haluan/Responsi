package org.com.responsi;

public class Main {
	public static void main(String args[]){
		Manager m1=new Manager("Haluan", "Mohammad", 20, 6);
		Pekerja p1=new Pekerja("Joni", "Pascal", 30, 7);
		Pekerja p2 = new Pekerja("Ismail", "Pasteur", 34, 9);
		
		Proyek pj1=new DoProyek("SISTEM TANGGAP", 9, 1_000_000_000);
		m1.addPekerja(p1);
		m1.addPekerja(p2);
		m1.addProyek(pj1);
		
		m1.allPekerja();
	}
	
	

}
