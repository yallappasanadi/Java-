class Sample
{
  int a=10;
}

class Demo extends Sample
{
 void area()
 {
 System.out.println("HI");
 }
}

class Tester extends Sample
{
   int c=100;

}

class Hiararchi
{
     public static void main(String[] args)
     {  
     
     
       Demo d1 = new Demo();
       
            System.out.println(d1.a);
              d1.area();
	      
	      
	      
	   Tester t1 = new Tester();
	   
	          System.out.println(t1.a);
		      System.out.println(t1.c);
     
     
     
     }

}
