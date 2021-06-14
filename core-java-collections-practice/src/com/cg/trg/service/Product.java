package com.cg.trg.service;

public class Product {
private String name;
private double weight;
public Product(String string, int i) {
	this.name = string;
	this.weight= i;
}
@Override
public String toString() {
	return "Product [name=" + name + ", weight=" + weight + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}
}

