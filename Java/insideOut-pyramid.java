//java program to print inside dimamond pattern
//INPUT : 5
// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********

import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
for(int i=n;i>=1;i--){
   
     for(int j=1;j<=n;j++)                                       // first triangle
 {
       if(j-1>=i)
           System.out.print(" ");
       else
       System.out.print("*");
   }
   
   for(int j=n;j>=1;j--)                                         // second triangle
 {   
    if(j-1<i)
          System.out.print("*");   
       else
       System.out.print(" ");
   }
   System.out.println();
}

for(int i=1;i<=n;i++){
   
     for(int j=1;j<=n;j++){                              // third triangle
       if(j-1>=i){
           System.out.print(" ");
       }
       else
       System.out.print("*");
   }
   
 for(int j=5;j>=1;j--){                                  // fourth triangle
       if(i>j-1){


           System.out.print("*");
       }
       else
       System.out.print(" "); 
}
  System.out.println();
}
}
}
