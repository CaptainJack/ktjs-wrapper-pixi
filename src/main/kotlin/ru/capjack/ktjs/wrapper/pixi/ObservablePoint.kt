@file:JsModule("pixi.js")

package ru.capjack.ktjs.wrapper.pixi

external class ObservablePoint(cb: () -> Any, scope: Any, x: Double = definedExternally, y: Double = definedExternally) : PointLike {
	override var x: Double
	override var y: Double
	
	override fun set(x: Double?, y: Double?)
	override fun copy(point: PointLike)
	
	var cb: () -> Any
	var scope: Any
}