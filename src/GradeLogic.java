public class GradeLogic {

		// Validation Check for Marks
		public void validateInputs(double midObtained, double midTotal, double quizObtained, double quizTotal,
				double assignmentObtained, double assignmentTotal, double cpObtained, double cpTotal) {
			if (midObtained > midTotal || quizObtained > quizTotal || assignmentObtained > assignmentTotal || cpObtained > cpTotal) {
				throw new IllegalArgumentException("Obtained marks cannot be greater than total marks!");
			}
		}

		// Validation Check for Weightage (Should be exactly 100)
		public void validateWeightage(double midWeight, double quizWeight, double assignmentWeight, double cpWeight, double finalWeight) {
			double totalWeightage = midWeight + quizWeight + assignmentWeight + cpWeight + finalWeight;
			if (Math.abs(totalWeightage - 100.0) > 0.001) { 
				throw new IllegalArgumentException("Total weightage must be exactly 100. Current total: " + totalWeightage);
			}
		}

		// Calculate Internal Score
		public double calculateCurrentScore(double midObtained, double midTotal, double midWeight,
				double quizObtained, double quizTotal, double quizWeight,
				double assignmentObtained, double assignmentTotal, double assignmentWeight,
				double cpObtained, double cpTotal, double cpWeight) {
			
			double midScore = (midObtained / midTotal) * midWeight;
			double quizScore = (quizObtained / quizTotal) * quizWeight;
			double assignmentScore = (assignmentObtained / assignmentTotal) * assignmentWeight;
			double cpScore = (cpObtained / cpTotal) * cpWeight;
			
			return midScore + quizScore + assignmentScore + cpScore;
		}

		// Target Score based on Grade
		public double getTargetScore(String grade) {
			switch(grade) {
				case "A": return 85;
				case "A-": return 80;
				case "B+": return 75;
				case "B": return 71;
				case "B-": return 68;
				case "C+": return 64;
				case "C": return 61;
				case "C-": return 58;
				case "D+": return 54;
				case "D": return 50;
				case "F": return 0;
				default: return 85; 
			}
		}

		// Calculate Marks needed in Final
		public double calculateRequiredFinalMarks(double requiredPercentageInFinal, double finalWeightage, double finalTotal) {
			return (requiredPercentageInFinal / finalWeightage) * finalTotal;
		}

}
