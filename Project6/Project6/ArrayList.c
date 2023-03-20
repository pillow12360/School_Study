#include<stdio.h>
#include "ArrayList.h"

void ListInit(List* plist) // 리스트 초기화
{
	(plist->numOfData) = 0; //현재 데이터의 갯수 0
	(plist->curPosition) = -1; //현재 아무 위치도 가르키지 않음
}

void LInsert(List* plist, LData data)
{
	if (plist->numOfData >= LIST_LEN) //더이상 저장할 공간이 없다면
	{
		puts("저장이 불가능 합니다."); //출력
		return 0;
	}
	plist->arr[plist->numOfData] = data;
	(plist->numOfData)++;
}

int LFirst(List* plist, LData* pdata)
{
	if (plist->numOfData = 0) //저장된 데이터가 하나도 없으면
		return FALSE;
	
	(plist->curPosition) = 0; //현재 참조위치 0으로 초기화
	*pdata = plist->arr[0]; //PDATA의 참조 위치를 arr[0]으로 설정 후 참조
	return TRUE;
}

int LNext(List* plist, LData* pdata)
{
	if (plist->curPosition >= (plist->numOfData) - 1) //더이상 참조할 데이터가 없다면
		return FALSE;

	(plist->curPosition)++;
	*pdata = plist->arr[plist->curPosition];
	return TRUE;
}

LData LRemove(List* plist)
{
	int rpos = plist->curPosition;
	int num = plist->numOfData;
	int i;
	LData rdata = plist->arr[rpos]; //삭제할 데이터 임시 저장

	for (i = rpos; i < num - 1; i++)
		plist->arr[i] = plist->arr[i + 1]; // 삭제를 위한 데이터의 이동을 진행하는 반복문

	(plist->numOfData)--;
	(plist->curPosition)--;
	return rdata; 
}