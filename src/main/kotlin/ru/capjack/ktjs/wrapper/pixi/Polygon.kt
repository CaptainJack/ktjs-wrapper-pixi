@file:JsModule("pixi.js")

package ru.capjack.ktjs.wrapper.pixi
import ru.capjack.ktjs.wrapper.pixi.Point

external class Polygon() : HitArea {
	constructor(points:Array<Point>)
	constructor(points:Array<Double>)
	constructor(vararg points:Point)
	constructor(vararg points:Double)
	
	var points:Array<Double>
	val type:Int = definedExternally
	
	fun clone(): Polygon
	fun contains(x: Int, y: Int): Boolean
	fun close()
}