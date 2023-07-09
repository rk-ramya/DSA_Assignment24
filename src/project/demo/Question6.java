package project.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Question6 {
	static String findWord(String[] arr)
	{
		HashMap<String, Integer> numSet= new HashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (numSet.containsKey(arr[i])) {
				numSet.put(arr[i], numSet.get(arr[i]) + 1);
			}
			else {
				numSet.put(arr[i], 1);
			}
		}

		Set<Map.Entry<String, Integer> > set
		= numSet.entrySet();
		String key = "";
		int value = 0;

		for (Map.Entry<String, Integer> me : set) {
			if (me.getValue() > value) {
				value = me.getValue();
				key = me.getKey();
			}
		}
		return key;
	}


	public static void main(String[] args)
	{
		String arr[]= { "java","tutorial","spring","springboot","hibernate","spring","spring","springboot"};
		String result = findWord(arr);
		System.out.println(result);
	}
}
