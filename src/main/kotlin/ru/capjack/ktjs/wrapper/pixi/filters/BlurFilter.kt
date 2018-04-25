@file:JsModule("ktjs-wrapper-pixi/pixi")
@file:JsQualifier("filters")

package ru.capjack.ktjs.wrapper.pixi.filters

import ru.capjack.ktjs.wrapper.pixi.Filter

external class BlurFilter(
	strength: Number = definedExternally,
	quality: Number = definedExternally,
	resolution: Number = definedExternally,
	kernelSize: Number = definedExternally
) : Filter {
	
	var blur: Int
	var blurX: Int
	var blurY: Int
	var quality: Int
}