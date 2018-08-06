package ru.capjack.ktjs.wrapper.pixi.interaction

import ru.capjack.ktjs.wrapper.pixi.DisplayObject

external interface InteractionEvent {
	
	var stopped: Boolean
	
	var target: DisplayObject
	
	var currentTarget: DisplayObject
	
	var type: String
	
	var data: InteractionData
	
	fun stopPropagation()
}
