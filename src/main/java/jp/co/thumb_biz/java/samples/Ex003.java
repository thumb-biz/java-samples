package jp.co.thumb_biz.java.samples;

public class Ex003 {
    public static void main(String[] args) {
	int a;
	String msg;

	a = (int) (100.0 * Math.random());
	if (a < 60) {
	    msg = "D";
	} else if (a < 70) {
	    msg = "C";
	} else if (a < 80) {
	    msg = "B";
	} else {
	    msg = "A";
	}
	System.out.println(a + " point is " + msg);
    }
}
