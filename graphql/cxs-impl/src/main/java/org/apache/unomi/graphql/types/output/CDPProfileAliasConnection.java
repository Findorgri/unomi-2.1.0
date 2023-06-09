/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.unomi.graphql.types.output;

import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLName;

import java.util.ArrayList;
import java.util.List;

import static org.apache.unomi.graphql.types.output.CDPProfileAliasConnection.TYPE_NAME;

@GraphQLName(TYPE_NAME)
public class CDPProfileAliasConnection {

    public static final String TYPE_NAME = "CDP_ProfileAliasConnection";

    private final List<CDPProfileAliasEdge> edges;

    private final CDPPageInfo pageInfo;

    private final Long totalCount;

    public CDPProfileAliasConnection() {
        this(new ArrayList<>(), new CDPPageInfo(), 0L);
    }

    public CDPProfileAliasConnection(
            final List<CDPProfileAliasEdge> edges, final CDPPageInfo pageInfo, final Long totalCount) {
        this.edges = edges;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    @GraphQLField
    @GraphQLName("edges")
    public List<CDPProfileAliasEdge> edges() {
        return edges;
    }

    @GraphQLField
    @GraphQLName("pageInfo")
    public CDPPageInfo pageInfo() {
        return pageInfo;
    }

    @GraphQLField
    @GraphQLName("totalCount")
    public Long totalCount() {
        return totalCount;
    }
}
