#ifndef __POINT_H__
#define __POINT_H__

typedef struct _point
{
	int xpos;
	int ypos;
}Point;

void ShowPointPos(Point* ppos, int xpos, int ypos); // Point 변수의 xpos, ypos 값 설정

void ShowPointPos(Point* ppos); // Point 변수의 xpos, ypos 정보 출력

int PointComp(Point* pos1, Point* pos2); // 두 Point 변수의 비교

#endif