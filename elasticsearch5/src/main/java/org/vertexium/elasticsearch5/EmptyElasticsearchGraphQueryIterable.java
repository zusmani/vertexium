package org.vertexium.elasticsearch5;

import org.vertexium.query.QueryParameters;

import java.util.ArrayList;

public class EmptyElasticsearchGraphQueryIterable<T> extends ElasticsearchGraphQueryIterable<T> {
    public EmptyElasticsearchGraphQueryIterable(ElasticsearchSearchQueryBase query, QueryParameters parameters) {
        super(query, null, parameters, new ArrayList<>(), false, false, false, 0, 0, null);
    }
}
