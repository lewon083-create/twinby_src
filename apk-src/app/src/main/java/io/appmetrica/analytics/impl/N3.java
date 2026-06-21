package io.appmetrica.analytics.impl;

import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class N3 extends Q5 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HashMap f22711q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Wm f22712r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Tm f22713s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Tm f22714t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0018a3 f22715u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Wm f22716v;

    public N3(@NonNull PublicLogger publicLogger) {
        this.f22711q = new HashMap();
        a(publicLogger);
    }

    public static Q5 b(String str, String str2) {
        Q5 q5 = new Q5("", 0);
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        q5.f22863d = 5376;
        q5.a(str, str2);
        return q5;
    }

    public static Q5 n() {
        Q5 q5 = new Q5("", 0);
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        q5.f22863d = 5632;
        return q5;
    }

    public static Q5 o() {
        Q5 q5 = new Q5("", 0);
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        q5.f22863d = 40961;
        return q5;
    }

    public final void a(String str, String str2, M3 m32) {
        if (StringUtils.equalsNullSafety(str, str2)) {
            this.f22711q.remove(m32);
        } else {
            this.f22711q.put(m32, Integer.valueOf(StringUtils.getUTF8Bytes(str).length - StringUtils.getUTF8Bytes(str2).length));
        }
        Iterator it = this.f22711q.values().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Integer) it.next()).intValue();
        }
        this.f22866g = iIntValue;
    }

    @Override // io.appmetrica.analytics.impl.Q5
    @NonNull
    public final void c(String str) {
        Wm wm = this.f22716v;
        wm.getClass();
        this.f22867h = wm.a(str);
    }

    public final String d(String str) {
        Wm wm = this.f22712r;
        wm.getClass();
        String strA = wm.a(str);
        a(str, strA, M3.NAME);
        return strA;
    }

    public final String e(String str) {
        Tm tm = this.f22713s;
        tm.getClass();
        String strA = tm.a(str);
        a(str, strA, M3.VALUE);
        return strA;
    }

    public final N3 f(@NonNull String str) {
        Tm tm = this.f22714t;
        tm.getClass();
        String strA = tm.a(str);
        a(str, strA, M3.VALUE);
        this.f22861b = strA;
        return this;
    }

    @NonNull
    public final HashMap<M3, Integer> p() {
        return this.f22711q;
    }

    @Override // io.appmetrica.analytics.impl.Q5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setName(String str) {
        this.f22860a = d(str);
    }

    @Override // io.appmetrica.analytics.impl.Q5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValue(String str) {
        this.f22861b = e(str);
    }

    @Override // io.appmetrica.analytics.impl.Q5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValueBytes(byte[] bArr) {
        a(bArr);
    }

    public N3(String str, int i, @NonNull PublicLogger publicLogger) {
        this("", str, i, publicLogger);
    }

    public N3(String str, String str2, int i, @NonNull PublicLogger publicLogger) {
        this(str, str2, i, 0, publicLogger);
    }

    public N3(String str, String str2, int i, int i10, @NonNull PublicLogger publicLogger) {
        this.f22711q = new HashMap();
        a(publicLogger);
        this.f22861b = e(str);
        this.f22860a = d(str2);
        setType(i);
        setCustomType(i10);
    }

    public final N3 a(@NonNull HashMap<M3, Integer> map) {
        this.f22711q = map;
        return this;
    }

    public final void a(PublicLogger publicLogger) {
        this.f22712r = new Wm(1000, "event name", publicLogger);
        this.f22713s = new Tm(245760, "event value", publicLogger);
        this.f22714t = new Tm(1024000, "event extended value", publicLogger);
        this.f22715u = new C0018a3(245760, "event value bytes", publicLogger);
        this.f22716v = new Wm(VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM, "user profile id", publicLogger);
    }

    public N3(byte[] bArr, String str, int i, @NonNull PublicLogger publicLogger) {
        this.f22711q = new HashMap();
        a(publicLogger);
        a(bArr);
        this.f22860a = d(str);
        setType(i);
    }

    public final void a(byte[] bArr) {
        C0018a3 c0018a3 = this.f22715u;
        c0018a3.getClass();
        byte[] bArrA = c0018a3.a(bArr);
        M3 m32 = M3.VALUE;
        if (bArr.length != bArrA.length) {
            this.f22711q.put(m32, Integer.valueOf(bArr.length - bArrA.length));
        } else {
            this.f22711q.remove(m32);
        }
        Iterator it = this.f22711q.values().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Integer) it.next()).intValue();
        }
        this.f22866g = iIntValue;
        super.setValueBytes(bArrA);
    }

    public static Q5 a(@NonNull C0220ho c0220ho) {
        Q5 q5O = o();
        q5O.setValue(new String(Base64.encode(MessageNano.toByteArray(c0220ho), 0)));
        return q5O;
    }

    public static N3 a(PublicLogger publicLogger, Ni ni2) {
        int length;
        N3 n32 = new N3(publicLogger);
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        n32.f22863d = 40976;
        Li li2 = new Li();
        li2.f22625b = ni2.f22741a.currency.getCurrencyCode().getBytes();
        li2.f22629f = ni2.f22741a.priceMicros;
        li2.f22626c = StringUtils.stringToBytesForProtobuf(new Wm(VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM, "revenue productID", ni2.f22745e).a(ni2.f22741a.productID));
        li2.f22624a = ((Integer) WrapUtils.getOrDefault(ni2.f22741a.quantity, 1)).intValue();
        Tm tm = ni2.f22742b;
        String str = ni2.f22741a.payload;
        tm.getClass();
        li2.f22627d = StringUtils.stringToBytesForProtobuf(tm.a(str));
        if (ko.a(ni2.f22741a.receipt)) {
            Gi gi = new Gi();
            String str2 = (String) ni2.f22743c.a(ni2.f22741a.receipt.data);
            length = !StringUtils.equalsNullSafety(ni2.f22741a.receipt.data, str2) ? ni2.f22741a.receipt.data.length() : 0;
            String str3 = (String) ni2.f22744d.a(ni2.f22741a.receipt.signature);
            gi.f22394a = StringUtils.stringToBytesForProtobuf(str2);
            gi.f22395b = StringUtils.stringToBytesForProtobuf(str3);
            li2.f22628e = gi;
        } else {
            length = 0;
        }
        Pair pair = new Pair(MessageNano.toByteArray(li2), Integer.valueOf(length));
        n32.f22861b = n32.e(new String(Base64.encode((byte[]) pair.first, 0)));
        n32.f22866g = ((Integer) pair.second).intValue();
        return n32;
    }

    public static N3 a(PublicLogger publicLogger, E e3) {
        N3 n32 = new N3(publicLogger);
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        n32.f22863d = 40977;
        kotlin.Pair pairA = e3.a();
        n32.f22861b = n32.e(new String(Base64.encode((byte[]) pairA.f27469b, 0)));
        n32.f22866g = ((Integer) pairA.f27470c).intValue();
        return n32;
    }
}
