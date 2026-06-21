package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0528u7 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0453r7 f24838a;

    public C0528u7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(@NotNull C0503t7 c0503t7) {
        ContentValues contentValues = new ContentValues();
        Long l10 = c0503t7.f24757a;
        if (l10 != null) {
            contentValues.put("id", Long.valueOf(l10.longValue()));
        }
        Uk uk2 = c0503t7.f24758b;
        if (uk2 != null) {
            contentValues.put("type", Integer.valueOf(uk2.f23108a));
        }
        String str = c0503t7.f24759c;
        if (str != null) {
            contentValues.put("report_request_parameters", str);
        }
        C0453r7 c0453r7 = this.f24838a;
        contentValues.put("session_description", MessageNano.toByteArray(c0453r7.f24679a.fromModel(c0503t7.f24760d)));
        return contentValues;
    }

    public C0528u7(@NotNull C0453r7 c0453r7) {
        this.f24838a = c0453r7;
    }

    public /* synthetic */ C0528u7(C0453r7 c0453r7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C0453r7(null, 1, 0 == true ? 1 : 0) : c0453r7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0503t7 toModel(@NotNull ContentValues contentValues) {
        Uk uk2;
        Long asLong = contentValues.getAsLong("id");
        Integer asInteger = contentValues.getAsInteger("type");
        if (asInteger != null) {
            int iIntValue = asInteger.intValue();
            uk2 = Uk.FOREGROUND;
            if (iIntValue != 0 && iIntValue == 1) {
                uk2 = Uk.BACKGROUND;
            }
        } else {
            uk2 = null;
        }
        return new C0503t7(asLong, uk2, contentValues.getAsString("report_request_parameters"), this.f24838a.toModel(contentValues.getAsByteArray("session_description")));
    }
}
