@file:JsModule("pixi.js")

package ru.capjack.ktjs.wrapper.pixi

import ru.capjack.ktjs.wrapper.pixi.utils.EventEmitter

external open class DisplayObject : EventEmitter {
	var alpha: Boolean
	var buttonMode: Boolean
	var cacheAsBitmap: Boolean
	var cursor: String
	var filterArea: Rectangle
	var filters: Array<Filter>?
	var hitArea: HitArea
	var interactive: Boolean
	val localTransform: Matrix
	var mask: DisplayObject
	val parent: Container
	var pivot: PointLike
	var position: PointLike
	var renderable: Boolean
	var rotation: Double
	var scale: PointLike
	var skew: ObservablePoint
	var transform: TransformBase
	var visible: Boolean
	val worldAlpha: Double
	val worldTransform: Matrix
	val worldVisible: Boolean
	var x: Double
	var y: Double
	
	fun destroy()
	fun getBounds(skipUpdate: Boolean, rect: Rectangle): Rectangle
	fun getLocalBounds(): Rectangle
	fun getLocalBounds(rect: Rectangle): Rectangle
	fun renderCanvas(renderer: CanvasRenderer)
	fun renderWebGL(renderer: WebGLRenderer)
	fun setParent(container: Container): Container
	fun setTransform(x: Double = definedExternally, y: Double = definedExternally, scaleX: Double = definedExternally, scaleY: Double = definedExternally,
	                 rotation: Double = definedExternally, skewX: Double = definedExternally, skewY: Double = definedExternally,
	                 pivotX: Double = definedExternally, pivotY: Double): DisplayObject
	
	fun toGlobal(position: PointLike): Point
	fun toLocal(position: PointLike, from: DisplayObject, point: Point = definedExternally, skipUpdate: Boolean = definedExternally): Point
	fun updateTransform()
}