package ru.capjack.ktjs.wrapper.pixi

external interface TextStyleOptions {
	var align: String?
	
	var breakWords: Boolean?
	
	var dropShadow: Boolean?
	
	var dropShadowAlpha: Double?
	
	var dropShadowAngle: Double?
	
	var dropShadowBlur: Double?
	
	/*
	* String? | Double?
	*/
	var dropShadowColor: Any?
	
	var dropShadowDistance: Int?
	
	/*
	* String? | string[] | number | number[] | CanvasGradient | CanvasPattern;
	*/
	var fill: Any?
	
	var fillGradientType: Int?
	
	var fillGradientStops: Array<Double>?
	
	/*
	* String? | Array<String>?
	*/
	var fontFamily: Any?
	
	/*
	* Int? | String?
	*/
	var fontSize: Any?
	
	var fontStyle: String?
	
	var fontVariant: String?
	
	var fontWeight: String?
	
	var leading: Double?
	
	var letterSpacing: Double?
	
	var lineHeight: Int?
	
	var lineJoin: String?
	
	var miterLimit: Double?
	
	var padding: Int?
	
	/*
	* String? | Int?
	*/
	var stroke: Any?
	
	var strokeThickness: Double?
	
	var trim: Boolean?
	
	var textBaseline: String?
	
	var wordWrap: Boolean?
	
	var wordWrapWidth: Int?
}