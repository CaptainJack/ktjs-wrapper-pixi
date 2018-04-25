@file:JsModule("ktjs-wrapper-pixi/pixi")
@file:Suppress("ClassName")

package ru.capjack.ktjs.wrapper.pixi

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

external enum class SCALE_MODE {
	LINEAR,
	NEAREST
}

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