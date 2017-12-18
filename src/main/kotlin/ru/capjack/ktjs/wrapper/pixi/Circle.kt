@file:JsModule("pixi.js")

package ru.capjack.ktjs.wrapper.pixi

import ru.capjack.ktjs.wrapper.pixi.HitArea
import ru.capjack.ktjs.wrapper.pixi.Rectangle

external class Circle(var x: Int = definedExternally, var y: Int = definedExternally, var radius: Double = definedExternally) : HitArea {
	val type: Int = definedExternally
	fun clone(): Circle
	fun contains(x: Int, y: Int): Boolean
	fun getBounds(): Rectangle
	
}