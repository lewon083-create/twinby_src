package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0573w2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W1 fromModel(@NonNull C0623y2 c0623y2) {
        W1 w12 = new W1();
        EnumC0598x2 enumC0598x2 = c0623y2.f25062a;
        if (enumC0598x2 != null) {
            int iOrdinal = enumC0598x2.ordinal();
            if (iOrdinal == 0) {
                w12.f23191a = 6;
            } else if (iOrdinal == 1) {
                w12.f23191a = 1;
            } else if (iOrdinal == 2) {
                w12.f23191a = 2;
            } else if (iOrdinal == 3) {
                w12.f23191a = 3;
            } else if (iOrdinal == 4) {
                w12.f23191a = 4;
            } else if (iOrdinal != 5) {
                w12.f23191a = 0;
            } else {
                w12.f23191a = 5;
            }
        }
        Boolean bool = c0623y2.f25063b;
        if (bool != null) {
            if (bool.booleanValue()) {
                w12.f23192b = 1;
                return w12;
            }
            w12.f23192b = 0;
        }
        return w12;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0623y2 toModel(@NonNull W1 w12) {
        EnumC0598x2 enumC0598x2;
        Boolean bool = null;
        switch (w12.f23191a) {
            case 1:
                enumC0598x2 = EnumC0598x2.ACTIVE;
                break;
            case 2:
                enumC0598x2 = EnumC0598x2.WORKING_SET;
                break;
            case 3:
                enumC0598x2 = EnumC0598x2.FREQUENT;
                break;
            case 4:
                enumC0598x2 = EnumC0598x2.RARE;
                break;
            case 5:
                enumC0598x2 = EnumC0598x2.RESTRICTED;
                break;
            case 6:
                enumC0598x2 = EnumC0598x2.EXEMPTED;
                break;
            default:
                enumC0598x2 = null;
                break;
        }
        int i = w12.f23192b;
        if (i == 0) {
            bool = Boolean.FALSE;
        } else if (i == 1) {
            bool = Boolean.TRUE;
        }
        return new C0623y2(enumC0598x2, bool);
    }
}
