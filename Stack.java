public class Stack {

	private int top;
	private Object[] StackElem;//object类型的数组可以保证任意类型的数据进入栈
	Stack(){//默认构造函数
		StackElem=new Object[10];
		top=0;
	}
	Stack(int maxSize) {//有参构造
		StackElem=new Object[maxSize];
		top=0;
	}
	
	public void clear() {//设top=0 伪清空
		top=0;
	}
	
	public boolean isEmpty() {//判断是否为空
		if (top==0) {
			return true;
		}
		else return false;
	}
	public int length() {//返回长度
			return top;
	}
	
	public void push(Object x)throws Exception{
		
		if(top==StackElem.length) {
			throw new Exception("栈满楼");
		}
			StackElem[top++]=x;
	}
	
	public Object pop()throws Exception{
		if(top==0){throw new Exception("栈为空");}
		
		else 
			return  StackElem[--top]; 
	}
	
	public void display() {
		for(int i=length()-1;i>=0;i--) {
		System.out.println(StackElem[i]);
		}
	}

	public static void main(String[] args)throws Exception {
		Stack stack=new Stack(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push("123");
		stack.display();
	}

}
