package myNotes;

import java.util.Stack;

/*��Ŀ:һ��ջһ��ѹ��1��2��3��4��5����ô��ջ����ջ�׷ֱ�Ϊ5��4��3��2��1��
 * �����ջת�ú󣬴�ջ����ջ��Ϊ1��2��3��4��5��Ҳ����ʵ��ջ��Ԫ�ص�����
 * ����ֻ���õݹ麯����ʵ�֣��������������ݽṹ
 *****************************************************/
public class chapter1section3 {

	// ��ջstack��ջ��Ԫ�ط��ز��Ƴ�(ջ��Ԫ��<ջ��>1��2��3<ջ��>��Ϊ2��3<ջ��>)
	public static int getAndRemoveLastElement(Stack<Integer> stack) {
		int result = stack.pop(); // ��stackջ���Ƴ�������Ԫ�ش��뵽result��
		if (stack.isEmpty()) {
			return result;
		} else {
			int last = getAndRemoveLastElement(stack);// �ݹ����getAndRemoveLastElement������stack��ջ��Ԫ�ش浽last��
			stack.push(result);// ���ݣ�������Ԫ������ѹ��ջ
			return last;// ��һ��ʱ������ջ��Ԫ��1
		}
	}

	 /**
     * ����һ��ջ:ÿ��ݹ�ȡ��ջ�׵�Ԫ�ز����浽�����У�ֱ��ջ�գ�
     * Ȼ������ÿ�����ѹ��ջ�����ʵ��ԭջ���ݵ�����
     ***/
	public static void reverse(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		} else {
			int i = getAndRemoveLastElement(stack);// �õ�ջ��Ԫ��,���η���1��2��3
			reverse(stack);//�ݹ飬����i����Ϊ1,2,3
			stack.push(i);// ���ݣ�����ѹ��3,2,1
		}
	}

	public static void main(String[] args) {
		Stack<Integer> test = new Stack<Integer>();// Stack�̳�Vector��Ĭ��������10
		test.push(1);
		test.push(2);
		test.push(3);
		test.push(4);
		test.push(5);
		reverse(test);
		while (!test.isEmpty()) {
			System.out.println(test.pop());
		}
	}

}
