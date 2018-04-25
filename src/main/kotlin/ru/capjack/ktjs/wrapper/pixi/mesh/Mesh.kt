@file:JsModule("ktjs-wrapper-pixi/pixi")
@file:JsQualifier("mesh")
@file:Suppress("ClassName")

package ru.capjack.ktjs.wrapper.pixi.mesh

import org.khronos.webgl.Float32Array
import org.khronos.webgl.Uint16Array
import ru.capjack.ktjs.wrapper.pixi.BLEND_MODE
import ru.capjack.ktjs.wrapper.pixi.Container
import ru.capjack.ktjs.wrapper.pixi.Point
import ru.capjack.ktjs.wrapper.pixi.Shader
import ru.capjack.ktjs.wrapper.pixi.Texture
import ru.capjack.ktjs.wrapper.pixi.Textured

open external class Mesh(texture: Texture) : Container, Textured {
	
	companion object DRAW_MODES {
		val TRIANGLE_MESH: Int
		val TRIANGLES: Int
	}
	
	override var texture: Texture
	
	var blendMode: BLEND_MODE
	var canvasPadding: Int
	var dirty: Int
	var drawMode: Int
	var indexDirty: Int
	var indices: Uint16Array
	var pluginName: String
	var shader: Shader?
	var tint: Int
	var tintRgb: Float32Array
	var uploadUvTransform: Boolean
	var uvs: Float32Array
	var vertices: Float32Array
	
	constructor(
		texture: Texture,
		vertices:
		Float32Array = definedExternally,
		uvs: Float32Array = definedExternally,
		indices: Uint16Array = definedExternally,
		drawMode: Int = definedExternally
	)
	
	fun multiplyUvs()
	
	fun refresh(forceUpdate: Boolean = definedExternally)
	
	fun containsPoint(point: Point): Boolean
}