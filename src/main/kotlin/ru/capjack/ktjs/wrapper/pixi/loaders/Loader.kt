@file:JsModule("ktjs-wrapper-pixi/pixi")
@file:JsQualifier("loaders")

package ru.capjack.ktjs.wrapper.pixi.loaders

import ru.capjack.ktjs.wrapper.pixi.utils.EventEmitter

external class Loader(baseUrl: String = definedExternally, concurrency: Int = definedExternally) : EventEmitter {
	val baseUrl: String
	
	val defaultQueryString: String
	
	val loading: Boolean
	
	val progress: Double
	
	fun add(name: String, url: String): Loader
	
	fun add(url: String): Loader
	
	fun pre(handler: (resource: Resource) -> Unit): Loader
	
	fun use(handler: (resource: Resource) -> Unit): Loader
	
	fun load(): Loader
	
	fun load(handler: () -> Unit): Loader
	
	fun load(handler: (loader: Loader, resources: dynamic) -> Unit): Loader
}