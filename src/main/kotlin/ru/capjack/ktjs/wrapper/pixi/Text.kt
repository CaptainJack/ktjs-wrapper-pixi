@file:JsModule("ktjs-wrapper-pixi/pixi")

package ru.capjack.ktjs.wrapper.pixi

import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement

open external class Text(text: String) : Sprite {
	var canvas: HTMLCanvasElement
	
	var context: CanvasRenderingContext2D
	
	var text: String
	
	var style: TextStyle
	
	var resolution: Double
	
	
	constructor(text: String, options: TextStyleOptions)
	
	constructor(text: String, style: TextStyle)
}