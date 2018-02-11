/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache license, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the license for the specific language governing permissions and
 * limitations under the license.
 */

package org.apache.commons.text.lookup;

import org.apache.commons.text.StrLookup;

/**
 * A default lookup for others to extend in this package.
 * <p>
 * Unfortunately, the type {@link org.apache.commons.text.StrLookup} was defined as class and not an interface, which is
 * why this package introduces the interface {@link StringLookup}. In time, some deprecation strategy should be created.
 * </p>
 * 
 * @since 1.3
 */
public abstract class AbstractStringLookup extends StrLookup<String> {

    protected static final String EMPTY = "";

    protected boolean isEmpty(final String value) {
        return value == null ? true : value.isEmpty();
    }

}