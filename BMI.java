import java.util.Scanner;
public class BMI {
	public static void main(String[] args) {
		System.out.println("�������������(��)��");
        Scanner scanner=new Scanner(System.in);
        float height=scanner.nextFloat();
        System.out.println("��������������(KG)��");
        float weight=scanner.nextFloat();
        double bmi=weight/(height*height);
        System.out.println("����ǰ��BMIֵΪ��"+bmi);
        if(bmi<18.5)
        	System.out.print("����״̬�ǣ����ع���");
        else if((18.5<=bmi)&(bmi<24))
        	System.out.print("����״̬�ǣ�������Χ");
        else if((24<=bmi)&(bmi<27))
        	System.out.print("����״̬�ǣ����ع���");
        else if((27<=bmi)&(bmi<30))
        	System.out.print("����״̬�ǣ���ȷ���");
        else if((30<=bmi)&(bmi<35))
        	System.out.print("����״̬�ǣ��жȷ���");
        else
        	System.out.print("����״̬�ǣ��ضȷ���");
        scanner.close();
	}
}