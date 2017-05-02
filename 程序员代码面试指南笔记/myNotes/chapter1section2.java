package myNotes;

import java.util.Stack;

//��Ŀ����дһ���࣬������ջʵ�ֶ��У�֧�ֶ��еĻ�������(add��poll��peek)
/*ע��:
 * 1.��Ҫһ���Խ�stackPush�е�����ѹ�뵽stackPop��
 * 2.���stackPop��Ϊ�գ�stackPush������stackPop��ѹ������
 * */
public class chapter1section2 {

	// ��Ϸ���
	public static class TwoStacksQueue {
		public Stack<Integer> stackPush;// ��һ��ѹ��ջ
		public Stack<Integer> stackPop;// �ڶ���ѹ��ջ

		// ��������ջ
		public TwoStacksQueue() {
			stackPush = new Stack<Integer>();// ��һ��ѹ��ջ
			stackPop = new Stack<Integer>();// �ڶ���ѹ��ջ
		}

		// add����
		public void add(int pushInt) {
			stackPush.push(pushInt); // �Ƚ�pushIntѹ�뵽һ��stackPushջ��
		}

		// poll����
		public int poll() {
			if (stackPush.empty() && stackPop.empty()) {// �������ջȫ���ǿ�
				throw new RuntimeException("Queue is empty!");// ���׳��쳣
			} else if (stackPop.empty()) {// ��ֻ��stackPopջΪ��ʱ�������������
				while (!stackPush.empty()) {// ��stackPushջ��Ϊ��ʱ
					stackPop.push(stackPush.pop());// ��ʱ����һֱ��stackPushջ�е�ֵ������stackPop��
				}
			}
			return stackPop.pop();// ���stackPopջ�е�Ԫ�ص���
		}

		// peek����
		public int peek() {
			if (stackPush.empty() && stackPop.empty()) {// �������ջȫ���ǿ�
				throw new RuntimeException("Queue is empty!");// ���׳��쳣
			} else if (stackPop.empty()) {// ��ֻ��stackPopջΪ��ʱ�������������
				while (!stackPush.empty()) {// ��stackPushջ��Ϊ��ʱ
					stackPop.push(stackPush.pop());// ��ʱ����һֱ��stackPushջ�е�ֵ������stackPop��
				}
			}
			return stackPop.peek();// ���ز鿴stackPopջ������
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoStacksQueue test = new TwoStacksQueue();
		test.add(1);
		test.add(2);
		test.add(3);
		System.out.println(test.peek());
		System.out.println(test.poll());
		System.out.println(test.peek());
		System.out.println(test.poll());
		System.out.println(test.peek());
		System.out.println(test.poll());
	}

}
