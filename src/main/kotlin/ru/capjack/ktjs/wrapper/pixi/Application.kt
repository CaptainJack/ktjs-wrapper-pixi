@file:JsModule("pixi.js")

package ru.capjack.ktjs.wrapper.pixi

import org.w3c.dom.HTMLCanvasElement
import ru.capjack.ktjs.wrapper.pixi.loaders.Loader
import ru.capjack.ktjs.wrapper.pixi.ticker.Ticker

external class Application() {
	constructor(options: ApplicationOptions)
	constructor(
		width: Int = definedExternally,
		height: Int = definedExternally,
		options: ApplicationOptions = definedExternally,
		noWebGL: Boolean = definedExternally,
		useSharedTicker: Boolean = definedExternally
	)
	
	var loader: Loader
	var renderer: SystemRenderer
	val screen: Rectangle
	var stage: Container
	var ticker: Ticker
	val view: HTMLCanvasElement
	
	fun destroy(removeView: Boolean = definedExternally)
	fun renter()
	fun start()
	fun stop()
}

