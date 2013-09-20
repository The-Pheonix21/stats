class stats {
public static void main(String[] args) {
		int[] c = {1,76,0,0,0,0};
		int[] b = {5,4,63,45,6};
		int[] artyom = {1,2,3,4,5,6};
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		double[] ar = {1.1,1.3,1.6,2.2,5.2,6.1,7.5};
		System.out.println(max(artyom));
		System.out.println(min(b));
		System.out.println(mean(ar));
		System.out.println(median(ar));
		System.out.println(mode(a));
		System.out.println(standardDev(ar));
		System.out.println(Quartile(ar,3));
	}	
	public static int max(int[] artyom) {
		int max = artyom[0];
		for (int i=0;i<artyom.length;i++) {
			if (artyom[i]>max) {
				max = artyom[i];
			}
		}
	return max;	
	}
	public static int min(int[] b){
		int min = b[0];
		for (int i=0;i<b.length;i++) {
			if (b[i]<min) {
				min = b[i];
			}
		}
	return min;
	}
	public static double mean(double[] ar){
		double sum = 0;
		for (int i=0;i < ar.length;i++) {
			sum +=ar[i];
		}
		return sum / ar.length;
	} 

	public static double median(double[] ar) {
    	int middle = ar.length/2;
    	if (ar.length%2 == 1) {
       		return ar[middle];
    	} else {
        	return (ar[middle-1] + ar[middle]) / 2.0;
    	}
	}
	public static double Quartile(double[] ar, int qt){
				int quartval = qt*(ar.length/4);
				if (ar.length%4 == 0){
					System.out.println("quartval = "+ quartval);
					return (ar[(quartval-1)]*.25)+(ar[((quartval))]*.75);
				}else{
					return (ar[quartval]+ar[quartval+1])/2.0;
					}	 
			}
		public static int mode(int[] a) {
    	int maxValue=0;
    	int maxCount=0;

    	for (int i = 0; i < a.length; ++i) {
        	int count = 0;
        	for (int j = 0; j < a.length; ++j) {
            	if (a[j] == a[i]) ++count;
        	}
        	if (count > maxCount) {
            	maxCount = count;
            	maxValue = a[i];
        	}
    	}
    	return maxValue;
	}
	public static double standardDev(double[] ar){
		double temp=0;
		double mean=mean(ar);
		for (int i=0;i<ar.length;i++) {
			temp+=(mean-ar[i])*(mean-ar[i]);
		}
		temp = temp/(ar.length-1);
		return Math.sqrt(temp);
	}
}