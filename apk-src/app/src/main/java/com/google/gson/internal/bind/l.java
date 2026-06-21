package com.google.gson.internal.bind;

import com.google.android.gms.internal.ads.fm1;
import com.google.android.gms.internal.ads.gm1;
import io.sentry.metrics.MetricsUnit;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import me.r;
import me.s;
import me.t;
import me.w;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14980a;

    public /* synthetic */ l(int i) {
        this.f14980a = i;
    }

    public static me.p c(re.b bVar) {
        int iM = z.m(bVar.s());
        if (iM == 0) {
            me.m mVar = new me.m();
            bVar.beginArray();
            while (bVar.hasNext()) {
                mVar.f28893b.add(c(bVar));
            }
            bVar.endArray();
            return mVar;
        }
        if (iM == 2) {
            s sVar = new s();
            bVar.beginObject();
            while (bVar.hasNext()) {
                sVar.f28895b.put(bVar.nextName(), c(bVar));
            }
            bVar.endObject();
            return sVar;
        }
        if (iM == 5) {
            return new t(bVar.nextString());
        }
        if (iM == 6) {
            return new t(new oe.g(bVar.nextString()));
        }
        if (iM == 7) {
            return new t(Boolean.valueOf(bVar.nextBoolean()));
        }
        if (iM != 8) {
            throw new IllegalArgumentException();
        }
        bVar.nextNull();
        return r.f28894b;
    }

    public static void d(re.c cVar, me.p pVar) {
        if (pVar == null || (pVar instanceof r)) {
            cVar.i();
            return;
        }
        boolean z5 = pVar instanceof t;
        if (z5) {
            if (!z5) {
                throw new IllegalStateException("Not a JSON Primitive: " + pVar);
            }
            t tVar = (t) pVar;
            Serializable serializable = tVar.f28896b;
            if (serializable instanceof Number) {
                cVar.m(tVar.g());
                return;
            } else if (serializable instanceof Boolean) {
                cVar.I(tVar.f());
                return;
            } else {
                cVar.s(tVar.e());
                return;
            }
        }
        boolean z10 = pVar instanceof me.m;
        if (z10) {
            cVar.beginArray();
            if (!z10) {
                throw new IllegalStateException("Not a JSON Array: " + pVar);
            }
            Iterator it = ((me.m) pVar).f28893b.iterator();
            while (it.hasNext()) {
                d(cVar, (me.p) it.next());
            }
            cVar.endArray();
            return;
        }
        if (!(pVar instanceof s)) {
            throw new IllegalArgumentException("Couldn't write " + pVar.getClass());
        }
        cVar.beginObject();
        Iterator it2 = ((oe.i) pVar.a().f28895b.entrySet()).iterator();
        while (((fm1) it2).hasNext()) {
            gm1 gm1VarA = ((oe.h) it2).a();
            cVar.d((String) gm1VarA.getKey());
            d(cVar, (me.p) gm1VarA.getValue());
        }
        cVar.endObject();
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x010a  */
    @Override // me.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(re.b r10) {
        /*
            Method dump skipped, instruction units count: 1078
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.l.a(re.b):java.lang.Object");
    }

    @Override // me.w
    public final void b(re.c cVar, Object obj) throws IOException {
        switch (this.f14980a) {
            case 0:
                cVar.beginArray();
                int length = ((AtomicIntegerArray) obj).length();
                for (int i = 0; i < length; i++) {
                    cVar.l(r6.get(i));
                }
                cVar.endArray();
                return;
            case 1:
                cVar.m((Number) obj);
                return;
            case 2:
                cVar.m((Number) obj);
                return;
            case 3:
                cVar.m((Number) obj);
                return;
            case 4:
                cVar.m((Number) obj);
                return;
            case 5:
                Character ch2 = (Character) obj;
                cVar.s(ch2 == null ? null : String.valueOf(ch2));
                return;
            case 6:
                cVar.s((String) obj);
                return;
            case 7:
                cVar.m((BigDecimal) obj);
                return;
            case 8:
                cVar.m((BigInteger) obj);
                return;
            case 9:
                StringBuilder sb2 = (StringBuilder) obj;
                cVar.s(sb2 == null ? null : sb2.toString());
                return;
            case 10:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            case 11:
                StringBuffer stringBuffer = (StringBuffer) obj;
                cVar.s(stringBuffer == null ? null : stringBuffer.toString());
                return;
            case 12:
                URL url = (URL) obj;
                cVar.s(url == null ? null : url.toExternalForm());
                return;
            case 13:
                URI uri = (URI) obj;
                cVar.s(uri == null ? null : uri.toASCIIString());
                return;
            case 14:
                InetAddress inetAddress = (InetAddress) obj;
                cVar.s(inetAddress == null ? null : inetAddress.getHostAddress());
                return;
            case 15:
                UUID uuid = (UUID) obj;
                cVar.s(uuid == null ? null : uuid.toString());
                return;
            case 16:
                cVar.s(((Currency) obj).getCurrencyCode());
                return;
            case 17:
                if (((Calendar) obj) == null) {
                    cVar.i();
                    return;
                }
                cVar.beginObject();
                cVar.d("year");
                cVar.l(r6.get(1));
                cVar.d("month");
                cVar.l(r6.get(2));
                cVar.d("dayOfMonth");
                cVar.l(r6.get(5));
                cVar.d("hourOfDay");
                cVar.l(r6.get(11));
                cVar.d(MetricsUnit.Duration.MINUTE);
                cVar.l(r6.get(12));
                cVar.d(MetricsUnit.Duration.SECOND);
                cVar.l(r6.get(13));
                cVar.endObject();
                return;
            case 18:
                Locale locale = (Locale) obj;
                cVar.s(locale == null ? null : locale.toString());
                return;
            case 19:
                d(cVar, (me.p) obj);
                return;
            case 20:
                BitSet bitSet = (BitSet) obj;
                cVar.beginArray();
                int length2 = bitSet.length();
                for (int i10 = 0; i10 < length2; i10++) {
                    cVar.l(bitSet.get(i10) ? 1L : 0L);
                }
                cVar.endArray();
                return;
            case 21:
                Boolean bool = (Boolean) obj;
                if (bool == null) {
                    cVar.i();
                    return;
                }
                cVar.J();
                cVar.a();
                cVar.f32313b.write(bool.booleanValue() ? "true" : "false");
                return;
            case 22:
                Boolean bool2 = (Boolean) obj;
                cVar.s(bool2 == null ? "null" : bool2.toString());
                return;
            case 23:
                cVar.m((Number) obj);
                return;
            case 24:
                cVar.m((Number) obj);
                return;
            case 25:
                cVar.m((Number) obj);
                return;
            case 26:
                cVar.l(((AtomicInteger) obj).get());
                return;
            case 27:
                cVar.I(((AtomicBoolean) obj).get());
                return;
            default:
                Number number = (Number) obj;
                if (number == null) {
                    cVar.i();
                    return;
                } else {
                    me.k.a(number.doubleValue());
                    cVar.m(number);
                    return;
                }
        }
    }
}
