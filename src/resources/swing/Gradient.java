package resources.swing;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class Gradient extends JPanel {
        public Color col1 ;
        public Color col2 ;
        public int round =20;

    public Gradient() {
        col1 = new Color(52,143,80);
        col2 = new Color(86,180,211);
        setOpaque(false);
    }
    public Gradient(Color c1,Color c2) {
        col1 = c1;
        col2 = c2;
        setOpaque(false);
    }

    @Override
    public void paint(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
//        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint p = new GradientPaint(0,0,col1,getWidth(),getHeight(),col2);
        g2.setPaint(p);
//        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), round, round);
//          g2.fillRect(0, 0, getWidth(), getHeight());
        g2.dispose();
        super.paint(grphcs);
    }
}
