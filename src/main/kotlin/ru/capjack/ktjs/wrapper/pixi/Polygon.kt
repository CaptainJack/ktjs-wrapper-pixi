@file:JsModule("pixi.js")

package ru.capjack.ktjs.wrapper.pixi


external class Polygon(x: Int = definedExternally, y: Int = definedExternally, radius: Double = definedExternally) : HitArea {
	var x: Int
	var y: Int
	var radius: Double
	
	val type: Int = definedExternally
	fun clone(): Circle
	override fun contains(x: Int, y: Int): Boolean
	fun getBounds(): Rectangle
	
}
//external class Polygon() : HitArea {
//	val type: Int = definedExternally
//	var points: Array<Double>
//
//	constructor(points: Array<Point>)
//	constructor(points: Array<Double>)
//	constructor(vararg points: Point)
//	constructor(vararg points: Double)
//
//
//	fun clone(): Polygon
//	override fun contains(x: Int, y: Int): Boolean
//	fun close()
//}