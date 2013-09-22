class stats {
public static void main(String[] args) {
		int[] c = {1,76,0,0,0,0};
		int[] b = {5,4,63,45,6};
		int[] artyom = {1,2,3,4,5,6};
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		double[] ar = {1.1,1.3,1.6,2.2,5.2,6.1,7.5,8.0};
		System.out.println("max " +max(artyom));
		System.out.println("min: " +min(b));
		System.out.println("mean is " +mean(ar));
		System.out.println("Median equals "+median(ar));
		System.out.println("Mode =" +mode(a));
		System.out.println("Standard Dev "+standardDev(ar));
		System.out.println("Quartile 1: "+Quartile(ar,1));
		System.out.println("Quartile 2: "+Quartile(ar,2));
		System.out.println("Quartile 3: "+Quartile(ar,3));
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
		int q1 = (ar.length+1)/4;
		int q3 = ((ar.length+1)/4)*3;
		if (qt==2) {
		return median(ar);
		}
		if (qt==1) {
			if ((ar.length+1)%4 == 1) {
				//odd
				return (ar[q1-1]+ar[q1])/2.0;
			}else {
				//even
				return ar[q1-1];
			}
		}if (qt==3) {
			if ((ar.length+1)%4 == 1) {
				//odd
				return (ar[q3-1]+ar[q3])/2.0;
			}else {
				//even
				return ar[q3-1];
			}
		}
		return 0.0;
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




































