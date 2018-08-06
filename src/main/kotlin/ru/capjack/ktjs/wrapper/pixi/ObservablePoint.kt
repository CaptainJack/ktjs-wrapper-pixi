@file:JsModule("ktjs-wrapper-pixi/pixi.min")

package ru.capjack.ktjs.wrapper.pixi

external class ObservablePoint(cb: () -> Any) : PointLike {
	var cb: () -> Any
	
	var scope: Any
	
	constructor(cb: () -> Any, scope: Any = definedExternally, x: Number = definedExternally, y: Number = definedExternally)
}