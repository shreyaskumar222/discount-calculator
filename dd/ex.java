package dd;

import java.util.Scanner;

class ex{ 
	public static void main(String args[]){
Scanner n=new Scanner(System.in);
System.out.println("enter the value amount");
float number=n. nextFloat();
if(number>1000)
{
	float dis=0;
	dis=number*10/100;
	float tot=number-dis;
	System.out.print(dis);
	System. out. print("\n");
	System.out.print("the total amount is"+tot);
	}
else{
	System.out.println("no discount");
	System. out. print("\n");
	System. out. print("payable amt is"+number);
}



}
}