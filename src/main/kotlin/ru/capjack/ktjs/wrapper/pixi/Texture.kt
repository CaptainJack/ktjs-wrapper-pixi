@file:JsModule("ktjs-wrapper-pixi/pixi")

package ru.capjack.ktjs.wrapper.pixi

import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.HTMLVideoElement
import ru.capjack.ktjs.wrapper.pixi.utils.EventEmitter

open external class Texture(
	baseTexture: BaseTexture,
	frame: Rectangle? = definedExternally,
	orig: Rectangle? = definedExternally,
	trim: Rectangle? = definedExternally,
	rotate: Number = definedExternally
) : EventEmitter {
	companion object {
		val EMPTY: Texture
		
		fun from(source: Any): Texture
		
		fun fromImage(imageUrl: String, crossOrigin: Boolean = definedExternally, scaleMode: SCALE_MODE = definedExternally, sourceScale: Double = definedExternally): Texture
		
		fun fromLoader(source: dynamic, imageUrl: String, name: String): Any
		
		fun fromVideo(video: HTMLVideoElement, scaleMode: SCALE_MODE = definedExternally): Texture
		
		fun fromVideoUrl(videoUrl: String, scaleMode: SCALE_MODE = definedExternally): Texture
		
		fun fromCanvas(canvas: HTMLCanvasElement, scaleMode: SCALE_MODE = definedExternally, origin:String = definedExternally):Texture
	}
	
	var baseTexture: BaseTexture
	
	var frame: Rectangle
	
	var width: Double
	
	var height: Double
	
	fun destroy(destroyBase: Boolean = definedExternally)
}

