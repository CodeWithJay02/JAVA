class Method_Overloading
{
double figure(double l,int b)
{
return(l*b);
}
float figure(int s)
{
return(s*s);
}
public static void main(String[] args)
{
Method_Overloading obj=new Method_Overloading();
System.out.println("area of rectangle:"+obj.figure(5.5,6));
System.out.println("area of square:"+obj.figure(3));
}
}