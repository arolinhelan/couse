package org.bike;

public class Ktm implements Bike {
@Override
public void cost() {
	System.out.println(" Cost: 12345");
	}
@Override
	public void speed() {
		System.out.println(" Speed: 25kms");
		}
public void distance() {
	System.out.println(" Distance: 78kms");
}
public static void main(String[] args) {
	Ktm emp = new Ktm();
	emp.cost();
	emp.speed();
	emp.distance();
}}