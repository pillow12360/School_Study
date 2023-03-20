#ifndef __ARRAY_LIST_H__
#define __ARRAT_LIST_H__
#include "Point.h"

#define TRUE 1
#define FALSE 0

#define LIST_LEN 100

// typedef int LData; // 선언 변경
typedef Point* LData;

typedef struct __ArrayList
{
	LData arr[LIST_LEN];
int numOfData;
int curPosition;

}ArrayList;

typedef ArrayList List;

void ListInt(List* plist);
void LInsert(List* plist, LData data);

int Lfirst(List* plist, LData pdata);
int LNext(List* plist, LData pdata);

LData LRemove(List* plist);
int LCount(List* plist);
#endif
