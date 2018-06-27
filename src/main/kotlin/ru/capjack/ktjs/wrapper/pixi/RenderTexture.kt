@file:JsModule("ktjs-wrapper-pixi/pixi.min")

package ru.capjack.ktjs.wrapper.pixi

external class RenderTexture(
	baseRenderTexture: BaseRenderTexture,
	frame: Rectangle = definedExternally
) : Texture {
	
	companion object {
		fun create(
			width: Number = definedExternally,
			height: Number = definedExternally,
			scaleMode: SCALE_MODE = definedExternally,
			resolution: Number = definedExternally
		): RenderTexture
	}
	
	fun resize(width: Number, height: Number, doNotResizeBaseTexture: Boolean)
}