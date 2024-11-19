
package BloodBankManagement;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Souleymane
 */
public class Printing {
    
    
    
    public void printLabel(JPanel panel){
        PrinterJob pJob = PrinterJob.getPrinterJob();
        pJob.setJobName("Students ID");
        pJob.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                if(pageIndex > 0){
                    return Printable.NO_SUCH_PAGE;
                }
                Graphics2D g2D =(Graphics2D)graphics;
                g2D.translate(pageFormat.getImageableX()*2, pageFormat.getImageableY()*2);
                g2D.scale(0.5,0.5 );
                panel.paint(g2D);
                return Printable.PAGE_EXISTS;
                
            }
        });
        boolean returnResult = pJob.printDialog();
        if(returnResult){
            try{
                pJob.print(); 
            }
            catch(PrinterException pe){
                //JOptionPane.showMessageDialog( pe.getMessage());
            }
        } 
    }
    
}
