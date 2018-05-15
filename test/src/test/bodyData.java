package test;


public class bodyData {
	//基础代谢
	double bmr_value(double weight_value,int age,double height,char gender) {
		double bmr_value = 0;
		if(gender == 'm') {
			bmr_value = 5+(10*weight_value)+625*height-5*age;
		}else {
			bmr_value = (10*weight_value)+625*height-5*age-161;
		}
		return bmr_value;
	}
	//体重等级
	String weight_status_text(double bmi_value,char gender) {
		String weight_status_text = null;
		if(gender == 'm') {
			if (bmi_value>0&&bmi_value<18) {           
			       weight_status_text="低";
			        }else if(bmi_value>=18&&bmi_value<24){
			            weight_status_text="正常";
			        }else if(bmi_value>=24){           
			          weight_status_text="高";
			        }
		}else {
			if (bmi_value>0&&bmi_value<18) {           
			       weight_status_text="低";
			        }else if(bmi_value>=18&&bmi_value<24){
			            weight_status_text="正常";
			        }else if(bmi_value>=24){           
			          weight_status_text="高";
			        }

		}
		return weight_status_text;
	}
	//体型
	String physique(double fatPercentage_value,char gender){
		String phsique = null;
		if(gender =='m') {
			if (fatPercentage_value>0&&fatPercentage_value<0.16) {           
			       phsique="肌肉不足型";
			        }else if(fatPercentage_value>=0.16&&fatPercentage_value<0.20){
			            phsique ="健康匀称型";
			        } else if(fatPercentage_value>=0.20){           
			          phsique ="肥胖型";
			        }
		}else {
			if (fatPercentage_value>0&&fatPercentage_value<0.18) {           
			       phsique="肌肉不足型";
			        }else if(fatPercentage_value>=0.18&&fatPercentage_value<0.22){
			            phsique ="健康匀称型";
			        } else if(fatPercentage_value>=0.22){           
			          phsique ="肥胖型";
			        }
		}
		return phsique;

	}
	//bmi值
	double bmi_value(double weight_value,double height) {
		double bmi_value;
		bmi_value = weight_value/(height*height);
		return bmi_value;
	}
	//体脂率
	double fatPercentage_value(double age,double weight_value,double height,char gender){
		double fatPercentage_value = 0;
		if(gender =='m') {
				fatPercentage_value =
					(132.775-91.9*height-0.0215*age+ 
					0.4906*weight_value+1785*(height*height/weight_value)+
					0.003841*(age*weight_value/height)+0.0173*(weight_value*weight_value/age)-
					2901.1*(height/weight_value))/100;
			}else {//女性
				fatPercentage_value = 
						(187.388855595 -138.7210380*height+
								0.102831883*age+0.957665737*
								weight_value+2705.21410*(height*height/weight_value) 
								-0.00161382964*(age*weight_value/height) -
								0.008158316*(weight_value*weight_value/age)-
								4039.6447497*(height/weight_value))/100;
			}
		return fatPercentage_value;
	}
	
	//男性身体年龄
	int bodyAge_value(double age,double fatPercentage_value,char gender){
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

		return (int) bodyAge_value;
	}
	//最佳体重
	double standard_weight_value(double height,char gender){
		double standard_weight_value = 0;
		if(gender=='m') {
			standard_weight_value = 22*(height*height);
		}else {
			standard_weight_value = 20*(height*height);
		}
		return standard_weight_value;
	}
	//体脂率等级
	String fatPercentage_status_text(double fatPercentage_value,char gender){
		String fatPercentage_status_text = null;
		if(gender == 'm') {
			if (fatPercentage_value>0&&fatPercentage_value<0.16) {           
			       fatPercentage_status_text="低";
			        }else if(fatPercentage_value>=0.16&&fatPercentage_value<0.20){
			            fatPercentage_status_text="正常";
			        }else if(fatPercentage_value>=0.20&&fatPercentage_value<0.24){
			            fatPercentage_status_text="较高";
			        }else if(fatPercentage_value>=0.24){           
			          fatPercentage_status_text="高";
			        }
		}else {
			if (fatPercentage_value>0&&fatPercentage_value<0.18) {           
			       fatPercentage_status_text="低";
			        }else if(fatPercentage_value>=0.18&&fatPercentage_value<0.22){
			            fatPercentage_status_text="正常";
			        }else if(fatPercentage_value>=0.22&&fatPercentage_value<0.26){
			            fatPercentage_status_text="较高";
			        }else if(fatPercentage_value>=0.26){           
			          fatPercentage_status_text="高";
			        }
		}
		return fatPercentage_status_text;
	}
	//脂肪
	double fatWeight_value(double weight_value,double fatPercentage_value) {
		double fatWeight_value=0;
			fatWeight_value = weight_value*fatPercentage_value;
		return fatWeight_value;
	}
	//脂肪等级
	String fatWeight_status_text(String fatPercentage_status_text) {
		String fatWeight_status_text = fatPercentage_status_text;
		return fatWeight_status_text;
	}
	//肥胖等级
	String weightLevelState(double fatPercentage_value,char gender) {
		String weightLevelState = null;
		if(gender=='m') {
			if(fatPercentage_value>0&&fatPercentage_value<0.16) {
	            weightLevelState="较轻";
	        }else if(fatPercentage_value>=0.16&&fatPercentage_value<0.20){
	            weightLevelState="正常";
	        }else if(fatPercentage_value>=0.20&&fatPercentage_value<0.24){
	            weightLevelState="轻度肥胖";
	        }else if(fatPercentage_value>=0.24&&fatPercentage_value<0.28){
	            weightLevelState="中度肥胖";
	        }else if(fatPercentage_value>=0.28&&fatPercentage_value<0.30){
	            weightLevelState="重度肥胖";
	        }else if(fatPercentage_value>=0.30){
	            weightLevelState="极度肥胖";
	        }
		}else {
			if(fatPercentage_value>0&&fatPercentage_value<0.18) {
	            weightLevelState="较轻";
	        }else if(fatPercentage_value>=0.18&&fatPercentage_value<0.22){
	            weightLevelState="正常";
	        }else if(fatPercentage_value>=0.22&&fatPercentage_value<0.26){
	            weightLevelState="轻度肥胖";
	        }else if(fatPercentage_value>=0.26&&fatPercentage_value<0.29){
	            weightLevelState="中度肥胖";
	        }else if(fatPercentage_value>=0.29&&fatPercentage_value<0.35){
	            weightLevelState="重度肥胖";
	        }else if(fatPercentage_value>=0.35){
	            weightLevelState="极度肥胖";
	        }
		}
		return weightLevelState;
	}
	public static void main(String[] args) {
		bodyData b = new bodyData();
		double weight_value = 51,height = 1.6;
		int age = 26;
		char gender = 'm';
		System.out.println("身体年龄："+b.bodyAge_value(age, b.fatPercentage_value(age, weight_value, height,gender), gender));
		System.out.println("体脂率:"+b.fatPercentage_value(age, weight_value, height,gender));
		System.out.println("BMI:"+b.bmi_value(weight_value, height));
		System.out.println("体型："+b.physique(b.fatPercentage_value(age, weight_value, height, gender), gender));
		System.out.println("体重等级:"+b.weight_status_text(b.bmi_value(weight_value, height), gender));
		System.out.println("基础代谢:"+b.bmr_value(weight_value, age, height, gender));
		System.out.println("最佳体重:"+b.standard_weight_value(height, gender));
		System.out.println("体脂率等级:"+b.fatPercentage_status_text(b.fatPercentage_value(age, weight_value, height, gender), gender)); 
		System.out.println("脂肪:"+b.fatWeight_value(weight_value, b.fatPercentage_value(age, weight_value, height, gender)));
		System.out.println("脂肪等级:"+b.fatWeight_status_text(b.fatPercentage_status_text(b.fatPercentage_value(age, weight_value, height, gender), gender)));
		System.out.println("肥胖等级:"+b.weightLevelState(b.fatPercentage_value(age, weight_value, height, gender), gender));
	}
}
