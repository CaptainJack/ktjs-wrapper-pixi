@file:JsModule("ktjs-wrapper-pixi/pixi")
@file:JsQualifier("extras")

package ru.capjack.ktjs.wrapper.pixi.extras

import ru.capjack.ktjs.wrapper.pixi.Sprite
import ru.capjack.ktjs.wrapper.pixi.Texture

external class AnimatedSprite(textures: Array<Texture>, autoUpdate: Boolean = definedExternally) : Sprite {
	val playing: Boolean
	val currentFrame: Int
	val totalFrames: Int
	
	var animationSpeed: Double
	var loop: Boolean
	var textures: Array<Texture>
	
	var onComplete: (() -> Unit)?
	var onFrameChange: (() -> Unit)?
	var onLoop: (() -> Unit)?
	
	fun play()
	
	fun stop()
	
	fun gotoAndPlay(frameNumber: Int)
	
	fun gotoAndStop(frameNumber: Int)
}