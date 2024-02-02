/*Project to make pc using manu driven function. In this pricet each function gives
option to select part and show price. User selects the part and billing function
called. It autometicly calculate the bill and show the total price of the pc you want.
 */

 import java.util.*;
 public class project
 {
         /*This is Main Funtion Containing Choices and calling of the functions. Billing and pc parts name
         functions are called here. Main choice options like AMD and Intel based Pc are there too.*/
         public static void main (String[] args)
         {
             Scanner r = new Scanner(System.in);
             System.out.println("********** Welcome to ModxComputer **********");
             System.out.println();
 
             //Option to select type of Pc
             System.out.println("Press (1) For AMD Based PC Built....");
             System.out.println("Press (2) For Intel Based PC Built....");
             int cpu_Choice = r.nextInt();
 
             //Intel based cpu funtions calling and components name printer funtion
             if (cpu_Choice == 1)
             {
                 System.out.println("********** AMD PC Build ***********");
                 System.out.println(":...:Select Components for Your PC :...:");
                 int cpu = cpu_Store_Function();
 
                 bill_Generator(cpu);
             }
 
             //Intel based cpu funtions calling and components name printer funtion
             else if (cpu_Choice == 2)
             {
                 System.out.println("*********** Intel PC Build ************");
             }
 
             //Wrong Option msg
             else
             {
                 System.out.println("Wrong Option (You May Restart the project)");
             }
 
         }
 
 
         /*This Functions is containing all cpu names and there price along with sorting according to
         price in order of high to low and low to high. There is fucntion also to print all cpu name
         and there prices. Here is return varibale to return the index of the part to main function*/
 
 
     public static int cpu_Store_Function(){
 
         //Proccessor name and Price in Low to High order
         String[] processor1 = {"intel core 2 duo","intel i3 12th gen 12300k","intel i3 12th gen 12340f",
                 "intel i5 12th gen 12500k","intel i5 12th gen 12540f","intel i7 12th gen 12700k",
                 "intel i7 12th gen 12740f","intel i9 12th gen 12900k","intel i9 12th gen 12940f",
                 "intel xenon extreme 12999e"};
         int[] price1 = {6999,10999,8900,13500,15999,18900,17000,21000,20999,24900};
 
         //Proccessor name and Price in High to Low order
         String[] processor2 = {"intel xenon extreme 12999e","intel i9 12th gen 12940f","intel i9 12th gen 12900k",
                 "intel i7 12th gen 12740f","intel i7 12th gen 12700k","intel i5 12th gen 12540f",
                 "intel i5 12th gen 12500k","intel i3 12th gen 12340f","intel i3 12th gen 12300k",
                 "intel core 2 duo"};
         int[] price2 = {24900,20999,21000,17000,18900,15999,13500,8900,10999,6999};
 
         Scanner r = new Scanner(System.in);
 
         //Option to select type of sorting
         System.out.println(":..: Choose Sorting :..:");
         System.out.println("Press (1) to sort Price (Low To High)");
         System.out.println("Press (2) to sort Price (High To Low)");
         int sort_Type_Choice = r.nextInt();
 
         //Low to High sorting Printer
         if(sort_Type_Choice == 1)
         {
 
             for (int i = 0; i< processor1.length; i++)
             {
                 System.out.print(processor1[i]+"= Rs."+price1[i] +"......:>"+(i+1));
                 System.out.println();
             }
             System.out.println("Press (Index) to select the CPU : ");
             int cpu_Index = r.nextInt();
             return cpu_Index;
 
         }
 
         //High to Low Sorting Printer
         else if(sort_Type_Choice == 2)
         {
 
             for (int i = 0; i< processor2.length; i++)
             {
                 System.out.print(processor2[i]+"= Rs."+price2[i] +"......:>"+(i+1));
                 System.out.println();
             }
             System.out.println("Press (Index) to select the CPU : ");
             int cpu_Index = r.nextInt();
             return cpu_Index;
         }
 
         return 0;
     }
 
         /*This function is calculating bill from the given index and getting price form given price 
         array. */
     public static void bill_Generator(int cpu_Index)
     {
         String[] processor1 = {"intel core 2 duo", "intel i3 12th gen 12300k", "intel i3 12th gen 12340f",
                 "intel i5 12th gen 12500k", "intel i5 12th gen 12540f", "intel i7 12th gen 12700k",
                 "intel i7 12th gen 12740f", "intel i9 12th gen 12900k", "intel i9 12th gen 12940f",
                 "intel xenon extreme 12999e"};
         int[] price1 = {6999, 10999, 8900, 13500, 15999, 18900, 17000, 21000, 20999, 24900};
 
         //Bill genrator and total price calculator
         double total_Price = 0;
         for (int i = 0; i < processor1.length; i++) {
             if (cpu_Index == i+1) {
                 System.out.println(processor1[i] + "Rs =" + price1[i]);
                 System.out.println();
                 total_Price = price1[i];
             }
         }
         System.out.println(total_Price);
     }
 }