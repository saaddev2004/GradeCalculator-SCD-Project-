/**
 * 
 */

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */
public class GradeLogicTest {
	
	@Test
	public void testGetTargetScore() {
	    GradeLogic logic = new GradeLogic();

	    // Verify target score for valid grades
	    assertEquals(85.0, logic.getTargetScore("A"), 0.001);
	    assertEquals(0.0, logic.getTargetScore("F"), 0.001);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidWeightage() {
	    GradeLogic logic = new GradeLogic();

	    // Verify exception when total weightage is not 100%
	    logic.validateWeightage(20, 20, 20, 20, 10);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidMarks() {
	    GradeLogic logic = new GradeLogic();

	    // Verify exception when obtained marks exceed total marks
	    logic.validateInputs(25, 20, 10, 10, 10, 10, 10, 10);
	}

	@Test
	public void testCalculateCurrentScore() {
	    GradeLogic logic = new GradeLogic();

	    // Verify current score calculation with full marks
	    double score = logic.calculateCurrentScore(
	        20, 20, 20,
	        10, 10, 10,
	        10, 10, 10,
	        10, 10, 10
	    );

	    assertEquals(50.0, score, 0.001);
	}

}
