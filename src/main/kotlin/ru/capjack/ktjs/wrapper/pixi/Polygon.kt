@file:JsModule("pixi.js")

package ru.capjack.ktjs.wrapper.pixi


external class Polygon : HitArea {
	val type: Int = definedExternally
	var points: Array<Double>
	
	constructor(points: Array<Point>)
	constructor(points: Array<Double>)
	constructor(vararg points: Point)
	constructor(vararg points: Double)
	
	fun clone(): Polygon
	override fun contains(x: Int, y: Int): Boolean
	fun close()
}