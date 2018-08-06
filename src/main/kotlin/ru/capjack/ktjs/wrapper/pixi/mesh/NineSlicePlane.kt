@file:JsModule("ktjs-wrapper-pixi/pixi.min")
@file:JsQualifier("mesh")

package ru.capjack.ktjs.wrapper.pixi.mesh

import ru.capjack.ktjs.wrapper.pixi.Texture

external class NineSlicePlane(texture: Texture) : Plane {
	constructor(texture: Texture, options: NineSlicePlaneOptions = definedExternally)
	
	constructor(
		texture: Texture,
		leftWidth: Int = definedExternally,
		topHeight: Int = definedExternally,
		rightWidth: Int = definedExternally,
		bottomHeight: Int = definedExternally
	)
	
	var leftWidth: Int
	var rightWidth: Int
	var topHeight: Int
	var bottomHeight: Int
	
	fun updateHorizontalVertices()
	
	fun updateVerticalVertices()
}