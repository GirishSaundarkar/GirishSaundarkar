package classandobj;

import classandobj1.DataType_char;

public class DataType_Char {
char a='J';
char b='A';
char c='V';
char d='A';

void join() {
	System.out.println("The characters value is :"+a+b+c+d);
}
public static void main(String[] args) {
	DataType_char obj=new DataType_char();
    obj.join();
}
}
