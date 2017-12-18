@file:JsModule("pixi.js")

package ru.capjack.ktjs.wrapper.pixi

import ru.capjack.ktjs.wrapper.pixi.HitArea
import ru.capjack.ktjs.wrapper.pixi.Rectangle

external class Rectangle(var x: Int = definedExternally, var y: Int = definedExternally, var width: Int = definedExternally, var height: Int = definedExternally) :
		HitArea {
	
	companion object {
		val EMPTY: Rectangle = definedExternally
	}
	
	val type: Int = definedExternally
	var left: Int
	var right: Int
	var top: Int
	var bottom: Int
	
	fun clone(): Rectangle
	fun copy(rectangle: Rectangle):Rectangle
	fun contains(x: Int, y: Int): Boolean
	fun enlarge(rectangle: Rectangle)
	fun fit(rectangle: Rectangle)
	fun pad(paddingX: Int, paddingY: Int)
}
