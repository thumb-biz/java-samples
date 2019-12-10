package jp.co.thumb_biz.java.samples;

public class Ex004 {
    public static void main(String[] args) {
	int a;
	String msg;

	a = (int) (5.0 * Math.random());
	switch (a) {
	case 0:
	    msg = "zero";
	    break;
	case 1:
	    msg = "one";
	    break;
	case 2:
	    msg = "two";
	    break;
	default:
	    msg = "three or four";
	    break;
	}
	System.out.println(a + " point is " + msg);
    }
}
