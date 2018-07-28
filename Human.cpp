#include <iostream>
#include "Race.h"
#include "Human.h"
#include <string>
#include "Enemy.h"
#include "Sword.h"
#include "Fight.h"
using namespace std;

Human::Human()
{
    cout << "I am Human!" << endl;
    health = 10;
    cout << "Your health is " << health << endl;
    strength = 10;
    cout << "Your strength is " << strength << endl;
};

Human::~Human()
{
    cout << "You were killed by an enemy!" << endl;
};

void Human::setName(){
    string x;
    getline(cin,x);
    name = x;
};

string Human::getName(){
    return name;
};

