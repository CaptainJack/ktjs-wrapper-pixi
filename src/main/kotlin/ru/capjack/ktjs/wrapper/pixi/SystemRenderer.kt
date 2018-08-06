@file:JsModule("ktjs-wrapper-pixi/pixi.min")

package ru.capjack.ktjs.wrapper.pixi

import org.w3c.dom.HTMLCanvasElement
import ru.capjack.ktjs.wrapper.pixi.utils.EventEmitter

external abstract class SystemRenderer : EventEmitter {
	open val options: RendererOptions
	
	val width: Int
	
	val height: Int
	
	var autoResize: Boolean
	
	var backgroundColor: Int
	
	var blendModes: Map<String, Any>
	
	var clearBeforeRender: Boolean
	
	var preserveDrawingBuffer: Boolean
	
	var roundPixels: Boolean
	
	var resolution: Double
	
	var screen: Rectangle
	
	var transparent: Boolean
	
	var type: RENDERER_TYPE
	
	var view: HTMLCanvasElement
	
	fun resize(screenWidth: Int, screenHeight: Int)
	
	fun generateTexture(displayObject: DisplayObject, scaleMode: SCALE_MODE, resolution: Number, region: Rectangle = definedExternally): RenderTexture
	
	fun render(
		displayObject: DisplayObject,
		renderTexture: RenderTexture = definedExternally,
		clear: Boolean = definedExternally,
		transform: Transform = definedExternally,
		skipUpdateTransform: Boolean = definedExternally
	)
	
	fun destroy(removeView: Boolean = definedExternally)
}

