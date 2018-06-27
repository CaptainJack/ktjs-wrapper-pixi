@file:JsModule("ktjs-wrapper-pixi/pixi.min")

package ru.capjack.ktjs.wrapper.pixi

import org.w3c.dom.HTMLVideoElement

external class VideoBaseTexture : BaseTexture {
	companion object {
		fun fromUrl(src: String, scaleMode: Number = definedExternally, crossOrigin: Boolean = definedExternally): VideoBaseTexture
		
		fun fromVideo(video: HTMLVideoElement, scaleMode: SCALE_MODE = definedExternally): VideoBaseTexture
	}
	
	override val source: HTMLVideoElement
	var autoPlay: Boolean
	var autoUpdate: Boolean
}