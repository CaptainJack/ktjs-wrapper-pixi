@file:JsModule("ktjs-wrapper-pixi/pixi.min")
@file:JsQualifier("mesh")

package ru.capjack.ktjs.wrapper.pixi.mesh

import ru.capjack.ktjs.wrapper.pixi.Texture

open external class Plane(texture: Texture) : Mesh {
	constructor(texture: Texture, verticesX: Int = definedExternally, verticesY: Int = definedExternally)
	
	var verticesX: Int
	var verticesY: Int
	
	fun refresh()
}