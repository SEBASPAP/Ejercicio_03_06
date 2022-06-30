/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_06;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author paulp
 */
public class Ventana extends JFrame implements ActionListener {

//    private List<JButton> jButtonList;
    private Figura1 figura1;
    private Figura2 figura2;
    private Figura3 figura3;
    private JComboBox jComboBox1;
    private JComboBox jComboBox2;
    private JButton jButton1;
    private JButton jButton2;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(600, 600);
        this.iniciaComponentes();
        this.setLayout(new BorderLayout());
        this.add(this.jComboBox1, BorderLayout.NORTH);
        this.add(this.jComboBox2, BorderLayout.BEFORE_LINE_BEGINS);
        this.add(this.jButton1, BorderLayout.SOUTH);
        this.add(this.jButton2, BorderLayout.EAST);
        this.figura1 = new Figura1(Color.black);
        this.figura2 = new Figura2(Color.black);
        this.figura3 = new Figura3(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void iniciaComponentes() {
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("LINEA");
        this.jComboBox1.addItem("CIRCULO");
        this.jComboBox1.addItem("RECTANGULO");
        this.jComboBox2 = new JComboBox();
        this.jComboBox2.addItem("Rojo");
        this.jComboBox2.addItem("Azul");
        this.jComboBox2.addItem("Naranja");
        this.jComboBox2.addItem("Verde");
        this.jComboBox2.addItem("Amarillo");
        this.jComboBox2.addItem("Rosado");
        this.jComboBox2.addItem("Gris");
        this.jButton1 = new JButton("ENTER");
        this.jButton1.addActionListener(this);
        this.jButton2 = new JButton("ELIMINAR");
        this.jButton2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (this.jComboBox1.getSelectedIndex() == 0) {
            if (this.jComboBox2.getSelectedIndex() == 2) {
                this.figura1.setColor1(Color.ORANGE);
                this.figura1.repaint();
                this.add(this.figura1, BorderLayout.CENTER);
                if (e.getSource().equals(this.jButton2)) {
                    System.out.println("ELIMINADO");
                    this.remove(this.figura1);
                }
            }
            if (this.jComboBox2.getSelectedIndex() == 5) {
                this.figura1.setColor1(Color.PINK);
                this.figura1.repaint();
                this.add(this.figura1, BorderLayout.CENTER);
                if (e.getSource().equals(this.jButton2)) {
                    System.out.println("ELIMINADO");
                    this.remove(this.figura1);
                }
            }
            if (this.jComboBox2.getSelectedIndex() == 6) {
                this.figura1.setColor1(Color.DARK_GRAY);
                this.figura1.repaint();
                this.add(this.figura1, BorderLayout.CENTER);
                if (e.getSource().equals(this.jButton2)) {
                    System.out.println("ELIMINADO");
                    this.remove(this.figura1);
                }
            }

        }

        if (this.jComboBox1.getSelectedIndex() == 1) {
            if (this.jComboBox2.getSelectedIndex() == 2) {
                this.figura2.setColor1(Color.ORANGE);
                this.figura2.repaint();
                this.add(this.figura2, BorderLayout.CENTER);
                if (e.getSource().equals(this.jButton2)) {
                    System.out.println("ELIMINADO");
                    this.remove(this.figura2);
                }
            }
            if (this.jComboBox2.getSelectedIndex() == 5) {
                this.figura2.setColor1(Color.PINK);
                this.figura2.repaint();
                this.add(this.figura2, BorderLayout.CENTER);
                if (e.getSource().equals(this.jButton2)) {
                    System.out.println("ELIMINADO");
                    this.remove(this.figura2);
                }
            }
            if (this.jComboBox2.getSelectedIndex() == 6) {
                this.figura2.setColor1(Color.DARK_GRAY);
                this.figura2.repaint();
                this.add(this.figura2, BorderLayout.CENTER);
                if (e.getSource().equals(this.jButton2)) {
                    System.out.println("ELIMINADO");
                    this.remove(this.figura2);
                }
            }
        }

        if (this.jComboBox1.getSelectedIndex() == 2) {
            if (this.jComboBox2.getSelectedIndex() == 2) {
                this.figura3.setColor1(Color.ORANGE);
                this.figura3.repaint();
                this.add(this.figura3, BorderLayout.CENTER);
                if (e.getSource().equals(this.jButton2)) {
                    System.out.println("ELIMINADO");
                    this.remove(this.figura3);
                }
            }
            if (this.jComboBox2.getSelectedIndex() == 5) {
                this.figura3.setColor1(Color.PINK);
                this.figura3.repaint();
                this.add(this.figura3, BorderLayout.CENTER);
                if (e.getSource().equals(this.jButton2)) {
                    System.out.println("ELIMINADO");
                    this.remove(this.figura3);
                }
            }
            if (this.jComboBox2.getSelectedIndex() == 6) {
                this.figura3.setColor1(Color.DARK_GRAY);
                this.figura3.repaint();
                this.add(this.figura3, BorderLayout.CENTER);
                if (e.getSource().equals(this.jButton2)) {
                    System.out.println("ELIMINADO");
                    this.remove(this.figura3);
                }
            }
        }
    }

}
