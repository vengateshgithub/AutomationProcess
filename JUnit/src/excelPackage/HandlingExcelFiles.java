package excelPackage;

public class HandlingExcelFiles {

	public static void main(String args[]) {

		Xls_Reader excel = new Xls_Reader("G:\\HandlingExcel\\LoginDetailsInfo.xlsx");

		System.out.println("Row count is: " + excel.getRowCount("Sheet1"));
		System.out.println(("Column count is :" + excel.getColumnCount("Sheet1")));
		
		

		for (int i = 0; i <= excel.getRowCount("Sheet1"); i++) {

			for (int j = 0; j <= excel.getColumnCount("Sheet1"); j++) {

				System.out.print(excel.getCellData("sheet1", j, i) + " ");

			}
			System.out.println();

		}

	}

}
