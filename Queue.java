//java����1��ʵ�ֶ���
public class Queue {

	private Object [] queueElem;//����һ������
	private int top;
	
	 Queue() {//���캯�� Ĭ�϶��г���Ϊ10
		queueElem=new Object[10];
	}
	 Queue(int MaxSize) {//�вι��캯��
		queueElem =new Object[MaxSize];
		top=0;
	}
	
	public void clear() {//��top��ֵ ��ն���
		top=0;//Ϊʲô��top����0��ʱ��Ϊ��գ�
		//��Ϊ���ǵ��������queuqeElem[0]һֱΪ�գ� ���Ƕ���Ĳ���ʼ���Ǵ�queueElem[top++]��ʼ������
		//ֻҪ���ص��±�Ϊ0�ĵط�  ��Ϊ�տ���
	}
	
	public boolean isEmpty() {//ͨ��top�Ƿ�Ϊ0���ж��Ƿ�Ϊ��
		if(top==0)
			return true;
		else 
			return  false;
	}
	int length() {//����г���
	return top;
	}
	
	public void push(int elem) throws Exception{//�����	
		if (top==queueElem.length)
			throw new Exception("��������");
		else
			queueElem[top++]=elem;
	}
	
	public int peek()throws Exception {//������
		if(top==0)
			throw new Exception("����Ϊ��");
		
		return top--;
	}
	
	public void display() {//��ӡ��������е�Ԫ��
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
