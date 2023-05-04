/*
 * Copyright (c) 2018 - Frank Hossfeld
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *  use this file except in compliance with the License. You may obtain a copy of
 *  the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  License for the specific language governing permissions and limitations under
 *  the License.
 */

package com.github.nalukit.nalu.processor.controller.acceptAnnotation03;

import com.github.nalukit.nalu.client.component.AbstractComponentController;
import com.github.nalukit.nalu.client.component.annotation.AcceptParameter;
import com.github.nalukit.nalu.client.component.annotation.Controller;
import com.github.nalukit.nalu.processor.common.MockContext;

import java.math.BigDecimal;

@Controller(route = "/mockShell/route01/:parameter01",
            selector = "selector01",
            component = Component03.class,
            componentInterface = IComponent03.class)
public class AcceptAnnotation03Controller
    extends AbstractComponentController<MockContext, IComponent03, String>
    implements IComponent03.Controller {

  public AcceptAnnotation03Controller() {
  }

  @AcceptParameter("parameter01")
  public void setParameter01(BigDecimal parameter) {
  }
}
