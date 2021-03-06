package com.lonepulse.robozombie.core.response.parser;

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
import org.apache.http.util.EntityUtils;

/**
 * <p>This is an extension of {@link AbstractResponseParser} which allows the parsing 
 * of character data. 
 * 
 * @version 1.1.4
 * <br><br>
 * @author <a href="mailto:lahiru@lonepulse.com">Lahiru Sahan Jayasinghe</a>
 */
public class StringResponseParser extends AbstractResponseParser<CharSequence> {

	/**
	 * <p> Parses the content in the {@link HttpResponse} to any type which is 
	 * assignable to a {@link CharSequence}.
	 * 
	 * @see AbstractResponseParser#parse(HttpResponse, com.lonepulse.robozombie.core.processor.ProxyInvocationConfiguration)
	 */
	@Override
	public CharSequence processResponse(HttpResponse httpResponse) throws Exception {

		String responseString = EntityUtils.toString(httpResponse.getEntity());
		return responseString.subSequence(0, responseString.length());
	}

	/**
	 * See {@link AbstractResponseParser#getType()}.
	 */
	@Override
	public Class<CharSequence> getType() {

		return CharSequence.class;
	}
}
