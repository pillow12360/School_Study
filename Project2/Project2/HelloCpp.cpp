//HelloCpp.cpp : 콘솔 응용 프로그램에 대한 진입점을 정의합니다.
//


//#include<iostream>
//int main(int argc, char* argv[])//메인 함수와 인자 (인자 = ★매개변수)
//{
//	std::cout << "Hello , World" << std::endl;
//	return 0;
//}


//std = 네임스페이스 '소속'의 개념
//:: = 범위 지정 연산자 , 소크프 설정 연산자 (Scope resolution operator)
//std::cout = std 에 소속되어있는 cout 객체
//<< = (iostream 헤더파일 소속) 연산자 , 전달하라
//endl = end of line 문자열의 끝을 의미 = 줄을 넘겨라

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

//U = unsigned 부호없는 정수형
//F = 실수형
//L = long
//<<의 의미  : std::cout 으로 보냄