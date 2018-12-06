@file:JsModule("ktjs-wrapper-pixi/pixi")
@file:JsQualifier("loaders")

package ru.capjack.ktjs.wrapper.pixi.loaders

external class Resource {
	val name: String
	val url: String
	val extension: String
	val type: TYPE
	
	var data: dynamic
	val metadata: dynamic
	
	enum class TYPE {
		UNKNOWN,
		JSON,
		XML,
		IMAGE,
		AUDIO,
		VIDEO,
		TEXT
	}
}