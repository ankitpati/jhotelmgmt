/* UserPanel.java */
/* User Component for the Hotel Management System
 *
 * Copyright 2016 Ankit Pati <ankitpati@gmail.com>
 *
 * This  software is  free software;  you can redistribute it and/or  modify  it
 * under the terms of the  GNU Lesser General Public License as published by the
 * Free Software Foundation;  either  version 3  of the  License,  or  (at  your
 * option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but  WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more
 * details.
 *
 * You  should  have received a copy of the GNU Lesser  General  Public  License
 * along with this program; if not, see <http://www.gnu.org/licenses/>.
 */

package hotelmgmt;

import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class UserPanel extends javax.swing.JPanel {
    final static long serialVersionUID = 0l;
    String username;

    public UserPanel(String username) {
        initComponents();

        this.username = username;
        activityLabel.setText(activityLabel.getText() + username);

        populateHotelNameComboBox();
    }

    private void populateHotelNameComboBox() {
        ResultSet rs;

        try (
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotelmgmt", "hotelmgmt", "hotelmgmt");
            PreparedStatement ps = con.prepareStatement("select hotel from hotels")
        ) {
            rs = ps.executeQuery();
            while (rs.next()) hotelNameComboBox.addItem(rs.getString(1));
        }
        catch(SQLException e) {
            errorLabel.setText("Database Connection Failed");
            errorLabel.setForeground(Color.ORANGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roomTypeButtonGroup = new javax.swing.ButtonGroup();
        headerLabel = new javax.swing.JLabel();
        activityLabel = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        cashierTabbedPane = new javax.swing.JTabbedPane();
        bookPane = new javax.swing.JPanel();
        guestNameTextField = new javax.swing.JTextField();
        roomRadioButton = new javax.swing.JRadioButton();
        suiteRadioButton = new javax.swing.JRadioButton();
        deluxeRadioButton = new javax.swing.JRadioButton();
        cancelButton = new javax.swing.JButton();
        unbookButton = new javax.swing.JButton();
        bookButton = new javax.swing.JButton();
        hotelNameComboBox = new javax.swing.JComboBox();
        servePane = new javax.swing.JPanel();
        billPane = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();

        headerLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("Hotel Management System");

        activityLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 30)); // NOI18N
        activityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        activityLabel.setText("User: ");

        errorLabel.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        guestNameTextField.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        guestNameTextField.setForeground(java.awt.Color.gray);
        guestNameTextField.setText("Guest Name");
        guestNameTextField.setToolTipText("Guest Name");
        guestNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                guestNameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                guestNameTextFieldFocusLost(evt);
            }
        });

        roomTypeButtonGroup.add(roomRadioButton);
        roomRadioButton.setSelected(true);
        roomRadioButton.setText("Room");

        roomTypeButtonGroup.add(suiteRadioButton);
        suiteRadioButton.setText("Suite");

        roomTypeButtonGroup.add(deluxeRadioButton);
        deluxeRadioButton.setText("Deluxe");

        cancelButton.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        unbookButton.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        unbookButton.setText("Unbook");
        unbookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unbookButtonActionPerformed(evt);
            }
        });

        bookButton.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        bookButton.setText("Book");
        bookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });

        hotelNameComboBox.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        hotelNameComboBox.setForeground(java.awt.Color.gray);
        hotelNameComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hotel Name" }));
        hotelNameComboBox.setToolTipText("Hotel Name");
        hotelNameComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                hotelNameComboBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout bookPaneLayout = new javax.swing.GroupLayout(bookPane);
        bookPane.setLayout(bookPaneLayout);
        bookPaneLayout.setHorizontalGroup(
            bookPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bookPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookPaneLayout.createSequentialGroup()
                        .addComponent(bookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unbookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(guestNameTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hotelNameComboBox, 0, 445, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(bookPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roomRadioButton)
                    .addComponent(suiteRadioButton)
                    .addComponent(deluxeRadioButton))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        bookPaneLayout.setVerticalGroup(
            bookPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bookPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookPaneLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(hotelNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(guestNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bookPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unbookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bookPaneLayout.createSequentialGroup()
                        .addComponent(roomRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(suiteRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(deluxeRadioButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cashierTabbedPane.addTab("Book", bookPane);

        javax.swing.GroupLayout servePaneLayout = new javax.swing.GroupLayout(servePane);
        servePane.setLayout(servePaneLayout);
        servePaneLayout.setHorizontalGroup(
            servePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );
        servePaneLayout.setVerticalGroup(
            servePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 159, Short.MAX_VALUE)
        );

        cashierTabbedPane.addTab("Serve", servePane);

        javax.swing.GroupLayout billPaneLayout = new javax.swing.GroupLayout(billPane);
        billPane.setLayout(billPaneLayout);
        billPaneLayout.setHorizontalGroup(
            billPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );
        billPaneLayout.setVerticalGroup(
            billPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 159, Short.MAX_VALUE)
        );

        cashierTabbedPane.addTab("Bill", billPane);

        logoutButton.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(activityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cashierTabbedPane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(activityLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cashierTabbedPane))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guestNameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_guestNameTextFieldFocusGained
        if (guestNameTextField.getForeground() == Color.GRAY) {
            guestNameTextField.setText("");
            guestNameTextField.setForeground(Color.BLACK);
            guestNameTextField.setCaretPosition(0);
        }
    }//GEN-LAST:event_guestNameTextFieldFocusGained

    private void guestNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_guestNameTextFieldFocusLost
        if ("".equals(guestNameTextField.getText()) || guestNameTextField.getForeground() == Color.GRAY) {
            guestNameTextField.setForeground(Color.GRAY);
            guestNameTextField.setText("Guest Name");
        }
    }//GEN-LAST:event_guestNameTextFieldFocusLost

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        HMSFrame.self.renderLogin(username);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        errorLabel.setText("");
        errorLabel.setForeground(Color.RED);

        if (cashierTabbedPane.getSelectedComponent() == bookPane) {
            hotelNameComboBox.setSelectedIndex(0);
            hotelNameComboBox.setForeground(Color.GRAY);
            guestNameTextField.setText("Guest Name");
            guestNameTextField.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void unbookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unbookButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unbookButtonActionPerformed

    private void bookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtonActionPerformed
        String hotel, guest, roomtype;
        ResultSet maxRoomsRS, countGuestsRS;

        hotel = hotelNameComboBox.getSelectedItem().toString();
        guest = guestNameTextField.getText();

        roomtype = "Room";
        if (suiteRadioButton.isSelected()) roomtype = "Suite";
        else if (deluxeRadioButton.isSelected()) roomtype = "Deluxe";

        if (hotelNameComboBox.getSelectedIndex() == 0 || hotelNameComboBox.getSelectedIndex() == -1
                || guestNameTextField.getForeground() == Color.GRAY || "".equals(guest)) {
            errorLabel.setText("Provide Hotel and Guest Names");
            errorLabel.setForeground(Color.RED);
            return;
        }

        try (
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotelmgmt", "hotelmgmt", "hotelmgmt");
            PreparedStatement maxRoomsPS = con.prepareStatement("select rooms from hotels where hotel=?");
            PreparedStatement countGuestsPS = con.prepareStatement("select count(*) from guests where hotel=?");
            PreparedStatement insertPS = con.prepareStatement("insert into guests (name, hotel, roomtype) values(?, ?, ?) on duplicate key update roomtype=?")
        ) {
            maxRoomsPS.setString(1, hotel);
            maxRoomsRS = maxRoomsPS.executeQuery();

            countGuestsPS.setString(1, hotel);
            countGuestsRS = countGuestsPS.executeQuery();

            if (maxRoomsRS.next()) {
                countGuestsRS.next();
                if (countGuestsRS.getInt(1) < maxRoomsRS.getInt(1)) {
                    insertPS.setString(1, guest);
                    insertPS.setString(2, hotel);
                    insertPS.setString(3, roomtype);
                    insertPS.setString(4, roomtype);
                    insertPS.execute();

                    errorLabel.setText("Room Booked");
                    errorLabel.setForeground(Color.BLUE);
                }
                else {
                    errorLabel.setText("Insufficient Rooms");
                    errorLabel.setForeground(Color.RED);
                }
            }
            else {
                errorLabel.setText("Hotel Not Found");
                errorLabel.setForeground(Color.RED);
            }
        }
        catch(SQLException e) {
            errorLabel.setText("Database Connection Failed");
            errorLabel.setForeground(Color.ORANGE);
        }
        finally {
            hotelNameComboBox.setSelectedIndex(0);
            hotelNameComboBox.setForeground(Color.GRAY);
            guestNameTextField.setText("Guest Name");
            guestNameTextField.setForeground(Color.GRAY);
            roomRadioButton.setSelected(true);
        }
    }//GEN-LAST:event_bookButtonActionPerformed

    private void hotelNameComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_hotelNameComboBoxItemStateChanged
        SwingUtilities.invokeLater(() -> {
            if (hotelNameComboBox.getSelectedIndex() == 0 || hotelNameComboBox.getSelectedIndex() == -1) {
                hotelNameComboBox.setSelectedIndex(0);
                hotelNameComboBox.setForeground(Color.GRAY);
            }
            else hotelNameComboBox.setForeground(Color.BLACK);
        });
    }//GEN-LAST:event_hotelNameComboBoxItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activityLabel;
    private javax.swing.JPanel billPane;
    private javax.swing.JButton bookButton;
    private javax.swing.JPanel bookPane;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTabbedPane cashierTabbedPane;
    private javax.swing.JRadioButton deluxeRadioButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JTextField guestNameTextField;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JComboBox hotelNameComboBox;
    private javax.swing.JButton logoutButton;
    private javax.swing.JRadioButton roomRadioButton;
    private javax.swing.ButtonGroup roomTypeButtonGroup;
    private javax.swing.JPanel servePane;
    private javax.swing.JRadioButton suiteRadioButton;
    private javax.swing.JButton unbookButton;
    // End of variables declaration//GEN-END:variables
}
/* end of UserPanel.java */
