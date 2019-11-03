package fr.dauphine.ja.monrocqpierre.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import java.util.Random;

public abstract class Drawer {

	Shape shape;
	public abstract void draw(Graphics g);
	Color color = randomColor();
	
	public Color randomColor() {//TODO fix to prevent same color as bg
		Random randomHue = new Random();
		Random randomSaturation = new Random();
		final float hue = randomHue.nextFloat();
		final float saturation = randomSaturation.nextFloat();
		final float luminance = 1.0f;
		return Color.getHSBColor(hue, saturation, luminance);
	}
	
}
