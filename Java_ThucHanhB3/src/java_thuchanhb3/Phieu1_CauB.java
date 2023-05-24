/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_thuchanhb3;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Phieu1_CauB {
    private static final int RECORD_SIZE = 46;
    private static final int NAME_SIZE = 20;
    private static final int ID_SIZE = 10;
    private static final int GRADE_SIZE = 16;
    private static final int MAX_RECORDS = 100;

    private RandomAccessFile studentFile;
    private Scanner scanner;

    public Phieu1_CauB() {
        File file = new File("E:\\students.dat");
        try {
            studentFile = new RandomAccessFile(file, "rw");
            scanner = new Scanner(System.in);
        } catch (IOException e) {
            System.out.println("error: " + e);
        }
    }

    public void addStudent(String name, String id, String grade) {
        try {
            if (studentFile.length() / RECORD_SIZE >= MAX_RECORDS) {
                System.out.println("ERROR: Reached maximum number of students!");
                return;
            }
            studentFile.seek(studentFile.length());
            studentFile.writeBytes(fixLengthString(name, NAME_SIZE));
            studentFile.writeBytes(fixLengthString(id, ID_SIZE));
            studentFile.writeBytes(fixLengthString(grade, GRADE_SIZE));
        } catch (IOException e) {
            System.out.println("error: " + e);
        }
    }

    public void displayStudent(String id) {
        try {
            int recordNumber = searchRecord(id);
            if (recordNumber == -1) {
                System.out.println("ERROR: Cannot find student with ID " + id);
                return;
            }
            studentFile.seek(recordNumber * RECORD_SIZE);
            String name = readFixedLengthString(NAME_SIZE);
            String grade = readFixedLengthString(GRADE_SIZE);
            System.out.println("Student: " + name + " (ID: " + id + " Grade: " + grade + ")");
        } catch (IOException e) {
            System.out.println("error: " + e);
        }
    }

    public void updateGrade(String id, String grade) {
        try {
            int recordNumber = searchRecord(id);
            if (recordNumber == -1) {
                System.out.println("ERROR: Cannot find student with ID " + id);
                return;
            }
            studentFile.seek(recordNumber * RECORD_SIZE + NAME_SIZE);
            studentFile.writeBytes(fixLengthString(grade, GRADE_SIZE));
        } catch (IOException e) {
                System.out.println("error: " + e);
        }
    }

    private int searchRecord(String id) throws IOException {
        long filePointer = 0;
        while (filePointer < studentFile.length()) {
            studentFile.seek(filePointer);
            String currentID = readFixedLengthString(ID_SIZE);
            if (currentID.equals(id)) {
                return (int) (filePointer / RECORD_SIZE);
            }
            filePointer += RECORD_SIZE;
        }
        return -1;
    }

    private String readFixedLengthString(int length) throws IOException {
        byte[] bytes = new byte[length];
        studentFile.read(bytes);
        return new String(bytes);
    }

    private String fixLengthString(String string, int length) {
        if (string.length() > length) {
            return string.substring(0, length);
        } else if (string.length() == length) {
            return string;
        } else {
            StringBuilder sb = new StringBuilder(string);
            while (sb.length() < length) {
                sb.append(' ');
            }
            return sb.toString();
        }
    }

    public void close() {
        try {
            studentFile.close();
            scanner.close();
        } catch (IOException e) {
            System.out.println("error: " + e);
        }
    }

    public static void main(String[] args) throws IOException {
        Phieu1_CauB manager = new Phieu1_CauB();
        manager.addStudent("John Doe", "12345", "A");
        manager.addStudent("Jane Smith", "54321", "B");
        manager.addStudent("Bob Johnson", "67890", "C");

        manager.displayStudent("12345");
        manager.updateGrade("54321", "A");

        manager.close();
    }
}

