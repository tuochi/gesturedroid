/*
 * Copyright 2007-2008 Volker Fritzsch
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package motej.event;

/**
 * 
 * <p>
 * @author <a href="mailto:vfritzsch@users.sourceforge.net">Volker Fritzsch</a>
 */
public class DataEvent {

	private byte[] address;
	
	private byte[] payload;
	
	private int error;
	
	public DataEvent(byte[] address, byte[] payload, int error) {
		this.address = address;
		this.payload = payload;
		this.error = error;
	}

	public byte[] getAddress() {
		return address;
	}

	public byte[] getPayload() {
		return payload;
	}

	public int getError() {
		return error;
	}
	
}
