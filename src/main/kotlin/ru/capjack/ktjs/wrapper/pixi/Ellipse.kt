@file:JsModule("ktjs-wrapper-pixi/pixi")

package ru.capjack.ktjs.wrapper.pixi

external class Ellipse(x: Number = definedExternally, y: Number = definedExternally, width: Number = definedExternally, height: Number = definedExternally) : Shape {
	var x: Double
	
	var y: Double
	
	var width: Double
	
	var height: Double
	
	val type: Int
	
	override fun contains(x: Number, y: Number): Boolean
	
	fun clone(): Ellipse
	
	fun getBounds(): Rectangle
}
