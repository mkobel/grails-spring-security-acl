/* Copyright 2009-2012 SpringSource.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package test

import grails.plugins.springsecurity.Secured

class TestRunAsService {

	def testSecureService

	@Secured(['ROLE_ADMIN', 'RUN_AS_SUPERUSER'])
	String method1() {
		testSecureService.method1()
	}

	@Secured(['ROLE_ADMIN', 'RUN_AS_SUPERUSER'])
	String method2() {
		testSecureService.method2()
	}
}
