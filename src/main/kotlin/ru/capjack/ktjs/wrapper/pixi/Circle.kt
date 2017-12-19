@file:JsModule("pixi.js")

package ru.capjack.ktjs.wrapper.pixi

external class Circle(x: Int = definedExternally, y: Int = definedExternally, radius: Double = definedExternally) : HitArea {
	var x: Int
	var y: Int
	var radius: Double
	
	val type: Int = definedExternally
	fun clone(): Circle
	override fun contains(x: Int, y: Int): Boolean
	fun getBounds(): Rectangle
	
}