package justin_johnson_exercise3;

//Assignment 2
//Exercise #3

public class SortNumbers{

   public static void sortList(int... numbers) { 
      int n = numbers.length;
      int[] newArray = new int[n]; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
               if (newArray[j] > newArray[j+1])  { 
                  int temp = newArray[j]; 
                  newArray[j] = newArray[j+1]; 
                  newArray[j+1] = temp; 
               }                      
    } 
     
   public static void main(String args[]) 
   { 
      int newArray[] = {50, 60, 30, 20, 40, 10}; 
      sortList(newArray); 
      System.out.println("Sorted Array:");
      
      for (int value: newArray) {
    	  System.out.printf("  %d",value);
      }
   }
} 
