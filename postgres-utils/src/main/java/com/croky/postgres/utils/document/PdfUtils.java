package com.croky.postgres.utils.document;

import com.croky.common.util.FileUtils;
import org.apache.pdfbox.pdfwriter.ContentStreamWriter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageTree;
import org.apache.pdfbox.pdmodel.common.PDStream;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.text.PDFTextStripper;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Croky.Zheng
 * @date 2021-03-17 15:17
 */
public final class PdfUtils {
    private PdfUtils() {
    }

    /**
     * 读取pdf文件的所有内容
     *
     * @param filePath 文件路径
     * @return
     * @throws IOException
     */
    public static String readAll(String filePath) throws IOException {
        try (PDDocument doc = PDDocument.load(new File(filePath))) {
            //获取一个PDFTextStripper文本剥离对象
            PDFTextStripper textStripper = new PDFTextStripper();
            textStripper.setSortByPosition(true);
            return textStripper.getText(doc);
        }

    }

    /**
     * 获取pdf文件的正文
     *
     * @param filePath
     * @param startPage 开始页
     * @param endPage   结束页
     * @return
     * @throws IOException
     */
    public static String read(String filePath, int startPage, int endPage, int num) throws IOException {
        //创建文档对象
        try (PDDocument doc = PDDocument.load(new File(filePath))) {
            //获取一个PDFTextStripper文本剥离对象
            PDFTextStripper textStripper = new PDFTextStripper();
            textStripper.setSortByPosition(true);
            textStripper.setStartPage(startPage);
            textStripper.setEndPage(endPage);
            return textStripper.getText(doc);
        }
    }

    /**
     * 将内容写入到pdf文件中
     *
     * @param filePath 文件路径
     * @param contents 写入的内容，字符串数组，一个字符串对应一页
     * @throws IOException
     */
    public static void write(String filePath, String[] contents) throws IOException {
        try (PDDocument document = new PDDocument()) {
            for (String content : contents) {
                PDPage page = new PDPage();
                //创建一个PDStream 流对象
                PDStream updatedStream = new PDStream(document);
                //创建一个输出流接收updatedStream
                OutputStream out = updatedStream.createOutputStream();
                //将接受一个列表并写出它们的流。
                ContentStreamWriter tokenWriter = new ContentStreamWriter(out);
                //写入一系列标记，后面跟着一行新行
                tokenWriter.writeTokens(content);
                //当前页设置新的内容
                page.setContents(updatedStream);
                document.addPage(page);
            }
            document.save(filePath);
        }
    }

    /**
     * 删除pdf文件中的一页
     * @param filePath      pdf文件路径
     * @param pageNoArr     要删除的页码的数组，页码从0开始
     * @throws IOException
     */
    public static void removePage(String filePath, int[] pageNoArr) throws IOException {
        try (PDDocument document = PDDocument.load(new File(filePath))) {
            if (document.isEncrypted()) {
                throw new IOException("Encrypted documents are not supported for this example");
            }
            if (null != pageNoArr) {
                for (int pageNo : pageNoArr) {
                    document.removePage(pageNo);
                }
            }
            document.save(filePath);
        }
    }


    /**
     * 将pdf文件转为图片
     *
     * @param pdfFilePath   pdf文件路径
     * @param imageFilePath 输出的文件
     * @throws IOException
     */
    public static void toImage(String pdfFilePath,  String imageFilePath) throws IOException {
        toImage(pdfFilePath,null,imageFilePath);
    }

    /**
     * 将pdf文件转为图片
     *
     * @param pdfFilePath   pdf文件路径
     * @param pageNoArr     页码数组,为null则将所有页合并成pdf，页码从0开始
     * @param imageFilePath 输出的文件
     * @throws IOException
     */
    public static void toImage(String pdfFilePath, int[] pageNoArr, String imageFilePath) throws IOException {
        try (PDDocument document = PDDocument.load(new File(pdfFilePath))) {
            //
            //int pageCount = doc.getPageCount();
            //指定单页转pdf
            PDPageTree pages = document.getDocumentCatalog().getPages();
            int size = document.getNumberOfPages();
            List<BufferedImage> piclist = new ArrayList();
            if (null == pageNoArr) {
                for (int i = 0; i < size; i++) {
                    BufferedImage image = new PDFRenderer(document).renderImageWithDPI(i, 130, ImageType.RGB);
                    piclist.add(image);
                }
            } else {
                for (int i = 0; i < pageNoArr.length; i++) {
                    BufferedImage image = new PDFRenderer(document).renderImageWithDPI(pageNoArr[i], 130, ImageType.RGB);
                    piclist.add(image);
                }
            }
            //合并图片
            mergeImages(piclist, imageFilePath);
//            if(pageNo <= 0 || pageNo > document.getNumberOfPages()){
//                String count = (int)(Math.random() * 1000) + "-" + (int)(Math.random() * 1000);
//                //接收页面
//                PDPage page = (PDPage) pages.get(pageNo);
//                //定义图片操作对象来设置图片
//                BufferedImage image = page.convertToImage();
//                //定义迭代器对象存储
//                Iterator<ImageWriter> iter = ImageIO.getImageWritersBySuffix("jpg");
//                //图片写入器对象写入图片
//                ImageWriter writer = (ImageWriter) iter.next();
//                //创建文件输出流对象
//                try (FileOutputStream out = new FileOutputStream(jpgFilePath)) {
//                    //ImageIO去实现ImageOutputStream获取当前图片
//                    ImageOutputStream outImage = ImageIO.createImageOutputStream(out);
//                    writer.setOutput(outImage);
//                    writer.write(new IIOImage(image, null, null));
//                }
//            } else {
//                //循环
//                for (int i = 0; i < pages.size(); i++) {
//                    //接收页面
//                    PDPage page = (PDPage) pages.get(i);
//                    //定义图片操作对象来设置图片
//                    BufferedImage image = page.convertToImage();
//                    //定义迭代器对象存储
//                    Iterator iter = ImageIO.getImageWritersBySuffix("jpg");
//                    //图片写入器对象写入图片
//                    ImageWriter writer = (ImageWriter) iter.next();
//                    //循环保存图片
//                    File outFile = new File(vo.getOutputfile()+i+".jpg");
//                    //创建文件输出流对象
//                    FileOutputStream out = new FileOutputStream(outFile);
//                    //ImageIO去实现ImageOutputStream获取当前图片
//                    ImageOutputStream outImage = ImageIO.createImageOutputStream(out);
//                    writer.setOutput(outImage);
//                    writer.write(new IIOImage(image, null, null));
//                }
//            }
        }
    }

    /**
     * 将宽度相同的图片，竖向追加在一起 ##注意：宽度必须相同
     *
     * @param piclist 文件流数组
     * @param outPath 输出路径
     */
    private static void mergeImages(List<BufferedImage> piclist, String outPath) throws IOException {
        if (piclist == null || piclist.size() <= 0) {
            return;
        }
        int height = 0; // 总高度
        int width = 0;// 总宽度
        int offsetHeight = 0;// 临时的高度 , 或保存偏移高度
        int picNum = piclist.size();// 图片的数量
        File fileImg = null; // 保存读取出的图片
        int[] heightArray = new int[picNum]; // 保存每个文件的高度
        BufferedImage buffer = null; // 保存图片流
        List<int[]> allImgRGB = new ArrayList<int[]>(); // 保存所有的图片的RGB
        int[] imgRGB; // 保存一张图片中的RGB数据
        for (int i = 0; i < picNum; i++) {
            buffer = piclist.get(i);
            heightArray[i] = offsetHeight = buffer.getHeight();// 图片高度
            if (i == 0) {
                width = buffer.getWidth();// 图片宽度
            }
            height += offsetHeight; // 获取总高度
            imgRGB = new int[width * offsetHeight];// 从图片中读取RGB
            imgRGB = buffer.getRGB(0, 0, width, offsetHeight, imgRGB, 0, width);
            allImgRGB.add(imgRGB);
        }
        offsetHeight = 0; // 设置偏移高度为0
        // 生成新图片
        BufferedImage imageResult = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_BGR);
        for (int i = 0; i < picNum; i++) {
            imageResult.setRGB(0, offsetHeight, width, heightArray[i], allImgRGB.get(i),
                    0, width); // 写入流中
            offsetHeight += heightArray[i]; // 计算偏移高度
        }
        File outFile = new File(outPath);
        byte[] bytes = null;
        try (ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            ImageIO.write(imageResult, FileUtils.getExtensionName(outPath), out);// 写图片
            bytes = out.toByteArray();
        }
        try(FileOutputStream output = new FileOutputStream(outFile)) {
            output.write(bytes);
        }
    }
}
