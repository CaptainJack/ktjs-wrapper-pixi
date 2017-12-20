@file:JsModule("pixi")
@file:JsNonModule

package ru.capjack.ktjs.wrapper.pixi

import org.w3c.dom.HTMLCanvasElement
import ru.capjack.ktjs.wrapper.pixi.utils.EventEmitter

external open class SystemRenderer : EventEmitter {
	constructor(system: String)
	constructor(system: String, options: RendererOptions)
	constructor(system: String, screenWidth: Int = definedExternally,
	            screenHeight: Int = definedExternally,
	            options: HTMLCanvasElement = definedExternally)
	
	var autoResize: Boolean
	var backgroundColor: Int
	var blendModes: Any // todo: in ts description type = any and marked as todo?
	var clearBeforeRender: Boolean
	val options: RendererOptions
	var preserveDrawingBuffer: Boolean
	var roundPixels: Boolean
	var screen: Rectangle
	var transparent: Boolean
	var view: HTMLCanvasElement
	
	val height: Int = definedExternally
	val width: Int = definedExternally
	val resolution: Double = definedExternally
	val type: Int = definedExternally //todo: describe PIXI.RENDERER_TYPE.UNKNOWN
	
	fun destroy(removeView: Boolean?)
	fun generateTexture(displayObject: DisplayObject, scaleMode: Double, resolution: Double, region: Rectangle?): RenderTexture
	fun resize(screenWidth: Int, screenHeight: Int)
	fun render(vararg args: Any)//todo: по описанию из ts в сорцах сигнатуры не нашла
}
