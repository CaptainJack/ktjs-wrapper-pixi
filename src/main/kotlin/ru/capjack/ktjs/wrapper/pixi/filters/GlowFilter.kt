@file:JsModule("ktjs-wrapper-pixi/filter-motion-blur")

package ru.capjack.ktjs.wrapper.pixi.filters

import ru.capjack.ktjs.wrapper.pixi.Filter

external class GlowFilter(
	distance: Int = definedExternally,
	outerStrength: Int = definedExternally,
	innerStrength: Int = definedExternally,
	color: Int = definedExternally,
	quality: Number = definedExternally
) : Filter {
	val distance: Int
	val outerStrength: Int
	val innerStrength: Int
	val color: Int
	val quality: Double
}