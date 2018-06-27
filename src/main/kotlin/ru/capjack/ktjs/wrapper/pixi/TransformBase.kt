@file:JsModule("ktjs-wrapper-pixi/pixi.min")

package ru.capjack.ktjs.wrapper.pixi

external class TransformBase {
	
	var localTransform: Matrix
	
	var worldTransform: Matrix
	
	companion object {
		val IDENTITY: TransformBase = definedExternally
	}
	
	fun updateLocalTransform()
	
	fun updateTransform(parentTransform: TransformBase)
	
	fun updateWorldTransform(parentTransform: TransformBase)
}