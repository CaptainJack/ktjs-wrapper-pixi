@file:JsModule("pixi.js")

package ru.capjack.ktjs.wrapper.pixi

external class Ellipse(x: Int = definedExternally, y: Int = definedExternally, width: Int = definedExternally, height: Int = definedExternally) :
		HitArea {
	var x: Int
	var y: Int
	var width: Int
	var height: Int
	val type: Int
	
	fun clone(): Ellipse
	override fun contains(x: Int, y: Int): Boolean
	fun getBounds(): Rectangle
}
