import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

import javax.swing.JComponent;

import javafx.stage.Screen;

public class Print implements Printable{

	JComponent component;
	
	public Print (JComponent compo) {
		this.component=compo;
	}
	
	@Override
	public int print(Graphics g, PageFormat pf, int arg2) throws PrinterException {
		// TODO Auto-generated method stub
		  /*
	     * User (0,0) is typically outside the imageable area, so we must
	     * translate by the X and Y values in the PageFormat to avoid clipping
	     */
	    Graphics2D g2d = (Graphics2D) g;
	    g2d.translate(pf.getImageableX(), pf.getImageableY());

	    //get the image to print
	    BufferedImage theImage = createImage(component);


	    double pageWidth = pf.getImageableWidth();
	    double pageHeight = pf.getImageableHeight();
	    
	    double imageWidth = theImage.getWidth();
	    double imageHeight = theImage.getHeight();
	    
	    double scaleX = pageWidth / imageWidth;
	    double scaleY = pageHeight / imageHeight;
	    
	    double scaleFactor = Math.min(scaleX, scaleY);
	    
	    g2d.scale(scaleFactor, scaleFactor);
	    g.drawImage(theImage, 0, 0, Color.WHITE, null);
	    component.printAll(g2d); 
	    /* tell the caller that this page is part of the printed document */
	    return PAGE_EXISTS; 
	}
	
	/**
	 * Create a BufferedImage for Swing components. The entire component will be
	 * captured to an image.
	 *
	 * @param component Swing component to create image from
	 * @return  image the image for the given region
	 */
	public static BufferedImage createImage(JComponent component)
	{
	    Dimension d = component.getSize();

	    if (d.width == 0 || d.height == 0)
	    {
	        d = component.getPreferredSize();
	        component.setSize(d);
	    }

	    Rectangle region = new Rectangle(0, 0, d.width, d.height);
	    return  createImage(component, region);
	}

	/**
	 * Create a BufferedImage for Swing components. All or part of the component
	 * can be captured to an image.
	 *
	 * @param component Swing component to create image from
	 * @param region The region of the component to be captured to an image
	 * @return  image the image for the given region
	 */
	public static BufferedImage createImage(JComponent component, Rectangle region)
	{
	    //  Make sure the component has a size and has been layed out.
	    //  (necessary check for components not added to a realized frame)

	    if (!component.isDisplayable())
	    {
	        Dimension d = component.getSize();

	        if (d.width == 0 || d.height == 0)
	        {
	            d = component.getPreferredSize();
	            component.setSize(d);
	        }
	        

	       // layoutComponent(component);
	    }

	    BufferedImage image = new BufferedImage(region.width, region.height, BufferedImage.TYPE_INT_RGB);
	    Graphics2D g2d = image.createGraphics();

	    //  Paint a background for non-opaque components,
	    //  otherwise the background will be black

	    if (!component.isOpaque())
	    {
	        g2d.setColor(component.getBackground());
	        g2d.fillRect(region.x, region.y, region.width, region.height);
	    }

	    g2d.translate(-region.x, -region.y);
	    component.paint(g2d);
	    g2d.dispose();
	    return image;
	}

	 

}
