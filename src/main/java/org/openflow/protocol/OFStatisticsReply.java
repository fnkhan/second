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
/**
 *    Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior
 *    University
 * 
 *    Licensed under the Apache License, Version 2.0 (the "License"); you may
 *    not use this file except in compliance with the License. You may obtain
 *    a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *    WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *    License for the specific language governing permissions and limitations
 *    under the License.
 **/

package org.openflow.protocol;

import org.openflow.util.U16;

/**
 * Represents an ofp_stats_reply message
 * 
 * @author David Erickson (daviderickson@cs.stanford.edu)
 */
public class OFStatisticsReply extends OFStatisticsMessageBase {
	public enum OFStatisticsReplyFlags {
		REPLY_MORE(1 << 0);

		protected short type;

		OFStatisticsReplyFlags(final int type) {
			this.type = (short) type;
		}

		public short getTypeValue() {
			return this.type;
		}
	}

	public OFStatisticsReply() {
		super();
		this.type = OFType.STATS_REPLY;
		this.length = U16.t(OFStatisticsMessageBase.MINIMUM_LENGTH);
	}
}