@file:JsModule("ktjs-wrapper-pixi/pixi.min")
@file:JsQualifier("interaction")

package ru.capjack.ktjs.wrapper.pixi.interaction

import org.w3c.dom.HTMLCanvasElement
import ru.capjack.ktjs.wrapper.pixi.Container
import ru.capjack.ktjs.wrapper.pixi.DisplayObject
import ru.capjack.ktjs.wrapper.pixi.Point
import ru.capjack.ktjs.wrapper.pixi.SystemRenderer
import ru.capjack.ktjs.wrapper.pixi.utils.EventEmitter

external class InteractionManager(renderer: SystemRenderer) : EventEmitter {
	
	var renderer: SystemRenderer
	
	var autoPreventDefault: Boolean
	
	var interactionFrequency: Number
	
	var mouse: InteractionData
	
	/**
	 * Actively tracked InteractionData {Object.<number,PIXI.interation.InteractionData>}
	 */
	var activeInteractionData: Any
	
	var interactionDataPool: Array<InteractionData>
	
	var eventData: InteractionEvent
	
	var moveWhenInside: Boolean
	
	var eventsAdded: Boolean
	
	val supportsTouchEvents: Boolean
	
	val supportsPointerEvents: Boolean
	
	constructor(renderer: SystemRenderer, options: InteractionManagerOption)
	
	constructor(
		renderer: SystemRenderer, autoPreventDefault: Boolean = definedExternally,
		interactionFrequency: Int = definedExternally
	)
	
	var cursorStyles: dynamic
	
	var currentCursorMode: String
	
	var cursor: String
	
	var resolution: Number
	
	
	fun hitTest(globalPoint: Point, root: Container = definedExternally): DisplayObject
	
	fun setTargetElement(element: HTMLCanvasElement, resolution: Number)
	
	fun update(deltaTime: Number = definedExternally)
	
	fun setCursorMode(mode: String)
	
	fun mapPositionToPoint(point: Point, x: Number, y: Number)
	
	fun destroy()
}