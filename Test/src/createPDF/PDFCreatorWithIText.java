package createPDF;


import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

import java.io.FileNotFoundException;


// https://www.tutorialspoint.com/itext/itext_creating_pdf_document.htm
public class PDFCreatorWithIText {
    public static void main(String[] args) throws FileNotFoundException {


        // Creating a PdfWriter
        String dest = "/home/DN230483ZAV2/Trash/pdfIText.pdf";
        PdfWriter writer = new PdfWriter(dest);

        // Creating a PdfDocument
        PdfDocument pdf = new PdfDocument(writer);

        // Creating a Document
        Document document = new Document(pdf);
        String para1 = "Tutorials Point originated from the idea that there exists a class of readers who respond better to online content and prefer to learn new skills at their own pace from the comforts of their drawing rooms.";

        String para2 = "The journey commenced with a single tutorial on HTML in 2006 and elated by the response it generated, we worked our way to adding fresh tutorials to our repository which now proudly flaunts a wealth of tutorials and allied articles on topics ranging from programming languages to web designing to academics and much more.";

        // Creating Paragraphs
        Paragraph paragraph1 = new Paragraph(para1);
        Paragraph paragraph2 = new Paragraph(para2);

        // Creating a table
        float [] pointColumnWidths = {150F, 150F, 150F};
        Table table = new Table(pointColumnWidths);
/*
        // Adding cells to the table
        table.addCell("dgfskjdhegf");
        table.addCell(new Cell().add("Raju"));
        table.addCell(new Cell().add("Id"));
        table.addCell(new Cell().add("1001"));
        table.addCell(new Cell().add("Designation"));
        table.addCell(new Cell().add("Programmer"));
*/
        // Adding Table to document
        document.add(table);

        // Adding paragraphs to document
        document.add(paragraph1);
        document.add(paragraph2);

        // Closing the document
        document.close();
        System.out.println("Paragraph added");


    }
}
