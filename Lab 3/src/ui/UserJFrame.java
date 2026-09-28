package ui;


import java.awt.Image;
import model.User;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;



public class UserJFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(UserJFrame.class.getName());
private File selectedPhoto; // to store uploaded photo
    private File photo;

   
    public UserJFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Age = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        firstnametextfield = new javax.swing.JTextField();
        ageSpinner = new javax.swing.JSpinner();
        Name = new javax.swing.JLabel();
        College = new javax.swing.JLabel();
        PhoneNumber = new javax.swing.JLabel();
        phoneFormattedTextField = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        continentcombobox = new javax.swing.JComboBox<>();
        hobbies = new javax.swing.JLabel();
        Photo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hobbiesTextArea = new javax.swing.JTextArea();
        photoTextField = new javax.swing.JTextField();
        UploadPhoto = new javax.swing.JButton();
        photoUpload = new javax.swing.JLabel();
        lastnametextfield = new javax.swing.JTextField();
        lastname = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        emailTextField = new javax.swing.JFormattedTextField();
        gendercombobox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Age.setText("Age:");

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        ageSpinner.setModel(new javax.swing.SpinnerNumberModel());

        Name.setText("First Name:");

        College.setText("Gender");

        PhoneNumber.setText("Phone:");

        try {
            phoneFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        phoneFormattedTextField.setToolTipText("123-456-7890");
        phoneFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneFormattedTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Continent:");

        continentcombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Africa", "Antarctica", "Asia", "Europe", "North America", "South America", "Australia" }));

        hobbies.setText("Hobbies:");

        Photo.setText("Photo:");

        hobbiesTextArea.setColumns(20);
        hobbiesTextArea.setRows(5);
        jScrollPane1.setViewportView(hobbiesTextArea);

        photoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photoTextFieldActionPerformed(evt);
            }
        });

        UploadPhoto.setText("Upload Photo");
        UploadPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadPhotoActionPerformed(evt);
            }
        });

        lastname.setText("Last Name:");

        email.setText("Email");

        emailTextField.setToolTipText("");

        gendercombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(Submit)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lastname)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(photoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(133, 133, 133)
                                                .addComponent(photoUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(UploadPhoto))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lastnametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Name)
                                            .addComponent(Age)
                                            .addComponent(email)
                                            .addComponent(jLabel1)
                                            .addComponent(PhoneNumber)
                                            .addComponent(College))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(ageSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(firstnametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(gendercombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(phoneFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(continentcombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(hobbies)
                                    .addComponent(Photo))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name)
                    .addComponent(firstnametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastname))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Age)
                    .addComponent(ageSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gendercombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(College))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneNumber))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(continentcombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hobbies))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(photoUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(photoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UploadPhoto))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Submit)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Photo)
                        .addGap(115, 115, 115))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
                                     

    // Read all input fields
    String firstName = firstnametextfield.getText().trim();
    String lastName = lastnametextfield.getText().trim();
    String gender = gendercombobox.getSelectedItem().toString();
    int age = (Integer) ageSpinner.getValue();
    String phone = phoneFormattedTextField.getText().trim();
    String email = emailTextField.getText().trim();
    String continent = continentcombobox.getSelectedItem().toString();
    String hobbies = hobbiesTextArea.getText().trim();

    // === Validation ===
   if (firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty() || email.isEmpty()) {
        JOptionPane.showMessageDialog(this, "All fields must be filled!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
     if (!phone.matches("\\d{3}-\\d{3}-\\d{4}")) { // phone must match the masked format 123-456-7890
        JOptionPane.showMessageDialog(this, "Invalid phone number! Must be in format 123-456-7890.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
     
    if (!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
        JOptionPane.showMessageDialog(this, "Invalid email format!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

if (selectedPhoto == null) {
    JOptionPane.showMessageDialog(this, "Please upload a photo!", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}
    // === Create User object with uploaded photo ===
   User user = new User(firstName, lastName, gender, age, phone, email, continent, hobbies, selectedPhoto);

    // === Show success popup with user.toString() ===
    if (selectedPhoto != null) {
        ImageIcon icon = new ImageIcon(new ImageIcon(selectedPhoto.getAbsolutePath())
                .getImage().getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH));
        JOptionPane.showMessageDialog(this, user.toString(), "Profile", JOptionPane.INFORMATION_MESSAGE, icon);
    } else {
        JOptionPane.showMessageDialog(this, user.toString(), "Profile", JOptionPane.INFORMATION_MESSAGE);
    }

    }//GEN-LAST:event_SubmitActionPerformed

    private void phoneFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneFormattedTextFieldActionPerformed



    }//GEN-LAST:event_phoneFormattedTextFieldActionPerformed

    private void photoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photoTextFieldActionPerformed
   
    }//GEN-LAST:event_photoTextFieldActionPerformed

    private void UploadPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadPhotoActionPerformed

    JFileChooser chooser = new JFileChooser();
    int result = chooser.showOpenDialog(this);
    if (result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = chooser.getSelectedFile();
        selectedPhoto = selectedFile;
        photoTextField.setText(selectedFile.getAbsolutePath());

        // Load and scale image to fit label
        ImageIcon icon = new ImageIcon(selectedFile.getAbsolutePath());
        Image scaledImage = icon.getImage().getScaledInstance(photoUpload.getWidth(), photoUpload.getHeight(), Image.SCALE_SMOOTH);
        icon = new ImageIcon(scaledImage);

        photoUpload.setIcon(icon);
        photoUpload.setText(""); // remove placeholder text
    }




    }//GEN-LAST:event_UploadPhotoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new UserJFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Age;
    private javax.swing.JLabel College;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel PhoneNumber;
    private javax.swing.JLabel Photo;
    private javax.swing.JButton Submit;
    private javax.swing.JButton UploadPhoto;
    private javax.swing.JSpinner ageSpinner;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> continentcombobox;
    private javax.swing.JLabel email;
    private javax.swing.JFormattedTextField emailTextField;
    private javax.swing.JTextField firstnametextfield;
    private javax.swing.JComboBox<String> gendercombobox;
    private javax.swing.JLabel hobbies;
    private javax.swing.JTextArea hobbiesTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastname;
    private javax.swing.JTextField lastnametextfield;
    private javax.swing.JFormattedTextField phoneFormattedTextField;
    private javax.swing.JTextField photoTextField;
    private javax.swing.JLabel photoUpload;
    // End of variables declaration//GEN-END:variables
}