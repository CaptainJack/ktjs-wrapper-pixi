@file:JsModule("pixi.js")

package ru.capjack.ktjs.wrapper.pixi

import ru.capjack.ktjs.wrapper.pixi.utils.EventEmitter
import ru.capjack.ktjs.wrapper.pixi.Rectangle
//import ru.capjack.ktjs.wrapper.pixi.Filter

external open class DisplayObject : EventEmitter {
	var alpha: Boolean
	var buttonMode: Boolean
	
	var cacheAsBitmap:Boolean
	var cursor:String
	var filterArea:Rectangle?
//	var filters:Array<Filter>?
//	var hitArea:Any
	var interactive: Boolean
	var localTransform:Matrix
	var mask: DisplayObject
	var x: Double
	var y: Double
}