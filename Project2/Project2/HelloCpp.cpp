//HelloCpp.cpp : �ܼ� ���� ���α׷��� ���� �������� �����մϴ�.
//


//#include<iostream>
//int main(int argc, char* argv[])//���� �Լ��� ���� (���� = �ڸŰ�����)
//{
//	std::cout << "Hello , World" << std::endl;
//	return 0;
//}


//std = ���ӽ����̽� '�Ҽ�'�� ����
//:: = ���� ���� ������ , ��ũ�� ���� ������ (Scope resolution operator)
//std::cout = std �� �ҼӵǾ��ִ� cout ��ü
//<< = (iostream ������� �Ҽ�) ������ , �����϶�
//endl = end of line ���ڿ��� ���� �ǹ� = ���� �Ѱܶ�

#include <iostream>
int main(int argc, char* argv[])
{
	std::cout << 10 << std::endl;
	std::cout << 10U << std::endl;
	std::cout << 10.5F << std::endl;
	std::cout << 10.5 << std::endl;
	std::cout << 3 + 4 << std::endl;
	return 0;
}

//U = unsigned ��ȣ���� ������
//F = �Ǽ���
//L = long
//<<�� �ǹ�  : std::cout ���� ����