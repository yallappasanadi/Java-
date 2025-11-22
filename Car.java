class Car
{
       String model;
       int cost;
       
       Car(String a,int b)
       {
       
            model=a;
	    cost=b;
       
       }
       
       public static void main(String[] args)
       {
       
             Car c1 = new Car("FORTUNER",4847);
	     
	          System.out.println(c1.model);
		  
		  System.out.println(c1.cost);
       
       }



}