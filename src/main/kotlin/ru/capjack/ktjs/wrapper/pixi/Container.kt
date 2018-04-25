@file:JsModule("ktjs-wrapper-pixi/pixi")

package ru.capjack.ktjs.wrapper.pixi

open external class Container : DisplayObject {
	val children: Array<DisplayObject>
	
	var interactiveChildren: Boolean
	
	var width: Double
	
	var height: Double
	
	fun calculateBounds()
	
	fun <T : DisplayObject> addChild(child: T): T
	
	fun <T : DisplayObject> addChildAt(child: T, index: Int): T
	
	open fun destroy(options: Boolean)
	
	open fun destroy(options: DestroyOptions = definedExternally)
	
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