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

package com.github.nalukit.nalu.processor.common.application.applicationAnnotationOkWithLoaderAsInnerInterface;

import com.github.nalukit.nalu.client.application.AbstractLoader;
import com.github.nalukit.nalu.client.application.IsApplication;
import com.github.nalukit.nalu.client.application.annotation.Application;
import com.github.nalukit.nalu.processor.common.MockContext;
import com.github.nalukit.nalu.processor.common.application.applicationAnnotationOkWithLoaderAsInnerInterface.ApplicationAnnotationOkWithLoaderAsInnerInterface.MyApplicationLoader;

@Application(loader = MyApplicationLoader.class,
             startRoute = "/mockShell/route01",
             context = MockContext.class)
public interface ApplicationAnnotationOkWithLoaderAsInnerInterface
    extends IsApplication {

  public static class MyApplicationLoader
      extends AbstractLoader<MockContext> {

    @Override
    public void load(FinishLoadCommand finishLoadCommand) {
      finishLoadCommand.finishLoading();
    }

  }
}
