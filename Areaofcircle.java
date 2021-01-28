class AreaOfCircle {
   public static void main(String args[]) 
    {   
        Scanner s= new Scanner(System.in);
         System.out.println("Enter the radius:");
         double r= s.Double();
         double  area=(3.14*r*r) ;
         System.out.println("Area of Circle is: " + area);      
   }
}