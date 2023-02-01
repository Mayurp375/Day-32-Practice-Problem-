package org.example.Day32.adressbook;

import org.example.Day31.adressbook.AddressBook;
import org.example.Day31.adressbook.MyConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ComandLine {

    static Scanner sc = new Scanner(System.in);

    public static void createDataBase() throws SQLException {

        String query = "select* from contact"; //Qury
        Connection root = MyConnection.connection();
        Statement statement = root.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
//List
        List<AddressBook> bookList = new ArrayList<AddressBook>();
        while (resultSet.next()) {
            AddressBook book = new AddressBook();
            book.setName(resultSet.getString(1));
            book.setAdress(resultSet.getString(2));
            book.setCity(resultSet.getString(3));
            book.setState(resultSet.getString(4));
            book.setZip(resultSet.getInt(5));
            book.setPhoneNumm(resultSet.getString(6));
            book.setEmail(resultSet.getString(7));
            bookList.add(book);
        }
//Iterator
        Iterator<AddressBook> iterator = bookList.iterator();
        while (iterator.hasNext()) {
            System.out.println("+++++++++++++++++++++++++");
            System.out.println(iterator.next());
            System.out.println("+++++++++++++++++++++++++");
        }
    }

    public static void insertData() throws SQLException {
        System.out.println("Enter name :");
        String name = sc.nextLine();
        System.out.println("Enter address :");
        String address = sc.nextLine();
        System.out.println("Enter city :");
        String city = sc.nextLine();
        System.out.println("Enter state :");
        String state = sc.nextLine();
        System.out.println("Enter zip :");
        int zip = sc.nextInt();
        System.out.println("Enter phone :");
        String phone = sc.next();
        System.out.println("Enter email :");
        String email = sc.next();
//query
        String q = "insert into contact values ('" + name + "','" + address + "','" + city + "','" + state + "'," + zip + ",'" + phone + "','" + email + "');";
        Connection root = MyConnection.connection();
        Statement statement = root.createStatement();
        //if added
        int resultSet = statement.executeUpdate(q);
        if (resultSet == 1) {
            System.out.println("added Successfully...........");
        } else {
            System.out.println("Something went wrong........");
        }
        root.close(); //closed connection
    }

    public static void delteData(String name) throws SQLException {
        System.out.println("Enter name :");

//query
        String q = "delete from contact where name ='"+ name+"'';";
        Connection root = MyConnection.connection();
        Statement statement = root.createStatement();

        int resultSet = statement.executeUpdate(q);
        if (resultSet == 1) {
            System.out.println("added Successfully...........");
        } else {
            System.out.println("Something went wrong........");
        }
        root.close(); //closed connection
    }
}
