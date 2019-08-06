class MyClass {
	public static void main(String[] args)
	{
   int num;
   float gpa = 13.65;
   double mask = 0xaf;
   Integer x = 5; // boxes int to an Integer object
    x =  x + 10;   // unboxes the Integer to a int
   //constructor
   MyClass() {
      num = 100;
   }
   //parameterized constructor
   MyClass(int i ) {
      x = i;
   }
	  //integer array
	  int [] numbers = {10, 20, 30, 40, 50};
//advanced for loop
      for(int x : numbers ) 
	  {
         System.out.print( x );
         System.out.print(",");
		 //inner advanced for loop
		 for( String name : names )
		 {
         System.out.print( name );
         System.out.print(",");
         }
      }
      System.out.print("\n");
	  //string array
      String [] names = {"James", "Larry", "Tom", "Lacy"};
	  //switch case
	  char grade = 'C';

      switch(grade) {
         case 'A' :
            System.out.println("Excellent!"); 
            break;
         case 'B' :
         case 'C' :
            System.out.println("Well done");
            break;
         case 'D' :
            System.out.println("You passed");
         case 'F' :
            System.out.println("Better try again");
            break;
         default :
            System.out.println("Invalid grade");
      }
	  //string function
      System.out.println("Your grade is " + grade);
	  String fs;
fs = String.format("The value of the float variable is " +
                   "%f, while the value of the integer " +
                   "variable is %d, and the string " +
                   "is %s", floatVar, intVar, stringVar);
System.out.println(fs);
//for loop
int[] result = new int[list.length];

   for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
      result[j] = list[i];
	  
   }
//Date format
Date date = new Date();
SimpleDateFormat ft = 
      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

      System.out.println("Current Date: " + ft.format(dNow));
	  
	  //Thread
	  Thread.sleep(5*60*10);
