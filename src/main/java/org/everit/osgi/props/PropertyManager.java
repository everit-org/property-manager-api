/**
 * This file is part of Everit - Property Manager API.
 *
 * Everit - Property Manager API is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Everit - Property Manager API is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Everit - Property Manager API.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.everit.osgi.props;

/**
 * Property Manager allows the programmer to put key-value pairs in a persistent store. Keys should be unique, therefore
 * the user of the library should prefix each key in the way that they do not conflict with keys that come from other
 * modules. The key-value pairs should not be cached on the user side. The implementation should take care of caching in
 * the way that it keeps data consistent even in a clustered environment.
 */
public interface PropertyManager {

    /**
     * Associates the specified value with the specified key. Cannot add the same key twice, because the keys are
     * unique. If you want to change its value, use the {@link #updateProperty(String, String)} method.
     *
     * @param key
     *            key with which the specified value is to be associated
     * @param value
     *            value to be associated with the specified key
     * @throws NullPointerException
     *             if the key or value parameter is null.
     * @throws RuntimeException
     *             an excpetion should be thrown if the key already exists.
     */
    void addProperty(String key, String value);

    /**
     * Returns the value of the given key, or null if this Property Manager contains no mapping for the key.
     *
     * @param key
     *            The key whose associated value is to be returned
     * @return The value of the given key, or null if this Property Manager contains no mapping for the key.
     * @throws NullPointerException
     *             if the key parameter is null.
     */
    String getProperty(String key);

    /**
     * Removes the association for a key from this store if it is present.
     *
     * @param key
     *            Key whose mapping is to be removed
     * @return the value that was stored till now, null if there was no such value.
     * @throws NullPointerException
     *             if the key parameter is null.
     */
    String removeProperty(String key);

    /**
     * Replaces the value of the given key in the store.
     *
     * @param key
     *            Key with which the specified value is to be associated.
     * @param value
     *            Value to be associated with the specified key. Null value is not supported.
     * @return The previous value of the modified key, or null if there was no associated value of this key.
     * @throws NullPointerException
     *             if the key or value parameter is null.
     */
    String updateProperty(String key, String value);
}
