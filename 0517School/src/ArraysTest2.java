
public class ArraysTest2 {
public static void main(String args[]) {
	int score[] = {88,97,53,62,92,68,82};
int max=score[0];
for(int i : score) //배열 요소의 값을 순차적으로 배정
{
	if(i>max)
		max = i;
}
	System.out.println("배열 요소의 최대값은 "+ max + "입니다.");
	
}
}
