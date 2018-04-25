package ru.capjack.ktjs.wrapper.pixi

external interface ApplicationOptions : AutoDetectRendererOptions {
	var autoStart: Boolean?
	var sharedTicker: Boolean?
	var sharedLoader: Boolean?
}