@file:JsModule("ktjs-wrapper-pixi/pixi.min")

package ru.capjack.ktjs.wrapper.pixi

external class GraphicsData(
		lineWidth: Number,
		lineColor: Int,
		lineAlpha: Double,
		fillColor: Int,
		fillAlpha: Double,
		fill: Boolean,
		nativeLines: Boolean,
		shape: Shape,
		lineAlignment: Double
) {
	var fill: Boolean
	var fillAlpha: Double
	var fillColor: Int
	var lineAlignment: Double
	var lineAlpha: Double
	var lineColor: Int
	var lineWidth: Double
	var nativeLines: Boolean
	var shape: Shape
	var type: SHAPE
	
	
	constructor(lineWidth: Int, lineColor: Int, lineAlpha: Double, fillColor: Int, fillAlpha: Double, fill: Boolean, nativeLines: Boolean, shape: Circle)
	
	constructor(lineWidth: Int, lineColor: Int, lineAlpha: Double, fillColor: Int, fillAlpha: Double, fill: Boolean, nativeLines: Boolean, shape: Ellipse)
	
	constructor(lineWidth: Int, lineColor: Int, lineAlpha: Double, fillColor: Int, fillAlpha: Double, fill: Boolean, nativeLines: Boolean, shape: Rectangle)
	
	constructor(lineWidth: Int, lineColor: Int, lineAlpha: Double, fillColor: Int, fillAlpha: Double, fill: Boolean, nativeLines: Boolean, shape: RoundedRectangle)
	
	constructor(lineWidth: Int, lineColor: Int, lineAlpha: Double, fillColor: Int, fillAlpha: Double, fill: Boolean, nativeLines: Boolean, shape: Polygon)
	
	fun addHole(shape: Shape)
	
	fun clone(): GraphicsData
	
	fun destroy()
}