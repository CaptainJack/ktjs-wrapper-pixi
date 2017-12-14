@file:JsModule("pixi.js")

package ru.capjack.ktjs.wrapper.pixi

import org.w3c.dom.HTMLCanvasElement

external interface RendererOptions {
	var width: Int?
	var height: Int?
	var view: HTMLCanvasElement?
	var transparent: Boolean?
	var antialias: Boolean?
	var preserveDrawingBuffer: Boolean?
	var resolution: Double?
	var forceCanvas: Boolean?
	var backgroundColor: Int?
	var clearBeforeRender: Boolean?
	var roundPixels: Boolean?
	var forceFXAA: Boolean?
	var legacy: Boolean?
	var powerPreference: Boolean?
}