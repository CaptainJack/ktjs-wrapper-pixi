@file:JsModule("ktjs-wrapper-pixi/pixi")

package ru.capjack.ktjs.wrapper.pixi

@JsName("settings")
external object PixiSettings {
	var SCALE_MODE: SCALE_MODE
	var RESOLUTION: Double
	var TARGET_FPMS: Double
	var PRECISION_FRAGMENT: PRECISION
	var PRECISION_VERTEX: PRECISION
}