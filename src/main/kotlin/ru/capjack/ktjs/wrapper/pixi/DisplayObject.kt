@file:JsModule("pixi.js")

package ru.capjack.ktjs.wrapper.pixi

import ru.capjack.ktjs.wrapper.pixi.utils.EventEmitter

external open class DisplayObject : EventEmitter {
	var alpha: Boolean
	var buttonMode: Boolean
	var interactive: Boolean
	var mask: DisplayObject
	var x: Double
	var y: Double
}