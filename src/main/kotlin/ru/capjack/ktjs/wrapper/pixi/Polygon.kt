@file:JsModule("ktjs-wrapper-pixi/pixi.min")

package ru.capjack.ktjs.wrapper.pixi


external class Polygon : Shape {
	var points: Array<Double>
	
	val type: Int
	
	constructor(points: Array<Point>)
	
	constructor(points: Array<Double>)
	
	constructor(vararg points: Point)
	
	constructor(vararg points: Number)
	
	fun clone(): Polygon
	
	override fun contains(x: Number, y: Number): Boolean
	
	fun close()
}