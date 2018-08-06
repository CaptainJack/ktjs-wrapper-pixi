package ru.capjack.ktjs.wrapper.pixi

class CompositeShape(shapes: Collection<Shape>) : Shape {
	
	private val shapes: Array<Shape> = shapes.toTypedArray()
	
	override fun contains(x: Number, y: Number): Boolean {
		return shapes.any { it.contains(x, y) }
	}
}