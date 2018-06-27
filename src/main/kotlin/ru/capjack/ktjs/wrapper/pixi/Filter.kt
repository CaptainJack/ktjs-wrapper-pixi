@file:JsModule("ktjs-wrapper-pixi/pixi.min")

package ru.capjack.ktjs.wrapper.pixi

open external class Filter : Shader {
	var autoFit: Boolean
	var blendMode: BLEND_MODE
	var enabled: Boolean
	var fragmentSrc: String
	var padding: Number
	var resolution: Double
	var uniforms: dynamic
	var vertexSrc: String
	
	fun apply(filterManager: FilterManager, input: RenderTarget, output: RenderTarget, clear: Boolean, currentState: dynamic = definedExternally)
}

