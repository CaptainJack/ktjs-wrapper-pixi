@file:JsModule("ktjs-wrapper-pixi/pixi.min")

package ru.capjack.ktjs.wrapper.pixi

open external class Sprite(texture: Texture = definedExternally) : Container, Textured {
	companion object {
		fun from(source: Any): Sprite
		
		fun fromImage(url: String): Sprite
	}
	
	var anchor: ObservablePoint
	
	override var texture: Texture
}