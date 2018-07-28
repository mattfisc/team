#include <iostream>
#include "Race.h"
#include "Human.h"
#include <string>
#include "Enemy.h"
#include "Sword.h"
#include "Fight.h"
using namespace std;

Fight::Fight()
{

}

void Fight::fight(){
    char ch = 'y';
    while(ch == 'Y' || ch == 'y'){
        cout << "Do you wish you attack or run.  Press 'Y' to attack or 'N' to run" << endl;
        cin >> ch;
        cout << "You attack and deal " << attackPower << " damage!";
    }
};
