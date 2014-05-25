/*******************************************************************************
 * Copyright 2014 Open Networking Laboratory
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package net.onrc.openvirtex.messages.statistics;

import net.onrc.openvirtex.elements.datapath.OVXSwitch;
import net.onrc.openvirtex.messages.OVXStatisticsRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openflow.protocol.statistics.OFQueueStatisticsRequest;

public class OVXQueueStatisticsRequest extends OFQueueStatisticsRequest
		implements DevirtualizableStatistic {

	Logger log = LogManager.getLogger(OVXQueueStatisticsRequest.class.getName());
	
	@Override
	public void devirtualizeStatistic(final OVXSwitch sw,
			final OVXStatisticsRequest msg) {
		//TODO
		log.info("Queue statistics handling not yet implemented");
	}

}