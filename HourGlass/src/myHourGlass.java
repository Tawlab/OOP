/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adison
 */
import java.util.Scanner;
public class myHourGlass {
    Scanner scanner = new Scanner(System.in);
   int sandA = 5000;
   int sandB = 0;
   int sandSideStart = 2;
   
   
   
   void menu(){
       boolean continueLoop = true;
       System.out.println("       Hour Glass Program       ");
       System.out.println("********************************");
       System.out.println("*             Menu             *");
       while (continueLoop){
       System.out.println("********************************");
       System.out.println("  Press 1 for Rotate right 90   ");
       System.out.println("  Press 2 for Rotate right 180  ");
       System.out.println("        Press 3 for Exit        ");
       System.out.println("");
       System.out.println("Press your menu :");
       byte numMenu = scanner.nextByte();
       switch(numMenu){
           case 1:
               System.out.println("Rotate 90");
               rotateRight90();
               break;
           case 2:
               System.out.println("Rotate 180");
               rotateRight180();
               break;
           case 3:
               System.out.println("Exit program");
               System.exit(0);
           default:
               System.out.println("ERROR");
               return ;
       }
       }

   }
   ////////////////////////////////////////////////////////////////////
   
   void rotateRight90(){
//       int sandSideAction = sandSideStart;
//       Sand in side 1
if(sandSideStart==1){
          sandB = sandA;
          sandA=0;
          System.out.println("Sand is side "+sandSideStart);
           for(int i = sandB;i >=0;i -=1000){
               System.out.println("SandA "+sandA +"  "+"sandB "+sandB);
               sandB -=1000;
               sandA +=1000;
                try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       }
   }
//       Sand in side 2
       if(sandSideStart==2){
           System.out.println("Sand is side "+sandSideStart);
           sandSideStart = 2;
       }
//       Sand in side 3
       if(sandSideStart==3){
           System.out.println("Sand is side "+sandSideStart);
           for(int i = sandA;i >=0;i -=1000){
               System.out.println("SandA "+sandA +"  "+"sandB "+sandB);
               sandA -=1000;
               sandB +=1000;
                try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
//       Sand in side 4
       if(sandSideStart==4){
       System.out.println("Sand is side "+sandSideStart);
       }
//       Side Sand+1
      sandSideStart++;
//      Check sand side and Restatus sand side
      if(sandSideStart >=5){
          sandSideStart = 1;
          sandA = 5000;
          sandB = 0;
      }
   }
   
   void rotateRight180(){
       sandSideStart=sandSideStart+2;
//       int sandSideAction = sandSideStart;
       //       Sand in side 1
       if(sandSideStart==1){
           System.out.println("Sand is side "+sandSideStart);
           for(int i = sandA;i >=0;i -=1000){
               System.out.println("SandA "+sandA +"  "+"sandB "+sandB);
               sandA -=1000;
               sandB +=1000;
                try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
           
}
//       Sand in side 2
       if(sandSideStart==2){
           System.out.println("Sand is side "+sandSideStart);
       }
//       Sand in side 3
       if(sandSideStart==3){
          sandB = sandA;
          sandA=0;
          System.out.println("Sand is side "+sandSideStart);
           for(int i = sandB;i >=0;i -=1000){
               System.out.println("SandA "+sandA +"  "+"sandB "+sandB);
               sandB -=1000;
               sandA +=1000;
                try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       }
   }
//       Sand in side 4
       if(sandSideStart==4){
       System.out.println("Sand is side "+sandSideStart);
       }
       
//       Side Sand+1
//      Check sand side and Restatus sand side
      if(sandSideStart >=5){
          sandSideStart = 2;
          sandA = 5000;
          sandB = 0;
      }
   }
   
   }
//       else
//           System.out.println("ERROR");
//           }
       
   
