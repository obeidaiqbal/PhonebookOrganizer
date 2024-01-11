// Name: Obeida Iqbal
// Date: 2/20/2021

import java.util.Scanner;

class PhoneBookManager
{
    PhoneBook start;
    void display()            // this method is for when the phone book is being displayed
    {
        PhoneBook temp = start;
        boolean isEmpty = true;
        if(temp != null)
            System.out.format("%-15s%-15s%-15s%-15s\n", "Name","House Number","City","Number");
        while(temp != null)
        {
            System.out.format("%-15s%-15s%-15s%-15s\n", temp.name,temp.address, temp.city, temp.PhoneNumber);
            temp = temp.next;
            isEmpty = false;
        }
        if(isEmpty)
            System.out.println("Phonebook is empty");
    }
    void add(PhoneBook pb)         // this method is for when a contact is being added to the phone book
    {
        PhoneBook current;
        if (start == null || start.name.compareTo(pb.name)>=0)
        {
            pb.next = start;
            start = pb;
        }
        else {
            current = start;
            while (current.next != null && current.next.name.compareTo(pb.name)<=-1)
                current = current.next;
            pb.next = current.next;
            current.next = pb;
        }
    }
    void modify(String PhoneNumber)     // this method is for when the phone book is being modified
    {
        PhoneBook temp = start;
        boolean found = false;
        while(temp != null)
        {
            if(temp.PhoneNumber.equals(PhoneNumber))
            {
                found = true;
                break;
            }
            temp = temp.next;
        }
        if(found)
        {
            Scanner console = new Scanner(System.in);
            System.out.println(temp.toString());
            System.out.println("Enter New Name: ");
            String name = console.next();
            System.out.println("Enter New House Number: ");
            String address = console.next();
            System.out.println("Enter New City: ");
            String city = console.next();
            System.out.println("Enter New Phonenumber: ");
            String phonenumber = console.next();

            temp.name = name;
            temp.address = address;
            temp.city = city;
            temp.PhoneNumber = phonenumber;
            System.out.println("Successfully updated");
        }
        else
        {
            System.out.println("Given details not found");
        }
    }
    void delete(String PhoneNumber)       // this method is for when a contact is being deleted
    {
        if(start.PhoneNumber.equals(PhoneNumber))
        {
            start=start.next;
            return;
        }
        PhoneBook temp = start;
        PhoneBook prev = null;
        boolean found = false;
        while(temp != null)
        {
            if(temp.PhoneNumber.equals(PhoneNumber))
            {
                found = true;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        if(found)
        {
            if(start.next != null)
                prev.next = temp.next;
            else
                start = null;
            System.out.println("Deleted Successfully");
        }
        else
        {
            System.out.println("Given details not found!");
        }
    }
}