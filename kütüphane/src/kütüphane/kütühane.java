package kütüphane;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class kütühane {

	public static void main(String[] args) {
		
		 Frame k1 = new Frame();
        k1.setTitle("Kütüphane");
	        k1.setSize(600,800);
	        	     		     		     	     	    
	        Label label = new Label ("Adres");
	        label.setBounds(200, 50, 200, 55);
	        k1.add(label);
	
	        Label  label2 = new  Label (" Cadde: ");
         label2.setBounds(30, 100, 100, 55);
         k1.add(label2);
	   	     	   
         TextField txtAd1 = new TextField(); 
         txtAd1.setText(" ");
         txtAd1.setBounds(200, 110, 200, 30); 
         k1.add(txtAd1);
	
         Label  label3 = new  Label ("Sokak : ");
	        label3.setBounds(30, 150, 100, 55);
	        k1.add(label3);
	   	     	   
	        TextField txtAd2 = new  TextField(); 
	        txtAd2.setText(" ");
	        txtAd2.setBounds(200, 160, 200, 30); 
	        k1.add(txtAd2);
	
	        Label  label4 = new Label (" Mahalle : ");
	        label4.setBounds(30, 200, 100, 55);
	        k1.add(label4);
	   	     	   
	        TextField txtAd3 = new  TextField(); 
	        txtAd3.setText(" ");
	        txtAd3.setBounds(200, 210, 200, 30); 
	        k1.add(txtAd3);
	
	        Label  label5 = new Label (" Bina No : ");
	        label5.setBounds(30, 250, 100, 55);
	        k1.add(label5);
	   	     	   
	        TextField txtAd4 = new  TextField(); 
	        txtAd4.setText(" ");
	        txtAd4.setBounds(200, 250, 200, 30); 
	        k1.add(txtAd4);
	        
	        Label  label6 = new Label (" Kat No : ");
	        label6.setBounds(30, 290, 100, 55);
	        k1.add(label6);
	   	     	   
	        TextField txtAd5 = new  TextField(); 
	        txtAd5.setText(" ");
	        txtAd5.setBounds(200, 310, 200, 30); 
	        k1.add(txtAd5);
	        
	        Label  label7 = new Label (" Ýlçe: ");
	        label7.setBounds(30, 350, 100, 55);
	        k1.add(label7);
	   	     	   
	        TextField txtAd6 = new  TextField(); 
	        txtAd6.setText(" ");
	        txtAd6.setBounds(200, 370, 200, 30); 
	        k1.add(txtAd6);
	        
	        Label  label8 = new Label (" Ýl : ");
	        label8.setBounds(30, 400, 100, 55);
	        k1.add(label8);
	   	     	   
	        TextField txtAd7 = new  TextField(); 
	        txtAd7.setText(" ");
	        txtAd7.setBounds(200, 410, 200, 30); 
	        k1.add(txtAd7);
	        
	        Label  label9 = new Label (" Posta Kodu : ");
	        label9.setBounds(30, 440, 100, 55);
	        k1.add(label9);
	   	     	   
	        TextField txtAd8 = new  TextField(); 
	        txtAd8.setText(" ");
	        txtAd8.setBounds(200, 450, 200, 30); 
	        k1.add(txtAd8); 
	        
	     	    
            Label label15 = new Label ("Üye");
            label15.setBounds(650, 50, 200, 55);
             k1.add(label15);
	        
	        Label  label10 = new  Label (" Ad: ");
	         label10.setBounds(600, 100, 100, 55);
	         k1.add(label10);
		   	     	   
	         TextField txtAd9 = new TextField(); 
	         txtAd9.setText(" ");
	         txtAd9.setBounds(700, 110, 200, 30); 
	         k1.add(txtAd9);
	         
	         Label  label11 = new  Label ("Soyad : ");
		        label11.setBounds(600, 150, 100, 55);
		        k1.add(label11);
		   	     	   
		        TextField txtAd10 = new  TextField(); 
		        txtAd10.setText(" ");
		        txtAd10.setBounds(700, 160, 200, 30); 
		        k1.add(txtAd10);
		
	        
	        Label  label12 = new Label (" Telefon: ");
	        label12.setBounds(600, 190, 100, 55);
	        k1.add(label12);
	   	     	   
	        TextField txtAd11 = new  TextField(); 
	        txtAd11.setText(" ");
	        txtAd11.setBounds(700, 210, 200, 30); 
	        k1.add(txtAd11);
	        
	        Label  label13 = new Label (" E Posta : ");
	        label13.setBounds(600, 250, 100, 55);
	        k1.add(label13);
	   	     	   
	        TextField txtAd12 = new  TextField(); 
	        txtAd12.setText(" ");
	        txtAd12.setBounds(700, 270, 200, 30); 
	        k1.add(txtAd12);
	        
	        
	        Label  label14 = new Label ("  Adres : ");
	        label14.setBounds(600, 300, 100, 55);
	        k1.add(label14);
	   	     	   
	        TextField txtAd13 = new  TextField(); 
	        txtAd13.setText(" ");
	        txtAd13.setBounds(700, 320, 190, 30); 
	        k1.add(txtAd13);
	       
	        Label label16 = new Label ("Emanet");
            label16.setBounds(1000, 50, 200, 55);
             k1.add(label16);
	        
	        Label  label17 = new  Label (" Emanet Tarihi: ");
	         label17.setBounds(1000, 100, 100, 55);
	         k1.add(label17);
		   	     	   
	         TextField txtAd18 = new TextField(); 
	         txtAd18.setText(" ");
	         txtAd18.setBounds(1100, 110, 200, 30); 
	         k1.add(txtAd18);
	         
	         Label  label19 = new  Label ("Teslim Tarihi : ");
		        label19.setBounds(1000, 150, 100, 55);
		        k1.add(label19);
		   	     	   
		        TextField txtAd20 = new  TextField(); 
		        txtAd20.setText(" ");
		        txtAd20.setBounds(1100, 160, 200, 30); 
		        k1.add(txtAd20);
		
	        
	        Label  label21 = new Label (" Kitapid: ");
	        label21.setBounds(1000, 190, 100, 55);
	        k1.add(label21);
	   	     	   
	        TextField txtAd22 = new  TextField(); 
	        txtAd22.setText(" ");
	        txtAd22.setBounds(1100, 210, 200, 30); 
	        k1.add(txtAd22);
	        
	        Label  label23 = new Label (" Üyeid : ");
	        label23.setBounds(1000, 250, 100, 55);
	        k1.add(label23);
	   	     	   
	        TextField txtAd24 = new  TextField(); 
	        txtAd24.setText(" ");
	        txtAd24.setBounds(1100, 270, 200, 30); 
	        k1.add(txtAd24);
	        
	        
	        Label  label25 = new Label ("  Adresid : ");
	        label25.setBounds(1000, 300, 100, 55);
	        k1.add(label25);
	   	     	   
	        TextField txtAd26 = new  TextField(); 
	        txtAd26.setText(" ");
	        txtAd26.setBounds(1100, 320, 190, 30); 
	        k1.add(txtAd26);

	        Label  label26 = new  Label ("Kitap Adý : ");
	        label26.setBounds(30, 550, 100, 55);
	        k1.add(label26);
	   	     	   
	        TextField txtAd27 = new  TextField(); 
	        txtAd27.setText(" ");
	        txtAd27.setBounds(200, 550, 190, 30); 
	        k1.add(txtAd27);
	
        
        Label  label27 = new Label (" Yayýn Tarihi: ");
        label27.setBounds(30, 600, 100, 55);
        k1.add(label27);
   	     	   
        TextField txtAd28 = new  TextField(); 
        txtAd28.setText(" ");
        txtAd28.setBounds(200, 600, 190, 30); 
        k1.add(txtAd28);
        
        Label  label28 = new Label ("Sayfa Sayýsý : ");
        label28.setBounds(30, 650, 100, 55);
        k1.add(label28);
   	     	   
        TextField txtAd29 = new  TextField(); 
        txtAd29.setText(" ");
        txtAd29.setBounds(200, 650, 190, 30); 
        k1.add(txtAd29);
        
        
        Label  label29 = new Label ("  YayýnEviid : ");
        label29.setBounds(30, 700, 100, 55);
        k1.add(label29);
   	     	   
        TextField txtAd30 = new  TextField(); 
        txtAd30.setText(" ");
        txtAd30.setBounds(200, 700, 190, 30); 
        k1.add(txtAd30);
       	        
	        Button button1 = new Button(" Ekle");
	        button1.setBounds(1000,500,100,30);
	        k1.add(button1);
	        
	        Button button2 = new Button("Sil");
	        button2.setBounds(1000,550,100,30);
	        k1.add(button2);

	        Button button3 = new Button(" Güncelle ");
	        button3.setBounds(1000,600,100,30);
	        k1.add(button3);
	
	        Button button4 = new Button("Kayýt Listele");
	        button4.setBounds(950,650,350,30);
	        k1.add(button4);
	            
	        
	        DefaultTableModel  dtm = new DefaultTableModel(); 
			JTable table = new JTable();
			table.setBounds(100, 1000, 700, 100);
			 k1.add(table);
			 k1.setVisible(true); 
			table.setModel(dtm);
			dtm.setColumnIdentifiers(new String [] {"Adresid","Cadde","Sokak","Mahalle","Bina No","Kat No","Ýlçe","Ýl","Posta Kodu"});
			 
	       button1.addActionListener((ActionListener) new ActionListener() {
	   		   public void  actionPerformed(ActionEvent e) {
	   			
	   			if(txtAd1.getText().equals("") || txtAd2.getText().equals("") || txtAd3.getText().equals("") ||
	   				txtAd1.getText().equals("")) {
	   			  JOptionPane.showMessageDialog(null," Geçersiz"); 	   			  
	   			}
	   			else {
	   			  dtm.addRow(new String [] {txtAd1.getText(),txtAd2.getText(),txtAd3.getText(),txtAd4.getText()}); 	   			
	   			  txtAd1.setText("");
	   			  txtAd2.setText("");
	   			  txtAd3.setText("");
	   			  txtAd4.setText("");	   			  
	   			}	  
	   		   }
        });
	       }}		   		

