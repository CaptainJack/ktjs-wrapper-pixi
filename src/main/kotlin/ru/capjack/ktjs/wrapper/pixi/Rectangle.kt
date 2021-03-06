@file:JsModule("ktjs-wrapper-pixi/pixi")

package ru.capjack.ktjs.wrapper.pixi

external class Rectangle(
	x: Number = definedExternally,
	y: Number = definedExternally,
	width: Number = definedExternally,
	height: Number = definedExternally
) : Shape {
	
	companion object {
		val EMPTY: Rectangle = definedExternally
	}
	
	var x: Double
	var y: Double
	var width: Double
	var height: Double
	
	val left: Double
	val right: Double
	val top: Double
	val bottom: Double
	
	val type: Int = definedExternally
	
	override fun contains(x: Number, y: Number): Boolean
	
	fun clone(): Rectangle
	
	fun copy(rectangle: Rectangle): Rectangle
	
	fun enlarge(rectangle: Rectangle)
	
	fun fit(rectangle: Rectangle)
	
	fun pad(paddingX: Number, paddingY: Number)
}
