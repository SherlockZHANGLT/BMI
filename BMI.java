import java.util.Scanner;
public class BMI {
	public static void main(String[] args) {
		System.out.println("请输入您的身高(米)：");
        Scanner scanner=new Scanner(System.in);
        float height=scanner.nextFloat();
        System.out.println("请输入您的体重(KG)：");
        float weight=scanner.nextFloat();
        double bmi=weight/(height*height);
        System.out.println("您当前的BMI值为："+bmi);
        if(bmi<18.5)
        	System.out.print("身体状态是：体重过轻");
        else if((18.5<=bmi)&(bmi<24))
        	System.out.print("身体状态是：正常范围");
        else if((24<=bmi)&(bmi<27))
        	System.out.print("身体状态是：体重过重");
        else if((27<=bmi)&(bmi<30))
        	System.out.print("身体状态是：轻度肥胖");
        else if((30<=bmi)&(bmi<35))
        	System.out.print("身体状态是：中度肥胖");
        else
        	System.out.print("身体状态是：重度肥胖");
        scanner.close();
	}
}