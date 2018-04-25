@file:Suppress("UnsafeCastFromDynamic")

package ru.capjack.ktjs.wrapper.pixi.loaders

import ru.capjack.ktjs.common.js.toMap

fun Loader.load(handler: (resources: Map<String, Resource>) -> Unit): Loader {
	return this.load { _, resources ->
		handler(toMap(resources))
	}
}