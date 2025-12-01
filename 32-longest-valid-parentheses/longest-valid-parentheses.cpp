class Solution {
public:
    int longestValidParentheses(string s) {
        int size = s.length();
        int arr[100000];
        int top = -1;
        arr[++top] = -1;
        int max = 0;
        for(int i= 0; i<size; i++){
            if(s[i] == '('){
                arr[++top] = i;
            }
            else{
                top--;
                if(top == -1){
                    arr[++top] = i;
                }
                else{
                    int length = i-arr[top];
                    if(length>max){
                        max = length;
                    }
                }
            }
        }
        return max;
    
    }
};