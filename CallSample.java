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

class MainClass
{
     public static void main(String[],args)
     {  
     
          Demo d1 = new Demo();
	  
	     System.out.println(d1.a);
	     
	     d1.area();
      
         
     
     
     
     }

}
