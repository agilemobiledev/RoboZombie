package com.lonepulse.robozombie.core.processor.validator;

/*
 * #%L
 * RoboZombie
 * %%
 * Copyright (C) 2013 Lonepulse
 * %%
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
 * #L%
 */


/**
 * <p>This runtime exception is thrown when a required annotation is missing from 
 * the designated endpoint interface.</p>
 * 
 * @version 1.1.1
 * <br><br>
 * @author <a href="mailto:lahiru@lonepulse.com">Lahiru Sahan Jayasinghe</a>
 */
class MissingEndpointAnnotationException extends EndpointValidationFailedException {

	
	private static final long serialVersionUID = 4087362624687849076L;

	
	/**
	 * <p>Displays a detailed description along with the stacktrace. 
	 */
	public MissingEndpointAnnotationException(Class<?> endpointInterface, Class<?> missingAnnotation) {
		
		this("Missing annotation " + missingAnnotation.getName() + " on endpoint " + 
			  endpointInterface.getName());
	}
	
	/**
	 * See {@link RuntimeException#RuntimeException()}.
	 */
	public MissingEndpointAnnotationException() {
	}

	/**
	 * See {@link RuntimeException#RuntimeException(String)}.
	 */
	public MissingEndpointAnnotationException(String detailMessage) {
		
		super(detailMessage);
	}

	/**
	 * See {@link RuntimeException#RuntimeException(Throwable)}.
	 */
	public MissingEndpointAnnotationException(Throwable throwable) {
		
		super(throwable);
	}

	/**
	 * See {@link RuntimeException#RuntimeException(String, Throwable)}.
	 */
	public MissingEndpointAnnotationException(String detailMessage, Throwable throwable) {

		super(detailMessage, throwable);
	}
}
