@file:JsModule("pixi.js")
@file:JsQualifier("ticker")

package ru.capjack.ktjs.wrapper.pixi.ticker

external class Ticker {
	fun add(fn: (deltaTime: Double) -> Unit): Ticker
	fun addOnce(fn: (deltaTime: Double) -> Unit): Ticker
	fun destroy()
	fun remove(fn: (deltaTime: Double) -> Unit): Ticker
	fun start()
	fun stop()
	fun update(currentTime: Double = definedExternally)
}