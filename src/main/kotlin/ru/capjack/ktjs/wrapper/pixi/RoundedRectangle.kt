@file:JsModule("pixi.js")

package ru.capjack.ktjs.wrapper.pixi

external class RoundedRectangle(x: Int = definedExternally, y: Int = definedExternally, width: Int = definedExternally,
                                height: Int = definedExternally, radius: Int) :
		HitArea {
	
	var x: Int
	var y: Int
	var width: Int
	var height: Int
	var radius: Int
	
	companion object {
		val EMPTY: Rectangle = definedExternally
	}
	
	val type: Int = definedExternally
	fun clone(): Rectangle
	override fun contains(x: Int, y: Int): Boolean
}