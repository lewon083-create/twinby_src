package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdRevenue f22264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0495t f22266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Wm f22267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Tm f22268e;

    public E(AdRevenue adRevenue, boolean z5, C0141en c0141en, PublicLogger publicLogger) {
        this.f22264a = adRevenue;
        this.f22265b = z5;
        this.f22266c = c0141en;
        this.f22267d = new Wm(100, "ad revenue strings", publicLogger);
        this.f22268e = new Tm(30720, "ad revenue payload", publicLogger);
    }

    public final Pair a() {
        C0470s c0470s = new C0470s();
        int length = 0;
        for (Pair pair : kotlin.collections.s.f(new Pair(this.f22264a.adNetwork, new C0595x(c0470s)), new Pair(this.f22264a.adPlacementId, new C0620y(c0470s)), new Pair(this.f22264a.adPlacementName, new C0645z(c0470s)), new Pair(this.f22264a.adUnitId, new A(c0470s)), new Pair(this.f22264a.adUnitName, new B(c0470s)), new Pair(this.f22264a.precision, new C(c0470s)), new Pair(this.f22264a.currency.getCurrencyCode(), new D(c0470s)))) {
            String str = (String) pair.f27469b;
            Function1 function1 = (Function1) pair.f27470c;
            Wm wm = this.f22267d;
            wm.getClass();
            String strA = wm.a(str);
            byte[] bArrStringToBytesForProtobuf = StringUtils.stringToBytesForProtobuf(str);
            byte[] bArrStringToBytesForProtobuf2 = StringUtils.stringToBytesForProtobuf(strA);
            function1.invoke(bArrStringToBytesForProtobuf2);
            length += bArrStringToBytesForProtobuf.length - bArrStringToBytesForProtobuf2.length;
        }
        Integer num = (Integer) F.f22309a.get(this.f22264a.adType);
        c0470s.f24712d = num != null ? num.intValue() : 0;
        r rVar = new r();
        BigDecimal bigDecimal = this.f22264a.adRevenue;
        BigInteger bigInteger = AbstractC0628y7.f25089a;
        int i = -bigDecimal.scale();
        BigInteger bigIntegerUnscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (bigIntegerUnscaledValue.compareTo(AbstractC0628y7.f25089a) <= 0 && bigIntegerUnscaledValue.compareTo(AbstractC0628y7.f25090b) >= 0) {
                break;
            }
            bigIntegerUnscaledValue = bigIntegerUnscaledValue.divide(BigInteger.TEN);
            i++;
        }
        Long lValueOf = Long.valueOf(bigIntegerUnscaledValue.longValue());
        Integer numValueOf = Integer.valueOf(i);
        long jLongValue = lValueOf.longValue();
        int iIntValue = numValueOf.intValue();
        rVar.f24669a = jLongValue;
        rVar.f24670b = iIntValue;
        c0470s.f24710b = rVar;
        Map<String, String> map = this.f22264a.payload;
        String strB = AbstractC0207hb.b(this.f22266c.a(map != null ? kotlin.collections.j0.m(map) : new LinkedHashMap()));
        Tm tm = this.f22268e;
        tm.getClass();
        byte[] bArrStringToBytesForProtobuf3 = StringUtils.stringToBytesForProtobuf(tm.a(strB));
        c0470s.f24718k = bArrStringToBytesForProtobuf3;
        int length2 = (StringUtils.stringToBytesForProtobuf(strB).length - bArrStringToBytesForProtobuf3.length) + length;
        if (this.f22265b) {
            c0470s.f24709a = "autocollected".getBytes(Charsets.UTF_8);
        }
        return new Pair(MessageNano.toByteArray(c0470s), Integer.valueOf(length2));
    }
}
