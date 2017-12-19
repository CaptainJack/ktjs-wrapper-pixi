@file:JsModule("pixi.js")

package ru.capjack.ktjs.wrapper.pixi

external class Point(x: Double = definedExternally, y: Double = definedExternally) : PointLike {
	
	fun clone(): Point
	fun equals(p: PointLike): Boolean
}