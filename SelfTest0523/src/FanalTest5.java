
public class FanalTest5 {
public static void main(String args[]) {
String slist[]= {"서울","부산","인천","대구","대전"};
System.out.print("원래의 배열 : ");
for(String s : slist)
	System.out.print(s+" ");
System.out.println();
for(int i = 0; i< slist.length/2; i++)
{
	String temp = slist[i];
	slist[i]= slist[slist.length-i-1];
	slist[slist.length-i-1]= temp;
}
System.out.print("역순으로 재배치된 배열 : ");
for(String s : slist)
	System.out.print(s+" ");
}
}
