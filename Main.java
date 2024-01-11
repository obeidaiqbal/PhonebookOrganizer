// Name: Obeida Iqbal
// Date: 2/20/2021

import java.util.Scanner;

class Main
{
    public static void main(String[] args)       // This class asks the user what option they would like to select to edit the phonebook
    {
        PhoneBookManager pbManager = new PhoneBookManager();
        Scanner console = new Scanner(System.in);
        System.out.println("Enter 1 to add new contacts\nEnter 2 to view contacts\nEnter 3 to edit a contact\nEnter 4 to delete a Contact\nEnter 5 to exit");
        int menu = console.nextInt();
        while(true)
        {
            if(menu == 1)                   // this if statement is for adding to the phonebook
            {
                System.out.println("Enter First Name: ");
                String name = console.next();
                System.out.println("Enter House Number: ");
                String address = console.next();
                System.out.println("Enter City Name: ");
                String city = console.next();
                System.out.println("Enter Phonenumber: ");
                String phonenumber = console.next();
                PhoneBook pbook = new PhoneBook(name, address, city, phonenumber);
                pbManager.add(pbook);
            }
            else if(menu == 2)         // this if statement is for viewing the phonebook
            {
                pbManager.display();
            }
            else if(menu == 3)        // this if statement is for editing the phonebook
            {
                System.out.println("Enter the phonenumber of the contact\nyou would like to edit: ");
                String number = console.next();
                pbManager.modify(number);

            }
            else if(menu == 4)        // this if statement is for deleting an entry from the phonebook
            {
                System.out.println("Enter the phonenumber of the contact\nyou would like to delete: ");
                String number = console.next();
                pbManager.delete(number);
            }
            else
            {
                break;
            }
            System.out.println("Enter 1 to add new contacts\nEnter 2 to view contacts\nEnter 3 to edit a contact\nEnter 4 to delete a Contact\nEnter 5 to exit");
            menu = console.nextInt();
        }
    }
}
