package com.uptc.prg3.gameCar.viewer.utilities;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Utilities {

	public static Component space(Dimension dimension) {
		JLabel componentSpace = new JLabel();
		componentSpace.setText("  ");
		componentSpace.setPreferredSize(dimension);
		return componentSpace;
	}

	public static Component image(JLabel image, String URL, Dimension dimension) {
		JLabel componentImage = new JLabel();
		String url = URL;
		ImageIcon icon = new ImageIcon(new ImageIcon(url).getImage().getScaledInstance(dimension.width,
				dimension.height, Image.SCALE_AREA_AVERAGING));
		componentImage.setIcon(icon);
		componentImage.setPreferredSize(dimension);
		componentImage.setBorder(null);
		return componentImage;
	}

	public static ImageIcon imageReturn(int widht, int height, String URL) {
		String url = URL;
		ImageIcon icon = new ImageIcon(
				new ImageIcon(url).getImage().getScaledInstance(widht, height, Image.SCALE_AREA_AVERAGING));
		return icon;
	}

	public static Component imageBorder(Dimension dimension, String URL, Border border) {
		JLabel componentImage = new JLabel();
		String url = URL;
		ImageIcon icon = new ImageIcon(new ImageIcon(url).getImage().getScaledInstance((int) dimension.getWidth(),
				(int) dimension.getHeight(), Image.SCALE_AREA_AVERAGING));
		componentImage.setIcon(icon);
		componentImage.setPreferredSize(dimension);
		componentImage.setBorder(border);
		return componentImage;
	}

	public static Component text(JLabel componentText, Font font, String text, Color color) {
		componentText.setForeground(color);
		componentText.setFont(font);
		componentText.setText(text);
		return componentText;
	}

	public static Component textSize(JLabel componentText, Font font, String text, Color color, Dimension dimension) {
		componentText.setForeground(color);
		componentText.setFont(font);
		componentText.setText(text);
		componentText.setPreferredSize(dimension);
		return componentText;
	}

	public static Component buttonImage(JButton buttonImage, Dimension dimension, String URL) {
		JLabel componentImage = new JLabel();
		String url = URL;
		ImageIcon icon = new ImageIcon(new ImageIcon(url).getImage().getScaledInstance((int) dimension.getWidth(),
				(int) dimension.getHeight(), Image.SCALE_DEFAULT));
		componentImage.setIcon(icon);
		componentImage.setPreferredSize(dimension);
		componentImage.setBorder(null);
		buttonImage.setContentAreaFilled(false);
		buttonImage.setBorderPainted(false);
		buttonImage.add(componentImage);
		return buttonImage;
	}

	public static Component buttonImageBorder(JButton buttonImage, Dimension dimension, String URL, Border border) {
		JLabel componentImage = new JLabel();
		String url = URL;
		ImageIcon icon = new ImageIcon(new ImageIcon(url).getImage().getScaledInstance((int) dimension.getWidth(),
				(int) dimension.getHeight(), Image.SCALE_DEFAULT));
		componentImage.setIcon(icon);
		componentImage.setPreferredSize(dimension);
		componentImage.setBorder(border);
		buttonImage.setContentAreaFilled(false);
		buttonImage.setBorderPainted(false);
		buttonImage.add(componentImage);
		return buttonImage;
	}

	public static Component button(JButton button, Dimension dimension, String text) {
		button.setText(text);
		button.setPreferredSize(dimension);
		button.isBorderPainted();
		button.isContentAreaFilled();
		return button;
	}

	public static Component textField(JTextField cTextField, Font font, String text, Color color, int width,
			int height) {
		Dimension sizeTextField = new Dimension();
		sizeTextField.setSize(width, height);
		cTextField.setForeground(color);
		cTextField.setFont(font);
		cTextField.setText(text);
		cTextField.setEditable(true);
		cTextField.setMaximumSize(sizeTextField);
		return cTextField;
	}

	public static Component comboBox(JComboBox<String> correctOption, String[] options, int width, int height) {
		Dimension sizeComboBox = new Dimension();
		sizeComboBox.setSize(width, height);
		for (int i = 0; i < options.length; i++) {
			correctOption.addItem(options[i]);
		}
		correctOption.setMaximumSize(sizeComboBox);
		correctOption.setBackground(Color.WHITE);
		return correctOption;
	}

	public static Component checkBox(JCheckBox check, Font font, Color foreground, Color Backgorund, boolean selected) {
		check.setFont(font);
		check.setForeground(foreground);
		check.setBackground(Backgorund);
		check.setSelected(selected);
		return check;
	}
}