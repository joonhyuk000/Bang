import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {

		List<Map<String, String>> rList = new ArrayList<>();
		//new�� �߰��ϸ�  null�� �����ֱ�
		Map<String, String>pMap=new HashMap<String, String>();
		pMap.put("name","������");
		pMap.put("email","h.lee@");
		pMap.put("addr","����");
		
		rList.add(pMap);
		
		pMap=null;
		
		pMap=new HashMap<>();
		
		pMap.put("name","ȫ�浿");
		pMap.put("email","g.Hong@");
		pMap.put("addr","���");
		
		rList.add(pMap);
		
		pMap=null;
		Iterator<Map<String, String>> it =rList.iterator();
		while(it.hasNext()) {
			Map<String, String> rMap = it.next();
			System.out.println("name : "+rMap.get("name") );
			System.out.println("email : "+rMap.get("email") );
			System.out.println("addr : "+rMap.get("addr") );
			rMap=null;
		}
	}

}
