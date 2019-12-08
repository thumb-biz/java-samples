package jp.co.thumb_biz.java.samples;

public class Ex001 {

    public static void main(String[] args) {
	int b = 2;
	int sum, dist, times, div, mod;

	sum = dist = times = div = mod = 10;
	sum = sum + b;
	dist = dist - b;
	times = times * b;
	div = div / b;
	mod = mod % b;
	System.out.println("sum = " + sum);
	System.out.println("dist = " + dist);
	System.out.println("times = " + times);
	System.out.println("div = " + div);
	System.out.println("mod = " + mod);

    }

}
