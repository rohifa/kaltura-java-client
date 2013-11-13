// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platfroms allow them to do with
// text.
//
// Copyright (C) 2006-2011  Kaltura Inc.
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as
// published by the Free Software Foundation, either version 3 of the
// License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
// @ignore
// ===================================================================================================
package com.kaltura.client.types;

import org.w3c.dom.Element;
import com.kaltura.client.KalturaParams;
import com.kaltura.client.KalturaApiException;
import com.kaltura.client.KalturaObjectBase;
import com.kaltura.client.utils.ParseUtils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Tue, 20 Aug 13 03:11:34 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class KalturaBatchHistoryData extends KalturaObjectBase {
    public int schedulerId = Integer.MIN_VALUE;
    public int workerId = Integer.MIN_VALUE;
    public int batchIndex = Integer.MIN_VALUE;
    public int timeStamp = Integer.MIN_VALUE;
    public String message;
    public int errType = Integer.MIN_VALUE;
    public int errNumber = Integer.MIN_VALUE;
    public String hostName;
    public String sessionId;

    public KalturaBatchHistoryData() {
    }

    public KalturaBatchHistoryData(Element node) throws KalturaApiException {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("schedulerId")) {
                this.schedulerId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("workerId")) {
                this.workerId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("batchIndex")) {
                this.batchIndex = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("timeStamp")) {
                this.timeStamp = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("message")) {
                this.message = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("errType")) {
                this.errType = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("errNumber")) {
                this.errNumber = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("hostName")) {
                this.hostName = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("sessionId")) {
                this.sessionId = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public KalturaParams toParams() {
        KalturaParams kparams = super.toParams();
        kparams.add("objectType", "KalturaBatchHistoryData");
        kparams.add("schedulerId", this.schedulerId);
        kparams.add("workerId", this.workerId);
        kparams.add("batchIndex", this.batchIndex);
        kparams.add("timeStamp", this.timeStamp);
        kparams.add("message", this.message);
        kparams.add("errType", this.errType);
        kparams.add("errNumber", this.errNumber);
        kparams.add("hostName", this.hostName);
        kparams.add("sessionId", this.sessionId);
        return kparams;
    }

}

