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

public interface PropertyManager {

    /**
     * Associates the specified value with the specified key. Cannot add the same key twice, because the keys are
     * unique. If you want to change its value, use the {@link #updateProperty(String, String)} method.
     *
     * @param key
     *            key with which the specified value is to be associated
     * @param value
     *            value to be associated with the specified key
     */
    void addProperty(String key, String value);

    /**
     * Returns the value of the given key, or null if this Property Service contains no mapping for the key.
     *
     * @param key
     *            The key whose associated value is to be returned
     * @return The value of the given key, or null if this Property Service contains no mapping for the key.
     */
    String getProperty(String key);

    /**
     * Removes the association for a key from this map if it is present.
     *
     * @param key
     *            Key whose mapping is to be removed
     * @return the value that was stored till now, null if there was no such value.
     */
    String removeProperty(String key);

    /**
     * Replaces the value of the given key, and returns its previous value. If there was no associated value of this
     * key, returns null.
     *
     * @param key
     *            Key with which the specified value is to be associated.
     * @param value
     *            Value to be associated with the specified key. Null value is not supported.
     * @return The previous value of the modified key, or null if there was no associated value of this key.
     */
    String updateProperty(String key, String value);
}
