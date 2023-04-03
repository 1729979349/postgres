package com.croky.postgres.utils.document;

import com.croky.common.util.CollectionUtils;
import org.apache.poi.hslf.usermodel.*;
import org.apache.poi.openxml4j.util.ZipSecureFile;
import org.apache.poi.sl.usermodel.Shape;
import org.apache.poi.sl.usermodel.SlideShow;
import org.apache.poi.xslf.usermodel.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Croky.Zheng
 * @date 2021-03-16 11:00
 */
public final class PptUtils {
    private PptUtils() {
    }

    public static String read(String filePath) throws IOException {
        File file = new File(filePath);
        if (file.isFile()) {
            return read(file);
        }
        return null;
    }

    /**
     * 读取PPT中的文件内容
     * @param file
     * @return
     * @throws IOException
     */
    public static String read(File file) throws IOException {
        try (FileInputStream fin = new FileInputStream(file)) {
            StringBuffer sbuf = new StringBuffer();
            if (file.getName().toLowerCase().endsWith(".pptx")) {
                try (XMLSlideShow slideShow = new XMLSlideShow(fin)) {
                    for (XSLFSlide slide : slideShow.getSlides()) {
                        //读取一张幻灯片的标题
                        sbuf.append("title=" + slide.getTitle()).append("&");
                        for (XSLFShape shape : slide.getShapes()) {
                            sbuf.append(getTextByShape(shape));
                        }
                    }
                }
            } else {
                try (HSLFSlideShow slideShow = new HSLFSlideShow(fin)) {
                    List<HSLFSlide> slides = slideShow.getSlides();
                    for (HSLFSlide slide : slides) {
                        //读取一张幻灯片的标题
                        sbuf.append("title=" + slide.getTitle()).append("&content=");
                        for (HSLFShape shape : slide.getShapes()) {
                            sbuf.append(getTextByShape(shape)).append("-|-");
                        }
                    }
                }
            }
            return sbuf.toString();
        }
    }

    public static void write(String filePath,String[] contents) throws IOException {
        File file = new File(filePath);
        if (file.isFile()) {
            write(file,contents);
        }
    }
    /**
     * 将文本内容写入PPT
     *
     * @param file PPT文件对象
     * @param contents 内容，字符串数组，一个字符串一页PPT
     * @throws IOException
     */
    public static void write(File file, String[] contents) throws IOException {
        // 创建一个空白PPT
        XMLSlideShow xmlSlideShow = new XMLSlideShow();
        //设置幻灯片的大小：
        Dimension pageSize = xmlSlideShow.getPageSize();
        pageSize.setSize(800, 600);
        //获取幻灯片主题列表：
        List<XSLFSlideMaster> slideMasters = xmlSlideShow.getSlideMasters();
        //获取幻灯片的布局样式
        if (CollectionUtils.isNotEmpty(slideMasters)) {
            XSLFSlideLayout layout = slideMasters.get(0).getLayout(SlideLayout.TITLE_AND_CONTENT);
        }
        // 在空白的PPT中创建一个空白的幻灯片
        for (String content : contents) {
            //创建无样式幻灯片
            XSLFSlide slide = xmlSlideShow.createSlide();
            //创建文本框
            XSLFTextBox textBox = slide.createTextBox();
            //设置文本框的位置
            textBox.setAnchor(new Rectangle2D.Double(200, 160, 200, 100));
            //创建一个段落
            XSLFTextParagraph textParagraph = textBox.addNewTextParagraph();
            //创建文本
            XSLFTextRun textRun = textParagraph.addNewTextRun();
            //设置标题字号
            textRun.setFontSize(26.00);
            //设置成粗体
            textRun.setBold(true);
            textRun.setText(content);
        }
        try (FileOutputStream out = new FileOutputStream(file)) {
            xmlSlideShow.write(out);
        }
    }

    public static void toImage(File file) throws IOException {
        try (FileInputStream fin = new FileInputStream(file)) {
            StringBuffer sbuf = new StringBuffer();
            if (file.getName().toLowerCase().endsWith(".pptx")) {
                try (XMLSlideShow slideShow = new XMLSlideShow(fin)) {
                    for (XSLFSlide slide : slideShow.getSlides()) {
                        //读取一张幻灯片的标题
                        sbuf.append("title=" + slide.getTitle()).append("&");
                        for (XSLFShape shape : slide.getShapes()) {
                            sbuf.append(getTextByShape(shape));
                        }
                    }
                }
            } else {
                try (HSLFSlideShow slideShow = new HSLFSlideShow(fin)) {
                    List<HSLFSlide> slides = slideShow.getSlides();
                    for (HSLFSlide slide : slides) {
                        //读取一张幻灯片的标题
                        sbuf.append("title=" + slide.getTitle()).append("&content=");
                        for (HSLFShape shape : slide.getShapes()) {
                            sbuf.append(getTextByShape(shape)).append("-|-");
                        }
                    }
                }
            }
        }
    }

    public static List ppt2Png(File pptFile) {
        List pngFileList = new ArrayList<>();
        long startTime = System.currentTimeMillis();

        FileInputStream is = null;
        // 将ppt文件转换成每一帧的图片
        HSLFSlideShow ppt = null;

        try {
            ZipSecureFile.setMinInflateRatio(-1.0d);
            is = new FileInputStream(pptFile);
            ppt = new HSLFSlideShow(is);
            int idx = 1;
            Dimension pageSize = ppt.getPageSize();
            double image_rate = 1.0;
            int imageWidth = (int) Math.floor(image_rate * pageSize.getWidth());
            int imageHeight = (int) Math.floor(image_rate * pageSize.getHeight());

            for (HSLFSlide slide : ppt.getSlides()) {
                BufferedImage img = new BufferedImage(imageWidth, imageHeight, BufferedImage.TYPE_INT_ARGB);
                Graphics2D graphics = img.createGraphics();
                graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                graphics.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
                graphics.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
                // clear the drawing area
                graphics.setPaint(Color.white);
                graphics.fill(new Rectangle2D.Float(0, 0, imageWidth, imageHeight));
                graphics.scale(image_rate, image_rate);

                //防止中文乱码
                for (HSLFShape shape : slide.getShapes()) {
                    if (shape instanceof HSLFTextShape) {
                        HSLFTextShape hslfTextShape = (HSLFTextShape) shape;
                        for (HSLFTextParagraph hslfTextParagraph : hslfTextShape) {
                            for (HSLFTextRun hslfTextRun : hslfTextParagraph) {
                                hslfTextRun.setFontFamily("宋体");
                            }
                        }
                    }
                }

                FileOutputStream out = null;
                try {
                    slide.draw(graphics);
                    File pngFile = new File(pptFile.getPath().replace(".ppt", String.format("-%04d.png", idx++)));
                    out = new FileOutputStream(pngFile);
                    ImageIO.write(img, "png", out);
                    pngFileList.add(pngFile);
                } catch (Exception e) {

                } finally {
                    try {
                        if (out != null) {
                            out.flush();
                            out.close();
                        }

                        if (graphics != null) {
                            graphics.dispose();
                        }

                        if (img != null) {
                            img.flush();
                        }
                    } catch (IOException e) {

                    }
                }
            }
        } catch (Exception e) {

        } finally {
            try {
                if (is != null) {
                    is.close();
                }

                if (ppt != null) {
                    ppt.close();
                }
            } catch (Exception e) {

            }
        }
        long endTime = System.currentTimeMillis();

        return pngFileList;
    }

    private static String getTextByShape(Shape shape) {
        if (shape instanceof XSLFTextShape) {
            //将图像类强制装换成文本框类
            XSLFTextShape textShape = (XSLFTextShape) shape;
            //获取文本框内的文字
            return textShape.getText();
//            List<XSLFTextParagraph> textParagraphs = textShape.getTextParagraphs();
//            for (XSLFTextParagraph tp : textParagraphs) {
//                List<XSLFTextRun> textRuns = tp.getTextRuns();
//                for (XSLFTextRun r : textRuns) {
//                    if ("201809".equals(r.getRawText())) {
////对匹配到的字符串进行更改
//                        r.setText("2018-09");
////设置字体颜色
//                        r.setFontColor(Color.RED);
//                    }
//                }
//            }

        } else if (shape instanceof XSLFTable) {//表格
            // 将图像类强制装换成表格类
            XSLFTable tableShape = (XSLFTable) shape;
            List<XSLFTableRow> rows = tableShape.getRows();
            StringBuffer sbuf = new StringBuffer();
            for (XSLFTableRow tr : rows) {
                List<XSLFTableCell> cells = tr.getCells();
                sbuf.append("row=");
                for (XSLFTableCell tc : cells) {
                    sbuf.append(tc.getText()).append(",");
                }
                sbuf.append("&");
            }
            return sbuf.toString();
        } else if (shape instanceof XSLFPictureShape) {//图片
////将图像类强制装换成图片框类
//            XSLFPictureShape ps = (XSLFPictureShape) shape;
////获取图片的字节码数据（可以利用输出流将该图片保存到硬盘里）
//            byte [] pictureData = ps.getPictureData().getData();
////图片文件
//            File image = new File("D://222.jpg");
//// 图片文件输入流
//            FileInputStream imageFis = new FileInputStream(image);
//// 获取图片大小
//            int len = (int) image.length();
//
////创建一个字节数组，数组大小与图片文件大小一致
//            byte[] imageData = new byte[len];
//            if (imageFis.read(imageData) != -1) {
////更换图片必须图片设置索引，要不不生效
//                ps.getPictureData().setIndex(1);
//                ps.getPictureData().setData(imageData);
//            }
////关闭输入流
//            imageFis.close();
        } else {
        }
        return null;
    }
}
