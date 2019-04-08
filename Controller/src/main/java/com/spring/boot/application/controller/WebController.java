/*
 * Copyright 2015-2018 the original author or authors.
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

package com.spring.boot.application.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.application.interfaces.WebInterface;
import com.spring.boot.application.web.domain.Greeting;



@RequestMapping("/test/api")
@RestController
public class WebController {

	private WebInterface buildingService;
	private final AtomicLong counter = new AtomicLong();

	@Autowired
	public WebController(WebInterface buildingService) {
		this.buildingService = buildingService;
	}

	/*
	 * Test
	 */
	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public Greeting greeting() {
		return new Greeting(String.valueOf(this.counter.incrementAndGet()), "Greetings to User.");
	}
}