package com.ferdi.matematik;

public class Matematik implements IMatematik {

	@Override
	public void toplama(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Toplama sonucu:" + (a+b));
	}

	@Override
	public void cikarma(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Cikarma sonucu:" + (a-b));
	}

	@Override
	public void bolme(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Bolme sonucu:" + ((double)a/b));
	}

	@Override
	public void carpma(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Carpma sonucu:" + (a*b));
	}

}
