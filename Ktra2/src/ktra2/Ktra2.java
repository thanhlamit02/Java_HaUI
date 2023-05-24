/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ktra2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dth27
 */
public class Ktra2 {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    static List<Book> books = new ArrayList<>();
    
    public static void main(String[] args) throws IOException, Exception {
        // TODO code application logic here
        int choice;

        do {
            System.out.println("CHUONG TRINH QUAN LY THU VIEN");
            System.out.println("    ---------------------    ");
            System.out.println("1. Nhap");
            System.out.println("2. Hien thi");
            System.out.println("3. Sap xep");
            System.out.println("4. Tim kiem");
            System.out.println("5. Thoat");
            System.out.println("Chon chuc nang: ");
            try {
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Nhap ");
                        add(books);
                        break;
                    case 2:
                        System.out.println("HIen thi danh sach sach");
                        show(books);
                        break;
                    case 3:
                        System.out.println("Sap xep");
                        sort(books);
                        break;
                    case 4:
                        System.out.println("Tim kiem");
                        search(books);
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        throw new IllegalArgumentException("Invlaid " + choice);
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (true);
    }

    public static void add(List<Book> books) throws Exception{
        Book book = new Book();
        book.Input();
        WriteFile("book.dat", book);
        books.add(book);
    }

    public static void show(List<Book> books) {
        System.out.printf("%-10s %-30s %-20s %-30s %-10s\n", "Ma sach", "Ten sach", "Tac gia", "Nha XB", "Nam XB");
        for (Book ele : books) {
            ele.Output();
        }
    }

    public static void sort(List<Book> books) {
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getNamXB() - o2.getNamXB();
            }
        });
        
        for(Book ele : books) {
            ele.Output();
        }
    }

    public static void search(List<Book> books) {
        sc.nextLine();
        System.out.print("Nhap ma sach can tim: ");
        String id = sc.nextLine();
        boolean check = false;
        for (Book book : books) {
            if (book.getId().equals(id)) {
                book.Output();
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Khong co sach nao co ma nay");
        }
    }
    
    public static void WriteFile(String fileName, Book book) throws Exception {
        FileOutputStream file = new FileOutputStream(fileName);
        
        ObjectOutputStream os = new ObjectOutputStream(file);
        
        os.writeObject(book.toString());
        
        os.close();
    }

    public static void ReadFile(String fileName) throws Exception {        
        FileInputStream file = new FileInputStream(fileName);
        
        ObjectInputStream is = new ObjectInputStream(file);
        
        Book book = (Book) is.readObject();
        
        System.out.println(book.toString());
        
        is.close();
    }
}
