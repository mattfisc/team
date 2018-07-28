#include <iostream>
#include "Race.h"
#include "Human.h"
#include <string>
#include "Enemy.h"
#include "Sword.h"
#include "Fight.h"
using namespace std;


Enemy::Enemy()
{
    cout << "An enemy appears!!!" << endl;
}

Enemy::~Enemy()
{
    cout << "The enemy is dead!" << endl;
}
