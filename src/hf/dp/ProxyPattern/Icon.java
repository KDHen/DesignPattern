package hf.dp.ProxyPattern;

import java.awt.*;

public interface Icon {
    int getIconHeight();
    int getIconWidth();
    void paintIcon(final Component c, Graphics g, int x, int y);
}
