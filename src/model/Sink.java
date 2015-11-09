package model;

public class Sink implements CarAcceptor{

	@Override
	public boolean accept(CarObj c, double frontPosition) {
		return true; //Eats up car (does nothing)
	}

	@Override
	public double distanceToObstacle(double fromPosition) {
		return Double.POSITIVE_INFINITY;
	}
}