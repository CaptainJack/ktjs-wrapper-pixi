package ru.capjack.ktjs.wrapper.pixi

open class PointLike(x: Double = 0.0, y: Double = 0.0) {
	var x = x
		private set(value) {
			field = value
		}
	var y = y
		private set(value) {
			field = value
		}
	
	fun set(x: Double?, y: Double?) {
		if (x != null) {
			this.x = x
		}
		if (y != null) {
			this.y = y
		}
	}
	
	fun copy(point: PointLike) {
		this.x = point.x
		this.y = point.y
	}
}