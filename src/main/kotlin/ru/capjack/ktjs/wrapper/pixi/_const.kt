@file:JsModule("ktjs-wrapper-pixi/pixi.min")
@file:Suppress("ClassName")

package ru.capjack.ktjs.wrapper.pixi

@JsName("SHAPES")
external enum class SHAPE {
	POLY,
	RECT,
	CIRC,
	ELIP,
	RREC
}

external enum class RENDERER_TYPE {
	UNKNOWN,
	WEBGL,
	CANVAS
}

@JsName("SCALE_MODES")
external enum class SCALE_MODE {
	LINEAR,
	NEAREST
}

@JsName("BLEND_MODES")
external enum class BLEND_MODE {
	NORMAL,
	ADD,
	MULTIPLY,
	SCREEN,
	OVERLAY,
	DARKEN,
	LIGHTEN,
	COLOR_DODGE,
	COLOR_BURN,
	HARD_LIGHT,
	SOFT_LIGHT,
	DIFFERENCE,
	EXCLUSION,
	HUE,
	SATURATION,
	COLOR,
	LUMINOSITY
}