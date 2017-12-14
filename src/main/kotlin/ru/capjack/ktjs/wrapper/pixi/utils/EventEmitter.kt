@file:JsModule("pixi.js")
@file:JsQualifier("utils")

package ru.capjack.ktjs.wrapper.pixi.utils

external open class EventEmitter {
	fun on(event: String, fn: () -> Unit): EventEmitter
	fun once(event: String, fn: () -> Unit): EventEmitter
}