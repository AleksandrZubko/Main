package TestsForWork;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

import java.io.*;
public class HtmlToPdf {

    public static void main(String[] args) {
            /*
            try {


                    Document document = new Document();
                    PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("/home/DN230483ZAV2/Trash/HTMLtoPDF.pdf"));
                    document.open();
                    XMLWorkerHelper.getInstance().parseXHtml(writer, document, new FileInputStream("/home/DN230483ZAV2/Trash/test.html"));
                    document.close();


            } catch (Exception e) {
                    e.printStackTrace();
            }
*/

            try{
                    OutputStream file = new FileOutputStream(new File("/home/DN230483ZAV2/Trash/HTMLtoPDF.pdf"));
                    Document document = new Document();
                    PdfWriter writer = PdfWriter.getInstance(document, file);
                    StringBuilder htmlString = new StringBuilder();
                    htmlString.append(new String("<html><body> как это сделать?<table border='2' align='center'> "));
                    htmlString.append(new String("<tr><td>JavaCodeGeeks</td><td><a href='examples.javacodegeeks.com'>JavaCodeGeeks</a> </td></tr>"));
                    htmlString.append(new String("<tr> <td> Google Here </td> <td><a href='www.google.com'>Google</a> </td> </tr></table></body></html>"));
                    String utf8String = new String(htmlString.toString().getBytes(), "UTF-8");
                    String ansiString = new String(htmlString.toString().getBytes("UTF-8"), "windows-1251");
                    document.open();
                    InputStream is = new ByteArrayInputStream(ansiString.getBytes());
                    XMLWorkerHelper.getInstance().parseXHtml(writer, document, is);
                    document.close();
                    file.close();
            }
            catch (Exception e){
                    e.printStackTrace();
            }
    }


}
