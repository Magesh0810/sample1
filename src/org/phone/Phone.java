package org.phone;

public class Phone{

	public void phoneInfo(){
		System.out.println("phone  information");
	}
	public  void phoneInfo(int serial) {
		System.out.println("phone serial is:"+serial);
	}
//<<<<<<< HEAD
	private void phoneModel() {
		System.out.println("iphone");
	}
	public void cameraPixel() {
		System.out.println("64");
//=======
	
//>>>>>>> 0c49c9115af904acd9ab6624c7570b7dc12870fe
	}
	public static void main(String[] args) {
		Phone p = new Phone();
		p.phoneInfo();
		p.phoneInfo(122);
	}
}
