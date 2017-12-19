@file:JsModule("pixi.js")

package ru.capjack.ktjs.wrapper.pixi

import ru.capjack.ktjs.wrapper.pixi.HitArea
import ru.capjack.ktjs.wrapper.pixi.Rectangle

external class Ellipse(var x: Int = definedExternally, var y: Int = definedExternally, var width: Int = definedExternally, var height: Int = definedExternally) :
		HitArea {
	
	val type: Int = definedExternally
	
	fun clone(): Ellipse
	fun contains(x: Int, y: Int): Boolean
	fun getBounds(): Rectangle
}
