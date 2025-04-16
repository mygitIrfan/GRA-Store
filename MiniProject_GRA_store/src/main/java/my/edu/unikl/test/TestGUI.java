package my.edu.unikl.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class Student {
    private int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + age;
    }
}

class StudentForm extends JFrame {
    private JTextField nameField, ageField;
    private JButton addButton, updateButton, deleteButton;
    private DefaultListModel<Student> studentListModel;
    private JList<Student> studentList;
    private int nextId;

    public StudentForm() {
        setTitle("Student CRUD");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));
        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Age:"));
        ageField = new JTextField();
        inputPanel.add(ageField);
        addButton = new JButton("Add");
        inputPanel.add(addButton);
        updateButton = new JButton("Update");
        inputPanel.add(updateButton);
        deleteButton = new JButton("Delete");
        inputPanel.add(deleteButton);

        studentListModel = new DefaultListModel<>();
        studentList = new JList<>(studentListModel);
        JScrollPane scrollPane = new JScrollPane(studentList);

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String ageText = ageField.getText();
                if (name.isEmpty() || ageText.isEmpty()) {
                    JOptionPane.showMessageDialog(StudentForm.this, "Please enter name and age");
                    return;
                }

                int age;
                try {
                    age = Integer.parseInt(ageText);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(StudentForm.this, "Invalid age format");
                    return;
                }

                Student student = new Student(nextId, name, age);
                studentListModel.addElement(student);
                nextId++;
                clearFields();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = studentList.getSelectedIndex();
                if (selectedIndex == -1) {
                    JOptionPane.showMessageDialog(StudentForm.this, "Please select a student to update");
                    return;
                }

                String name = nameField.getText();
                String ageText = ageField.getText();
                if (name.isEmpty() || ageText.isEmpty()) {
                    JOptionPane.showMessageDialog(StudentForm.this, "Please enter name and age");
                    return;
                }

                int age;
                try {
                    age = Integer.parseInt(ageText);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(StudentForm.this, "Invalid age format");
                    return;
                }

                Student student = studentListModel.getElementAt(selectedIndex);
                student.name = name;
                student.age = age;
                studentListModel.setElementAt(student, selectedIndex);
                clearFields();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = studentList.getSelectedIndex();
                if (selectedIndex == -1) {
                    JOptionPane.showMessageDialog(StudentForm.this, "Please select a student to delete");
                    return;
                }

                studentListModel.removeElementAt(selectedIndex);
                clearFields();
            }
        });
    }

    private void clearFields() {
        nameField.setText("");
        ageField.setText("");
    }

    public void setStudents(ArrayList<Student> students) {
        for (Student student : students) {
            studentListModel.addElement(student);
            nextId = Math.max(nextId, student.getId() + 1);
        }
    }

    public ArrayList<Student> getStudents() {
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < studentListModel.size(); i++) {
            students.add(studentListModel.getElementAt(i));
        }
        return students;
    }

    public void saveDataToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 0; i < studentListModel.size(); i++) {
                writer.write(studentListModel.getElementAt(i).toString());
                writer.newLine();
            }
            writer.flush();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving data to file");
        }
    }
}

public class TestGUI {
    public static void main(String[] args) {
        StudentForm studentForm = new StudentForm();

        // Load existing student data from file (if any)
        ArrayList<Student> students = loadDataFromFile("students.txt");
        studentForm.setStudents(students);

        studentForm.setVisible(true);
    }

    private static ArrayList<Student> loadDataFromFile(String filename) {
        ArrayList<Student> students = new ArrayList<>();
        // Read student data from file (if any) and populate the students list
        // Each line in the file represents a student in the format: id,name,age
        // Example line: 1,John,20
        // You can use libraries like Apache Commons CSV to parse CSV files easily
        // For simplicity, let's assume the file is properly formatted and there are no errors
        // in reading or parsing the data.

        // Add dummy data for demonstration purposes
        students.add(new Student(1, "John", 20));
        students.add(new Student(2, "Jane", 22));
        students.add(new Student(3, "Mark", 21));

        return students;
    }
}
