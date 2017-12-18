@file:JsModule("pixi.js")

package ru.capjack.ktjs.wrapper.pixi
import ru.capjack.ktjs.wrapper.pixi.DestroyOptions
import ru.capjack.ktjs.wrapper.pixi.CanvasRenderer
import ru.capjack.ktjs.wrapper.pixi.WebGLRenderer

external class Container : DisplayObject {
	val childrenArray:Array<DisplayObject>
	val interactiveChildren:Boolean
	var width:Double
	var height:Double
	override val worldAlpha:Boolean
	
	fun calculateBounds()
	fun <T : DisplayObject> addChild(child: T): T
	fun <T : DisplayObject> addChildAt(child:T, index:Int):T
	override fun destroy(destroyChildren:Boolean)
	override fun destroy(options:DestroyOptions = definedExternally)//todo: check how to set defaults
	fun getChildAt(index:Int): DisplayObject
	fun getChildIndex(child:DisplayObject):Int
	fun removeChild(child:DisplayObject):DisplayObject
	fun removeChildAt(index:Int):DisplayObject
	fun removeChildren():Array<DisplayObject>
	fun removeChildren(beginIndex:Int = definedExternally):Array<DisplayObject>
	fun removeChildren(beginIndex:Int = definedExternally, endIndex:Int = definedExternally):Array<DisplayObject>
	override fun renderCanvas(renderer: CanvasRenderer)
	override fun renderWebGL(renderer: WebGLRenderer)
	fun setChildIndex(child:DisplayObject, index:Int)
	fun swapChildren(child:DisplayObject, child2:DisplayObject)
	override fun updateTransform()
	
}