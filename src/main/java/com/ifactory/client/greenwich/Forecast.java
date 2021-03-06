/**
 * Copyright 2013 iFactory Lab Ltd.
 * 
 * Min Kim (minsikzzang@gmail.com)
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.ifactory.client.greenwich;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Forecast implements Serializable {

	private List<Weather> weathers;
	private long timestamp;
	private int humidity;
	private double pressure;
	private Temp temp;
		
	static final class Builder {
  	private List<Weather> weathers = new ArrayList<Weather>();	
  	private long timestamp;
		
		public Builder(long timestamp) {
			this.timestamp = timestamp;			
		}

		public void addWeather(Weather weather) {
			weathers.add(weather);
		}
		    
		public Forecast build() {
			return new Forecast(this);
		}
	}
	
	private Forecast(Builder builder) {
		timestamp = builder.timestamp;
		weathers = builder.weathers;
	}	
	
	public long getTimestamp() {
		return timestamp;
	}
	
	public List<Weather> getWeathers() {
		return weathers;
	}
}
