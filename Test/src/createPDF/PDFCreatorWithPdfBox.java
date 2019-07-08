package createPDF;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.IOException;

//https://www.internet-technologies.ru/articles/sozdanie-pdf-faylov-v-java.html#header-9

public class PDFCreatorWithPdfBox {
    public static void main(String[] args) throws IOException {
        PDDocument document = new PDDocument();
        PDPage page = new PDPage();
        document.addPage(page);

        PDFont font = PDType1Font.HELVETICA_BOLD;
        PDPageContentStream contentStream = new PDPageContentStream(document, page);
//        contentStream.beginText();
//        contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
//
//        contentStream.showText("Hello World");
//        contentStream.endText();
//        contentStream.close();
        contentStream.beginText();
        contentStream.setFont( font, 12 );
        contentStream.moveTextPositionByAmount( 100, 700 );
        contentStream.drawString( "Hello World" );
        contentStream.endText();

// Make sure that the content stream is closed:
        contentStream.close();
        document.save("/home/DN230483ZAV2/Trash/pdfBoxEncryption.pdf");
        document.close();

    }
}
