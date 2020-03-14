/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.rocketmq.client.hook;

/**
 * 钩子函数
 * 在消息发送和消息消费前后通过钩子函数记录消息轨迹（主要是记录消息是何时发送到哪台Broker，发送耗时多少时间，在什么地方被哪个消费者消费）
 */
public interface SendMessageHook {
    String hookName();

    void sendMessageBefore(final SendMessageContext context);

    void sendMessageAfter(final SendMessageContext context);
}
