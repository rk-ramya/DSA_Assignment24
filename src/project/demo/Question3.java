package project.demo;

import java.util.HashMap;

public class Question3 {

	private static void majorityNum(int[] arr)
		{
			HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

			for(int i = 0; i < arr.length; i++) {
				if (map.containsKey(arr[i])) {
						int count = map.get(arr[i]) +1;
						if (count > arr.length /2) {
							System.out.println("Majority found :- " + arr[i]);
							return;
						} else
							map.put(arr[i], count);

				}
				else
					map.put(arr[i],1);
				}
				System.out.println(" No Majority element");
		}

	public static void main(String[] args)
		{
			int a[] = new int[]{2,2,2,2,5,5,2,3,3};
			
			majorityNum(a);
		}
	}
