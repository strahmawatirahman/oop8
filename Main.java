package oop8_;

public class Main {
	
	public static void main(String[] args) {
		Data m = new Data();
		m.setData();
		m.getData();
		System.out.println("NIDN : " + m.nidn);
		System.out.println("Nama Dosen : " + m.nm_Dosen);
		System.out.println("Jurusan : " + m.jurusan);
		System.out.println("Fakultas : " + m.fakultas);
		System.out.println("Email : " + m.email);
		
		
	}
}
//class pertama berisi atribut : nidn (nomor induk dosen), nama dosen, jurusan, fakultas, email beserta getter setter