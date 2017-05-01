package myNotes;

import java.util.Stack;

import chapter_1_stackandqueue.Problem_01_GetMinStack.MyStack1;

//��Ŀ��ʵ��һ�������ջ����ʵ��ջ�Ļ������ܵĻ����ϣ���ʵ�ַ���ջ����СԪ�صĲ���

public class chapter1section1 {
	//����һ
	public static class MyStack1{
		private Stack<Integer> stackData;//һ��ջ�������浱ǰռ�е�Ԫ�أ��书�ܺ�һ��������ջû���������ջ��ΪstackData
		private Stack<Integer> stackMin;//��һ��ջ��������ÿһ������Сֵ�����ջ��ΪstackMin
		//��������ջ
		public MyStack1() {
			this.stackData = new Stack<Integer>();//����һ��stackDataջ
			this.stackMin = new Stack<Integer>();//����һ��stackMinջ
		}
		
		//��ջ����
		public void push(int newNum){ //�������ݵ�ǰ����ΪnewNum
			//�ж�stackMin�Ƿ�Ϊ��
			if(this.stackMin.isEmpty()){  //���stackMinΪ��
				this.stackMin.push(newNum);//��newNumѹ��stackMinջ��
			}else if(newNum<=this.getMin()){//����stackMin��Ϊ�գ����ж�newNum�Ƿ�С��stackMin��ջ��Ԫ��
				this.stackMin.push(newNum);//���newNumС��stackMin��ջ��Ԫ�أ���newNumѹ��ջ�У���֮��ѹ��
			}
			this.stackData.push(newNum);//���ܽ����Σ����Ƚ�newNum��ѹ��stackData��
		}
		
		//��ջ����
		public int pop(){         //int����Ҫ����ֵ
			//�ж�stackData�Ƿ�Ϊ��
			if(this.stackData.isEmpty()){//���stackDataΪ��
				throw new RuntimeException("your stack is empty.");//���׳�Ϊ���쳣������ӡ�쳣��Ϣ
			}
			int value=this.stackData.pop();//��stackData��ջ��Ԫ�ص�������Ϊvalue
			//�ж�value��stackMin��ջ��Ԫ�صĴ�С
			if(value==this.getMin()){   //������
				this.stackMin.pop();//stackMin����ջ��Ԫ��
			}
			return value;
		}
		

		//ȡ��stackMin��ջ��Ԫ�أ�Ҳ���ǵ�ǰ����СԪ��
		public int getMin(){    
			if(this.stackMin.isEmpty()){  //���Ϊ��
				throw new RuntimeException("your stack is empty.");//���׳�Ϊ���쳣������ӡ�쳣��Ϣ
			}
			return this.stackMin.peek();//���ز鿴ջ���������ջ�������Ϊ��С
		}

	}

	//������
	public static class MyStack2{
		private Stack<Integer> stackData;//һ��ջ�������浱ǰռ�е�Ԫ�أ��书�ܺ�һ��������ջû���������ջ��ΪstackData
		private Stack<Integer> stackMin;//��һ��ջ��������ÿһ������Сֵ�����ջ��ΪstackMin

		//��������ջ
		public MyStack2() {
			this.stackData = new Stack<Integer>();//����һ��stackDataջ
			this.stackMin = new Stack<Integer>();//����һ��stackMinջ
		}
		
		//��ջ����
		public void push(int newNum){ //�������ݵ�ǰ����ΪnewNum
			//�ж�stackMin�Ƿ�Ϊ��
			if(this.stackMin.isEmpty()){  //���stackMinΪ��
				this.stackMin.push(newNum);//��newNumѹ��stackMinջ��
			}else if(newNum<=this.getMin()){//����stackMin��Ϊ�գ����ж�newNum�Ƿ�С��stackMin��ջ��Ԫ��
				this.stackMin.push(newNum);//���newNumС��stackMin��ջ��Ԫ�أ���newNumѹ��ջ�У���֮��ѹ��
			}else{  //���newNum����stackMin��ջ��Ԫ��
				int newMin=this.stackMin.peek();//��stackMinջ��Ԫ�ش�ŵ�newMin��
				this.stackMin.push(newMin);//����stackMinջ��Ԫ������ѹ��ջ��Ԫ��
			}
			this.stackData.push(newNum);//���ܽ����Σ����Ƚ�newNum��ѹ��stackData��
		}
		
		//��ջ����
		public int pop(){         //int����Ҫ����ֵ
			//�ж�stackData�Ƿ�Ϊ��
			if(this.stackData.isEmpty()){//���stackDataΪ��
				throw new RuntimeException("your stack is empty.");//���׳�Ϊ���쳣������ӡ�쳣��Ϣ
			}
			int value=this.stackData.pop();//��stackData��ջ��Ԫ�ص�������Ϊvalue
			this.stackMin.pop();//stackMin����ջ��Ԫ��
			return value;
		}
		
		//ȡ��stackMin��ջ��Ԫ�أ�Ҳ���ǵ�ǰ����СԪ��
		public int getMin(){    
			if(this.stackMin.isEmpty()){  //���Ϊ��
				throw new RuntimeException("your stack is empty.");//���׳�Ϊ���쳣������ӡ�쳣��Ϣ
			}
			return this.stackMin.peek();//���ز鿴ջ���������ջ�������Ϊ��С
		}
	}
	
	public static void main(String[] args) {
		MyStack1 stack1 = new MyStack1();
		stack1.push(3);
		System.out.println(stack1.getMin());
		stack1.push(4);
		System.out.println(stack1.getMin());
		stack1.push(1);
		System.out.println(stack1.getMin());
		System.out.println(stack1.pop());
		System.out.println(stack1.getMin());

		System.out.println("=============");

		MyStack1 stack2 = new MyStack1();
		stack2.push(3);
		System.out.println(stack2.getMin());
		stack2.push(4);
		System.out.println(stack2.getMin());
		stack2.push(1);
		System.out.println(stack2.getMin());
		System.out.println(stack2.pop());
		System.out.println(stack2.getMin());
	}
	
}

