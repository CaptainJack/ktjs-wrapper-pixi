@file:JsModule("ktjs-wrapper-pixi/pixi")

package ru.capjack.ktjs.wrapper.pixi

import org.khronos.webgl.TexImageSource
import org.w3c.dom.HTMLCanvasElement
import ru.capjack.ktjs.wrapper.pixi.utils.EventEmitter

open external class BaseTexture(source: dynamic, scaleMode: SCALE_MODE = definedExternally, resolution: Number = definedExternally) : EventEmitter {
	companion object {
		fun fromImage(imageUrl: String, crossOrigin: Boolean = definedExternally, scaleMode: SCALE_MODE = definedExternally, sourceScale: Number = definedExternally): BaseTexture
		
		fun fromCanvas(canvas: HTMLCanvasElement, scaleMode: SCALE_MODE = definedExternally, origin: String = definedExternally): BaseTexture
	}
	
	val hasLoaded: Boolean
	val isLoading: Boolean
	
	open val source: TexImageSource
	val sourceScale: Double
	val imageType: String
	var imageUrl: String?
	
	val height: Int
	val width: Int
	val realHeight: Int
	val realWidth: Int
	
	var resolution: Double
	
	var mipmap: Boolean
	var premultipliedAlpha: Boolean
	var scaleMode: SCALE_MODE
	var textureCacheIds: Array<String>
	var wrapMode: Number
	
	fun update()
	
	fun destroy()
	
	fun dispose()
}