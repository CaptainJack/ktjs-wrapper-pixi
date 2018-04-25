@file:JsModule("ktjs-wrapper-pixi/pixi")

package ru.capjack.ktjs.wrapper.pixi

import org.w3c.dom.HTMLCanvasElement
import ru.capjack.ktjs.wrapper.pixi.loaders.Loader
import ru.capjack.ktjs.wrapper.pixi.ticker.Ticker

external class Application() {
	val screen: Rectangle
	val view: HTMLCanvasElement
	
	var stage: Container
	var ticker: Ticker
	var loader: Loader
	var renderer: SystemRenderer
	
	constructor(options: ApplicationOptions)
	
	constructor(
		width: Int = definedExternally,
		height: Int = definedExternally,
		options: ApplicationOptions = definedExternally,
		noWebGL: Boolean = definedExternally,
		useSharedTicker: Boolean = definedExternally
	)
	
	fun destroy(removeView: Boolean = definedExternally)
	
	fun render()
	
	fun start()
	
	fun stop()
}