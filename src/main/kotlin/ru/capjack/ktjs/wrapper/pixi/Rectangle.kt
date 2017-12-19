@file:JsModule("pixi.js")

package ru.capjack.ktjs.wrapper.pixi

external class Rectangle(x: Int = definedExternally, y: Int = definedExternally, width: Int = definedExternally, height: Int = definedExternally) :
		HitArea {
	var x: Int
	var y: Int
	var width: Int
	var height: Int
	
	companion object {
		val EMPTY: Rectangle = definedExternally
	}
	
	val type: Int = definedExternally
	var left: Int
	var right: Int
	var top: Int
	var bottom: Int
	
	fun clone(): Rectangle
	fun copy(rectangle: Rectangle): Rectangle
	override fun contains(x: Int, y: Int): Boolean
	fun enlarge(rectangle: Rectangle)
	fun fit(rectangle: Rectangle)
	fun pad(paddingX: Int, paddingY: Int)
}
