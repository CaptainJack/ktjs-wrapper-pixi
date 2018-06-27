package ru.capjack.ktjs.wrapper.pixi

import org.w3c.dom.HTMLCanvasElement

external interface RendererOptions {
	var width: Int?
	
	var height: Int?
	
	var view: HTMLCanvasElement?
	
	var transparent: Boolean?
	
	var autoResize: Boolean?
	
	var antialias: Boolean?
	
	var resolution: Double?
	
	var preserveDrawingBuffer: Boolean?
	
	var clearBeforeRender: Boolean?
	
	var backgroundColor: Int?
	
	var roundPixels: Boolean?
}