package statisticker;

import java.util.Collections;
import java.util.List;

public class Statistics {
	static Stats stats = new Stats();

	public static Stats getStatistics(List<Float> numbers) {
		// implement the computation of statistics here

		if (numbers.isEmpty()) {
			stats.setAverage(Float.NaN);
			stats.setMax(Float.NaN);
			stats.setMin(Float.NaN);
		} else {
			float sum = 0;
			for (float number : numbers) {
				sum = sum + number;
			}
			float avg = sum / numbers.size();
			stats.setMax(Collections.max(numbers));
			stats.setMin(Collections.min(numbers));
			stats.setAverage(avg);
		}

		return stats;

	}
}
