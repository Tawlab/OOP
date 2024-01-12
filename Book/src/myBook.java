User
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author Adison
 */
import java.util.Scanner;
public class myBook {
    Scanner scanner = new Scanner(System.in);
    int indexPage = 1;
    int lastPage = 0;
    int currentPage = 1;
    int nextPage = currentPage++;
    int previousPage = currentPage--;
    int numberPage = 1;
    int bookMark = 0;
    
    void menu(){
    System.out.print("Enter all page : ");
    int numPage = scanner.nextInt();
    System.out.println("***************");
    System.out.println("     MENU      ");
    System.out.println("***************");
    System.out.println("Press 1 go to index page.");
    System.out.println("Press 2 go to last page.");
    System.out.println("Press 3 go to desired page.");
    System.out.println("Press 4 go to bookmark page.");
    System.out.println("Press 5 go to next page.");
    System.out.println("Press 6 go to previous page.");
    System.out.println("Press 7 insert bookmark.");
    System.out.println("***************");
    System.out.println("");
    System.out.println("Press your menu :");
       byte numMenu = scanner.nextByte();
    switch(numMenu){
        case 1:openIndex();
        break;
        case 2:lastPage();
        break;
        case 3:selectPage();
        break;
        case 4:openMark();
        break;
        case 5:toNextPage();
        break;
        case 6:toPreviousPage();
        break;
        case 7:insertBookMark();
        break;
        
    }
    }
    void openIndex() {
    currentPage = indexPage;
    System.out.println("This book has a total of " + numPage + " pages.");
}

    
   void lastPage() {
    currentPage = lastPage;
    System.out.println("Opening last page: " + currentPage);
}

    
    void selectPage() {
    System.out.print("Enter the desired page: ");
    currentPage = scanner.nextInt();
    System.out.println("Opening page: " + currentPage);
}

    
    void openMark() {
    if (bookMark > 0 && bookMark <= lastPage) {
        currentPage = bookMark;
        System.out.println("Opening bookmarked page: " + currentPage);
    } else {
        System.out.println("No bookmarks available.");
    }
}

    
    void toNextPage() {
    if (currentPage < lastPage) {
        currentPage++;
        System.out.println("Opening next page: " + currentPage);
    } else {
        System.out.println("You are already on the last page.");
    }
}

void toPreviousPage() {
    if (currentPage > 1) {
        currentPage--;
        System.out.println("Opening previous page: " + currentPage);
    } else {
        System.out.println("You are already on the first page.");
    }
}

    
    void insertBookMark() {
    bookMark = currentPage;
    System.out.println("Bookmark added to page: " + bookMark);
}

    
}
