@file:JsModule("ktjs-wrapper-pixi/pixi.min")

package ru.capjack.ktjs.wrapper.pixi

external class TextStyle() {
	var align: String
	
	var breakWords: Boolean
	
	var dropShadow: Boolean
	
	var dropShadowAlpha: Double
	
	var dropShadowAngle: Double
	
	var dropShadowBlur: Double
	
	/*
	* String? | Double?
	*/
	var dropShadowColor: Any
	
	var dropShadowDistance: Int
	
	/*
	* String? | string[] | number | number[] | CanvasGradient | CanvasPattern;
	*/
	var fill: Any
	
	var fillGradientStops: Array<Double>
	
	var fillGradientType: Int
	
	/*
	* String? | Array<String>?
	*/
	var fontFamily: Any
	
	/*
	* Int? | String?
	*/
	var fontSize: Any
	
	var fontStyle: String
	
	var fontVariant: String
	
	var fontWeight: String
	
	var leading: Double
	
	var letterSpacing: Double
	
	var lineHeight: Int
	
	var lineJoin: String
	
	var miterLimit: Double
	
	var padding: Int
	
	/*
	* String? | Int?
	*/
	var stroke: Any
	
	var strokeThickness: Double
	
	var textBaseline: String
	
	var trim: Boolean
	
	var wordWrap: Boolean
	
	var wordWrapWidth: Int
	
	
	constructor(options: TextStyleOptions = definedExternally)
	
	fun clone(): TextStyle
	
	fun reset()
	
	fun toFontString(): String
}