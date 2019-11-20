public class TimeSimpleList
{
	public static void main(String args[])
	{
		if(args.length != 4)
		{
			System.out.println("Usage: java TimeSimpleList initSize increment maxSize trials");
			System.exit(1);
		}
		int S = Integer.parseInt(args[0]);
		int I = Integer.parseInt(args[1]);
		int M = Integer.parseInt(args[2]);
		int T = Integer.parseInt(args[3]);
		for(int j = S; j < M+1; j += I)
		{
			IntegerList myList = new IntegerList( j );
			double exTime[] = new double[T];
			for(int k = 0; k < T; k++)
			{
				// each trail within an experiment
				for(int l = 0; l < j; l++)
				{
					myList.add(1);
				}
				System.gc();
				long start = System.nanoTime();
				myList.removeRangeV2( 0, j / 2); //the call to removeRange method
				long end = System.nanoTime();
				
				exTime[ k ] = (double)(end - start) / (double)1.0e9;
				
				
				myList.clear();
			}
		  
		  computeAndDisplay( exTime, j / 2 );
		}
	}
	
	public static void computeAndDisplay( double arr[], int rem )
	{
	
	  double sum = 0;
	  int len = arr.length;
	  
	  for( int i = 0; i < len; i++ )
	  {
	    sum += arr[i];
	  }
	  
	  double mean = sum / (double)len;
	  System.out.format( "%d %.5f \n", rem, mean );
	}
	
}
