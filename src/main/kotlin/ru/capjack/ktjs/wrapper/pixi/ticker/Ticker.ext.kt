package ru.capjack.ktjs.wrapper.pixi.ticker

fun Ticker.add(priority: Int, fn: (deltaTime: Double) -> Unit): Ticker {
	this.asDynamic().add(fn, null, priority)
	return this
}