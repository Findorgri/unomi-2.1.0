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
import graphql.annotations.annotationTypes.GraphQLNonNull;
import graphql.schema.DataFetchingEnvironment;
import org.apache.unomi.api.ProfileAlias;

import static org.apache.unomi.graphql.types.output.CDPProfileAliasEdge.TYPE_NAME;

@GraphQLName(TYPE_NAME)
public class CDPProfileAliasEdge {

    public static final String TYPE_NAME = "CDP_ProfileAliasEdge";

    private final ProfileAlias profileAlias;

    public CDPProfileAliasEdge(final ProfileAlias profileAlias) {
        this.profileAlias = profileAlias;
    }

    @GraphQLField
    @GraphQLName("node")
    public CDPProfileAlias node(final DataFetchingEnvironment environment) {
        return new CDPProfileAlias(profileAlias);
    }

    @GraphQLNonNull
    @GraphQLField
    public String cursor() {
        return profileAlias != null ? profileAlias.getItemId() : null;
    }
}
