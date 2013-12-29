/**
 * Copyright 2012-2013 Rafal Lewczuk <rafal.lewczuk@jitlogic.com>
 * <p/>
 * This is free software. You can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * <p/>
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU General Public License
 * along with this software. If not, see <http://www.gnu.org/licenses/>.
 */
package com.jitlogic.zico.core.model;


import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

public class TraceTemplate implements Serializable {

    int id;

    int traceId;

    int order;

    int flags;

    String condTemplate;

    String condRegex;

    String template;


    public TraceTemplate() {

    }


    public TraceTemplate(JSONObject obj) throws JSONException {
        this.id = obj.getInt("id");
        this.traceId = obj.getInt("traceId");
        this.order = obj.getInt("order");
        this.flags = obj.getInt("flags");

        this.condTemplate = obj.getString("condTemplate");
        this.condRegex = obj.getString("condRegex");
        this.template = obj.getString("template");
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject obj = new JSONObject();

        obj.put("id", id);
        obj.put("traceId", traceId);
        obj.put("order", order);
        obj.put("flags", flags);
        obj.put("condTemplate", condTemplate);
        obj.put("condRegex", condRegex);
        obj.put("template", template);

        return obj;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTraceId() {
        return traceId;
    }

    public void setTraceId(int traceId) {
        this.traceId = traceId;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getFlags() {
        return flags;
    }

    public void setFlags(int flags) {
        this.flags = flags;
    }

    public String getCondTemplate() {
        return condTemplate;
    }

    public void setCondTemplate(String condTemplate) {
        this.condTemplate = condTemplate;
    }

    public String getCondRegex() {
        return condRegex;
    }

    public void setCondRegex(String condRegex) {
        this.condRegex = condRegex;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }


}