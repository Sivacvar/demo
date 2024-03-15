package org.phone;

import java.util.HashSet;
import java.util.Set;

public class Student {
	
	int stdId;
    String stdName;
    String stdPhone;
    String address;
    String dOB;
    String eMail;
    String gender;

    public Student(int stdId, String stdName, String stdPhone, String address, String dOB, String eMail, String gender) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdPhone = stdPhone;
        this.address = address;
        this.dOB = dOB;
        this.eMail = eMail;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdId=" + stdId +
                ", stdName='" + stdName + '\'' +
                ", stdPhone='" + stdPhone + '\'' +
                ", address='" + address + '\'' +
                ", dOB='" + dOB + '\'' +
                ", eMail='" + eMail + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }




	 public static void main(String[] args) {
        // Create a set to store student details
        Set<Student> studentSet = new HashSet<>();

        // Insert 10 student details
        studentSet.add(new Student(1, "John Doe", "1234567890", "123 Main St", "2000-01-01", "john.doe@example.com", "Male"));
        studentSet.add(new Student(2, "Jane Smith", "9876543210", "456 Oak Ave", "1999-05-15", "jane.smith@example.com", "Female"));
        studentSet.add(new Student(3, "Bob Johnson", "5551234567", "789 Pine Rd", "2001-08-22", "bob.johnson@example.com", "Male"));
        studentSet.add(new Student(4, "Alice Brown", "9998887777", "321 Cedar Ln", "2002-03-10", "alice.brown@example.com", "Female"));
        studentSet.add(new Student(5, "Tom Wilson", "1112223333", "654 Birch Blvd", "2003-11-05", "tom.wilson@example.com", "Male"));
        studentSet.add(new Student(6, "Sara Miller", "4445556666", "987 Elm Ct", "1998-07-19", "sara.miller@example.com", "Female"));
        studentSet.add(new Student(7, "Chris Davis", "7778889999", "234 Maple Dr", "2004-02-28", "chris.davis@example.com", "Male"));
        studentSet.add(new Student(8, "Emily White", "1239874560", "567 Walnut St", "1997-09-12", "emily.white@example.com", "Female"));
        studentSet.add(new Student(9, "Mike Robinson", "5554443333", "890 Pine Ln", "2005-06-08", "mike.robinson@example.com", "Male"));
        studentSet.add(new Student(10, "Lisa Garcia", "1113335557", "123 Oak Dr", "1996-12-03", "lisa.garcia@example.com", "Female"));

        // Print the set of students
        System.out.println("Set of Students:");
        for (Student student : studentSet) {
            System.out.println(student);
        }
    }

}