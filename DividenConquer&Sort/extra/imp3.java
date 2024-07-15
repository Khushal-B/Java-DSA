// Java program to find kth most frequent
// character in a string
import java.io.*;
import java.util.*;

class imp3 {
	// Used for sorting by frequency.
	static class pair implements Comparable<pair> {
		char ch;
		int freq;
		pair(char ch, int freq)
		{
			this.ch = ch;
			this.freq = freq;
		}
		public int compareTo(pair a)
		{
			return a.freq - this.freq;
		}
	}

	// function to sort elements by frequency
	static char sortByFreq(String str, int k)
	{
		// Store frequencies of characters
		HashMap<Character, Integer> m = new HashMap<>();
		for (int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			int freq = m.getOrDefault(str.charAt(i), 0) + 1;
			m.put(ch, freq);
		}

		// Copy map to array
		pair[] v = new pair[m.size()];
		int idx = 0;
		for (Character ch : m.keySet()) {
			v[idx++] = new pair(ch, m.get(ch));
		}

		// Sort the element of array by frequency
		Arrays.sort(v);

		// Find k-th most frequent item. Please note
		// that we need to consider only distinct
		int count = 0;
		for (int i = 0; i < v.length; i++) {

			// Increment count only if frequency is
			// not same as previous
			if (i == 0 || v[i].freq != v[i - 1].freq)
				count++;

			if (count == k)
				return v[i].ch;
		}

		return '.';
	}
	public static void main(String[] args)
	{
		String str = "ggggggggggggeeeeoasbr";
		int k = 3;
		System.out.println(sortByFreq(str, k));
	}
}


