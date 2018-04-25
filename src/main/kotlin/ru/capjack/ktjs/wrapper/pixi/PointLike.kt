@file:JsModule("ktjs-wrapper-pixi/pixi")

package ru.capjack.ktjs.wrapper.pixi

open external class PointLike {
	var x: Double
	
	var y: Double
	
	fun set(x: Number, y: Number)
	
	fun copy(point: PointLike)
}