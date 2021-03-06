package com.trasier.api.server.service;

import java.util.List;

import com.trasier.api.server.model.ConversationInfo;
import com.trasier.api.server.model.Span;

public interface ReadService {
    Span readSpanById(String accountId, String spaceKey, String conversationId, String traceId, String spanId);

    ConversationInfo readConversationById(String accountId, String spaceKey, String conversationId);

    List<ConversationInfo> findByQuery(String accountId, String spaceKey, String query, Long from, Long to);
}