@file:JsModule("pixi.js")

package ru.capjack.ktjs.wrapper.pixi

import ru.capjack.ktjs.wrapper.pixi.HitArea
import ru.capjack.ktjs.wrapper.pixi.Rectangle

external class RoundedRectangle(var x: Int = definedExternally, var y: Int = definedExternally, var width: Int = definedExternally,
                                var height: Int = definedExternally, radius: Int) :
		HitArea {
	
	companion object {
		val EMPTY: Rectangle = definedExternally
	}
	
	val type: Int = definedExternally
	fun clone(): Rectangle
	fun contains(x: Int, y: Int): Boolean
}