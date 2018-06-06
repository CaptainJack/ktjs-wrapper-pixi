@file:JsModule("ktjs-wrapper-pixi/pixi.min")
@file:JsQualifier("ticker")
@file:Suppress("PropertyName")

package ru.capjack.ktjs.wrapper.pixi.ticker

external class Ticker {
	var autoStart: Boolean = definedExternally
	var deltaTime: Double = definedExternally
	var elapsedMS: Double = definedExternally
	var FPS: Int
	val lastTime: Long = definedExternally
	val minFPS: Int = definedExternally
	var speed: Int = definedExternally
	var started: Boolean = definedExternally
	
	fun add(fn: (deltaTime: Double) -> Unit): Ticker
	fun addOnce(fn: (deltaTime: Double) -> Unit): Ticker
	fun destroy()
	fun remove(fn: (deltaTime: Double) -> Unit): Ticker
	fun start()
	fun stop()
	fun update(currentTime: Double = definedExternally)
}