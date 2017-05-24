/*
 * Copyright 2017, Google Inc. All rights reserved.
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

/**
 * A client to Google Cloud Video Intelligence API.
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>============================== VideoIntelligenceServiceClient ==============================
 *
 * <p>Service Description: Service that implements Google Cloud Video Intelligence API.
 *
 * <p>Sample for VideoIntelligenceServiceClient:
 *
 * <pre>
 * <code>
 * try (VideoIntelligenceServiceClient videoIntelligenceServiceClient = VideoIntelligenceServiceClient.create()) {
 *   String inputUri = "";
 *   List&lt;Feature&gt; features = new ArrayList&lt;&gt;();
 *   VideoContext videoContext = VideoContext.newBuilder().build();
 *   String outputUri = "";
 *   String locationId = "";
 *   AnnotateVideoResponse response = videoIntelligenceServiceClient.annotateVideoAsync(inputUri, features, videoContext, outputUri, locationId);
 * }
 * </code>
 * </pre>
 */
package com.google.cloud.videointelligence.spi.v1beta1;