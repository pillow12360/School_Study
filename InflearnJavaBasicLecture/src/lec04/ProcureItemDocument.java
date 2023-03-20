package lec04;
/**
 * 구매품목문서
 * @author ehdcks
 *
 */
public class ProcureItemDocument {

	public int id;
	public String procureItemName;
	public String procureItemUnitCd;
	public String procureItemUnitName;
	public int procureItemQty;
	public int procureItemPrice;
	//객체 , 전역변수 선언
	public int addProcureItemQtyPrice() {
		int result = 0;
		result = procureItemQty * procureItemPrice;
		return result;
	}
	
	public void showEachVariableValue() {
		System.out.println("id ::: "+id);
		System.out.println("procureItemName ::: "+ procureItemName);
		System.out.println("procureItemUnitName ::: " +procureItemUnitCd );
		System.out.println("procureItemUnitName ::: "+ procureItemUnitName);
		System.out.println("procureItemQty ::: " +procureItemQty);
		System.out.println("procureItemPrice ::: "+procureItemPrice);
	}
	public String concatStringValues() {
		String returnValue = "";
		returnValue = "안녕하세요"+"구매문서품목 클래스 입니다."; 
		return returnValue;
	}
	
}
