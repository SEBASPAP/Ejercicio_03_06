/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_06;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author paulp
 */
public class Figura2 extends JPanel implements MouseListener {

    private Color color1;
    private Point punto = new Point(-1000, -1000);

    public Figura2(Color color1) {
        this.color1 = color1;
        this.addMouseListener(this);
    }

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        g.setColor(this.color1);
        g.fillOval(this.punto.x , this.punto.y , 200, 200);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.toString());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println(e.toString());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.punto = e.getPoint();
        this.repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println(e.toString());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println(e.toString());
    }

}
