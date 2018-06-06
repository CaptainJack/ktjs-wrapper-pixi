@file:JsModule("ktjs-wrapper-pixi/pixi.min")

package ru.capjack.ktjs.wrapper.pixi

external class GraphicsData(
		lineWidth: Int,
		lineColor: Int,
		lineAlpha: Double,
		fillColor: Int,
		fillAlpha: Double,
		fill: Boolean,
		nativeLines: Boolean,
		shape: Any
) {
	var fill: Boolean
	
	var fillAlpha: Double
	
	var fillColor: Int
	
	var lineAlpha: Double
	
	var lineColor: Int
	
	var lineWidth: Int
	
	var nativeLines: Boolean
	
	var shape: Any
	
	var type: Int?
	
	
	constructor(lineWidth: Int, lineColor: Int, lineAlpha: Double, fillColor: Int, fillAlpha: Double, fill: Boolean, nativeLines: Boolean, shape: Circle)
	
	constructor(lineWidth: Int, lineColor: Int, lineAlpha: Double, fillColor: Int, fillAlpha: Double, fill: Boolean, nativeLines: Boolean, shape: Ellipse)
	
	constructor(lineWidth: Int, lineColor: Int, lineAlpha: Double, fillColor: Int, fillAlpha: Double, fill: Boolean, nativeLines: Boolean, shape: Rectangle)
	
	constructor(lineWidth: Int, lineColor: Int, lineAlpha: Double, fillColor: Int, fillAlpha: Double, fill: Boolean, nativeLines: Boolean, shape: RoundedRectangle)
	
	constructor(lineWidth: Int, lineColor: Int, lineAlpha: Double, fillColor: Int, fillAlpha: Double, fill: Boolean, nativeLines: Boolean, shape: Polygon)
	
	fun addHole(shape: Any)
	
	fun addHole(shape: Circle)
	
	fun addHole(shape: Ellipse)
	
	fun addHole(shape: Rectangle)
	
	fun addHole(shape: RoundedRectangle)
	
	fun addHole(shape: Polygon)
	
	fun clone(): GraphicsData
	
	fun destroy()
}