package distinctchar;

import java.util.LinkedHashMap;

public class Distictchar {

		public static void main(String[] args)
		{
			String str="INFOSYS";
			LinkedHashMap <Character, String> map=new LinkedHashMap<Character, String>();
			
			for(int i=0;i<str.length();i++)
			{
			String temp=map.get(str.charAt(i));
				if(temp==null)
				{
					map.put(str.charAt(i), "1");
				}
				else
				{
					map.put(str.charAt(i), (Integer.parseInt(""+map.get(str.charAt(i)))+1)+"");
				}
			}
			
			System.err.println(map);
		}
}
