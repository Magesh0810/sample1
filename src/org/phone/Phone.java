package org.phone;

public class Phone{

	public void phoneInfo(){
		System.out.println("phone  information");
	}
	public  void phoneInfo(int serial) {
		System.out.println("phone serial is:"+serial);
	}
	public static void main(String[] args) {
		Phone p = new Phone();
		p.phoneInfo();
		p.phoneInfo(122);
	}
}
