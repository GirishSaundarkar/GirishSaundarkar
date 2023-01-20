package thousandjutsu;

import java.util.Scanner;

public class jetbrains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);

int t=scn.nextInt();
for(int i=0;i<t;i++) {
	int n = scn.nextInt();
	int count = 0;
	int j = 0;
	for(int div=1;div<=n;j++) {
		if(n% div ==0) {
			count++;
		}
	}
	if (count ==2) {
		System.out.println("prime");
	}else {
		System.out.println("not prime");
	}
}
}
}
