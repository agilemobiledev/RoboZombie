package com.lonepulse.robozombie.core.processor.executor;

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


import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpRequestBase;

import com.lonepulse.robozombie.core.HttpClientContract;
import com.lonepulse.robozombie.core.processor.ProxyInvocationConfiguration;

/**
 * <p>Specifies the contract for executing HTTP requests. 
 * 
 * @version 1.1.0
 * <br><br>
 * @author <a href="mailto:lahiru@lonepulse.com">Lahiru Sahan Jayasinghe</a>
 */
public interface RequestExecutor {

	/**
	 * <p>Executes the given {@link HttpRequestBase} using a 
	 * suitable {@link HttpClientContract} implementation.
	 * 
	 * @param httpRequestBase
	 * 			the {@link HttpRequestBase} to be executed
	 * 			
	 * @return the {@link HttpResponse} which is the result 
	 * 			of the execution 
	 * 
	 * @throws RequestExecutionException
	 * 			if the HTTP request execution failed
	 */
	HttpResponse execute(HttpRequestBase httpRequestBase, ProxyInvocationConfiguration config) 
	throws RequestExecutionException;
}
