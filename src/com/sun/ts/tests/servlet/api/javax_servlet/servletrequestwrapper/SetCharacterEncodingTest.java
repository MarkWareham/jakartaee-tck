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

package com.sun.ts.tests.servlet.api.javax_servlet.servletrequestwrapper;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequestWrapper;
import java.io.IOException;
import java.io.PrintWriter;

public class SetCharacterEncodingTest extends SetCharacterEncodingTestWrapper {

  public void init(ServletConfig servletConfig) throws ServletException {
    super.init(servletConfig);
  }

  // merely validate the default behavior of RequestWrapper -- delegates call
  // to the ServletRequest object it wraps.

  public void service(ServletRequest servletRequest,
      ServletResponse servletResponse) throws ServletException, IOException {
    ServletRequestWrapper wrapper = new ServletRequestWrapper(servletRequest);
    super.service(wrapper, servletResponse);
  }

}
