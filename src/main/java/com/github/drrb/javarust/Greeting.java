/*
 * Copyright (C) 2015 drrb
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
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.drrb.javarust;

import com.sun.jna.Structure;
import static java.util.Arrays.asList;
import java.util.List;

/**
 * A struct that we return from Rust to Java.
 *
 * This is the Java representation of the Greeting struct in Rust.
 */
public class Greeting extends Structure {

    public static class ByReference extends Greeting implements Structure.ByReference {
    }

    public static class ByValue extends Greeting implements Structure.ByValue {
    }

    public String text;

    public String getText() {
        return text;
    }

    @Override
    protected List<String> getFieldOrder() {
        return asList("text");
    }
}
