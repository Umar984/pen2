public class pen2
{
int price;
String color;
String type;

public static void main(String[]args)
{
pen2 p = new pen2();

p.price = 5;
p.color = "blue";
p.type = "bole pen";

pen2 p1 = new pen2();

p1.price = 10;
p1.color = "black";
p1.type = "jel pen";

pen2 p2 = new pen2();

p2.price = 20;
p2.color = "red";

System.out.println("Price of the pen: " + p.price);
System.out.println("color of the pen: " + p.color);
System.out.println("type of the pen: " + p.type);

System.out.println();

System.out.println("Price of the pen: " + p1.price);
System.out.println("color of the pen: " + p1.color);
System.out.println("type of the pen:  " + p1.type);

System.out.println();

System.out.println("Price of the pen: " + p2.price);
System.out.println("color of the pen: " + p2.color);
}
}