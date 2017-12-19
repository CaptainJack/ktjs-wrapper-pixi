@file:JsModule("pixi.js")

package ru.capjack.ktjs.wrapper.pixi

import ru.capjack.ktjs.wrapper.pixi.Matrix

external class TransformBase {
	//	todo: в описании этого нет, в сорцах есть и в описании ts тоже
	companion object {
		val IDENTITY:TransformBase = definedExternally
	}
	var localTransform: Matrix
	var worldTransform: Matrix
	
	fun updateLocalTransform()
	fun updateTransform(parentTransform: TransformBase)
//	todo: in source it looks:
// TransformBase.prototype.updateWorldTransform = TransformBase.prototype.updateTransform;
	fun updateWorldTransform(parentTransform: TransformBase)
}