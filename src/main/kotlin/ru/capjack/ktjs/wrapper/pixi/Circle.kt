@file:JsModule("ktjs-wrapper-pixi/pixi.min")
@file:Suppress("unused")

package ru.capjack.ktjs.wrapper.pixi

external class Circle(x: Number = definedExternally, y: Number = definedExternally, radius: Number = definedExternally) : Shape {
	val type: SHAPE
	
	var x: Double
	
	var y: Double
	
	var radius: Double
	
	override fun contains(x: Number, y: Number): Boolean
	
	fun getBounds(): Rectangle
	
	fun clone(): Circle
}