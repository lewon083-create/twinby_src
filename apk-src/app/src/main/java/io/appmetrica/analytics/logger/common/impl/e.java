package io.appmetrica.analytics.logger.common.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l7.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f25217a = Pattern.compile("[\\p{Space},;]");

    public static int a(Matcher matcher, int i, int i10) {
        if (i10 >= i) {
            int iC = o.c(i10, i, 2, i);
            matcher.region(iC, i10);
            if (matcher.find()) {
                int iStart = matcher.start();
                int iA = a(matcher, iStart + 1, i10);
                return iA == -1 ? iStart : iA;
            }
            matcher.region(i, iC);
            if (matcher.find()) {
                int iStart2 = matcher.start();
                int iA2 = a(matcher, iStart2 + 1, iC);
                return iA2 == -1 ? iStart2 : iA2;
            }
        }
        return -1;
    }
}
