#include <iostream>

using namespace std;

int main()
{

    cout << "enter a sentence" << endl;

    string sentence;
    getline(cin, sentence);

    int vowelCnt = 0;
    for(int i = 0; i < sentence.length(); i++){
        if(sentence[i] == 'a' || sentence[i] == 'e'|| sentence[i] == 'i' || sentence[i] == 'o' || sentence[i] == 'u'){
            vowelCnt += 1;
        }
        else if(sentence[i] == 'A' || sentence[i] == 'E'|| sentence[i] == 'I' || sentence[i] == 'O' || sentence[i] == 'U'){
            vowelCnt += 1;
        }

    }
    cout << vowelCnt << endl;
    return 0;
}
