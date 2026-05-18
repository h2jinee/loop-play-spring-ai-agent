package com.baedal.support;

import java.util.List;

public record SupportResponse(
        String summary,
        Category category,
        Urgency urgency,
        String nextAction,
        List<String> neededInfo,
        boolean requiresHumanReview
) {
    public enum Category { ORDER, DELIVERY, CANCEL, REFUND, PAYMENT, ETC }
    public enum Urgency  { LOW, NORMAL, HIGH, CRITICAL }
}
