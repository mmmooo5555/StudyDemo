package com.tian.classes.inner;

/**
 * 
 * @author lenovo
 *
 * �ڲ���ֻ�ڵ�ǰ��ɼ�,�ɷ����ⲿ��ľ�̬��Ǿ�̬��Ա
 * 
 */

public class InnerOuter {
	
	int i = 1;
	static int j = 2;
	
	public class Inner {
//		�ڲ���(�Ǿ�̬Ƕ���಻���о�̬����)
//		static char c1 = 'a';
		char c2 = 'b';
		
		public void printInner() {
			System.out.println(i);
			System.out.println(j);
			printOuter();
			staticPrintOuter();
		}
	}
	
	public void printOuter() { }
	public static void staticPrintOuter() { }

}
