/*
 * Copyright (C) 2018 Tran Le Duy
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.duy.ide.javaide.editor.autocomplete.internal;

import junit.framework.TestCase;

import java.util.regex.Matcher;

public class CompletePackageTest extends TestCase {

    public void testProcess() {
        Matcher matcher = CompletePackage.PACKAGE_NAME.matcher("junit.framework.TestCase");
        assertTrue(matcher.find());
    }

    public void test2() {
        Matcher matcher = CompletePackage.PACKAGE_NAME.matcher("junit.2framework.TestCase");
        assertFalse(matcher.find());
    }

    public void test3() {
        Matcher matcher = CompletePackage.PACKAGE_NAME.matcher(".framework.TestCase");
        assertFalse(matcher.find());
    }
}