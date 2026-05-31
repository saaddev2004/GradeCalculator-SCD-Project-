import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class GradeCalculatorGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	// Variables for Marks
		private JTextField midObtainedField;
		private JTextField midTotalField;
		private JTextField quizObtainedField;
		private JTextField quizTotalField;
		private JTextField assignmentObtainedField;
		private JTextField assignmentTotalField;
		private JTextField cpObtainedField;
		private JTextField cpTotalField;
		private JTextField finalTotalField;
		
		private JTextField midWeightageField;
		private JTextField quizWeightageField;
		private JTextField assignmentWeightageField;
		private JTextField cpWeightageField;
		private JTextField finalWeightageField;
		

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GradeCalculatorGUI frame = new GradeCalculatorGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GradeCalculatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel topHeadingLabel = new JLabel("TARGET GRADE FORECASTER");
		topHeadingLabel.setHorizontalAlignment(SwingConstants.CENTER);
		topHeadingLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		topHeadingLabel.setBounds(100, 15, 300, 20);
		contentPane.add(topHeadingLabel);
		
		// --- MIDS SECTION ---
		JLabel midLabel = new JLabel("Mid Exam Marks: ");
		midLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		midLabel.setBounds(30, 60, 120, 14);
		contentPane.add(midLabel);
		
		midObtainedField = new JTextField();
		midObtainedField.setBounds(150, 57, 40, 20);
		contentPane.add(midObtainedField);
		midObtainedField.setColumns(10);
		
		JLabel midSlashLabel = new JLabel("/");
		midSlashLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		midSlashLabel.setBounds(195, 60, 10, 14);
		contentPane.add(midSlashLabel);
		
		midTotalField = new JTextField();
		midTotalField.setBounds(210, 57, 40, 20);
		contentPane.add(midTotalField);
		midTotalField.setColumns(10);
		
		JLabel midWeightLabel = new JLabel("Weight %:");
		midWeightLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		midWeightLabel.setBounds(270, 60, 60, 14);
		contentPane.add(midWeightLabel);
		
		midWeightageField = new JTextField();
		midWeightageField.setBounds(340, 57, 40, 20);
		contentPane.add(midWeightageField);
		midWeightageField.setColumns(10);

		// --- QUIZZES SECTION ---
		JLabel quizLabel = new JLabel("Quizzes Marks: ");
		quizLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		quizLabel.setBounds(30, 95, 120, 14);
		contentPane.add(quizLabel);
		
		quizObtainedField = new JTextField();
		quizObtainedField.setBounds(150, 92, 40, 20);
		contentPane.add(quizObtainedField);
		quizObtainedField.setColumns(10);
		
		JLabel quizSlashLabel = new JLabel("/");
		quizSlashLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		quizSlashLabel.setBounds(195, 95, 10, 14);
		contentPane.add(quizSlashLabel);
		
		quizTotalField = new JTextField();
		quizTotalField.setBounds(210, 92, 40, 20);
		contentPane.add(quizTotalField);
		quizTotalField.setColumns(10);
		
		JLabel quizWeightLabel = new JLabel("Weight %:");
		quizWeightLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		quizWeightLabel.setBounds(270, 95, 60, 14);
		contentPane.add(quizWeightLabel);
		
		quizWeightageField = new JTextField();
		quizWeightageField.setBounds(340, 92, 40, 20);
		contentPane.add(quizWeightageField);
		quizWeightageField.setColumns(10);

		// --- ASSIGNMENTS SECTION ---
		JLabel assignmentLabel = new JLabel("Assignments Marks: ");
		assignmentLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		assignmentLabel.setBounds(30, 130, 120, 14);
		contentPane.add(assignmentLabel);
		
		assignmentObtainedField = new JTextField();
		assignmentObtainedField.setBounds(150, 127, 40, 20);
		contentPane.add(assignmentObtainedField);
		assignmentObtainedField.setColumns(10);
		
		JLabel assignmentSlashLabel = new JLabel("/");
		assignmentSlashLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		assignmentSlashLabel.setBounds(195, 130, 10, 14);
		contentPane.add(assignmentSlashLabel);
		
		assignmentTotalField = new JTextField();
		assignmentTotalField.setBounds(210, 127, 40, 20);
		contentPane.add(assignmentTotalField);
		assignmentTotalField.setColumns(10);
		
		JLabel assignmentWeightLabel = new JLabel("Weight %:");
		assignmentWeightLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		assignmentWeightLabel.setBounds(270, 130, 60, 14);
		contentPane.add(assignmentWeightLabel);
		
		assignmentWeightageField = new JTextField();
		assignmentWeightageField.setBounds(340, 127, 40, 20);
		contentPane.add(assignmentWeightageField);
		assignmentWeightageField.setColumns(10);

		// --- CP / PROJECT SECTION ---
		JLabel cpLabel = new JLabel("CP / Project Marks: ");
		cpLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		cpLabel.setBounds(30, 165, 120, 14);
		contentPane.add(cpLabel);
		
		cpObtainedField = new JTextField();
		cpObtainedField.setBounds(150, 162, 40, 20);
		contentPane.add(cpObtainedField);
		cpObtainedField.setColumns(10);
		
		JLabel cpSlashLabel = new JLabel("/");
		cpSlashLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		cpSlashLabel.setBounds(195, 165, 10, 14);
		contentPane.add(cpSlashLabel);
		
		cpTotalField = new JTextField();
		cpTotalField.setBounds(210, 162, 40, 20);
		contentPane.add(cpTotalField);
		cpTotalField.setColumns(10);
		
		JLabel cpWeightLabel = new JLabel("Weight %:");
		cpWeightLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		cpWeightLabel.setBounds(270, 165, 60, 14);
		contentPane.add(cpWeightLabel);
		
		cpWeightageField = new JTextField();
		cpWeightageField.setBounds(340, 162, 40, 20);
		contentPane.add(cpWeightageField);
		cpWeightageField.setColumns(10);

		// --- FINAL EXAM SECTION ---
		JLabel finalLabel = new JLabel("Final Exam Total: ");
		finalLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		finalLabel.setBounds(30, 200, 120, 14);
		contentPane.add(finalLabel);
		
		finalTotalField = new JTextField();
		finalTotalField.setBounds(150, 197, 100, 20);
		contentPane.add(finalTotalField);
		finalTotalField.setColumns(10);
		
		JLabel finalWeightLabel = new JLabel("Weight %:");
		finalWeightLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		finalWeightLabel.setBounds(270, 200, 60, 14);
		contentPane.add(finalWeightLabel);
		
		finalWeightageField = new JTextField();
		finalWeightageField.setBounds(340, 197, 40, 20);
		contentPane.add(finalWeightageField);
		finalWeightageField.setColumns(10);

		// --- TARGET GRADE SECTION ---
		JLabel targetGradeLabel = new JLabel("Select Target Grade: ");
		targetGradeLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		targetGradeLabel.setBounds(30, 235, 120, 14);
		contentPane.add(targetGradeLabel);
		
		JComboBox<String> targetGradeComboBox = new JComboBox<String>();
		targetGradeComboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "F"}));
		targetGradeComboBox.setFont(new Font("Times New Roman", Font.BOLD, 12));
		targetGradeComboBox.setBounds(150, 232, 50, 22);
		contentPane.add(targetGradeComboBox);
		
		// --- CALCULATE BUTTON ---
		JButton calculateButton = new JButton("Calculate Required Marks");
		calculateButton.setBackground(new Color(255, 255, 255));
		calculateButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		calculateButton.setBounds(140, 280, 200, 25);
		contentPane.add(calculateButton);
		
		// --- RESULT LABEL ---
		JLabel resultLabel = new JLabel("Result will appear here...");
		resultLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		resultLabel.setBounds(30, 330, 450, 14);
		contentPane.add(resultLabel);
		
		calculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					// 1. Get values from Text Fields (0 if empty)
					double midObtained = Double.parseDouble(midObtainedField.getText().isEmpty() ? "0" : midObtainedField.getText());
					double midTotal = Double.parseDouble(midTotalField.getText().isEmpty() ? "1" : midTotalField.getText());
					double midWeightage = Double.parseDouble(midWeightageField.getText().isEmpty() ? "0" : midWeightageField.getText());
					
					double quizObtained = Double.parseDouble(quizObtainedField.getText().isEmpty() ? "0" : quizObtainedField.getText());
					double quizTotal = Double.parseDouble(quizTotalField.getText().isEmpty() ? "1" : quizTotalField.getText());
					double quizWeightage = Double.parseDouble(quizWeightageField.getText().isEmpty() ? "0" : quizWeightageField.getText());
					
					double assignmentObtained = Double.parseDouble(assignmentObtainedField.getText().isEmpty() ? "0" : assignmentObtainedField.getText());
					double assignmentTotal = Double.parseDouble(assignmentTotalField.getText().isEmpty() ? "1" : assignmentTotalField.getText());
					double assignmentWeightage = Double.parseDouble(assignmentWeightageField.getText().isEmpty() ? "0" : assignmentWeightageField.getText());
					
					double cpObtained = Double.parseDouble(cpObtainedField.getText().isEmpty() ? "0" : cpObtainedField.getText());
					double cpTotal = Double.parseDouble(cpTotalField.getText().isEmpty() ? "1" : cpTotalField.getText());
					double cpWeightage = Double.parseDouble(cpWeightageField.getText().isEmpty() ? "0" : cpWeightageField.getText());
					
					double finalTotal = Double.parseDouble(finalTotalField.getText().isEmpty() ? "1" : finalTotalField.getText());
					double finalWeightage = Double.parseDouble(finalWeightageField.getText().isEmpty() ? "0" : finalWeightageField.getText());

					// 2. Code Refactoring (Call Logic Class)
					GradeLogic logic = new GradeLogic();

					logic.validateInputs(midObtained, midTotal, quizObtained, quizTotal, assignmentObtained, assignmentTotal, cpObtained, cpTotal);
					logic.validateWeightage(midWeightage, quizWeightage, assignmentWeightage, cpWeightage, finalWeightage);

					double currentTotalScore = logic.calculateCurrentScore(midObtained, midTotal, midWeightage,
							quizObtained, quizTotal, quizWeightage, assignmentObtained, assignmentTotal, assignmentWeightage,
							cpObtained, cpTotal, cpWeightage);

					String targetGrade = (String) targetGradeComboBox.getSelectedItem();
					double targetScore = logic.getTargetScore(targetGrade);

					double requiredPercentageInFinal = targetScore - currentTotalScore;
					
					// 3. Output logic
					if (requiredPercentageInFinal <= 0) {
						resultLabel.setText("Status: Excellent! You have already secured the '" + targetGrade + "' grade.");
						resultLabel.setForeground(new Color(0, 153, 0));
					} else if (requiredPercentageInFinal > finalWeightage) {
						resultLabel.setText("Status: Impossible! Final weightage is only " + finalWeightage + "%, but you need " + String.format("%.1f", requiredPercentageInFinal) + "%.");
						resultLabel.setForeground(Color.RED);
					} else {
						double finalMarksNeeded = logic.calculateRequiredFinalMarks(requiredPercentageInFinal, finalWeightage, finalTotal);
						resultLabel.setText("Target: You need " + String.format("%.1f", finalMarksNeeded) + " marks out of " + finalTotal + " in finals.");
						resultLabel.setForeground(Color.BLUE);
					}

				} catch (NumberFormatException ex) {
					javax.swing.JOptionPane.showMessageDialog(null,"Error: Invalid input. Please enter numbers only.","Input Error",javax.swing.JOptionPane.ERROR_MESSAGE);
				} catch (IllegalArgumentException ex) {
					javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage(), "Logic Error", javax.swing.JOptionPane.WARNING_MESSAGE);
				} catch (Exception ex) {
					javax.swing.JOptionPane.showMessageDialog(null,"An error occurred: " + ex.getMessage(),"System Error",javax.swing.JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		

	}

}
