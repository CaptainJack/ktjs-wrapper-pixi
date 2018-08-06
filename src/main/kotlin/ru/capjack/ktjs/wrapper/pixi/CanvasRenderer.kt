@file:JsModule("ktjs-wrapper-pixi/pixi.min")

package ru.capjack.ktjs.wrapper.pixi

import org.w3c.dom.CanvasRenderingContext2D
import ru.capjack.ktjs.wrapper.pixi.extract.CanvasExtract

external class CanvasRenderer() : SystemRenderer {
	override val options: CanvasRendererOptions
	
	val plugins: CanvasRendererPlugins
	
	var context: CanvasRenderingContext2D
	
	var rootContext: CanvasRenderingContext2D
	
	var extract: CanvasExtract
	
	var maskManager: CanvasMaskManager
	
	var refresh: Boolean
	
	var smoothProperty: String
	
	constructor(options: CanvasRendererOptions)
	
	constructor(screenWidth: Int, screenHeight: Int, options: CanvasRendererOptions = definedExternally)
	
	fun clear()
	
	fun clear(clearColor: String)
	
	fun invalidateBlendMode()
	
	fun setBlendMode(blendMode: BLEND_MODE)
}