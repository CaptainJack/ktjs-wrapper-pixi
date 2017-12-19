@file:JsModule("pixi.js")

package ru.capjack.ktjs.wrapper.pixi

external class Container : DisplayObject {
	val childrenArray: Array<DisplayObject>
	val interactiveChildren: Boolean
	var width: Double
	var height: Double
	
	fun calculateBounds()
	fun <T : DisplayObject> addChild(child: T): T
	fun <T : DisplayObject> addChildAt(child: T, index: Int): T
	fun destroy(destroyChildren: Boolean)
	fun destroy(options: DestroyOptions)//todo: check how to set defaults
	fun getChildAt(index: Int): DisplayObject
	fun getChildIndex(child: DisplayObject): Int
	fun removeChild(child: DisplayObject): DisplayObject
	fun removeChildAt(index: Int): DisplayObject
	fun removeChildren(): Array<DisplayObject>
	fun removeChildren(beginIndex: Int = definedExternally): Array<DisplayObject>
	fun removeChildren(beginIndex: Int = definedExternally, endIndex: Int = definedExternally): Array<DisplayObject>
	fun setChildIndex(child: DisplayObject, index: Int)
	fun swapChildren(child: DisplayObject, child2: DisplayObject)
	
}