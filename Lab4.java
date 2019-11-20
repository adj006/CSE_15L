
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * A class to calculate the equation 
 * y = 2 * x * x + 3 * x + 5
 */

public class Lab4 {

	private Logger logger = Logger.getLogger(Lab4.class.getName());
	private FileUtility fileUtility = new FileUtility();
	private LinkedList<Integer> x = new LinkedList<Integer>();
	private LinkedList<Integer> y = new LinkedList<Integer>();
	 
  
	public void run(String[] args) {
  logger.entering(Lab4.class.getName(), "run(String[] args)", args);
	
		// Parsing command line arguments
		if (args.length != 2) {
			System.out
					.println("Usage: java -Djava.util.logging.config.file=logging.properties Lab4 <inputFile> <outputFile>");
			logger.log(Level.WARNING, "Program input not specified correctly.");
			System.exit(1);
		}

		// command line inputs specifying input/output files
		String inputFileName = args[0];
		String outputFileName = args[1];
		
		// read input and store in linked list
		fileUtility.readInput(inputFileName, x);

		// calculate the function for each element of the list
		calculate();

		// write output to file
		fileUtility.writeOutput(outputFileName, y);
		logger.exiting(Lab4.class.getName(), "run(String[] args)");
	}
  

	public static void main(String[] args) {
		(new Lab4()).run(args);
	}

	public void calculate() {
		
		// FINE LOG : What is the size of x ?
		logger.fine("x.size() =" + x.size());

		if(x.size() == 0)
			return;

		for (int i = 0; i < x.size() ;i++) {
			y.addLast(func1(x.get(i)));
		}
		
		// FINE LOG : What is the size of y ?
		logger.fine( "y.size() = " + y.size());
	}

	public int func1(int y) {
		
		// FINER LOG : What is the value of result ?
		logger.finer( "2 *y * y = " + 2 * y * y);
		
		
		int result = 2 * y * y;
		result = result + func2(y);
		logger.finer( "result = " + result );
		return result;
	}

	public int func2(int y) {
		// FINER LOG : What is the value of result ?
		logger.finer("3*y = " + 3*y );
		int result = 3 * y;
		result = result + func3(y);
		return result;
	}

	public int func3(int y) {
		// FINER LOG : Is y being calculated correctly ?
		logger.finer( "y = " + y );
		return 5;
		
	}
}
