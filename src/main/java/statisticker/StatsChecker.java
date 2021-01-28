package statisticker;

import java.util.Collections;
import java.util.List;

public class StatsChecker {

	private float maxThreshold;
	private IAlerter[] alerters;

	public StatsChecker(float maxThreshold, IAlerter[] alerters) {
		this.maxThreshold = maxThreshold;
		this.alerters = alerters;
	}

	public void checkAndAlert(List<Float> numberList) {
		float maxValue = Collections.max(numberList);
		if (maxValue > maxThreshold) {
			for (IAlerter iaAlert : alerters) {
				if (iaAlert instanceof EmailAlert) {
					((EmailAlert) iaAlert).sendEmailAlert();
				} else if (iaAlert instanceof LEDAlert) {
					((LEDAlert) iaAlert).sendLEDAlert();
				}
			}
		}

	}

}
