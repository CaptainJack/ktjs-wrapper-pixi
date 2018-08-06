package ru.capjack.ktjs.wrapper.pixi

external interface WebGLRendererOptions : RendererOptions {
	var forceFXAA: Boolean?
	
	var legacy: Boolean?
	
	var powerPreference: Boolean?
}