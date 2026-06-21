package io.appmetrica.analytics.impl;

import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Be implements InterfaceC0299l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22149a = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22150b = 13;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Regex f22151c = new Regex("^[0-9()\\-+\\s]+$");

    @Override // io.appmetrica.analytics.impl.InterfaceC0299l2
    @Nullable
    public final String a(@NotNull String str) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        int length2 = string.length();
        Character chV = kotlin.text.e0.v(str);
        Character chV2 = kotlin.text.e0.v(string);
        if (length2 < this.f22149a || length2 > this.f22150b) {
            return null;
        }
        if ((chV2 != null && chV2.charValue() == '0') || !this.f22151c.b(str)) {
            return null;
        }
        if (length2 == 10 && (chV == null || chV.charValue() != '+')) {
            return "7".concat(string);
        }
        if (length2 == 11) {
            if (chV != null && chV.charValue() == '+' && chV2 != null && chV2.charValue() == '8') {
                return null;
            }
            if (chV2 != null && chV2.charValue() == '8') {
                return "7" + string.substring(1);
            }
        }
        if (length2 < 12 || chV == null || chV.charValue() != '+' || chV2 == null || chV2.charValue() != '7') {
            return string;
        }
        return null;
    }
}
