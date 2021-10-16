package utilsexamples;

public class Sphygmomanometer {
	
	private int systolicPressure = 0;
	private int diastolicPressure = 0;
	private boolean isHypertension;
	private String measureCategory;
	
	//UpperPressure
	protected void measureSystolicPressure(int systolicPressure) {
		this.systolicPressure = systolicPressure;
	}
	
	public int getSystolicPressure() {
		return systolicPressure;
	}
	
	//LowerPressure
	protected void measureDiastolicPressure(int diastolicPressure) {
		this.diastolicPressure = diastolicPressure;
	}
	
	public int getDiastolicPressure() {
		return diastolicPressure;
	}
	
	public String getMeasureCategory() {
		return measureCategory;
	}
	
	public boolean isHypertension() {
		return isHypertension;
	}
	
	public void categorizeMeasure() {
		if (systolicPressure <= 0 || diastolicPressure <= 0) {
		}
		else if(systolicPressure < 120 && diastolicPressure < 80) {
			isHypertension = false;
			measureCategory = "Normal";
		}else if(systolicPressure < 130 && diastolicPressure < 80) {
			isHypertension = false;
			measureCategory = "Elevated";
		}else if(systolicPressure < 140 || diastolicPressure < 90) {
			isHypertension = true;
			measureCategory = "Hypertension stage 1";
		}else if(systolicPressure < 180 || diastolicPressure < 120) {
			isHypertension = true;
			measureCategory = "Hypertension stage 2";
		}else{
			isHypertension = true;
			measureCategory = "Hypertensive crisis";
		}
	}

}
