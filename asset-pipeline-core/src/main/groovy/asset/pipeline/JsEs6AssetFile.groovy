/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package asset.pipeline

import asset.pipeline.processors.Es6Processor

import java.util.regex.Pattern
import asset.pipeline.processors.JsProcessor
import groovy.transform.CompileStatic
/**
 * An {@link AssetFile} implementation for ES6 Javascript
 *
 * @author David Estes
 * @author Graeme Rocher
 */
@CompileStatic
class JsEs6AssetFile extends AbstractAssetFile {
    static final List<String> contentType = ['application/javascript', 'application/x-javascript','text/javascript']
    static List<String> extensions = ['es6','js.es6']
    static String compiledExtension = 'js'
    static processors = [JsProcessor, Es6Processor]
    Pattern directivePattern = ~/(?m)^\/\/=(.*)/

}
