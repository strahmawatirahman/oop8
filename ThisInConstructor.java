package oop8_;

public class ThisInConstructor {
	int umur ;
	public ThisInConstructor(){
		int x=20;
		this.umur=x;
	}
	
	void cetak() {
		System.out.print(this.umur);
	}
	public static void main(String[] args) {
		ThisInConstructor k = new ThisInConstructor();
		k.cetak();
	}
}
