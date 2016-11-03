package shapes;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import constants.GConstants.EDrawingType;

public class GEllipse extends GShape{
	private Ellipse2D ellipse;
	private int x, y, w, h;
	public GEllipse() {
		super(EDrawingType.TP);
		this.ellipse = new Ellipse2D.Double(0,0,0,0);
	}
	@Override
	public void initDrawing(int x, int y, Graphics2D g2D) {
		this.ellipse.setFrame(x, y, x, y);
	}
	@Override
	public void keepDrawing(int x, int y, Graphics2D g2D) {
		g2D.drawOval(this.x, this.y, this.w, this.h);
		this.w = x - this.x;
		this.h = y - this.y;
		g2D.drawOval(this.x, this.y, this.w, this.h);		
	}
	public void continueDrawing(int x, int y, Graphics2D g2D) {
	}
	@Override
	public void finishDrawing(int x, int y, Graphics2D g2D) {
	}
	@Override
	public void draw(Graphics2D g2D) {
		g2D.drawOval(this.x, this.y, this.w, this.h);		
	}

}
