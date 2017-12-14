@file:JsModule("pixi.js")

package ru.capjack.ktjs.wrapper.pixi

external interface ApplicationOptions : RendererOptions {
	var autoStart: Boolean?
	var sharedTicker: Boolean?
	var sharedLoader: Boolean?
}