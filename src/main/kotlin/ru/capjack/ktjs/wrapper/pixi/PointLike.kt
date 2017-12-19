package ru.capjack.ktjs.wrapper.pixi

external interface PointLike {
	var x: Double
	var y: Double
	
	fun set(x: Double?, y: Double?)
	fun copy(point: PointLike)
}