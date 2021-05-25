/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author user
 */
public class ContactsManager {
    // Fields
    private Contact [] myFriends;
    private int friendsCount;
    // Constructor
    ContactsManager() {
        this.myFriends = new Contact[500];
        this.friendsCount = 0;
    }
    
    public void addContact(Contact contact){
        this.myFriends[this.friendsCount] = contact;
        this.friendsCount++;
    }
    
    public Contact searchContact(String searchName){
        for (int i = 0; i < this.friendsCount; i++) {
            if (searchName.toUpperCase().equals(this.myFriends[i].getName().toUpperCase())) {
                return this.myFriends[i];
            }
        }
        return null;
    }
}
