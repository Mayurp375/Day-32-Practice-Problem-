package org.example.Day32.adressbook;

import org.example.Day31.adressbook.ComandLine;
import org.example.Day31.adressbook.MyConnection;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        //connection
        int ch;
        MyConnection.connection();
        while (true) {
            System.out.println("enter 0 - exit , 1 - show database," +
                    "2- add now contact , 3- delet data by name");
            ch = sc.nextInt();
            if (ch == 0) {
                break;
            }
            if (ch == 1) {
                ComandLine.createDataBase();
            }
            if (ch == 2) {
                ComandLine.insertData();
            }
            if(ch == 3){
                System.out.println("Enter name to delete ..!!");
                String name =sc.nextLine();
               ComandLine.delteData(name);
            }
        }
    }
}
