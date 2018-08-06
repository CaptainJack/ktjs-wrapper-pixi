@file:JsModule("ktjs-wrapper-pixi/pixi.min")
@file:JsQualifier("filters")

package ru.capjack.ktjs.wrapper.pixi.filters

import ru.capjack.ktjs.wrapper.pixi.Filter

external class ColorMatrixFilter : Filter {
	var matrix: Array<Double> = definedExternally
	
	fun saturate(amount: Double, multiply: Boolean = definedExternally)
	
	fun brightness(b: Double, multiply: Boolean = definedExternally)
	
	fun contrast(amount: Double, multiply: Boolean = definedExternally)
	
	fun hue(rotation: Double, multiply: Boolean = definedExternally)
	
	fun colorTone(desaturation: Double, toned: Double, lightColor: String, darkColor: String, multiply: Boolean = definedExternally)
}