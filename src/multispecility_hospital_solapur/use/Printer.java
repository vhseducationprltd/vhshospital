package multispecility_hospital_solapur.use;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.print.*;
/**  @author ItzJVS  **/
public class Printer {
    public static void printReciept(JPanel Print_p) {
       PrinterJob printerjob = PrinterJob.getPrinterJob();
       printerjob.setJobName("Printer");
       
       printerjob.setPrintable((Graphics graphics, PageFormat pageFormat, int pageIndex) -> {
           Paper paper = new Paper();
           pageFormat.setPaper(paper);
           System.out.println("out the if"+pageIndex);
           if(pageIndex > 0){
               System.out.println("in the if"+pageIndex);
               return Printable.NO_SUCH_PAGE;
           }
           Graphics2D graphics2d = (Graphics2D) graphics; 
           graphics2d.translate(pageFormat.getImageableX()-50,pageFormat.getImageableY()-45);
           graphics2d.scale(1.2,1.2);
           Print_p.paint(graphics2d);
           return Printable.PAGE_EXISTS;
       });
       boolean returningResult = printerjob.printDialog();
       if(returningResult){
           try{
               printerjob.print();
           }catch(PrinterException e){
                System.out.println(e);
           }
       }
         
    }
    public static void printRecieptDischarge(JPanel Print_p) {
       PrinterJob printerjob = PrinterJob.getPrinterJob();
       printerjob.setJobName("Printer");
       
       printerjob.setPrintable((Graphics graphics, PageFormat pageFormat, int pageIndex) -> {
           Paper paper = new Paper();
           pageFormat.setPaper(paper);
           System.out.println("out the if"+pageIndex);
           if(pageIndex > 0){
               System.out.println("in the if"+pageIndex);
               return Printable.NO_SUCH_PAGE;
           }
           Graphics2D graphics2d = (Graphics2D) graphics; 
           graphics2d.translate(pageFormat.getImageableX()-65,pageFormat.getImageableY()-60);
           graphics2d.scale(0.70,0.7);
           Print_p.paint(graphics2d);
           return Printable.PAGE_EXISTS;
       });
       boolean returningResult = printerjob.printDialog();
       if(returningResult){
           try{
               printerjob.print();
           }catch(PrinterException e){
                System.out.println(e);
           }
       }
         
    }
    public static void printRecieptOpdExit(JPanel Print_p) {
       PrinterJob printerjob = PrinterJob.getPrinterJob();
       printerjob.setJobName("Printer");
       
       printerjob.setPrintable((Graphics graphics, PageFormat pageFormat, int pageIndex) -> {
           Paper paper = new Paper();
           pageFormat.setPaper(paper);
           System.out.println("out the if"+pageIndex);
           if(pageIndex > 0){
               System.out.println("in the if"+pageIndex);
               return Printable.NO_SUCH_PAGE;
           }
           Graphics2D graphics2d = (Graphics2D) graphics; 
           graphics2d.translate(pageFormat.getImageableX()-72,pageFormat.getImageableY()-70);
           graphics2d.scale(0.70,0.7);
           Print_p.paint(graphics2d);
           return Printable.PAGE_EXISTS;
       });
       boolean returningResult = printerjob.printDialog();
       if(returningResult){
           try{
               printerjob.print();
           }catch(PrinterException e){
                System.out.println(e);
           }
       }
         
    }
}
