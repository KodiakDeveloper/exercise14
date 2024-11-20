package selectionStructures;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ex14 {

	public static void main(String[] args) {

		String name;

		float percentual;

		float actualSalary, newSalary;

		percentual = 8.75f;

		name = JOptionPane.showInputDialog(null, "Input your name: ");

		name = name.toLowerCase().trim();

		if (name.isEmpty()) {

			JOptionPane.showMessageDialog(null, "Invalid name, null values are not available!!");
		}

		else {

			actualSalary = Float.parseFloat(JOptionPane.showInputDialog(null, "Input your actual salary: "));

			if (actualSalary <= 0) {
				JOptionPane.showMessageDialog(null, "Only positive and greater than zero are available!");
			}

			else {

				percentual /= 100;

				DecimalFormat df = new DecimalFormat("$###,###.##");

				newSalary = actualSalary + (actualSalary * percentual);

				JOptionPane.showMessageDialog(null, "Name: " + name + "\nActual Salary: " + df.format(actualSalary)
						+ "\nNew Salary: " + df.format(newSalary));
			}
		}

	}

}
