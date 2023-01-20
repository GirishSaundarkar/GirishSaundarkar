package local;

import java.util.Scanner;

public class gst {
	public static void main(String[] args) {
		int res= max(7,28);
		System.out.println(res);
	}
static int max(int x,int y){
	if(x>y) {
		return x;
	}else {
		return y;
	}
}
}