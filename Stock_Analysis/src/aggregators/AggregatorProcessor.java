package aggregators;

import java.io.IOException;
import java.util.List;

import fileprocessors.StockFileReader;

public class AggregatorProcessor<T extends Aggregator> {
	
	T aggregator;
	String file;
	
	public AggregatorProcessor(T aggregator, String file) {
		super();
		this.aggregator = aggregator;
		this.file = file;
	}
	
	
	public double runAggregator(int colIndex) {
		StockFileReader fileReader = new StockFileReader(this.file);
		
		List<String> lines = null;
		try {
			lines = fileReader.readFileData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		colIndex--;
		
		for (String line : lines) {
			String[] numbers = line.split(",");
			double value = Double.parseDouble(numbers[colIndex]);
			aggregator.add(value);
		}
		
		double number = aggregator.calculate();
		return number;
	}
	

}
