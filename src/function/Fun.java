package function;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Fun {
	public static String aqiLevel(int aqi) {
		String level="";
		if(aqi>0&&aqi<50) {
			level="��";
		}else if(aqi>=51&&aqi<100) {
			level="��";
		}else if(aqi>100&&aqi<150) {
			level="�����Ⱦ";
		}else if(aqi>150&&aqi<200) {
			level="�ж���Ⱦ";
		}else if(aqi>200&&aqi<300) {
			level="�ض���Ⱦ";
		}else
			level="������Ⱦ";
		return level;
	}
	
	public static String findCityName(String cityName_en) {  //���ݳ��е�Ӣ�ģ����س��е�����
		Map <String,String> map=new HashMap<>();
		map.put("shanghai", "�Ϻ�");
		map.put("nantong", "��ͨ");
		map.put("nanjing", "�Ͼ�");
		map.put("hangzhou", "����");
		String result=map.get(cityName_en);
		return result;
	}
}
