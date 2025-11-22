class Ellipse
{
       static double area(int a,int b){
       
          final double pi = 3.142;
	  
	       double res = pi*a*b;
	       
	       return res;
       
       
       }   
 


}

class Demo3
{
    public static void main(String[] args)
      {
    
              double x= Ellipse.area(4,7);
            
	    System.out.println(x);
    }

}