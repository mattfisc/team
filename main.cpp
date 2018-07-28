#include <iostream>
#include "Race.h"
#include "Human.h"
#include <string>
#include "Enemy.h"
#include "Sword.h"
#include "Fight.h"
using namespace std;

int main()
{
    Human hero;
    cout << "Enter a name for your hero..." << endl;
    hero.setName();

    cout << "Your name is " << hero.getName() << endl;

    Enemy monster;


    return 0;
}
