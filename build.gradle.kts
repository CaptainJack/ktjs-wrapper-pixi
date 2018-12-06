import de.undercouch.gradle.tasks.download.Download
import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile
import ru.capjack.degos.publish.DegosPublishExtension

group = "ru.capjack.ktjs"

plugins {
	id("kotlin2js") version "1.2.60"
	id("ru.capjack.degos.publish") version "1.7.0"
	id("nebula.release") version "6.3.5"
	id("de.undercouch.download") version "3.4.2"
}

repositories {
	jcenter()
	maven("http://artifactory.capjack.ru/public")
}

dependencies {
	implementation(kotlin("stdlib-js"))
	implementation("ru.capjack.ktjs:ktjs-common:0.4.0")
}

tasks.withType<Kotlin2JsCompile> {
	kotlinOptions {
		moduleKind = "amd"
		sourceMap = true
		sourceMapEmbedSources = "always"
	}
}

task<Download>("downloadPixi") {
	src("https://pixijs.download/v${ext["pixiVersion"]}/pixi.js")
	src("https://pixijs.download/v${ext["pixiVersion"]}/pixi.js.map")
	src("https://pixijs.download/v${ext["pixiVersion"]}/pixi.min.js")
	src("https://pixijs.download/v${ext["pixiVersion"]}/pixi.min.js.map")
	dest("src/main/resources/js")
}