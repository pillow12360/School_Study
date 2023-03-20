class AddSub {
	int add, sub;
	public String add(int x, int y) {
		add = x+y;
		return "두 수의 합은 " + add;
	}
	public String sub(int x, int y) {
		sub = x-y;
		return "두 수의 차는 " + sub;
	}
}