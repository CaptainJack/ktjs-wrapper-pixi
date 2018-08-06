@file:JsModule("ktjs-wrapper-pixi/pixi.min")
@file:JsQualifier("filters")

package ru.capjack.ktjs.wrapper.pixi.filters

import ru.capjack.ktjs.wrapper.pixi.Filter

external class AlphaFilter(
	alpha: Number = definedExternally
) : Filter {
	var alpha: Double
}