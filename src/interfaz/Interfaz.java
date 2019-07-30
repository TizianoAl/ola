package interfaz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import main.ClienteChat;

public class Interfaz {
    public static void main(String[] args) {
       
                    Color verde = new Color(20, 143, 119);
                    Color gris = new Color(208, 211, 212);
                    Color azul = new Color(212, 230, 241);
        
                    
                    JDialog dialogo1 = new JDialog();
                    dialogo1.setLayout(null);
                    dialogo1.setSize(500,400);                    
                    dialogo1.getContentPane().setBackground(verde);
                    dialogo1.setLocation(550, 200);
                    
                    
                    
                    JLabel label1 = new JLabel();
                    label1.setBounds(200, -20, 100, 90);
                    label1.setText("");
                    
                    JLabel label2 = new JLabel();
                    label2.setBounds(10, 50, 100, 90);
                    label2.setText("Nombre de Usuario:");
                    
                    JTextField field1 = new JTextField();
                    field1.setBounds(110, 77, 300, 30);
                    field1.setBackground(gris);
                    field1.setText("");
                    
                    JLabel label3 = new JLabel();
                    label3.setBounds(10, 150, 100, 90);
                    label3.setText("Contraseña:");
                    
                    JPasswordField pfield = new JPasswordField();
                    pfield.setBounds(110, 177, 300, 30);
                    pfield.setBackground(gris);
                    pfield.setEchoChar('*');
                    pfield.setText("");
                    
                    JCheckBox checkbox1 = new JCheckBox();
                    checkbox1.setBounds(10, 250, 400, 30);
                    checkbox1.setText("Recordar más tarde");
                    checkbox1.setBackground(verde);
                    checkbox1.setSelected(true);
                   
                    
                    JButton buttond2= new JButton();
                    buttond2.setText("Ingresar");
                    buttond2.setBounds(200,325,95,35);
                    buttond2.setBackground(azul);
                    buttond2.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent e){
                            if(checkbox1.isSelected()){
                                
                            }else{
                                pfield.setText("");
                                field1.setText("");
                            }
                                
                                    
                            dialogo1.setVisible(false);
                            JFrame frame= new JFrame("");
                            frame.setLayout(null);
                            frame.setSize(750,500);
                            frame.getContentPane().setBackground(verde);
                            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            frame.setLocation(550, 200);

                            JTextArea area= new JTextArea();
                            area.setBounds(10,10, 730, 300);
                            area.setBackground(gris);
                            area.setText("");
                            
                            JScrollPane scroll = new JScrollPane (area);
                            scroll.setBounds(10, 10, 480, 250);

                            JCheckBox checkbox = new JCheckBox();
                            checkbox.setBounds(45, 375, 730, 30);
                            checkbox.setText("Agregar al final");
                            checkbox.setBackground(verde);
                            checkbox.setSelected(true);

                            JTextField field = new JTextField();
                            field.setBounds(10, 320, 730, 30);
                            field.setBackground(gris);
                            field.setText("");

                            JButton button= new JButton();
                            button.setText("Borrar");
                            button.setBounds(550,400,95,35);
                            button.setBackground(azul);
                            button.addActionListener(new ActionListener(){
                                @Override
                                public void actionPerformed(ActionEvent e){
                                        JDialog dialogo = new JDialog();
                                        dialogo.setLayout(null);
                                        dialogo.setSize(250,200);
                                        dialogo.getContentPane().setBackground(verde);
                                        dialogo.setLocation(550, 200);

                                        JLabel label = new JLabel();
                                        label.setBounds(15, 10, 235, 90);
                                        label.setText("¿Seguro que quieres borrar?");

                                        JButton buttond= new JButton();
                                        buttond.setText("SI");
                                        buttond.setBounds(10,100,95,35);
                                        buttond.setBackground(azul);
                                        buttond.addActionListener(new ActionListener(){
                                            @Override
                                            public void actionPerformed(ActionEvent e){
                                                area.setText("");
                                                field.setText("");
                                                dialogo.setVisible(false);
                                            }
                                        });

                                        JButton buttond1= new JButton();
                                        buttond1.setText("NO");
                                        buttond1.setBounds(135,100,95,35);
                                        buttond1.setBackground(azul);
                                        buttond1.addActionListener(new ActionListener(){
                                            @Override
                                            public void actionPerformed(ActionEvent e){
                                                dialogo.setVisible(false);
                                            }
                                        });



                                        dialogo.add(label);
                                        dialogo.add(buttond);
                                        dialogo.add(buttond1);

                                        dialogo.setVisible(true);
                                        dialogo.setResizable(false);
                                }
                                });

                            JButton button1= new JButton();
                            button1.setText("Enviar");
                            button1.setBounds(425,400,95,35);
                            button1.setBackground(azul);
                            button1.addActionListener(new ActionListener(){
                                @Override
                                public void actionPerformed(ActionEvent e){
                                    if(checkbox.isSelected()){
                                        String txt= field.getText();
                                        area.append(txt);
                                        area.append(System.getProperty("line.separator"));    
                                    } else{
                                        String txt2= area.getText();
                                        String txt = field.getText();
                                        area.setText(txt);
                                        area.append(txt2);
                                    }    
                                }
                            });

                            JButton button2= new JButton();
                            button2.setText("Salir");
                            button2.setBounds(300,400,95,35);
                            button2.setBackground(azul);
                            button2.addActionListener(new ActionListener(){
                                @Override
                                public void actionPerformed(ActionEvent e){
                                        
                                        JDialog dialogo2 = new JDialog();
                                        dialogo2.setLayout(null);
                                        dialogo2.setSize(250,200);
                                        dialogo2.getContentPane().setBackground(verde);
                                        dialogo2.setLocation(550, 200);

                                        JLabel label = new JLabel();
                                        label.setBounds(15, 10, 235, 90);
                                        label.setText("¿Seguro que quieres salir?");

                                        JButton buttond3= new JButton();
                                        buttond3.setText("SI");
                                        buttond3.setBounds(10,100,95,35);
                                        buttond3.setBackground(azul);
                                        buttond3.addActionListener(new ActionListener(){
                                            @Override
                                            public void actionPerformed(ActionEvent e){
                                                frame.setVisible(false);
                                                dialogo2.setVisible(false);
                                                dialogo1.setVisible(true);
                                            }
                                        });

                                        JButton buttond4= new JButton();
                                        buttond4.setText("NO");
                                        buttond4.setBounds(135,100,95,35);
                                        buttond4.setBackground(azul);
                                        buttond4.addActionListener(new ActionListener(){
                                            @Override
                                            public void actionPerformed(ActionEvent e){
                                                dialogo2.setVisible(false);
                                            }
                                        });



                                        dialogo2.add(label);
                                        dialogo2.add(buttond3);
                                        dialogo2.add(buttond4);

                                        dialogo2.setVisible(true);
                                        dialogo2.setResizable(false);
                                }
                                });



                                        frame.add(area);
                                        frame.add(checkbox);
                                        frame.add(field);
                                        frame.add(button);
                                        frame.add(button1);
                                        frame.add(button2);

                                        frame.setResizable(false);
                                        frame.setVisible(true);

                                    }
                                });
                    
                    
                    
                    dialogo1.add(label1);
                    dialogo1.add(label2);
                    dialogo1.add(field1);
                    dialogo1.add(pfield);
                    dialogo1.add(label3);
                    dialogo1.add(checkbox1);
                    dialogo1.add(buttond2);
                    
                    dialogo1.setVisible(true);
                    dialogo1.setResizable(false);        
        
    } 
}