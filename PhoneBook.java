// Name: Obeida Iqbal
// Date: 2/20/2021

import java.util.*;

class PhoneBook 
{
   String name;
   String address;
   String city;
   String PhoneNumber;
   PhoneBook next;
   
   public String toString()       // this method is for printing the phonebook entries
   {
        return "PhoneBook [name= " + name + ", address= " + address + ", city= " + city + ", Phonenumber= " + PhoneNumber+ "]";
   }
   public PhoneBook(String name, String address, String city, String phoneNumber) // this method sets the strings in the previous method
   {
       super();
       this.name = name;
       this.address = address;
       this.city = city;
       PhoneNumber = phoneNumber;
       this.next = null;
   }
}


