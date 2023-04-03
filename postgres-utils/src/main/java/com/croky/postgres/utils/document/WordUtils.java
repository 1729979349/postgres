package com.croky.postgres.utils.document;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.Range;
import org.apache.poi.ooxml.POIXMLDocument;
import org.apache.poi.ooxml.extractor.POIXMLTextExtractor;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.*;

/**
 * 操作word文档
 * @author Croky
 * @date 2021-03-14 20:57
 */
public final class WordUtils {
    private WordUtils(){}

    /**
     * 从一个word文件中读取内容，读取的内容不能直接打印
     * @param filePath  文件路径
     * @return
     */
    public static String read(String filePath) throws IOException {
        String buffer = "";
            if (filePath.toLowerCase().endsWith(".doc")) {
                try(FileInputStream fis = new FileInputStream(filePath)) {
                    HWPFDocument doc = new HWPFDocument(fis);
                    //buffer = doc.getDocumentText();
                    //StringBuilder text = doc.getText();
                    Range rang = doc.getRange();
                    if (null != rang) {
                        buffer = rang.text();
                    }
                    doc.close();
                }
            } else if (filePath.toLowerCase().endsWith("docx")) {
                OPCPackage opcPackage = POIXMLDocument.openPackage(filePath);
                POIXMLTextExtractor extractor = new XWPFWordExtractor(opcPackage);
                buffer = extractor.getText();
                extractor.close();
                opcPackage.close();
            } else {
                throw new IllegalArgumentException(filePath + " must be a word file. .doc or docx");
            }
        return buffer;
    }

    /**
     * 将文件内容写入到word文件
     * @param filePath      word文件路径
     * @param content       需要写入的内容，默认只有一个短路，20号字，白底黑字
     * @throws IOException
     */
    public static void write(String filePath,String content) throws IOException {
        //创建文档对象
        XWPFDocument docx = new XWPFDocument();
        //创建段落对象
        XWPFParagraph paragraph = docx.createParagraph();
        //设置段落居中
        paragraph.setAlignment(ParagraphAlignment.CENTER);
        //创建文本对象（今天的主角：XWPFRun）
        XWPFRun run = paragraph.createRun();
        //默认：宋体（wps）/等线（office2016） 5号 两端对齐 单倍间距
        run.setText(content);
//        run.setBold(false);//加粗
//        run.setCapitalized(false);//我也不知道这个属性做啥的
//        run.setCharacterSpacing(5);//这个属性报错
        run.setColor("000000");//设置颜色--十六进制
//        run.setDoubleStrikethrough(false);//双删除线
//        run.setEmbossed(false);//浮雕字体----效果和印记（悬浮阴影）类似
        run.setFontFamily("宋体");//字体
//        run.setFontFamily("华文新魏", XWPFRun.FontCharRange.cs);//字体，范围----效果不详
        run.setFontSize(20);//字体大小
//        run.setImprinted(false);//印迹（悬浮阴影）---效果和浮雕类似
//        run.setItalic(false);//斜体（字体倾斜）
//        run.setKerning(1);//字距调整----这个好像没有效果
//        run.setShadow(true);//阴影---稍微有点效果（阴影不明显）
//        run.setSmallCaps(true);//小型股------效果不清楚
//        run.setStrikeThrough(false);//单删除线（新的替换Strike）
//        run.setSubscript(VerticalAlign.SUBSCRIPT);//下标(吧当前这个run变成下标)---枚举
//        run.setTextPosition(20);//设置两行之间的行间距
//        run.setUnderline(UnderlinePatterns.DASH_LONG);//各种类型的下划线（枚举）
//        run.addBreak();//类似换行的操作（html的  br标签）
//        run.addTab();//tab键
//        run.addCarriageReturn();//回车键注意：addTab()和addCarriageReturn() 对setText()的使用先后顺序有关：比如先执行addTab,再写Text这是对当前这个Text的Table，反之是对下一个run的Text的Tab效果
        try (FileOutputStream fout = new FileOutputStream(filePath)) {
            docx.write(fout);
            docx.close();
        }
    }
}
