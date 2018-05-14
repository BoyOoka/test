package test;

public class bodyData {
	double fatPercentage_value(){
		
		return 1;
	}
	
	//身体年纪计算
	double bodyAge_value(int age,double fatPercentage_value,char gender){
		double bodyAge_value = 0;
		if(gender =='m') {//男性
			if(fatPercentage_value <0.20){
				
				bodyAge_value = age  +(fatPercentage_value - 0.20)/0.014;
				         }
			else if(fatPercentage_value >=0.20){
				bodyAge_value = age  +(fatPercentage_value - 0.20)/0.017;
				         }
			if(bodyAge_value >age+3){
				bodyAge_value = age +3; 
				         }
			else if(bodyAge_value <age-5){
				bodyAge_value = age-5;
				         }
		}else {
			if(fatPercentage_value <0.20){
				bodyAge_value = age+(fatPercentage_value - 0.20)/0.014;
				         }
			else if(fatPercentage_value >=0.20){
				bodyAge_value = age  +(fatPercentage_value - 0.20)/0.017;
				         }
				if(bodyAge_value >age+3){
				bodyAge_value = age +3;
				         }else if(bodyAge_value <age-5){
				bodyAge_value = age-5;
				         }

		}

		return bodyAge_value;
	}
	
	public static void main(String[] args) {
		bodyData b = new bodyData();
		System.out.println(b.bodyAge_value(23, 100, 'm'));
		System.out.println(b.bodyAge_value(23, 100, 'f'));
	}
}
