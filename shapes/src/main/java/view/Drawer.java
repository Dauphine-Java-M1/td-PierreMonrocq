package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import java.util.Random;

public abstract class Drawer {

	Shape shape;
	public abstract void draw(Graphics g);
	
	public Color randomColor() {
		Random random = new Random();
		final float hue = random.nextFloat();
		final float saturation = 0.9f;
		final float luminance = 1.0f;
		return Color.getHSBColor(hue, saturation, luminance);
	}
	
}
