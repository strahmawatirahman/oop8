package oop8_;

class Data {
	int nidn;
	String nm_Dosen, jurusan, fakultas, email;

	void setData(){
		
		int nidn;
		String nm_Dosen,  jurusan, fakultas, email;
		
		 this.nidn = 9921090;
		 this.nm_Dosen= "Tuman";
		 this.jurusan = "Teknik Informatika";
		 this.fakultas = "Ilmu Komputer";
		 this.email= "namanyajugatuman@gmail.com";
	} 

	 int getData() {   
		 return this.nidn;
		 
	} 
}
