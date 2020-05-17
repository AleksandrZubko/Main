import org.apache.poi.sl.usermodel.AutoNumberingScheme;
import org.apache.poi.sl.usermodel.PictureData;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xslf.usermodel.*;

import java.awt.*;
import java.io.*;

public class PowerPoint {
    public static void main(String[] args) throws IOException {
        //create new presentation
        XMLSlideShow ppt = new XMLSlideShow();
        //add new slide
        XSLFSlideMaster defaultMaster = ppt.getSlideMasters().get(0);
        //получение макета слайда
        XSLFSlideLayout layout = defaultMaster.getLayout(SlideLayout.TITLE_ONLY);

        //create first slide
        XSLFSlide slide = ppt.createSlide(layout);
        XSLFTextShape title = slide.getPlaceholder(0);
        //удаление предопределённого текста
        title.clearText();

        //создание нового параграфа
        XSLFTextParagraph p = title.addNewTextParagraph();
        XSLFTextRun r = p.addNewTextRun();
        r.setText("My first presentation made by Java");
        r.setFontColor(Color.decode("#c62828"));  //#c62828 - красный цвет
        r.setFontSize(50.0);

        //добавление изображения
        //reading an image
        File image = new File("D://Others//weCanDoIt.jpg");

        //converting it into a byte array
        byte[] picture = IOUtils.toByteArray(new FileInputStream(image));


        //InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("D://Others/weCanDoIt.jpg");
        //byte[] pd = IOUtils.toByteArray(is);
        XSLFPictureData pictureData = ppt.addPicture(picture, XSLFPictureData.PictureType.JPEG);

        //определение позиции для картинки
        XSLFPictureShape pictureShape = slide.createPicture(pictureData);
        pictureShape.setAnchor(new Rectangle(20, 180, 200, 300));

        //create a second slide
        //так же используем макет. в этот раз используем TITLE and CONTENT
        layout = defaultMaster.getLayout(SlideLayout.TITLE_AND_CONTENT);
        slide = ppt.createSlide(layout);

        //очищаем заглавие (title)
        title = slide.getPlaceholder(0);
        title.clearText();
        r = title.addNewTextParagraph().addNewTextRun();
        r.setText("Работаем, ребята!");

        //добавление ссылки
        XSLFHyperlink link = r.createHyperlink();
        link.setAddress("https://www.youtube.com/watch?v=fWu2F1kS4Lk");

        //определение параграфов в слайде
        XSLFTextShape content = slide.getPlaceholder(1);
        content.clearText();
        content.addNewTextParagraph().addNewTextRun().setText("Куй железо пока горячо!");
        content.addNewTextParagraph().addNewTextRun().setText("Куй железо не отходя от кассы!");
        content.addNewTextParagraph().addNewTextRun().setText("Просто куй железо!");

        //create a third slide
        layout = defaultMaster.getLayout(SlideLayout.TITLE_AND_CONTENT);
        slide = ppt.createSlide(layout);
        title = slide.getPlaceholder(0);
        title.clearText();
        r = title.addNewTextParagraph().addNewTextRun();
        r.setText("План по реализации ТЗ");
        content = slide.getPlaceholder(1);
        content.clearText();

        //новый параграф
        p = content.addNewTextParagraph();
        p.setIndentLevel(0);

        //определяем как лист
        p.setBullet(true);
        r = p.addNewTextRun();
        r.setText("1. Прорабатываю возможность создания презентации;");

        p = content.addNewTextParagraph();
        p.setIndentLevel(0);
        p.addNewTextRun().setText("2. Пилю презентацию:");

        //больше отступ
        p = content.addNewTextParagraph();
        p.setBulletAutoNumber(AutoNumberingScheme.alphaLcParenRight, 1);
        p.setIndentLevel(1);

        p.addNewTextRun().setText("Всё получилось!");


        //create next slide
        layout = defaultMaster.getLayout(SlideLayout.TITLE_ONLY);
        slide = ppt.createSlide(layout);
        title = slide.getPlaceholder(0);
        //удаление предопределённого текста
        title.clearText();

        //создание нового параграфа
        p = title.addNewTextParagraph();
        r = p.addNewTextRun();
        r.setText("Пример линейной диаграммы");
        r.setFontColor(Color.GREEN);  //#c62828 - красный цвет
        r.setFontSize(50.0);

        //добавление изображения
        //reading an image
        image = new File("D://Others//diagram1.png");

        //converting it into a byte array
        picture = IOUtils.toByteArray(new FileInputStream(image));


        //InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("D://Others/weCanDoIt.jpg");
        //byte[] pd = IOUtils.toByteArray(is);
        pictureData = ppt.addPicture(picture, XSLFPictureData.PictureType.PNG);

        //определение позиции для картинки
        pictureShape = slide.createPicture(pictureData);
        pictureShape.setAnchor(new Rectangle(20, 180, 700, 140));

        //create next slide
        layout = defaultMaster.getLayout(SlideLayout.TITLE_ONLY);
        slide = ppt.createSlide(layout);
        title = slide.getPlaceholder(0);
        //удаление предопределённого текста
        title.clearText();

        //создание нового параграфа
        p = title.addNewTextParagraph();
        r = p.addNewTextRun();
        r.setText("Пример гистограммы");
        r.setFontColor(Color.GREEN);  //#c62828 - красный цвет
        r.setFontSize(50.0);

        //добавление изображения
        //reading an image
        image = new File("D://Others//diagram2.png");

        //converting it into a byte array
        picture = IOUtils.toByteArray(new FileInputStream(image));


        //InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("D://Others/weCanDoIt.jpg");
        //byte[] pd = IOUtils.toByteArray(is);
        pictureData = ppt.addPicture(picture, XSLFPictureData.PictureType.PNG);

        //определение позиции для картинки
        pictureShape = slide.createPicture(pictureData);
        pictureShape.setAnchor(new Rectangle(20, 180, 700, 140));





        //create next slide
        layout = defaultMaster.getLayout(SlideLayout.TITLE_ONLY);
        slide = ppt.createSlide(layout);
        title = slide.getPlaceholder(0);
        //удаление предопределённого текста
        title.clearText();

        //создание нового параграфа
        p = title.addNewTextParagraph();
        r = p.addNewTextRun();
        r.setText("Пример графика, который можно редактировать");
        r.setFontColor(Color.GREEN);  //#c62828 - красный цвет
        r.setFontSize(50.0);

        XSLFChart myXSLFChart = ppt.createChart();
        //myXSLFChart.createData();
        XSLFChart chartCopy = slide.getSlideShow().createChart(slide);










        //сохраняем презентацию
        FileOutputStream out = new FileOutputStream("D://Others//Preza.pptx");
        ppt.write(out);
        out.close();
        ppt.close();
    }
}
