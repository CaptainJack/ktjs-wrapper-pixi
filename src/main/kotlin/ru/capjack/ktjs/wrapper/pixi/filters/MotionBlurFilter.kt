@file:JsModule("ktjs-wrapper-pixi/pixi-filters/filter-motion-blur")
@file:JsQualifier("filters")

package ru.capjack.ktjs.wrapper.pixi.filters

import ru.capjack.ktjs.wrapper.pixi.Filter
import ru.capjack.ktjs.wrapper.pixi.PointLike

external class MotionBlurFilter(
	velocity: PointLike = definedExternally,
	kernelSize: Number = definedExternally,
	offset: Number = definedExternally
) : Filter {
	
	constructor(velocity: Array<out Number>, kernelSize: Number = definedExternally, offset: Number = definedExternally)
	
	var velocity: PointLike
	var kernelSize: Double
	var offset: Double
}