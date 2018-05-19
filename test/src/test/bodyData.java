package test;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

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
	//内脏脂肪指数
	double visceralFatPercentage_value(double fatPercentage_value){
		double visceralFatPercentage_value = 0;
		visceralFatPercentage_value = Math.round(150*fatPercentage_value*fatPercentage_value);
		return visceralFatPercentage_value;
	}
	//内脏脂肪状态
	String visceralFatPercentage_status_text(double VisceralFatPercentage_value) {
		String VisceralFatPercentage_status_text = null;
			if(VisceralFatPercentage_value>0&&VisceralFatPercentage_value<10) {
	            VisceralFatPercentage_status_text="正常";
	       }else if(VisceralFatPercentage_value>=10&&VisceralFatPercentage_value<14){
	           VisceralFatPercentage_status_text="超标";
	       }else if(VisceralFatPercentage_value>=14){           
	           VisceralFatPercentage_status_text="高";
	       }
		return VisceralFatPercentage_status_text;
	}
	//蛋白质
	double proteinWeight_value(double weight_value,double fatWeight_value,char gender ){
		double proteinWeight_value =0;
		if(gender=='m') {
			proteinWeight_value = 0.2*(weight_value-fatWeight_value);
		}else {
			proteinWeight_value = 0.178*(weight_value-fatWeight_value);
		}
		return proteinWeight_value;
	}
	//蛋白质上界
	double proteinWeight_upper_limit(double weight_value) {
		double proteinWeight_upper_limit = 0.1705*weight_value;
		return proteinWeight_upper_limit;
	}
	//蛋白质下界
	double proteinWeight_lower_limit(double weight_value){
		double proteinWeight_lower_limit = 0.1395*weight_value;
		return proteinWeight_lower_limit;
	}
	//蛋白质状态
	String proteinWeight_status_text(double proteinWeight_value,double proteinWeight_lower_limit) {
		String proteinWeight_status_text = null;
		if(proteinWeight_value>=proteinWeight_lower_limit){
			proteinWeight_status_text = "正常";
		 }else {
			 proteinWeight_status_text = "低";
		 }
		return proteinWeight_status_text;
	}
	//水分
	double waterWeight_value(double weight_value,double fatWeight_value,char gender) {
		double waterWeight_value = 0;
		if(gender=='m') {
			waterWeight_value = 0.735*(weight_value-fatWeight_value);
			}else {
				waterWeight_value = 0.76*(weight_value-fatWeight_value);	
			}
		return waterWeight_value;
		}
	//水分上界
	double waterWeight_upper_limit(double weight_value) {
		double waterWeight_upper_limit;
		waterWeight_upper_limit = 0.66*weight_value;
		return waterWeight_upper_limit;
	}
	//水分下界
	double waterWeight_lower_limit(double weight_value) {
		double waterWeight_lower_limit = 0.54*weight_value;
		return waterWeight_lower_limit;
	}
	//水分状态
	String waterWeight_status_text(double waterWeight_value,double waterWeight_upper_limit,double waterWeight_lower_limit) {
		String waterWeight_status_text = null;
		if(waterWeight_value>=waterWeight_upper_limit) {
			waterWeight_status_text = "高";
		}else if(waterWeight_value<waterWeight_lower_limit) {
			waterWeight_status_text = "低";
		}else {
			waterWeight_status_text = "正常";
		}
		return waterWeight_status_text;
	}
	//肌肉
	double muscleWeight_value(double weight_value,double fatWeight_value,char gender) {
		double muscleWeight_value = 0;
		if(gender=='m') {
			muscleWeight_value = 0.935*(weight_value-fatWeight_value);
		}else {
			muscleWeight_value = 0.938*(weight_value-fatWeight_value);
		}
		return muscleWeight_value;
	}
	//肌肉上界
	double muscleWeight_upper_limit(double height,char gender) {
		double muscleWeight_upper_limit = 0;
		if(gender=='m') {
			muscleWeight_upper_limit = height*height*(7.7*height+5.84);
		}else {
			muscleWeight_upper_limit = height*height*(7.6*height+4.3);
		}
		return muscleWeight_upper_limit;
	}
	//肌肉下界
	double muscleWeight_lower_limit(double height,char gender) {
		double muscleWeight_lower_limit = 0;
		if(gender =='m') {
			muscleWeight_lower_limit = height*height*(6.34*height+4.7);
		}else {
			muscleWeight_lower_limit = height*height*(6.2*height+3.55);
		}
		return muscleWeight_lower_limit;
	}
	//肌肉状态
	String muscleWeight_status_text(double muscleWeight_value,double muscleWeight_lower_limit) {
		String muscleWeight_status_text = null;
		if(muscleWeight_value>=muscleWeight_lower_limit) {
			muscleWeight_status_text = "正常";
		}else {
			muscleWeight_status_text = "低";
		}
		return muscleWeight_status_text;
	}
	//骨骼肌
	double boneMuscleWeight_value(double weight_value,double fatWeight_value,char gender) {
		double boneMuscleWeight_value;
		if(gender=='m') {
			boneMuscleWeight_value = 0.667*(weight_value-fatWeight_value);
		}else {
			boneMuscleWeight_value = 0.675*(weight_value-fatWeight_value);
		}
		return boneMuscleWeight_value;
	}
	//骨骼肌上界
	double boneMuscleWeight_upper_limit(double height,char gender) {
		double boneMuscleWeight_upper_limit = 0;
		if(gender=='m') {
			boneMuscleWeight_upper_limit = 0.75*height*height*(7.7*height+5.84);
		}else {
			boneMuscleWeight_upper_limit = 0.75*height*height*(7.6*height+4.3);
		}
		return boneMuscleWeight_upper_limit;
	}
	//骨骼肌下界
	double boneMuscleWeight_lower_limit(double height,char gender) {
		double boneMuscleWeight_lower_limit =0;
		if(gender=='m') {
			boneMuscleWeight_lower_limit = 0.75*height*height*(6.34*height+4.7);
		}else {
			boneMuscleWeight_lower_limit = 0.75*height*height*(6.2*height+3.55);
		}
		return boneMuscleWeight_lower_limit;
	}
	//骨骼肌状态
	String boneMuscleWeight_status_text(double boneMuscleWeight_value,double boneMuscleWeight_lower_limit) {
		String boneMuscleWeight_status_text = null;
		if(boneMuscleWeight_value>=boneMuscleWeight_lower_limit) {
			boneMuscleWeight_status_text = "正常";
		}else {
			boneMuscleWeight_status_text = "低";
		}
		return boneMuscleWeight_status_text;
	}
	//骨质
	double boneWeight_value(double weight_value,double fatWeight_value,char gender) {
		double boneWeight_value = 0;
		if(gender=='m') {
			boneWeight_value = 0.065*(weight_value-fatWeight_value);
		}else {
			boneWeight_value = 0.062*(weight_value-fatWeight_value);
		}
		return boneWeight_value;
	}
	//骨质上界
	double boneWeight_upper_limit(double weight_value) {
		double boneWeight_upper_limit = 0.055*weight_value;
		return boneWeight_upper_limit;
	}
	//骨质下界
	double boneWeight_lower_limit(double weight_value) {
		double boneWeight_lower_limit = 0.045*weight_value;
		return boneWeight_lower_limit;
	}
	//骨质状态
	String boneWeight_status_text(double boneWeight_value,double boneWeight_upper_limit,double boneWeight_lower_limit) {
		String boneWeight_status_text = null;
		if(boneWeight_value>=boneWeight_upper_limit) {
			boneWeight_status_text = "高";
		}else if(boneWeight_value<boneWeight_lower_limit) {
			boneWeight_status_text = "低";
		}else {
			boneWeight_status_text = "正常";
		}
		return boneWeight_status_text;
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
		System.out.println("内脏脂肪指数:"+ b.visceralFatPercentage_value(b.fatPercentage_value(age, weight_value, height, gender)));
		System.out.println("内脏脂肪状态:"+b.visceralFatPercentage_status_text(b.visceralFatPercentage_value(b.fatPercentage_value(age, weight_value, height, gender))));
		System.out.println("蛋白质:"+b.proteinWeight_value(weight_value, b.fatWeight_value(weight_value, b.fatPercentage_value(age, weight_value, height, gender)), gender));
		System.out.println("蛋白质上界:"+b.proteinWeight_upper_limit(weight_value));
		System.out.println("蛋白质下界:"+b.proteinWeight_lower_limit(weight_value));
		System.out.println("蛋白质状态："+b.proteinWeight_status_text(b.proteinWeight_value(weight_value, b.fatWeight_value(weight_value, b.fatPercentage_value(age, weight_value, height, gender)), gender), b.proteinWeight_lower_limit(weight_value)));
		System.out.println("水分:"+b.waterWeight_value(weight_value, b.fatWeight_value(weight_value, b.fatPercentage_value(age, weight_value, height, gender)), gender));
		System.out.println("水分上界:"+b.waterWeight_upper_limit(weight_value));
		System.out.println("水分下界:"+b.waterWeight_lower_limit(weight_value));
		System.out.println("水分状态:"+b.waterWeight_status_text(b.waterWeight_value(weight_value, b.fatWeight_value(weight_value, b.fatPercentage_value(age, weight_value, height, gender)), gender), b.waterWeight_upper_limit(weight_value), b.waterWeight_lower_limit(weight_value)));
		System.out.println("肌肉:"+b.muscleWeight_value(weight_value, b.fatWeight_value(weight_value, b.fatPercentage_value(age, weight_value, height, gender)), gender));
		System.out.println("肌肉上界:"+b.muscleWeight_upper_limit(height, gender));
		System.out.println("肌肉下界:"+b.muscleWeight_lower_limit(height, gender));
		System.out.println("肌肉状态:"+b.muscleWeight_status_text(b.muscleWeight_value(weight_value, b.fatWeight_value(weight_value, b.fatPercentage_value(age, weight_value, height, gender)), gender), b.muscleWeight_lower_limit(height, gender)));
		System.out.println("骨骼肌:"+b.boneMuscleWeight_value(weight_value, b.fatWeight_value(weight_value, b.fatPercentage_value(age, weight_value, height, gender)), gender));
		System.out.println("骨骼肌上界:"+b.boneMuscleWeight_upper_limit(height, gender));
		System.out.println("骨骼肌下界:"+b.boneMuscleWeight_lower_limit(height, gender));
		System.out.println("骨骼肌状态:"+b.muscleWeight_status_text(b.muscleWeight_value(weight_value, b.fatWeight_value(weight_value, b.fatPercentage_value(age, weight_value, height, gender)), gender), b.muscleWeight_lower_limit(height, gender)));
		System.out.println("骨质:"+b.boneWeight_value(weight_value, b.fatWeight_value(weight_value, b.fatPercentage_value(age, weight_value, height, gender)), gender));
		System.out.println("骨质上界:"+b.boneWeight_upper_limit(weight_value));
		System.out.println("骨质下界:"+b.boneWeight_lower_limit(weight_value));
		System.out.println("骨质状态:"+b.boneWeight_status_text(b.boneWeight_value(weight_value, b.fatWeight_value(weight_value, b.fatPercentage_value(age, weight_value, height, gender)), gender), b.boneWeight_upper_limit(weight_value), b.boneWeight_lower_limit(weight_value)));
	}
}
