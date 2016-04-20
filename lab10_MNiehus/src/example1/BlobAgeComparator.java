package example1;

import java.util.Comparator;

public class BlobAgeComparator implements Comparator<Blob> {

	@Override
	public int compare(Blob b1, Blob b2) {
		return b1.getAge()-b2.getAge();
	}
}
