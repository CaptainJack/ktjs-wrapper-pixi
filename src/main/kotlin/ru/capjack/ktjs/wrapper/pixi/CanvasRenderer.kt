@file:JsModule("pixi.js")

package ru.capjack.ktjs.wrapper.pixi

import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement
import ru.capjack.ktjs.wrapper.pixi.extract.CanvasExtract

external class CanvasRenderer() : SystemRenderer {
	constructor(options: RendererOptions)
	constructor(screenWidth: Int = definedExternally,
	            screenHeight: Int = definedExternally,
	            options: HTMLCanvasElement = definedExternally)
	
	var context: CanvasRenderingContext2D?
	var extract: CanvasExtract
	var maskManager: CanvasMaskManager
	val plugins: CanvasRendererPlugins
	var refresh: Boolean
	var rootContext: CanvasRenderingContext2D
	var smoothProperty: String
	
	fun clear(clearColor: String?)
	fun invalidateBlendMode()
	
	companion object {
		//todo: не поняла, что и как делает. описание на js:
		/**
		 * Adds a plugin to the renderer.
		 *
		 * @method PIXI.CanvasRenderer#registerPlugin
		 * @param {string} pluginName - The name of the plugin.
		 * @param {Function} ctor - The constructor function or class for the plugin.
		 */
		//описание ts:
		//static registerPlugin(pluginName: string, ctor: { new(renderer: CanvasRenderer): any; }): void;
		fun registerPlugin(pluginName: String, ctor: (Any) -> Any)
	}
	
	fun render(displayObject: DisplayObject, renderTexture: RenderTexture?, clear: Boolean? = definedExternally,
	           transform: TransformBase?, skipUpdateTransform: Boolean? = definedExternally)
	
	fun setBlendMode(blendMode: Int)//todo: describe PIXI.BLEND_MODES
}