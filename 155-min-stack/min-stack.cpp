class MinStack {
private: 
        int st[20000];
        int minStack[20000];
        int topInd;
public:
    MinStack() {
        topInd = -1;
    }

    void push(int val){
        topInd++;
        st[topInd] = val;
        if(topInd == 0){
            minStack[topInd] = val;
        }
        else{
            if(val < minStack[topInd -1])
                minStack[topInd] = val;
            else
                minStack[topInd] = minStack[topInd-1];
        }
    } 
    void pop() {
        if(topInd >= 0){
            topInd--;
        }
    }   
    int top() {
        if(topInd >= 0){
            return st[topInd];
            
        }
        return -1;
    }
    
    int getMin() {
        if(topInd >= 0){
            return minStack[topInd];
        }
        return -1;
    }
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(val);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */