package ui;

import model.User;
import utility.DatabaseConnector;
import java.util.ArrayList;
import java.io.File;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author otibhoedeoghon
 */
public class ViewJPanel extends javax.swing.JPanel {
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        photoUpload = new javax.swing.JLabel();
        Photo = new javax.swing.JLabel();
        PhoneNumber = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        lastnameTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        textPhoneNumber = new javax.swing.JFormattedTextField();
        Name1 = new javax.swing.JLabel();
        firstnameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        continentComboBox = new javax.swing.JComboBox<>();
        photoTextField = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        experience = new javax.swing.JLabel();
        UploadPhoto = new javax.swing.JButton();
        GenderComboBox = new javax.swing.JComboBox<>();
        College = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();

        Photo.setText("Photo:");

        PhoneNumber.setText("Phone:");

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        try {
            textPhoneNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textPhoneNumber.setToolTipText("123-456-7890");
        textPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPhoneNumberActionPerformed(evt);
            }
        });

        Name1.setText("Last Name:");

        jLabel1.setText("Continent:");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel());

        continentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Africa", "Antarctica", "Asia", "Europe", "North America", "South America", "Australia" }));

        photoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photoTextFieldActionPerformed(evt);
            }
        });

        email.setText("Email:");

        Name.setText("First Name:");

        experience.setText("Experience:");

        UploadPhoto.setText("Upload Photo");
        UploadPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadPhotoActionPerformed(evt);
            }
        });

        GenderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        College.setText("Gender:");

        Age.setText("Age:");

        jLabel2.setText("Date of Birth:");

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(studentTable);

        editButton.setText("Edit");

        deleteButton.setText("Delete");

        updateButton.setText("Update");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Name1)
                            .addComponent(Photo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editButton)
                        .addGap(34, 34, 34)
                        .addComponent(deleteButton)
                        .addGap(35, 35, 35)
                        .addComponent(updateButton)
                        .addGap(101, 101, 101))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Age)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Name)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(firstnameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastnameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(continentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PhoneNumber)
                                    .addComponent(experience)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(email)
                                        .addComponent(College)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(GenderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(emailTextField)
                                                .addComponent(textPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(photoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(UploadPhoto))
                                    .addComponent(photoUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(108, 108, 108)
                                        .addComponent(Submit)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name)
                            .addComponent(firstnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Age)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(College)
                            .addComponent(GenderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(continentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(experience)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Photo)
                            .addComponent(photoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UploadPhoto)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(editButton)
                        .addComponent(deleteButton)
                        .addComponent(updateButton))
                    .addComponent(photoUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Submit)
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents



        private ArrayList<User> students = new ArrayList<>();
    private User selectedUser;

    public ViewJPanel() {
        initComponents();
        setupTable();
        wireButtons();
        loadStudents();
        disableAllFields();
        updateButton.setEnabled(false);
    }

    // ---------- Table setup and loading ----------

    private void setupTable() {
        DefaultTableModel model = new DefaultTableModel(
            new Object[]{"ID", "First Name", "Last Name", "Age", "Gender",
                         "Email", "Phone", "Continent", "Experience"}, 0) {
            @Override
            public boolean isCellEditable(int row, int col) { return false; }
        };
        studentTable.setModel(model);
        studentTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        studentTable.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) showSelectedRow();
        });
    }

       public void loadStudents() {
        try {
            students = DatabaseConnector.getStudents();
            DefaultTableModel model = (DefaultTableModel) studentTable.getModel();
            model.setRowCount(0);
            for (User u : students) {
                model.addRow(new Object[]{
                    u.getId(), u.getFirstName(), u.getLastName(), u.getAge(),
                    u.getGender(), u.getEmail(), u.getPhone(),
                    u.getContinent(), u.getExperience()
                });
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Could not load students: " + ex.getMessage());
        }
    }

    private void showSelectedRow() {
        int row = studentTable.getSelectedRow();
        if (row < 0) { selectedUser = null; return; }
        selectedUser = students.get(row);
        displayUser(selectedUser);
        disableAllFields();
        updateButton.setEnabled(false);
    }

    // ---------- Buttons ----------

    private void wireButtons() {
        editButton.addActionListener(e -> editSelected());
        deleteButton.addActionListener(e -> deleteSelected());
        updateButton.addActionListener(e -> updateSelected());
    }

    private void editSelected() {
        if (selectedUser == null) {
            JOptionPane.showMessageDialog(this, "Please select a student to edit.");
            return;
        }
        enableEditableFields();
        updateButton.setEnabled(true);
    }

    private void deleteSelected() {
        if (selectedUser == null) {
            JOptionPane.showMessageDialog(this, "Please select a student to delete.");
            return;
        }
        int choice = JOptionPane.showConfirmDialog(this,
            "Delete " + selectedUser.getFirstName() + " " + selectedUser.getLastName() + "?",
            "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (choice != JOptionPane.YES_OPTION) return;

        try {
            DatabaseConnector.deleteStudent(selectedUser.getId());
            selectedUser = null;
            clearFields();
            loadStudents();
            JOptionPane.showMessageDialog(this, "Student deleted.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Delete failed: " + ex.getMessage());
        }
    }

    private void updateSelected() {
        if (selectedUser == null) return;

        if (firstnameTextField.getText().isBlank() || lastnameTextField.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "First and last name cannot be empty.");
            return;
        }

        selectedUser.setFirstName(firstnameTextField.getText().trim());
        selectedUser.setLastName(lastnameTextField.getText().trim());
        selectedUser.setAge((Integer) jSpinner1.getValue());
        selectedUser.setGender((String) GenderComboBox.getSelectedItem());
        selectedUser.setEmail(emailTextField.getText().trim());
        selectedUser.setPhone(textPhoneNumber.getText());
        selectedUser.setContinent((String) continentComboBox.getSelectedItem());
        selectedUser.setExperience(jTextArea1.getText());
        selectedUser.setDob(jDateChooser1.getDate());
        if (!photoTextField.getText().isBlank()) {
            selectedUser.setPhoto(new File(photoTextField.getText()));
        }

        try {
            DatabaseConnector.updateStudent(selectedUser);
            JOptionPane.showMessageDialog(this, "Student updated.");
            disableAllFields();
            updateButton.setEnabled(false);
            loadStudents();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Update failed: " + ex.getMessage());
        }
    }

    // ---------- Field helpers ----------

    private void disableAllFields() {
        firstnameTextField.setEnabled(false);
        lastnameTextField.setEnabled(false);
        jSpinner1.setEnabled(false);
        GenderComboBox.setEnabled(false);
        emailTextField.setEnabled(false);
        textPhoneNumber.setEnabled(false);
        continentComboBox.setEnabled(false);
        jTextArea1.setEnabled(false);
        photoTextField.setEnabled(false);
        UploadPhoto.setEnabled(false);
        jDateChooser1.setEnabled(false);
        Submit.setVisible(false);
    }

    private void enableEditableFields() {
        firstnameTextField.setEnabled(true);
        lastnameTextField.setEnabled(true);
        jSpinner1.setEnabled(true);
        GenderComboBox.setEnabled(true);
        emailTextField.setEnabled(true);
        textPhoneNumber.setEnabled(true);
        continentComboBox.setEnabled(true);
        jTextArea1.setEnabled(true);
        jDateChooser1.setEnabled(true);
        UploadPhoto.setEnabled(true);
    }

    private void clearFields() {
        firstnameTextField.setText("");
        lastnameTextField.setText("");
        jSpinner1.setValue(0);
        emailTextField.setText("");
        textPhoneNumber.setText("");
        jTextArea1.setText("");
        jDateChooser1.setDate(null);
        photoTextField.setText("");
        photoUpload.setIcon(null);
    }

    public void displayUser(User user) {
        firstnameTextField.setText(user.getFirstName());
        lastnameTextField.setText(user.getLastName());
        jSpinner1.setValue(user.getAge());
        GenderComboBox.setSelectedItem(user.getGender());
        emailTextField.setText(user.getEmail());
        textPhoneNumber.setText(user.getPhone());
        continentComboBox.setSelectedItem(user.getContinent());
        jTextArea1.setText(user.getExperience());
        jDateChooser1.setDate(user.getDob());

        if (user.getPhoto() != null) {
            photoTextField.setText(user.getPhoto().getAbsolutePath());
            showPhoto(user.getPhoto());
        } else {
            photoTextField.setText("");
            photoUpload.setIcon(null);
        }
    }

    private void showPhoto(File file) {
        int w = photoUpload.getWidth() > 0 ? photoUpload.getWidth() : 234;
        int h = photoUpload.getHeight() > 0 ? photoUpload.getHeight() : 60;
        javax.swing.ImageIcon icon = new javax.swing.ImageIcon(file.getAbsolutePath());
        java.awt.Image scaled = icon.getImage().getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH);
        photoUpload.setIcon(new javax.swing.ImageIcon(scaled));
        photoUpload.setText("");
    }
    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed

    }//GEN-LAST:event_SubmitActionPerformed

    private void textPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPhoneNumberActionPerformed

     
    }//GEN-LAST:event_textPhoneNumberActionPerformed

    private void photoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photoTextFieldActionPerformed

    }//GEN-LAST:event_photoTextFieldActionPerformed

    private void UploadPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadPhotoActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
            "Images", "jpg", "jpeg", "png", "gif"));
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            photoTextField.setText(file.getAbsolutePath());
            showPhoto(file);
        }
     
    }//GEN-LAST:event_UploadPhotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Age;
    private javax.swing.JLabel College;
    private javax.swing.JComboBox<String> GenderComboBox;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Name1;
    private javax.swing.JLabel PhoneNumber;
    private javax.swing.JLabel Photo;
    private javax.swing.JButton Submit;
    private javax.swing.JButton UploadPhoto;
    private javax.swing.JComboBox<String> continentComboBox;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel experience;
    private javax.swing.JTextField firstnameTextField;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField lastnameTextField;
    private javax.swing.JTextField photoTextField;
    private javax.swing.JLabel photoUpload;
    private javax.swing.JTable studentTable;
    private javax.swing.JFormattedTextField textPhoneNumber;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
