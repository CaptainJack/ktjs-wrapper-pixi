@file:JsModule("ktjs-wrapper-pixi/pixi.min")
@file:JsNonModule

package ru.capjack.ktjs.wrapper.pixi

import ru.capjack.ktjs.wrapper.pixi.utils.EventEmitter

open external class DisplayObject : EventEmitter {
	var cacheAsBitmap: Boolean
	var cursor: String
	var buttonMode: Boolean
	var interactive: Boolean
	var filterArea: Rectangle
	var filters: Array<out Filter>?
	var hitArea: Shape
	var transform: TransformBase
	val localTransform: Matrix
	val worldAlpha: Double
	val worldTransform: Matrix
	val worldVisible: Boolean
	var x: Double
	var y: Double
	var alpha: Double
	var pivot: PointLike
	var position: PointLike
	var rotation: Double
	var scale: PointLike
	var skew: ObservablePoint
	var visible: Boolean
	var mask: DisplayObject?
	val parent: Container?
	var renderable: Boolean
	
	open fun destroy()
	
	fun getBounds(skipUpdate: Boolean, rect: Rectangle): Rectangle
	
	fun getLocalBounds(): Rectangle
	
	fun getLocalBounds(rect: Rectangle): Rectangle
	
	fun renderCanvas(renderer: CanvasRenderer)
	
	fun renderWebGL(renderer: WebGLRenderer)
	
	fun setParent(container: Container): Container
	
	fun setTransform(
		x: Number = definedExternally, y: Number = definedExternally,
		scaleX: Number = definedExternally, scaleY: Number = definedExternally,
		rotation: Number = definedExternally,
		skewX: Number = definedExternally, skewY: Number = definedExternally,
		pivotX: Number = definedExternally, pivotY: Number
	): DisplayObject
	
	fun updateTransform()
	
	fun toGlobal(position: PointLike): Point
	
	fun toLocal(position: PointLike, from: DisplayObject, point: Point = definedExternally, skipUpdate: Boolean = definedExternally): Point
}