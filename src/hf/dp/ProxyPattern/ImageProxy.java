package hf.dp.ProxyPattern;

import javax.swing.*;
import java.awt.*;
import java.net.URL;


public class ImageProxy implements Icon {
    volatile ImageIcon imageIcon;
    final URL imageURL;

    public ImageProxy(URL url) { imageURL = url; }
    public int getIconWidth() {
        if (imageIcon != null) {
            return imageIcon.getIconWidth();
        } else {
            return 800;
        }
    }
    public int getIconHeight() {
        if (imageIcon != null) {
            return imageIcon.getIconHeight();
        } else {
            return 600;
        }
    }

    synchronized void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        if (imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading CD cover, please wait...",
                    x+300, y+190);
            Thread retrievalThread = new Thread(new Runnable() {
                public void run() {
                    setImageIcon(new ImageIcon(imageURL, "CD Cover"));
                    c.repaint();
                }
            });
            retrievalThread.start();
        }
    }
}
