class Sample
{
//method
public static int minFunction(int n1, int n2) {
   int min;
   if (n1 > n2)
   {
      min = n2;
   }
   else
   {
      min = n1;
   }

   return min; 
}
 //parameterized constructor
int age;   
   Sample(int age) {
      this.age = age;	
   }
public static void main(String [] args)
{
//regex
private static final String REGEX = "\\bcat\\b";
private static final String INPUT = "cat cat cat cattie cat";
Pattern p = Pattern.compile(REGEX);
Matcher m = p.matcher(INPUT); 
//calling method
int c = minFunction(a, b);

//File operations
FileInputStream in = null;
FileOutputStream out = null;
      try {
         in = new FileInputStream("input.txt");
         out = new FileOutputStream("output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }
   catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Exception thrown  :" + e);
      }
   finally
        {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
         }
         //exceptions
         try {
         int a[] = new int[2];
         System.out.println("Access element three :" + a[3]);
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Exception thrown  :" + e);
      }
      System.out.println("Out of the block");
      
      
      }
      
}
