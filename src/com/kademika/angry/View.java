package com.kademika.angry;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * Created by dean on 4/9/15.
 */
public class View extends JPanel {

    Figure circle;
    Rectangle mouse;
    IntersseptionListener listener;
//    Shape rect;

    public View(Figure figure) {
        circle = figure;
        mouse = new Rectangle(new Point(0, 0), new Dimension(10, 10));
//        rect = new Rectangle2D.Double(0,0,10,10);
//        mouse.setRect(new Rectangle2D.Double(0,0,10,10));
        drawPanel();
    }

    public void drawPanel() {
        JFrame frame = new JFrame("AngryFriend");
        frame.setContentPane(this);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(100,200,800,600);
        frame.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(circle.getColor());
        g2d.fillOval(circle.getX(),circle.getY(),circle.getDimention().width,circle.getDimention().height);
        if (g2d.hit(mouse,circle.getShape(),false)) {
            listener.prossessInterseption();
        }
    }

    public Figure getCircle() {
        return circle;
    }

    public void setCircle(Figure circle) {
        this.circle = circle;
    }

    public Rectangle getRect() {
        return mouse;
    }

    public void setRect(Rectangle mouse) {
        this.mouse = mouse;
    }

    public IntersseptionListener getListener() {
        return listener;
    }

    public void setListener(IntersseptionListener listener) {
        this.listener = listener;
    }
}
