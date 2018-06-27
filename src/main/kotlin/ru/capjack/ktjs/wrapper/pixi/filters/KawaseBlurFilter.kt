@file:JsModule("ktjs-wrapper-pixi/filter-kawase-blur")

package ru.capjack.ktjs.wrapper.pixi.filters

import ru.capjack.ktjs.wrapper.pixi.Filter

external class KawaseBlurFilter(
	blur: Int = definedExternally,
	quality: Int = definedExternally,
	clamp: Boolean = definedExternally
) : Filter {
	
	constructor(
		blur: Array<Int> = definedExternally,
		quality: Int = definedExternally,
		clamp: Boolean = definedExternally
	)
	
	var blur: Int
	var clamp: Boolean
	var kernels: Array<Int>
	var pixelSize: Any
	var quality: Int
}