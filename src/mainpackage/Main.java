package mainpackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Users user1 = new Users("nick13","12345","nikolas","styl");
        Patient pat1 = new Patient("elen12","1232","elenh","kapos",1234567656);
        Doctor doc1 = new Doctor("odikoss ","112111","giorgos","kostou","paidiatros");


        System.out.print("yo "+ user1.getUsername() +" "+ pat1.getAmka()+" "+ doc1.getSpecialty());

        doc1.setSpecialty(" gnaikologos \n");

        System.out.print(doc1.getSpecialty());


        /*Scanner test1 = new Scanner(System.in);
        System.out.println("Enter your username\n");
        String userName = test1.nextLine();  // Read user input
        System.out.println("Enter your password\n");
        String passWord = test1.nextLine();
        System.out.println("Enter your name\n");
        String Name = test1.nextLine();
        System.out.println("Enter your surname\n");
        String surName = test1.nextLine();

        Users test11 = new Users(userName,passWord,Name,surName);
        System.out.print(test11.getUsername()+" "+test11.getName()+" "+test11.getSurname());*/

        File patFromFile = new File("Patient1.txt");
        Scanner forFile = new Scanner(patFromFile);
        Patient pat2 = new Patient(forFile.next(),forFile.next(),forFile.next(),forFile.next(),forFile.nextInt());
        System.out.println(pat2.getAmka()+" "+pat2.getName()+" "+pat2.getUsername());



    }
}
