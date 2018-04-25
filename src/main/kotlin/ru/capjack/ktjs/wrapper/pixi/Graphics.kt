@file:JsModule("ktjs-wrapper-pixi/pixi")

package ru.capjack.ktjs.wrapper.pixi

external class Graphics() : Container {
	var blendMode: Int
	
	var boundsPadding: Double
	
	var fillAlpha: Double
	
	var isMask: Boolean
	
	var lineColor: Int//String in docs
	
	var lineWidth: Int
	
	var nativeLines: Boolean
	
	var tint: Int
	
	constructor(nativeLines: Boolean)
	
	fun clone(): Graphics
	
	fun beginFill(color: Int = definedExternally, alpha: Double = definedExternally): Graphics
	
	fun endFill(): Graphics
	
	fun clear(): Graphics
	
	fun containsPoint(point: Point): Boolean
	
	fun drawCircle(x: Number, y: Number, radius: Number): Graphics
	
	fun drawEllipse(x: Number, y: Number, width: Number, height: Number): Graphics
	
	fun drawPolygon(path: Array<Number>): Graphics
	
	fun drawPolygon(path: Array<Point>): Graphics
	
	fun drawPolygon(path: Polygon): Graphics
	
	fun drawRect(x: Number, y: Number, width: Number, height: Number): Graphics
	
	fun drawRoundedRect(x: Number, y: Number, width: Number, height: Number, radius: Number): Graphics
	
	fun drawShape(shape: Circle): GraphicsData
	
	fun drawShape(shape: Ellipse): GraphicsData
	
	fun drawShape(shape: Polygon): GraphicsData
	
	fun drawShape(shape: Rectangle): GraphicsData
	
	fun drawShape(shape: RoundedRectangle): GraphicsData
	
	fun lineStyle(lineWidth: Number = definedExternally, color: Int = definedExternally, alpha: Double = definedExternally): Graphics
	
	fun bezierCurveTo(cpX: Number, cpY: Number, cpX2: Number, cpY2: Number, toX: Number, toY: Number): Graphics
	
	fun arc(cx: Number, cy: Number, radius: Number, startAngle: Number, endAngle: Number, anticlockwise: Boolean = definedExternally): Graphics
	
	fun arcTo(x1: Number, y1: Number, x2: Number, y2: Number, radius: Number): Graphics
	
	fun lineTo(x: Number, y: Number): Graphics
	
	fun moveTo(x: Number, y: Number): Graphics
	
	fun quadraticCurveTo(cpX: Number, cpY: Number, toX: Number, toY: Number): Graphics
	
	fun generateCanvasTexture(scaleMode: Number, resolution: Number = definedExternally): Texture
	
	fun updateLocalBounds()
	
	fun isFastRect(): Boolean
}