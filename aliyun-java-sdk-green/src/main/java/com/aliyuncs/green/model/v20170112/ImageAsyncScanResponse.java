/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aliyuncs.green.model.v20170112;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20170112.ImageAsyncScanResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ImageAsyncScanResponse extends AcsResponse {

	@Override
	public ImageAsyncScanResponse getInstance(UnmarshallerContext context) {
		return	ImageAsyncScanResponseUnmarshaller.unmarshall(this, context);
	}
}