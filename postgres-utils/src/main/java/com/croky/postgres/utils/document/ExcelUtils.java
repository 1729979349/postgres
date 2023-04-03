package com.croky.postgres.utils.document;
import com.croky.common.lang.Pagination;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 操作excel表格
 * @author Croky.Zheng
 * 2019年9月3日 上午1:17:48
 */
public final class ExcelUtils {
    private ExcelUtils() {
    }

    /**
     * 读取一个excel文件，将内容通过回调返回
     *
     * @param excelFilePath excel文件路径
     * @param sheetIndex    工作薄序号，默认为第0张（0表示1）
     * @param pageNo        当前页码
     * @param pageSize      每页的大小
     * @throws IOException
     */
    public static List<String[]> read(String excelFilePath, int sheetIndex, int pageNo, int pageSize)
            throws IOException {
        Workbook workbook = getWorkbook(excelFilePath);
        // 获得工作表数量
        int sheetCount = workbook.getNumberOfSheets();
        if (sheetIndex < 0 || sheetIndex >= sheetCount) {
            throw new java.lang.IllegalArgumentException("index must >=0 and < " + sheetCount);
        }
        Sheet sheet = workbook.getSheetAt(sheetIndex);
        int rowCount = sheet.getLastRowNum();
        Pagination pagination = Pagination.getPagination(pageNo, pageSize, rowCount);
        List<String[]> result = new ArrayList<String[]>(pagination.getPageSize());
        // 4、循环读取表格数据
        for (Row row : sheet) {
            int cellCount = row.getLastCellNum();//最后一列
            String[] contentArr = new String[cellCount];
            for (int cell = 0; cell < cellCount; cell++) {
                contentArr[cell] = getValue(row.getCell(cell));
            }
            result.add(contentArr);
        }
        workbook.close();
        return result;
    }

    /**
     * 读取一个excel文件，将内容通过回调返回
     *
     * @param excelFilePath excel文件路径
     * @param sheetName    工作薄名称
     * @param pageNo        当前页码
     * @param pageSize      每页的大小
     * @throws IOException
     */
    public static List<String[]> read(String excelFilePath, String sheetName, int pageNo, int pageSize)
            throws IOException {
        Workbook workbook = getWorkbook(excelFilePath);
        Sheet sheet = workbook.getSheet(sheetName);
        if (null == sheet) {
            throw new java.lang.IllegalArgumentException("not exist sheet sheetName=" + sheetName);
        }
        int rowCount = sheet.getLastRowNum();
        Pagination pagination = Pagination.getPagination(pageNo, pageSize, rowCount);
        List<String[]> result = new ArrayList<String[]>(pagination.getPageSize());
        // 4、循环读取表格数据
        for (Row row : sheet) {
            int cellCount = row.getLastCellNum();//最后一列
            String[] contentArr = new String[cellCount];
            for (int cell = 0; cell < cellCount; cell++) {
                contentArr[cell] = getValue(row.getCell(cell));
            }
            result.add(contentArr);
        }
        workbook.close();
        return result;
    }

	/**
	 * 将excel文件中的所有内容返回
	 * @param excelFilePath	excel路径
	 * @return
	 * @throws IOException
	 */
	public static List<String[]> readAll(String excelFilePath) throws IOException {
		Workbook workbook = getWorkbook(excelFilePath);
		List<String[]> result = new ArrayList<String[]>();
		for (Sheet sheet : workbook) {
			//int rowCount = sheet.getLastRowNum();
			// 4、循环读取表格数据
			for (Row row : sheet) {
				int cellCount = row.getLastCellNum();//最后一列
				String[] contentArr = new String[cellCount];
				for (int cell = 0; cell < cellCount; cell++) {
					contentArr[cell] = getValue(row.getCell(cell));
				}
				result.add(contentArr);
			}
		}
		workbook.close();
		return result;
	}

    /**
     * 将内容写入excel
     * @param excelFilePath     excel文件路径
     * @param sheetName         工作薄名称
     * @param contents          需要写入的内容
     * @throws IOException
     */
	public static void write(String excelFilePath,String sheetName,List<String[]> contents) throws IOException {
        Workbook workbook = null;
        Sheet sheet = null;
        try {
            workbook = getWorkbook(excelFilePath);
            sheet = workbook.getSheet(sheetName);
            if(null == sheet) {
                sheet = workbook.createSheet(sheetName);
            }
        } catch (IOException e) {
            workbook = createWorbook(new String[]{sheetName},excelFilePath.toLowerCase().endsWith("xls") ? true : false);
            sheet = workbook.getSheet(sheetName);
        }
        write(sheet,contents);
        workbook.write(new FileOutputStream(excelFilePath));
    }

    private static void write(Sheet sheet,List<String[]> contents) {
	    if (null == sheet || null == contents) {
	        return;
        }
        for(int i=0; i<contents.size(); i++) {
            Row row = sheet.createRow(i);
            for (int j = 0; j < contents.get(i).length; j++) {
                Cell cell = row.createCell(j);
                //headRowCell.setCellStyle(getColumnTopStyle(workbook));
                cell.setCellValue(contents.get(i)[j]);
            }
        }
    }

    private static String getValue(Cell cell){
	    CellType cellType = cell.getCellType();
        if(CellType.NUMERIC.equals(cellType)){
            return String.valueOf( cell.getNumericCellValue());
        } else if (CellType.STRING.equals(cellType)){
            return String.valueOf( cell.getStringCellValue());
        } else if (CellType.BOOLEAN.equals(cellType)){
            if (cell.getBooleanCellValue()) {
                return "true";
            } else {
                return "false";
            }
        } else if (CellType.FORMULA.equals(cellType)){
            return String.valueOf(cell.getCellFormula());
            //return cell.getArrayFormulaRange().formatAsString();
        } else if (CellType.FORMULA.equals(cellType)){
            return "";
        } else if (CellType._NONE.equals(cellType)) {
            return null;
        } else {
            return String.valueOf( cell.getStringCellValue());
        }
    }

    private static Workbook createWorbook(String[] titles, boolean isXls) {
        // 2、获取Excel工作簿对象
        Workbook workbook = null;
        if (isXls) {
            workbook = new HSSFWorkbook();
        } else {
            //xlsx
            workbook = new XSSFWorkbook();
            //在内存当中保持 100 行 , 超过的数据放到硬盘中在内存当中保持 100 行 , 超过的数据放到硬盘中
            //workbook = new SXSSFWorkbook(100);
        }
        if (null != titles) {
        	for (String title : titles) {
				workbook.createSheet(title);
			}
		} else {
			workbook.createSheet("sheet1");
		}
        return workbook;
    }

    private static Workbook getWorkbook(String excelFilePath) throws IOException {
        Workbook workbook = null;
        // 1、获取文件输入流
        try (InputStream inputStream = new FileInputStream(excelFilePath)) {
            // 2、获取Excel工作簿对象
            if (excelFilePath.toLowerCase().endsWith("xls")) {
                workbook = new HSSFWorkbook(inputStream);
            } else {
                workbook = new XSSFWorkbook(inputStream);
            }
        }
        return workbook;
    }

    private static Sheet getSheet(Workbook workbook, int idx) {
        int sheetCount = workbook.getNumberOfSheets();
        if (idx < 0 || idx >= sheetCount) {
            return null;
        }
        return workbook.getSheetAt(idx);
    }

    /*
     * 列头单元格样式
     */
    private static HSSFCellStyle getColumnTopStyle(HSSFWorkbook workbook) {
        // 设置字体
        HSSFFont font = workbook.createFont();
        //设置字体大小
        font.setFontHeightInPoints((short) 11);
        //字体加粗
        font.setBold(true);
        //设置字体名字
        //font.setFontName("Courier New");
        //设置样式;
        HSSFCellStyle style = workbook.createCellStyle();
        //设置底边框;
        //在样式用应用设置的字体;
        style.setFont(font);
        //设置自动换行;
        style.setWrapText(false);
        //设置水平对齐的样式为居中对齐;
        style.setAlignment(HorizontalAlignment.CENTER);
        //设置垂直对齐的样式为居中对齐;
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        return style;
    }

    /*
     * 列数据信息单元格样式
     */
    private static HSSFCellStyle getStyle(HSSFWorkbook workbook) {
        // 设置字体
        HSSFFont font = workbook.createFont();
        //设置字体大小
        font.setFontHeightInPoints((short) 11);
        //字体加粗
        font.setBold(false);
        //设置字体名字
        //font.setFontName("Courier New");
        //设置样式;
        HSSFCellStyle style = workbook.createCellStyle();
        //设置底边框;
        //在样式用应用设置的字体;
        style.setFont(font);
        //设置自动换行;
        style.setWrapText(false);
        //设置水平对齐的样式为居中对齐;
        style.setAlignment(HorizontalAlignment.LEFT);
        //设置垂直对齐的样式为居中对齐;
        style.setVerticalAlignment(VerticalAlignment.BOTTOM);
        return style;
    }

    /**
     * 判断单元格是否是合并的单格，如果是，获取其合并的行数。
     */
    private static int getMergerCellRegionRow(HSSFSheet sheet, int cellRow, int cellCol) throws Throwable {
        int retVal = 0;
        int sheetMergerCount = sheet.getNumMergedRegions();
        for (int i = 0; i < sheetMergerCount; i++) {
            CellRangeAddress cra = sheet.getMergedRegion(i);
            int firstRow = cra.getFirstRow(); // 合并单元格CELL起始行
            int firstCol = cra.getFirstColumn(); // 合并单元格CELL起始列
            int lastRow = cra.getLastRow(); // 合并单元格CELL结束行
            int lastCol = cra.getLastColumn(); // 合并单元格CELL结束列
            if (cellRow >= firstRow && cellRow <= lastRow) { // 判断该单元格是否是在合并单元格中
                if (cellCol >= firstCol && cellCol <= lastCol) {
                    retVal = lastRow - firstRow + 1; // 得到合并的行数
                    break;
                }
            }
        }
        return retVal;
    }
}
