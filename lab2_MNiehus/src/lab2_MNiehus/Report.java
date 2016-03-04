package lab2_MNiehus;

public class Report {

	protected String title;
	protected double[] data;

	public Report(double[] data, String title ) {

		this.data = data;

		this.title = title;

	}

	public String getTitle() {

		return title;

	}

	public void setTitle(String title) {

		this.title = title;

	}

	public String write() {

		StringBuilder sb = new StringBuilder(title);

		sb.append("\n\nSales Data: ");

		for( double x : data ) {

			sb.append(String.format("$%.2f, ", x));

		}

		int len = sb.length();

		sb.delete(len-2,len);

		sb.append("\n");

		return sb.toString();

	}

	public static void main(String[] args) {

		double[] data;

		Report r;

		data= new double[] {33.3, 44.4, 88.2734};

		r = new Report(data, "October 2015");

		System.out.println( r.write());

	}
}