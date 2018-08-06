@file:JsModule("ktjs-wrapper-pixi/pixi.min")

package ru.capjack.ktjs.wrapper.pixi

external class BaseRenderTexture(
	width: Number = definedExternally,
	height: Number = definedExternally,
	scaleMode: SCALE_MODE = definedExternally,
	resolution: Number = definedExternally
) : BaseTexture {
	
	val valid: Boolean
	
	fun resize(width: Int, height: Int)
}
