/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

/**
 *
 * @author emmanuel owusu
 * 10533695
 */
import javax.swing.*;
import java.awt.*;
public class AFrameWithPanel extends JFrame
{
    public static void main(String[]arg)
    {
        JFrame f =new FrameWithPanel();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
    class FrameWithPanel extends JFrame
            
    {
        public FrameWithPanel()
        {
            setTitle("613 rocks!");
            setSize(300,200);
            setLocation(100,200);
            
            Panel613 panel  = new Panel613();
            Container cp = getContentPane();
            cp.add(panel);
        }
    }
class Panel613 extends JPanel
{
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawString("Hi",75,100);
    }
}
