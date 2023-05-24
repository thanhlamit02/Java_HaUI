package javaapplication3;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int id, age;
        String name, add;
        ArrayList<student> std = new ArrayList<student>();
        int num = scanner.nextInt();
        for(int i = 0; i < num; i++) {
            student s = new student();
            System.out.print("id: ");
            id = scanner.nextInt();
            s.setId(id);
            scanner.nextLine();
            System.out.print("name: ");
            name = scanner.nextLine();
            s.setName(name);
            System.out.print("age: ");
            age = scanner.nextInt();
            s.setAge(age);
            scanner.nextLine();
            System.out.print("add: ");
            add = scanner.nextLine();
            s.setAddress(add);
            std.add(s);
        }
        
        RandomAccessFile raf;
        try {
            raf = new RandomAccessFile("E:\\random.dat", "rw");
        } catch (FileNotFoundException exc) {
            System.out.println("Cannot open file.");
            return;
        }
        
        for (int i = 0; i < std.size(); i++) {
            byte[] bytes = std.get(i).toString().getBytes();
            for (byte byteWrite : bytes) {
                raf.writeByte(byteWrite);
            }
        }
        
        final int Record_Length = std.size();
        int recordNumber = 0;
        raf.seek((recordNumber) * Record_Length);

        String code ="";
        for(int i = 0; i < std.size() - 1; i++)
        {
        code += raf.readLine() + "\n";
        }
        System.out.println(code);
    }
}
