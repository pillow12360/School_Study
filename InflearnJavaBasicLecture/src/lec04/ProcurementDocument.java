package lec04;

public class ProcurementDocument {
	public int procureRequestDocumentQty;
	public int orderRequestDocumentQty;
	public int orderDocumentQty;
	public int contractDocumentQty;
	public int estimateDocumentQty;


	public int totalDocumentQtyDailyMake() {
	
	int totalDocument = procureRequestDocumentQty + orderDocumentQty + orderRequestDocumentQty
			+ contractDocumentQty + estimateDocumentQty;
	
	return totalDocument;
}
	
	public int staticValueCalculateDailyDocument(){
		
		int totalDocuCnt = 0;
		
		totalDocuCnt = 10 + 5 + 1 + 5;
		
		return totalDocuCnt;
		
		
	}
}
