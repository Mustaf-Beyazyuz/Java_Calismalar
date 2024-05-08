package csd;
class App {
public static void main(String[] args)
 {
	int a=-1, b= -3, c = 2;
	
	int result;
	result = a > b ? a > c ? a : c : b > c ? b : c ;
 	System.out.printf("%d",a>b ? a : b);

 }
}