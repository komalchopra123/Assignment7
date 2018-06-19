import java.util.Scanner;
class Maxstring
{
Scanner sc=new Scanner(System.in);
  String a1=sc.next();
  String a2=sc.next();

 void compr()
{
 	if(Integer.parseInt(a1)>Integer.parseInt(a2))
	{
 		System.out.println("A is bigger");
	}
 	else
	{
 		System.out.println("B is bigger");
	} 
 

 } 

public static void main(String[] args){
 System.out.print("enter value of A and B");

 
 Maxstring ab=new Maxstring();
  ab.compr();
} 
}
     
   