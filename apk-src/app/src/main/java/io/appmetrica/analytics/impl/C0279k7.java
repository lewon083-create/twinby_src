package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0279k7 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0311le f24208a;

    public C0279k7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0379o7 fromModel(@NotNull C0254j7 c0254j7) {
        C0379o7 c0379o7 = new C0379o7();
        Boolean bool = c0254j7.f24131a;
        if (bool != null) {
            c0379o7.f24471a = this.f24208a.fromModel(bool).intValue();
        }
        Double d10 = c0254j7.f24133c;
        if (d10 != null) {
            c0379o7.f24473c = d10.doubleValue();
        }
        Double d11 = c0254j7.f24132b;
        if (d11 != null) {
            c0379o7.f24472b = d11.doubleValue();
        }
        Long l10 = c0254j7.f24138h;
        if (l10 != null) {
            c0379o7.f24478h = l10.longValue();
        }
        Integer num = c0254j7.f24136f;
        if (num != null) {
            c0379o7.f24476f = num.intValue();
        }
        Integer num2 = c0254j7.f24135e;
        if (num2 != null) {
            c0379o7.f24475e = num2.intValue();
        }
        Integer num3 = c0254j7.f24137g;
        if (num3 != null) {
            c0379o7.f24477g = num3.intValue();
        }
        Integer num4 = c0254j7.f24134d;
        if (num4 != null) {
            c0379o7.f24474d = num4.intValue();
        }
        String str = c0254j7.i;
        if (str != null) {
            c0379o7.i = str;
        }
        String str2 = c0254j7.f24139j;
        if (str2 != null) {
            c0379o7.f24479j = str2;
        }
        return c0379o7;
    }

    public C0279k7(@NotNull C0311le c0311le) {
        this.f24208a = c0311le;
    }

    public /* synthetic */ C0279k7(C0311le c0311le, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C0311le() : c0311le);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0254j7 toModel(@Nullable C0379o7 c0379o7) {
        if (c0379o7 == null) {
            return new C0254j7(null, null, null, null, null, null, null, null, null, null);
        }
        C0379o7 c0379o72 = new C0379o7();
        Boolean boolA = this.f24208a.a(c0379o7.f24471a);
        double d10 = c0379o7.f24473c;
        Double dValueOf = Double.valueOf(d10);
        if (d10 == c0379o72.f24473c) {
            dValueOf = null;
        }
        double d11 = c0379o7.f24472b;
        Double dValueOf2 = !(d11 == c0379o72.f24472b) ? Double.valueOf(d11) : null;
        long j10 = c0379o7.f24478h;
        Long lValueOf = j10 != c0379o72.f24478h ? Long.valueOf(j10) : null;
        int i = c0379o7.f24476f;
        Integer numValueOf = i != c0379o72.f24476f ? Integer.valueOf(i) : null;
        int i10 = c0379o7.f24475e;
        Integer numValueOf2 = i10 != c0379o72.f24475e ? Integer.valueOf(i10) : null;
        int i11 = c0379o7.f24477g;
        Integer numValueOf3 = i11 != c0379o72.f24477g ? Integer.valueOf(i11) : null;
        int i12 = c0379o7.f24474d;
        Integer numValueOf4 = i12 != c0379o72.f24474d ? Integer.valueOf(i12) : null;
        String str = c0379o7.i;
        String str2 = !Intrinsics.a(str, c0379o72.i) ? str : null;
        String str3 = c0379o7.f24479j;
        return new C0254j7(boolA, dValueOf2, dValueOf, numValueOf4, numValueOf2, numValueOf, numValueOf3, lValueOf, str2, !Intrinsics.a(str3, c0379o72.f24479j) ? str3 : null);
    }
}
