package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0425q3 implements InterfaceC0651z5 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0651z5, kotlin.jvm.functions.Function1
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, String> invoke(@NotNull ContentValues contentValues) {
        String asString = contentValues.getAsString("clids");
        HashMap mapC = AbstractC0207hb.c(asString);
        if (Em.a(mapC)) {
            return mapC;
        }
        AbstractC0137ej.a(pe.a.f("Passed clids (", asString, ") are invalid."), new Object[0]);
        return null;
    }
}
