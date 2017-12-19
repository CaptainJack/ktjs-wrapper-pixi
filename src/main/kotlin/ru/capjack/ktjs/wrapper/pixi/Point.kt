@file:JsModule("pixi.js")

package ru.capjack.ktjs.wrapper.pixi

external class Point(x: Double = definedExternally, y: Double = definedExternally) : PointLike {
	override var x: Double
	override var y: Double
	fun clone(): Point
	fun equals(p: PointLike): Boolean
	override fun set(x: Double?, y: Double?)
	override fun copy(point: PointLike)
}