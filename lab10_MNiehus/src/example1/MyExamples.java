package example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class MyExamples {

	public static void main(String[] args) {

		// Problem 1
		List<String> words1 = new ArrayList<>(Arrays.asList("d", "c", "b", "g", "b"));
		List<String> words2 = new ArrayList<>(Arrays.asList("f", "d", "b", "g", "g"));

		// Write code here to call the method and print the return.



		// Problem 2
		List<Blob> blobs1 = new ArrayList<>();
		blobs1.add(new Blob(11,65));
		blobs1.add(new Blob(5,8));
		blobs1.add(new Blob(4,9));
		blobs1.add(new Blob(35,7));
		blobs1.add(new Blob(6,3));
		blobs1.add(new Blob(8,55));
		blobs1.add(new Blob(6,14));
		blobs1.add(new Blob(4,21));
		blobs1.add(new Blob(14,4));
		blobs1.add(new Blob(23,7));

		// Write code here to call the method and print the return.
		System.out.print(getCommonWords(words1, words2));
		System.out.print(getBlobsOlderThan(blobs1, 10));
		
	}




	public static List<String> getCommonWords(List<String> words1, List<String> words2 ) {
		SortedSet<String> wordsCommon = new TreeSet<String>(words1);
		wordsCommon.retainAll(words2);
		List<String> temp = new ArrayList<>(wordsCommon);
		Collections.sort(temp);
		return temp;
	}

	public static SortedSet<Blob> getBlobsOlderThan(List<Blob> blobs, int age ) {
		TreeSet<Blob> b1 = new TreeSet<>(new BlobAgeComparator());
		b1.addAll(blobs);
		Blob dummyBlob = new Blob(age,999);
		SortedSet<Blob> ss = b1.tailSet(dummyBlob);
		//System.out.println(ss);
		return ss;

	}
}
