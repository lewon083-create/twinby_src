package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0074c7 implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0311le f23565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0279k7 f23566b;

    public C0074c7() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0354n7 fromModel(@NotNull C0125e7 c0125e7) {
        C0354n7 c0354n7 = new C0354n7();
        Integer num = c0125e7.f23732a;
        if (num != null) {
            c0354n7.f24404a = num.intValue();
        }
        String str = c0125e7.f23733b;
        if (str != null) {
            c0354n7.f24405b = StringUtils.correctIllFormedString(str);
        }
        String str2 = c0125e7.f23734c;
        if (str2 != null) {
            c0354n7.f24406c = StringUtils.correctIllFormedString(str2);
        }
        Long l10 = c0125e7.f23735d;
        if (l10 != null) {
            c0354n7.f24407d = l10.longValue();
        }
        C0254j7 c0254j7 = c0125e7.f23736e;
        if (c0254j7 != null) {
            c0354n7.f24408e = this.f23566b.fromModel(c0254j7);
        }
        String str3 = c0125e7.f23737f;
        if (str3 != null) {
            c0354n7.f24409f = str3;
        }
        String str4 = c0125e7.f23738g;
        if (str4 != null) {
            c0354n7.f24410g = str4;
        }
        Long l11 = c0125e7.f23739h;
        if (l11 != null) {
            c0354n7.f24411h = l11.longValue();
        }
        Integer num2 = c0125e7.i;
        if (num2 != null) {
            c0354n7.i = num2.intValue();
        }
        Integer num3 = c0125e7.f23740j;
        if (num3 != null) {
            c0354n7.f24412j = num3.intValue();
        }
        String str5 = c0125e7.f23741k;
        if (str5 != null) {
            c0354n7.f24413k = str5;
        }
        J8 j82 = c0125e7.f23742l;
        if (j82 != null) {
            c0354n7.f24414l = j82.f22523a;
        }
        String str6 = c0125e7.f23743m;
        if (str6 != null) {
            c0354n7.f24415m = str6;
        }
        EnumC0128ea enumC0128ea = c0125e7.f23744n;
        if (enumC0128ea != null) {
            c0354n7.f24416n = enumC0128ea.f23758a;
        }
        EnumC0356n9 enumC0356n9 = c0125e7.f23745o;
        if (enumC0356n9 != null) {
            c0354n7.f24417o = enumC0356n9.f24428a;
        }
        Boolean bool = c0125e7.f23746p;
        if (bool != null) {
            c0354n7.f24418p = this.f23565a.fromModel(bool).intValue();
        }
        Integer num4 = c0125e7.f23747q;
        if (num4 != null) {
            c0354n7.f24419q = num4.intValue();
        }
        byte[] bArr = c0125e7.f23748r;
        if (bArr != null) {
            c0354n7.f24420r = bArr;
        }
        return c0354n7;
    }

    public C0074c7(@NotNull C0311le c0311le, @NotNull C0279k7 c0279k7) {
        this.f23565a = c0311le;
        this.f23566b = c0279k7;
    }

    public /* synthetic */ C0074c7(C0311le c0311le, C0279k7 c0279k7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C0311le() : c0311le, (i & 2) != 0 ? new C0279k7(null, 1, null) : c0279k7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0125e7 toModel(@NotNull C0354n7 c0354n7) {
        EnumC0356n9 enumC0356n9;
        C0354n7 c0354n72 = new C0354n7();
        int i = c0354n7.f24404a;
        Integer numValueOf = i != c0354n72.f24404a ? Integer.valueOf(i) : null;
        String str = c0354n7.f24405b;
        String str2 = !Intrinsics.a(str, c0354n72.f24405b) ? str : null;
        String str3 = c0354n7.f24406c;
        String str4 = !Intrinsics.a(str3, c0354n72.f24406c) ? str3 : null;
        long j10 = c0354n7.f24407d;
        Long lValueOf = j10 != c0354n72.f24407d ? Long.valueOf(j10) : null;
        C0254j7 model = this.f23566b.toModel(c0354n7.f24408e);
        String str5 = c0354n7.f24409f;
        String str6 = !Intrinsics.a(str5, c0354n72.f24409f) ? str5 : null;
        String str7 = c0354n7.f24410g;
        String str8 = !Intrinsics.a(str7, c0354n72.f24410g) ? str7 : null;
        long j11 = c0354n7.f24411h;
        Long lValueOf2 = Long.valueOf(j11);
        if (j11 == c0354n72.f24411h) {
            lValueOf2 = null;
        }
        int i10 = c0354n7.i;
        Integer numValueOf2 = i10 != c0354n72.i ? Integer.valueOf(i10) : null;
        int i11 = c0354n7.f24412j;
        Integer numValueOf3 = i11 != c0354n72.f24412j ? Integer.valueOf(i11) : null;
        String str9 = c0354n7.f24413k;
        String str10 = !Intrinsics.a(str9, c0354n72.f24413k) ? str9 : null;
        int i12 = c0354n7.f24414l;
        Integer numValueOf4 = Integer.valueOf(i12);
        if (i12 == c0354n72.f24414l) {
            numValueOf4 = null;
        }
        J8 j8A = numValueOf4 != null ? J8.a(Integer.valueOf(numValueOf4.intValue())) : null;
        String str11 = c0354n7.f24415m;
        String str12 = !Intrinsics.a(str11, c0354n72.f24415m) ? str11 : null;
        int i13 = c0354n7.f24416n;
        Integer numValueOf5 = Integer.valueOf(i13);
        if (i13 == c0354n72.f24416n) {
            numValueOf5 = null;
        }
        EnumC0128ea enumC0128eaA = numValueOf5 != null ? EnumC0128ea.a(Integer.valueOf(numValueOf5.intValue())) : null;
        int i14 = c0354n7.f24417o;
        Integer numValueOf6 = Integer.valueOf(i14);
        if (i14 == c0354n72.f24417o) {
            numValueOf6 = null;
        }
        if (numValueOf6 != null) {
            int iIntValue = numValueOf6.intValue();
            EnumC0356n9[] enumC0356n9ArrValues = EnumC0356n9.values();
            int length = enumC0356n9ArrValues.length;
            int i15 = 0;
            while (true) {
                if (i15 < length) {
                    enumC0356n9 = enumC0356n9ArrValues[i15];
                    EnumC0356n9[] enumC0356n9Arr = enumC0356n9ArrValues;
                    if (enumC0356n9.f24428a == iIntValue) {
                        break;
                    }
                    i15++;
                    enumC0356n9ArrValues = enumC0356n9Arr;
                } else {
                    enumC0356n9 = EnumC0356n9.NATIVE;
                    break;
                }
            }
        } else {
            enumC0356n9 = null;
        }
        Boolean boolA = this.f23565a.a(c0354n7.f24418p);
        int i16 = c0354n7.f24419q;
        Integer numValueOf7 = i16 != c0354n72.f24419q ? Integer.valueOf(i16) : null;
        byte[] bArr = c0354n7.f24420r;
        return new C0125e7(numValueOf, str2, str4, lValueOf, model, str6, str8, lValueOf2, numValueOf2, numValueOf3, str10, j8A, str12, enumC0128eaA, enumC0356n9, boolA, numValueOf7, !Arrays.equals(bArr, c0354n72.f24420r) ? bArr : null);
    }
}
