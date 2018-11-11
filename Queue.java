//java语言1简单实现队列
public class Queue {

	private Object [] queueElem;//声明一个数组
	private int top;
	
	 Queue() {//构造函数 默认队列长度为10
		queueElem=new Object[10];
	}
	 Queue(int MaxSize) {//有参构造函数
		queueElem =new Object[MaxSize];
		top=0;
	}
	
	public void clear() {//对top赋值 清空队列
		top=0;//为什么当top等于0的时候为清空？
		//因为我们的数组里的queuqeElem[0]一直为空！ 我们对其的操作始终是从queueElem[top++]开始操作的
		//只要返回到下标为0的地方  就为空咯。
	}
	
	public boolean isEmpty() {//通过top是否为0来判断是否为空
		if(top==0)
			return true;
		else 
			return  false;
	}
	int length() {//测队列长度
	return top;
	}
	
	public void push(int elem) throws Exception{//入队列	
		if (top==queueElem.length)
			throw new Exception("队列满了");
		else
			queueElem[top++]=elem;
	}
	
	public int peek()throws Exception {//出队列
		if(top==0)
			throw new Exception("队列为空");
		
		return top--;
	}
	
	public void display() {//打印输出队列中的元素
		for(int i=0;i<length();i++) {
			System.out.println(queueElem[i]);
		}
	}
		
	public static void main(String[] args) throws Exception {
		
		Queue queue =new Queue(20){};
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.display();
		queue.peek();
		queue.display();
		System.out.println(queue.isEmpty());
		queue.clear();
		System.out.println(queue.isEmpty());
		
	}

}
