package javaapplication3;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;

public class student implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String address;
    private int age;


    public student() {
       super();
    }

    public student(int id, String name, String address, int age) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

     @Override
    public String toString() {
        return "Student@[id=" + id + " , name=" + name + ", "
                + "address= " + address + ",age =" + age + "]";
    }

    public void readAll(RandomAccessFile file) throws IOException
    {
        final int Record_Length = 30;
        int recordNumber = 0;
        file.seek((recordNumber) * Record_Length);

        String code ="";
        for(int i = 0; i < 30; i++)
        {
        code += file.readLine() + "\n";
        }
        System.out.println(code);
    }
}
