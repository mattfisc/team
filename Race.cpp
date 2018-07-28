#include <iostream>
#include "Race.h"
#include "Human.h"
#include <string>
#include "Enemy.h"
#include "Sword.h"
#include "Fight.h"
using namespace std;

Race::Race()
{
    cout << "You are alive!" << endl;
};

Race::~Race()
{
    cout << "You are dead!" << endl;
};

void Race::attack(){
    cout << "You attack the enemy and deal " << attackPower << " damage!" << endl;
};

int Race::getHealth(){
    return health;
};

int Race::getHealthPoints(){
    return healthPoints;
};

int Race::getStrength(){
    return strength;
};
