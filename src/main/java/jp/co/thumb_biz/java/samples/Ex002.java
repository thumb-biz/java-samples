package jp.co.thumb_biz.java.samples;

public class Ex002 {
    public static void main(String[] args) {
	int a;
	a = (int) (100.0 * Math.random());
	if (a < 50) {
	    System.out.println(a + " is less than 50");
	} else {
	    System.out.println(a + " is greater than 50");
	}
    }
}
