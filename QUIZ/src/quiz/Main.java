/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContactsManager myContactManager = new ContactsManager();
        Scanner sc= new Scanner(System.in);
        String searchName;
        
        Contact addContact = new Contact("Andi","adni@gmail.com","13456789");
        myContactManager.addContact(addContact);
        addContact = new Contact("Budi","Budi@gmail.com","13456789");
        myContactManager.addContact(addContact);
        addContact = new Contact("Annas","Annas@gmail.com","13456789");
        myContactManager.addContact(addContact);
        addContact = new Contact("Herman","herman@gmail.com","13456789");
        myContactManager.addContact(addContact);
        addContact = new Contact("tanto","tanto@gmail.com","13456789");
        myContactManager.addContact(addContact);
        
        while(true){
                System.out.println("Search Nama\t: "); 
                searchName = sc.next();
                System.out.println("Looking for " + searchName + "'s contact"); 
                Contact result = myContactManager.searchContact(searchName);
                if (result != null) {
                    System.out.println("Contact's Found");
                    System.out.println("Nama\t\t: "+ result.getName());
                    System.out.println("Email\t\t: "+ result.getEmail());
                    System.out.println("PhoneNumber\t: "+ result.getPhoneNumber());
                }else{
                    System.out.println("Contact's Not Found");
                }
                System.out.println("Again?(y/n)\t: "); 
                String again = sc.next();
                if (again.equals("n")) {
                    return;
                }
        }
        
    }
    
}
