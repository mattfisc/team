#include <iostream>

using namespace std;

// piglatin

int main()
{
    string sentence;
    string pigWord;
    string word;

    cout << "Enter a sentence to translate into piglatin." << endl;

    int lengthOfWord;



    while(cin >> word){
        char temp = word[0];
        pigWord = word + "-" + temp + "ay";

        lengthOfWord = pigWord.length()-1;
        pigWord.copy(sentence,1);
        cout << pigWord << endl;

    }
        cout << sentence << endl;



    return 0;
}
