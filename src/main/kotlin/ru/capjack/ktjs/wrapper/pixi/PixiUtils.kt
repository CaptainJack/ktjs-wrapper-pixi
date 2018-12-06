@file:JsModule("ktjs-wrapper-pixi/pixi")
@file:Suppress("PropertyName")

package ru.capjack.ktjs.wrapper.pixi

@JsName("utils")
external object PixiUtils {
	val isMobile: IsMobile
	
	fun skipHello()
	
	fun isWebGLSupported(): Boolean
}


external interface IsMobile {
	val any: Boolean
	val phone: Boolean
	val tablet: Boolean
	
	val apple: Apple
	val android: Android
	val amazon: Amazon
	val windows: Windows
	val other: Other
	
	interface Vendor {
		val phone: Boolean
		val tablet: Boolean
		val device: Boolean
	}
	
	interface Apple : Vendor {
		val ipod: Boolean
	}
	
	interface Android : Vendor
	
	interface Amazon : Vendor
	
	interface Windows : Vendor
	
	interface Other {
		val blackberry_10: Boolean
		val blackberry: Boolean
		val opera: Boolean
		val firefox: Boolean
		val chrome: Boolean
		val device: Boolean
	}
	
}