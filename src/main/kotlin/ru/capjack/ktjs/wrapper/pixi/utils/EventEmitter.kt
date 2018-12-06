@file:JsModule("ktjs-wrapper-pixi/pixi")
@file:JsQualifier("utils")

package ru.capjack.ktjs.wrapper.pixi.utils

open external class EventEmitter {
	fun on(event: String, fn: () -> Unit): EventEmitter
	
	fun <E : Any> on(event: String, fn: (event: E) -> Unit): EventEmitter
	
	fun once(event: String, fn: () -> Unit): EventEmitter
	
	fun <E : Any> once(event: String, fn: (event: E) -> Unit): EventEmitter
	
	fun off(event: String, fn: () -> Unit): EventEmitter
	
	fun <E : Any> off(event: String, fn: (event: E) -> Unit): EventEmitter
}