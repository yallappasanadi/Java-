class Triangle
{
      static double area(int b,int h)
      {
         double res = 0.5*b*h;
	 
	 return res;
	
        }
  

}
class Demo2
{

      public static void main(String[] args)
      {
      
           double x = Triangle.area(5,10);
	   System.out.println(x);
      
      }

}