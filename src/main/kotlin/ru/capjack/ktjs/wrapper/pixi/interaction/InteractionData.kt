@file:JsModule("ktjs-wrapper-pixi/pixi.min")
@file:JsQualifier("interaction")

package ru.capjack.ktjs.wrapper.pixi.interaction

import ru.capjack.ktjs.wrapper.pixi.DisplayObject
import ru.capjack.ktjs.wrapper.pixi.Point

external class InteractionData {
	
	var global: Point
	
	var target: DisplayObject
	
	var originalEvent: Any
	
	var identifier: Int
	
	var isPrimary: Boolean
	
	var button: Int
	
	var buttons: Int
	
	var width: Double
	
	var height: Double
	
	var tiltX: Double
	
	var tiltY: Double
	
	var pointerType: String
	
	var pressure: Double
	
	var rotationAngle: Double
	
	var twist: Double
	
	var tangentialPressure: Double
	
	val pointerID: Int
	
	
	fun getLocalPosition(displayObject: DisplayObject): Point
	
	fun getLocalPosition(displayObject: DisplayObject, point: Point = definedExternally, globalPos: Point = definedExternally): Point
	
}