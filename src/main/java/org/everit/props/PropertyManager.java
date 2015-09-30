/*
 * Copyright (C) 2011 Everit Kft. (http://www.everit.biz)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.everit.props;

/**
 * Property Manager allows the programmer to put key-value pairs in a persistent store. Keys should
 * be unique, therefore the user of the library should prefix each key in the way that they do not
 * conflict with keys that come from other modules. The key-value pairs should not be cached on the
 * user side. The implementation should take care of caching in the way that it keeps data
 * consistent even in a clustered environment.
 */
public interface PropertyManager {

  /**
   * Associates the specified value with the specified key. Cannot add the same key twice, because
   * the keys are unique. If you want to change its value, use the
   * {@link #updateProperty(String, String)} method.
   *
   * @param key
   *          key with which the specified value is to be associated
   * @param value
   *          value to be associated with the specified key
   * @throws NullPointerException
   *           if the key or value parameter is null.
   * @throws RuntimeException
   *           an excpetion should be thrown if the key already exists.
   */
  void addProperty(String key, String value);

  /**
   * Returns the value of the given key, or null if this Property Manager contains no mapping for
   * the key.
   *
   * @param key
   *          The key whose associated value is to be returned
   * @return The value of the given key, or null if this Property Manager contains no mapping for
   *         the key.
   * @throws NullPointerException
   *           if the key parameter is null.
   */
  String getProperty(String key);

  /**
   * Removes the association for a key from this store if it is present.
   *
   * @param key
   *          Key whose mapping is to be removed
   * @return the value that was stored till now, null if there was no such value.
   * @throws NullPointerException
   *           if the key parameter is null.
   */
  String removeProperty(String key);

  /**
   * Replaces the value of the given key in the store.
   *
   * @param key
   *          Key with which the specified value is to be associated.
   * @param value
   *          Value to be associated with the specified key. Null value is not supported.
   * @return The previous value of the modified key, or null if there was no associated value of
   *         this key.
   * @throws NullPointerException
   *           if the key or value parameter is null.
   */
  String updateProperty(String key, String value);
}
