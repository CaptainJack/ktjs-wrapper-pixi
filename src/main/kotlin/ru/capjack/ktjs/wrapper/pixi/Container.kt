@file:JsModule("pixi.js")

package ru.capjack.ktjs.wrapper.pixi

external class Container : DisplayObject {
	fun <T : DisplayObject> addChild(child: T): T
}