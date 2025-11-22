class Solution {
public:
    bool isValid(string s) {
        int size = s.length();
        char stack[size];
        int top = -1;
        for(int i = 0; i< size; i++){
            char ch = s[i];
            if(ch == '(' || ch == '{' || ch == '['){
                top++;
                stack[top] = ch;
            }
            else{
                if(top == -1){
                    return false;
                }
                char topCh = stack[top];
                top--;

                if((ch == ')' && topCh != '(') || (ch == '}' && topCh != '{') ||
                (ch == ']' && topCh != '[')){
                    return false;
                }
            }
        }
        return top == -1;
    }
};