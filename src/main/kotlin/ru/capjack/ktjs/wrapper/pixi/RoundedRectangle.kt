@file:JsModule("ktjs-wrapper-pixi/pixi")

package ru.capjack.ktjs.wrapper.pixi

external class RoundedRectangle(
		x: Number = definedExternally,
		y: Number = definedExternally,
		width: Number = definedExternally,
		height: Number = definedExternally,
		radius: Number = definedExternally
) : HitArea {
	
	var x: Double
	
	var y: Double
	
	var width: Double
	
	var height: Double
	
	var radius: Double
	
	val type: Int = definedExternally
	
	companion object {
		val EMPTY: Rectangle = definedExternally
	}
	
	fun clone(): Rectangle
	
	override fun contains(x: Number, y: Number): Boolean
}