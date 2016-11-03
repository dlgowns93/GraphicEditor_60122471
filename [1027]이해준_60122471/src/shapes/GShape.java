package shapes;

import java.awt.Graphics2D;
import java.awt.Shape;

import constants.GConstants.EDrawingType;

abstract public class GShape {
	private Shape shape;
	private EDrawingType eDrawingType;
	public EDrawingType geteDrawingType() {	return eDrawingType;}
	protected Anchors anchors;
	
	public Anchors getAnchors(){return anchors;}
	
	public GShape(EDrawingType eDrawingType){
		this.eDrawingType = eDrawingType;
		this.anchors = new Anchors();
	}
	
	abstract public void draw(Graphics2D g2D);
	abstract public void initDrawing(int x, int y, Graphics2D g2D);
	abstract public void keepDrawing(int x, int y, Graphics2D g2D);
	abstract public void continueDrawing(int x, int y, Graphics2D g2D);
	abstract public void finishDrawing(int x, int y, Graphics2D g2D);
	public GShape clone() {
		try {
			return this.getClass().newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean on(int x, int y) {
		
		return shape.contains(x, y);
	}
}
