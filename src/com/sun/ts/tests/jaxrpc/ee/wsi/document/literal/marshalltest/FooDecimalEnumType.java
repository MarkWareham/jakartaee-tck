/*
 * Copyright (c) 2007, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

/*
 * $Id$
 */

// This class was generated by the JAXRPC RI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Reference Implementation (1.1, build EA-R15)

package com.sun.ts.tests.jaxrpc.ee.wsi.document.literal.marshalltest;

public class FooDecimalEnumType implements java.io.Serializable {
  private java.math.BigDecimal value;

  public static final String _value1String = "1.1";

  public static final String _value2String = "2.2";

  public static final String _value3String = "3.3";

  public static final java.math.BigDecimal _value1 = new java.math.BigDecimal(
      _value1String);

  public static final java.math.BigDecimal _value2 = new java.math.BigDecimal(
      _value2String);

  public static final java.math.BigDecimal _value3 = new java.math.BigDecimal(
      _value3String);

  public static final FooDecimalEnumType value1 = new FooDecimalEnumType(
      _value1);

  public static final FooDecimalEnumType value2 = new FooDecimalEnumType(
      _value2);

  public static final FooDecimalEnumType value3 = new FooDecimalEnumType(
      _value3);

  protected FooDecimalEnumType(java.math.BigDecimal value) {
    this.value = value;
  }

  public java.math.BigDecimal getValue() {
    return value;
  }

  public static FooDecimalEnumType fromValue(java.math.BigDecimal value)
      throws java.lang.IllegalStateException {
    if (value1.value.equals(value)) {
      return value1;
    } else if (value2.value.equals(value)) {
      return value2;
    } else if (value3.value.equals(value)) {
      return value3;
    }
    throw new IllegalArgumentException();
  }

  public static FooDecimalEnumType fromString(String value)
      throws java.lang.IllegalStateException {
    if (value.equals(_value1String)) {
      return value1;
    } else if (value.equals(_value2String)) {
      return value2;
    } else if (value.equals(_value3String)) {
      return value3;
    }
    throw new IllegalArgumentException();
  }

  public String toString() {
    return value.toString();
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof FooDecimalEnumType)) {
      return false;
    }
    return ((FooDecimalEnumType) obj).value.equals(value);
  }

  public int hashCode() {
    return value.hashCode();
  }
}
