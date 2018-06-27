@file:JsModule("ktjs-wrapper-pixi/filter-drop-shadow")

package ru.capjack.ktjs.wrapper.pixi.filters

import ru.capjack.ktjs.wrapper.pixi.Filter

external class DropShadowFilter() : Filter {
	constructor(options: DropShadowFilterOptions)
	
	var alpha: Double
	var blur: Int
	var color: Int
	var distance: Int
	var kernels: Array<Int>
	var pixelSize: Any
	var quality: Int
	var rotation: Int?
}

external interface DropShadowFilterOptions {
	var rotation: Int?
	var distance: Int?
	var color: Int?
	var alpha: Double?
	var shadowOnly: Boolean?
	var blur: Int?
	var quality: Int?
	var kernels: Array<Int>?
	var pixelSize: Any?
	var resolution: Int
}
