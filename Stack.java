
class StackOperations {
	int max_size=5;
	int arr[] = new int[max_size];
	int top=-1;
	
	public boolean full() {
		return top== max_size-1;
	}
	int push(int a) {
		if(full()) {
			System.out.println("Stack Overflow");
			return 0;
		}
		arr[++top]=a;
		//System.out.println("Element added="+arr[top]);
		return arr[top];
		
	}
	
	int pop() {
		if(top<0) {
			System.out.println("Stack Underflow");
			return 0;
		}else {
			int b = arr[top--];
			System.out.println("Element removed:"+b);
			return b;
		}
	}
	
	void traverse() {
		if(top==-1) {
			System.out.println("Stack Empty");
		}else {
			for(int i=0;i<=top;i++) {
				System.out.println(arr[i]);
			}
		}
	}
	
	
}
	
class Stack{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackOperations so = new StackOperations();
		so.push(1);
		so.push(2);
		so.push(3);
		so.push(4);
		
		so.push(5);
		so.push(6);
		so.pop();
		so.traverse();
		
		

	}

}
