public class Stack {

	private int top;
	private Object[] StackElem;//object���͵�������Ա�֤�������͵����ݽ���ջ
	Stack(){//Ĭ�Ϲ��캯��
		StackElem=new Object[10];
		top=0;
	}
	Stack(int maxSize) {//�вι���
		StackElem=new Object[maxSize];
		top=0;
	}
	
	public void clear() {//��top=0 α���
		top=0;
	}
	
	public boolean isEmpty() {//�ж��Ƿ�Ϊ��
		if (top==0) {
			return true;
		}
		else return false;
	}
	public int length() {//���س���
			return top;
	}
	
	public void push(Object x)throws Exception{
		
		if(top==StackElem.length) {
			throw new Exception("ջ��¥");
		}
			StackElem[top++]=x;
	}
	
	public Object pop()throws Exception{
		if(top==0){throw new Exception("ջΪ��");}
		
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
