package lab2_MNiehus;

public class FancyReport extends Report {
	int valuesPerLine;
	public FancyReport(double[] data, String title, int valuesPerLine) {
		super(data, title);
		this.valuesPerLine = valuesPerLine;
	}
	public FancyReport(double[] data, String title) {
		this(data, title, 5);
	}
	public String write() {
		StringBuilder sb = new StringBuilder("Fancy Report");
		sb.append("\n" + title);
		sb.append("\n\nSales Data:\n");
		int rows = data.length/valuesPerLine;
		int extraCols = data.length%valuesPerLine;
		int k=0;
		for( int i=0; i<rows; i++) {
			for( int j=0; j<valuesPerLine; j++) {
				sb.append(String.format("$%.2f, ", data[k++]));
			}
			int len = sb.length();
			sb.delete(len-2,len);
			sb.append("\n");
		}
		for( int j=0; j<extraCols; j++) {
			sb.append(String.format("$%.2f, ", data[k++]));
		}
		if( extraCols > 0 ) {
			int len = sb.length();
			sb.delete(len-2,len);
		}
		sb.append("\n");
		return sb.toString();
	}
	public static void main(String[] args) {
		double[] data = new double[] {33.3, 44.4, 88.2734, 23.92, 83.222,
				52.26, 91.42, 44.23, 76.34, 88.1222,
				39.919, 69.233, 54.82, 28.9923 };
		Report r = new FancyReport(data, "October 2015", 8);
		System.out.println( r.write());
	data = new double[] {33.3, 44.4, 88.2734, 23.92, 83.222,
			52.26, 91.42, 44.23, 76.34, 88.1222,
			39.919, 69.233, 54.82, 28.9923, 47.636 };
	r = new FancyReport(data, "October 2015");
	System.out.println( r.write());
	}
}