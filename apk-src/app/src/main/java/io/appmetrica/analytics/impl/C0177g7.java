package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0177g7 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0100d7 f23923a;

    public C0177g7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(@NotNull C0151f7 c0151f7) {
        ContentValues contentValues = new ContentValues();
        Long l10 = c0151f7.f23834a;
        if (l10 != null) {
            contentValues.put("session_id", Long.valueOf(l10.longValue()));
        }
        Uk uk2 = c0151f7.f23835b;
        if (uk2 != null) {
            contentValues.put("session_type", Integer.valueOf(uk2.f23108a));
        }
        Long l11 = c0151f7.f23836c;
        if (l11 != null) {
            contentValues.put("number_in_session", Long.valueOf(l11.longValue()));
        }
        EnumC0078cb enumC0078cb = c0151f7.f23837d;
        if (enumC0078cb != null) {
            contentValues.put("type", Integer.valueOf(enumC0078cb.f23605a));
        }
        Long l12 = c0151f7.f23838e;
        if (l12 != null) {
            contentValues.put("global_number", Long.valueOf(l12.longValue()));
        }
        Long l13 = c0151f7.f23839f;
        if (l13 != null) {
            contentValues.put("time", Long.valueOf(l13.longValue()));
        }
        C0100d7 c0100d7 = this.f23923a;
        contentValues.put("event_description", MessageNano.toByteArray(c0100d7.f23674a.fromModel(c0151f7.f23840g)));
        return contentValues;
    }

    public C0177g7(@NotNull C0100d7 c0100d7) {
        this.f23923a = c0100d7;
    }

    public /* synthetic */ C0177g7(C0100d7 c0100d7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C0100d7(null, 1, 0 == true ? 1 : 0) : c0100d7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0151f7 toModel(@NotNull ContentValues contentValues) {
        Uk uk2;
        Long asLong = contentValues.getAsLong("session_id");
        Integer asInteger = contentValues.getAsInteger("session_type");
        if (asInteger != null) {
            int iIntValue = asInteger.intValue();
            uk2 = Uk.FOREGROUND;
            if (iIntValue != 0 && iIntValue == 1) {
                uk2 = Uk.BACKGROUND;
            }
        } else {
            uk2 = null;
        }
        Long asLong2 = contentValues.getAsLong("number_in_session");
        Integer asInteger2 = contentValues.getAsInteger("type");
        return new C0151f7(asLong, uk2, asLong2, asInteger2 != null ? EnumC0078cb.a(asInteger2.intValue()) : null, contentValues.getAsLong("global_number"), contentValues.getAsLong("time"), this.f23923a.toModel(contentValues.getAsByteArray("event_description")));
    }
}
