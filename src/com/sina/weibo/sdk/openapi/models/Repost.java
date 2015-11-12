/*
 * Copyright (C) 2010-2013 The SINA WEIBO Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sina.weibo.sdk.openapi.models;

import org.json.JSONObject;

/**
 * 转发结构体。
 * 
 * @author lzy
 * @since 2015-11-04
 */
public class Repost {

	/** 转发创建时间 */
	public String created_at;
	/** 转发的 ID */
	public String id;
	/** 转发的内容 */
	public String text;
	/** 转发的来源 */
	public String source;
	/** 转发作者的用户信息字段 */
	public User user;
	/** 转发的 MID */
	public String mid;
	/** 字符串型的转发 ID */
	public String idstr;
	/** 转发的微博信息字段 */
	public Status retweeted_status;

	public static Repost parse(JSONObject jsonObject) {
		if (null == jsonObject) {
			return null;
		}

		Repost repost = new Repost();
		repost.created_at = jsonObject.optString("created_at");
		repost.id = jsonObject.optString("id");
		repost.text = jsonObject.optString("text");
		repost.source = jsonObject.optString("source");
		repost.user = User.parse(jsonObject.optJSONObject("user"));
		repost.mid = jsonObject.optString("mid");
		repost.idstr = jsonObject.optString("idstr");
		repost.retweeted_status = Status.parse(jsonObject
				.optJSONObject("retweeted_status"));
		return repost;
	}
}
