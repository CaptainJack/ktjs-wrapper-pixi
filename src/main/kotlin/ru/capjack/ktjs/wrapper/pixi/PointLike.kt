package ru.capjack.ktjs.wrapper.pixi

external open class PointLike constructor(x: Double = definedExternally, y: Double = definedExternally) {
	var x: Double
	var y: Double
	
	fun set(x: Double?, y: Double?)
	fun copy(point: PointLike)
}