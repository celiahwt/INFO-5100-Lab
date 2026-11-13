package utility;

import java.sql.*;
import java.util.ArrayList;
import java.io.File;
import model.User;

public class DatabaseConnector {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/userdb";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "my-secret-pw"; // TODO: change to your MySQL password

    // CREATE
    public static void addStudent(User s) throws SQLException {
        String query = "INSERT INTO student(first_name, last_name, age, email, phone, experience, continent, date_of_birth, gender, photo_path) VALUES (?,?,?,?,?,?,?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, s.getFirstName());
            stmt.setString(2, s.getLastName());
            stmt.setInt(3, s.getAge());
            stmt.setString(4, s.getEmail());
            stmt.setString(5, s.getPhone());
            stmt.setString(6, s.getExperience());
            stmt.setString(7, s.getContinent());
            stmt.setDate(8, toSqlDate(s.getDob()));
            stmt.setString(9, s.getGender());
            stmt.setString(10, s.getPhoto() != null ? s.getPhoto().getAbsolutePath() : null);

            stmt.executeUpdate();
        }
    }

    // READ
    public static ArrayList<User> getStudents() throws SQLException {
        ArrayList<User> list = new ArrayList<>();
        String query = "SELECT * FROM student";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                User s = new User();
                s.setId(rs.getInt("student_id"));
                s.setFirstName(rs.getString("first_name"));
                s.setLastName(rs.getString("last_name"));
                s.setAge(rs.getInt("age"));
                s.setGender(rs.getString("gender"));
                s.setPhone(rs.getString("phone"));
                s.setContinent(rs.getString("continent"));
                s.setExperience(rs.getString("experience"));
                s.setEmail(rs.getString("email"));
                s.setDob(rs.getDate("date_of_birth")); // java.sql.Date is a java.util.Date

                String photoPath = rs.getString("photo_path");
                if (photoPath != null) s.setPhoto(new File(photoPath));

                list.add(s);
            }
        }

        return list;
    }

    // UPDATE
    public static void updateStudent(User s) throws SQLException {
        String query = "UPDATE student SET first_name=?, last_name=?, age=?, email=?, phone=?, experience=?, continent=?, date_of_birth=?, gender=?, photo_path=? WHERE student_id=?";
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, s.getFirstName());
            stmt.setString(2, s.getLastName());
            stmt.setInt(3, s.getAge());
            stmt.setString(4, s.getEmail());
            stmt.setString(5, s.getPhone());
            stmt.setString(6, s.getExperience());
            stmt.setString(7, s.getContinent());
            stmt.setDate(8, toSqlDate(s.getDob()));
            stmt.setString(9, s.getGender());
            stmt.setString(10, s.getPhoto() != null ? s.getPhoto().getAbsolutePath() : null);
            stmt.setInt(11, s.getId());

            stmt.executeUpdate();
        }
    }

    // DELETE
    public static void deleteStudent(int studentId) throws SQLException {
        String query = "DELETE FROM student WHERE student_id=?";
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, studentId);
            stmt.executeUpdate();
        }
    }

    // Converts the model's java.util.Date into the java.sql.Date JDBC expects (null-safe)
    private static java.sql.Date toSqlDate(java.util.Date d) {
        return (d != null) ? new java.sql.Date(d.getTime()) : null;
    }
}