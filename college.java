// import java.util.Scanner;

//  >>>>>>>>> PRINT STRINGS <<<<<<<<<<<


// public class sachin  
// {  
// public static void main(String args[])   
// {   
// System.out.println(" Sachin Yadav ");  
// }  
// }


//  >>>>>>>>>>>> REVERSE STRINGS PROGRAM <<<<<<<<<<<<<<<<


// class sachin {
//     public static void main (String[] args) {
//         String str= "Sachin Yadav", nstr="";
//         char ch;
//       System.out.print("Original word: ");
//       System.out.println("Sachin Yadav");
//       for (int i=0; i<str.length(); i++)
//       {
//         ch= str.charAt(i); 
//         nstr= ch+nstr; 
//       }
//       System.out.println("Reversed word: "+ nstr);
//     }
// }


//  >>>>>>>>>>>>>> PALINDRON PROGRAM <<<<<<<<<<<<<<



// class PalindromeExample{  
//     public static void main(String args[]){  
//      int r,sum=0,temp;    
//      int n=455; 
//      temp=n;    
//      while(n>0){    
//       r=n%10; 
//       sum=(sum*10)+r;    
//       n=n/10;    
//      }    
//      if(temp==sum)    
//       System.out.println("palindrome number ");    
//      else    
//       System.out.println("not palindrome");    
//    }  
//    } 



// import java.util.Scanner;
//  class expalindrome 
// {
// public static void main(String args[]) 
// {
// int x,number, y=0,temp=0;
// Scanner s =new Scanner(System.in);
// System.out.println("Enter Any Number: ");
// number=s.nextInt();
// x=number;
// while(number>0)
// {
// x=number%10;
// number=number/10;
// temp=temp*10+x;
// }
// if(temp==y)
// {
// System.out.println("Number is Palindrome");
// }
// else
// {
// System.out.println("not Palindrome");
// }
// }
// }


// >>>>>>>>>>>>  SUM OF TWO NUMBERS   <<<<<<<<<

// public class sachin  
// {  
// public static void main(String args[])   
// {  
// int n1 = 225, n2 = 115, sum;  
// sum = n1 + n2;  
// System.out.println("The sum of numbers is: "+sum);  
// }  
// }


//  >>>>>>>>>> METHOD OVERLOADING PROGRAM ADDITION <<<<<<<<<<<<

// class Adder{  
//     static int add(int a,int b){return a+b;}  
//     static int add(int a,int b,int c){return a+b+c;}  
//     }  
//     class TestOverloading1{  
//     public static void main(String[] args){  
//     System.out.println(Adder.add(11,11));  
//     System.out.println(Adder.add(11,11,11));  
//     }}


// class Adder{  
//     static int add(int a,int b, int c)
//     {
//         return a+b+c;
//     }  
//     static int add(int a,int b,int c,int d)
//     {
//         return a+b+c+d;
//     }  
//     }  
//     class TestOverloading1{  
//     public static void main(String[] args){  
//     System.out.println(Adder.add(11,11,2));  
//     System.out.println(Adder.add(11,11,11,12));  
//     }}

// ....>>>>>>>>>>> AVERAGE OF THE ADDITION IN ARRAY <<<<<<<<<<<<<<<..............


// public class sachin 
// {
//     public static void main(String[] args) {
//         int size, sum = 0, avg;
//         System.out.print("enter the size of the array:");
//         try (Scanner obj = new Scanner(System.in)) {
//             size = obj.nextInt();
//             int a[] = new int[size];
//             System.out.println("enter the array element:");
//             for (int i = 0; i < size; i++) {
//                 a[i] = obj.nextInt();
//             }
//             System.out.print("you entered these value in array:");
//             for (int i = size - 1; i >= 0; i--) {
//                 System.out.println(a[i] + " ");
//                 sum = sum + a[i];
//             }
//         }
//         System.out.println("Addition of the array value: " + sum);
//         avg = (sum / size);
//         System.out.println("Average fo the array: " +avg);
//     }
// }


// class Threads{
//     public static void main(String[] args)
//     {
//         try {
//             for (int i = 0; i < 5; i++) {
//                 Thread.sleep(1000);
//                 System.out.println(i);
//             }
//         }
//         catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }


// class A extends Thread{
//     public void run(){
//         try{
//             for(int i=1;i<=5;i++){
//                 System.out.println("My Name is Sachin Yadav");
//             }
//             Thread.sleep(1000)

//             }
//         }
//     }


// class SleepThread extends Thread  {    
//     public void run()    {    
//         for(int i=1;i<5;i++)   {    
//             try  {  
//                 Thread.sleep(1000);  
//             }catch(InterruptedException e){System.out.println(e);}    
//             System.out.println(Thread.currentThread().getName() + "   : " + i);    
//         }    
//     }    
// }
// class Main{
//     public static void main(String args[])  
//     {  
//         SleepThread thread_1 = new SleepThread();    
//         SleepThread thread_2 = new SleepThread();    
//         thread_1.start();    
//         thread_2.start();    
//     }    
// } 


//>>>>>>>>>>>>>>>>>>>>>> AWT CREATE CLASS IN LIST <<<<<<<<<<<<<<<<


// import java.awt.*;    
  
// public class college  
// {
//      college() {    
//         Frame f = new Frame();   
//         List l1 = new List(5);    
//         l1.setBounds(100, 100, 75, 75);    
//         l1.add("Red");    
//         l1.add("Green");    
//         l1.add("Blue");    
//         l1.add("Black");    
//         l1.add("White");    
//         f.add(l1);   
//         f.setSize(400, 400);    
//         f.setLayout(null);    
//         f.setVisible(true);    
//      }
// public static void main(String args[])    
// {    
//    new college();    
// }    
// }    


//  >>>>>>>>>>>>>>>>JAVA SWING BUTTON PROGRAM <<<<<<<<<<<<<<<



// import javax.swing.*;  
// public class college {  
// college() {  
// JFrame f=new JFrame();

// JLabel jl1 = new JLabel("Hii GLAINS");
// JLabel jl2 = new JLabel("MCA Sec- D");
// JButton c=new JButton("Click Me");
// JButton d=new JButton("Submit");


// jl1.setBounds(80,80,100, 20);
// jl2.setBounds(80,140,100, 20);
// c.setBounds(80,105,100, 20);
// d.setBounds(80,160,100, 20);

// f.add(jl1);       
// f.add(jl2); 
// f.add(c);
// f.add(d); 
          
// f.setSize(400,500);
// f.setLayout(null); 
// f.setVisible(true);
// }  
// public static void main(String args[]){
//    college g = new college();
// }
// }  


// >>>>>>>>>>>>>JAVA SWINGS CHECKBOX PROGRAM<<<<<<<<<<<



// import javax.swing.*;  
// public class college {  
// college() {  
// JFrame f=new JFrame();

// JLabel jl1 = new JLabel("Hii GLAINS");
// JLabel jl2 = new JLabel("MCA Sec- D");
// JCheckBox c=new JCheckBox("Click Me");
// JCheckBox d=new JCheckBox("Submit");


// jl1.setBounds(80,80,100, 20);
// jl2.setBounds(80,140,100, 20);
// c.setBounds(80,105,100, 20);
// d.setBounds(80,160,100, 20);

// f.add(jl1);       
// f.add(jl2); 
// f.add(c);
// f.add(d); 
          
// f.setSize(400,500);
// f.setLayout(null); 
// f.setVisible(true);
// }  
// public static void main(String args[]){
//    college e = new college();
// }
// }