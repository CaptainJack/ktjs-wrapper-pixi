@file:JsModule("ktjs-wrapper-pixi/pixi")

package ru.capjack.ktjs.wrapper.pixi

external class Point(x: Number = definedExternally, y: Number = definedExternally) : PointLike {
	
	fun clone(): Point
	
	fun equals(p: PointLike): Boolean
}