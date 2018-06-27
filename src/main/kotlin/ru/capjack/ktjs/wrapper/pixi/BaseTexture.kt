@file:JsModule("ktjs-wrapper-pixi/pixi.min")

package ru.capjack.ktjs.wrapper.pixi

import org.w3c.dom.HTMLCanvasElement
import ru.capjack.ktjs.wrapper.pixi.utils.EventEmitter

open external class BaseTexture(source: dynamic, scaleMode: SCALE_MODE = definedExternally, resolution: Number = definedExternally) : EventEmitter {
	companion object {
		fun fromImage(imageUrl: String, crossOrigin: Boolean = definedExternally, scaleMode: SCALE_MODE = definedExternally, sourceScale: Number = definedExternally): BaseTexture
		
		fun fromCanvas(canvas: HTMLCanvasElement, scaleMode: SCALE_MODE = definedExternally, origin: String = definedExternally): BaseTexture
	}
	
	open val source: dynamic
	val hasLoaded: Boolean
	val sourceScale: Double
	var resolution: Double
	
	fun update()
	
	fun destroy()
}