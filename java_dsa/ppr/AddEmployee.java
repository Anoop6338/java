package hotel.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;

public class AddEmployee extends JFrame implements ActionListener {
    
    JTextField tfage,tfemail,tfsalary,tfname,tfphone,tfaadhar;
    JRadioButton rbmale,rbfemale;
    JButton submit;
    JComboBox cbjob;
    
    AddEmployee(){
        setLayout(null);
        
        JLabel lbname = new JLabel("NAME");
        lbname.setBounds(60, 30, 120, 30);
        lbname.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lbname);
        
        tfname = new JTextField();
        tfname.setBounds(200, 30, 150, 30);
        add(tfname);
        
        JLabel lbage = new JLabel("AGE");
        lbage.setBounds(60, 80, 120, 30);
        lbage.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lbage);
        
        tfage = new JTextField();
        tfage.setBounds(200, 80, 150, 30);
        add(tfage); 
        
        JLabel lbgender = new JLabel("GENDER");
        lbgender.setBounds(60, 130, 120, 30);
        lbgender.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lbgender);
        
        rbmale = new JRadioButton("Male");
        rbmale.setBounds(200, 130, 70, 30);
        rbmale.setFont(new Font("Thoma", Font.PLAIN, 14));
        rbmale.setBackground(Color.WHITE);
        add(rbmale);
        
        rbfemale = new JRadioButton("Female");
        rbfemale.setBounds(280, 130, 90, 30);
        rbfemale.setFont(new Font("Thoma", Font.PLAIN, 14));
        rbfemale.setBackground(Color.WHITE);
        add(rbfemale);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbmale);
        bg.add(rbfemale);
        
        JLabel lbjob = new JLabel("JOB");
        lbjob.setBounds(60, 180, 120, 30);
        lbjob.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lbjob);
        
        String str[] = { "Front Desk Clerks", "Porters", "House Keeping", "Kitchen Staff", "Room Service","Chefs", "Waiter/Waitress", "Manager", "Acountant" };
        cbjob = new JComboBox(str);
        cbjob.setBounds(200, 180, 150, 30);
        cbjob.setBackground(Color.WHITE);
        add(cbjob);
        
        JLabel lbsalary = new JLabel("SALARY");
        lbsalary.setBounds(60, 230, 120, 30);
        lbsalary.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lbsalary);
        
        tfsalary = new JTextField();
        tfsalary.setBounds(200, 230, 150, 30);
        add(tfsalary);
        
        JLabel lbphone = new JLabel("PHONE");
        lbphone.setBounds(60, 280, 120, 30);
        lbphone.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lbphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(200, 280, 150, 30);
        add(tfphone);
        
        JLabel lbemail = new JLabel("EMAIL");
        lbemail.setBounds(60, 330, 120, 30);
        lbemail.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lbemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(200, 330, 150, 30);
        add(tfemail);
        
        JLabel lbaadhar = new JLabel("AADHAR");
        lbaadhar.setBounds(60, 380, 120, 30);
        lbaadhar.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lbaadhar);
        
        tfaadhar = new JTextField();
        tfaadhar.setBounds(200, 380, 150, 30);
        add(tfaadhar);
        
        submit = new JButton("SUBMIT");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(200, 430, 150, 30);
        submit.addActionListener(this);
        add(submit);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons//tenth.jpg"));
        Image i2 = i1.getImage().getScaledInstance(450, 450, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(380, 60, 450, 370);
        add(image);
        
        getContentPane().setBackground(Color.WHITE);
        setBounds(350, 200, 850, 540);
        setVisible(true);
        
    }
    
    public void ActionPerformed(ActionEvent ae){
        
        String name = tfname.getText();
        String age = tfage.getText();
        String salary = tfsalary.getText();
        String email = tfemail.getText();
        String phone = tfphone.getText();
        String aadhar = tfaadhar.getText();
        
        String gender = null;
        
        if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Nmae shoud not be empty");
            return; 
        }
        
        if(rbmale.isSelected()) {
            gender = "Male";
        } else if(rbfemale.isSelected()) {
            gender = "Female";
        }
        String job = (String) cbjob.getSelectedItem();
        
        try{
            
            Conn conn = new Conn();
            
            String query = "insert into employee values('"+name+"', '"+age+"', '"+gender+"', '"+job+"', '"+salary+"', '"+phone+"', '"+email+"', '"+aadhar+"')";
            
            conn.s.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, "Employee added successfully");
            setVisible(false);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[]args){
        new AddEmployee();
        
    }
    }