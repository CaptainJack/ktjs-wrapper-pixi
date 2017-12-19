@file:JsModule("pixi.js")

package ru.capjack.ktjs.wrapper.pixi

import ru.capjack.ktjs.wrapper.pixi.PointLike

external class Point(x: Double = definedExternally, y: Double = definedExternally) : PointLike(x, y) {
	
	fun clone(): Point
	fun equals(p: PointLike): Boolean
}