/*
 * Copyright (c) 2018 Frank Hossfeld
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

package com.github.nalukit.nalu.processor.tracker.eventhandler.eventHandlerOnATrackerOk01;

import com.github.nalukit.nalu.client.event.annotation.EventHandler;
import com.github.nalukit.nalu.client.tracker.AbstractTracker;
import com.github.nalukit.nalu.client.tracker.IsTracker;
import com.github.nalukit.nalu.processor.common.event.MockEvent01;
import com.github.nalukit.nalu.processor.tracker.eventhandler.eventHandlerOnATrackerOk01.MockTrackerWithEventHandler;
import com.github.nalukit.nalu.processor.common.MockContext;
import java.lang.Override;

/**
 * Default implementation of Nalu's logger.
 *
 * @author Frank Hossfeld
 */
public class MockTrackerWithEventHandler
    extends AbstractTracker<MockContext>
    implements IsTracker {

  @EventHandler
  public void handleEvent(MockEvent01 mockEvent01) {

  }

  @Override
  public void bind() {
  }

  @Override
  public void track(String route,
                    String... params) {
  }

}

