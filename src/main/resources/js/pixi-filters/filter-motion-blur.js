/*!
 * @pixi/filter-motion-blur - v2.6.1
 * Compiled Sat, 09 Jun 2018 08:50:18 UTC
 *
 * @pixi/filter-motion-blur is licensed under the MIT License.
 * http://www.opensource.org/licenses/mit-license
 */
!function(e,t){"object"==typeof exports&&"undefined"!=typeof module?t(exports,require("pixi.js")):"function"==typeof define&&define.amd?define(["exports","pixi.js"],t):t(e.__filters={},e.PIXI)}(this,function(e,t){"use strict";var i="attribute vec2 aVertexPosition;\nattribute vec2 aTextureCoord;\n\nuniform mat3 projectionMatrix;\n\nvarying vec2 vTextureCoord;\n\nvoid main(void)\n{\n    gl_Position = vec4((projectionMatrix * vec3(aVertexPosition, 1.0)).xy, 0.0, 1.0);\n    vTextureCoord = aTextureCoord;\n}",o="varying vec2 vTextureCoord;\nuniform sampler2D uSampler;\nuniform vec4 filterArea;\n\nuniform vec2 uVelocity;\nuniform int uKernelSize;\nuniform float uOffset;\n\nconst int MAX_KERNEL_SIZE = 2048;\n\n// Notice:\n// the perfect way:\n//    int kernelSize = min(uKernelSize, MAX_KERNELSIZE);\n// BUT in real use-case , uKernelSize < MAX_KERNELSIZE almost always.\n// So use uKernelSize directly.\n\nvoid main(void)\n{\n    vec4 color = texture2D(uSampler, vTextureCoord);\n\n    if (uKernelSize == 0)\n    {\n        gl_FragColor = color;\n        return;\n    }\n\n    vec2 velocity = uVelocity / filterArea.xy;\n    float offset = -uOffset / length(uVelocity) - 0.5;\n    int k = uKernelSize - 1;\n\n    for(int i = 0; i < MAX_KERNEL_SIZE - 1; i++) {\n        if (i == k) {\n            break;\n        }\n        vec2 bias = velocity * (float(i) / float(k) + offset);\n        color += texture2D(uSampler, vTextureCoord + bias);\n    }\n    gl_FragColor = color / float(uKernelSize);\n}\n",n=function(e){function n(n,r,l){void 0===n&&(n=[0,0]),void 0===r&&(r=5),void 0===l&&(l=0),e.call(this,i,o),this.uniforms.uVelocity=new Float32Array(2),this._velocity=new t.ObservablePoint(this.velocityChanged,this),this.velocity=n,this.kernelSize=r,this.offset=l}e&&(n.__proto__=e),n.prototype=Object.create(e&&e.prototype),n.prototype.constructor=n;var r={velocity:{configurable:!0},offset:{configurable:!0}};return n.prototype.apply=function(e,t,i,o){var n=this.velocity,r=n.x,l=n.y;this.uniforms.uKernelSize=0!==r||0!==l?this.kernelSize:0,e.applyFilter(this,t,i,o)},r.velocity.set=function(e){Array.isArray(e)?this._velocity.set(e[0],e[1]):(e instanceof t.Point||e instanceof t.ObservablePoint)&&this._velocity.copy(e)},r.velocity.get=function(){return this._velocity},n.prototype.velocityChanged=function(){this.uniforms.uVelocity[0]=this._velocity.x,this.uniforms.uVelocity[1]=this._velocity.y},r.offset.set=function(e){this.uniforms.uOffset=e},r.offset.get=function(){return this.uniforms.uOffset},Object.defineProperties(n.prototype,r),n}(t.Filter);e.MotionBlurFilter=n,Object.defineProperty(e,"__esModule",{value:!0})}),Object.assign(PIXI.filters,this?this.__filters:__filters);
//# sourceMappingURL=filter-motion-blur.js.map
