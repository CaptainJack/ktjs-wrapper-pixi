package ru.capjack.ktjs.wrapper.pixi

external interface AutoDetectRendererOptions : WebGLRendererOptions, CanvasRendererOptions {
	var forceCanvas: Boolean?
}