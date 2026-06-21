package wd;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.internal.ads.cx0;
import com.google.android.gms.internal.ads.om1;
import hk.c0;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import p2.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t2.e f35245b = ya.e.r("fire-global");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t2.e f35246c = ya.e.r("fire-count");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t2.e f35247d = ya.e.A("last-used-date");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final od.b f35248a;

    public i(Context context, String str) {
        this.f35248a = new od.b(context, om1.k("FirebaseHeartBeat", str));
    }

    public final synchronized ArrayList a() {
        try {
            ArrayList arrayList = new ArrayList();
            String strB = b(System.currentTimeMillis());
            od.b bVar = this.f35248a;
            bVar.getClass();
            for (Map.Entry entry : ((Map) c0.p(new o(bVar, null, 3))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strB);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new a(((t2.e) entry.getKey()).f33403a, new ArrayList(hashSet)));
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f35248a.a(new fj.h(jCurrentTimeMillis, 2));
            }
            return arrayList;
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public final synchronized String b(long j10) {
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
        }
        Instant instant = new Date(j10).toInstant();
        ZoneOffset unused = ZoneOffset.UTC;
        LocalDateTime localDateTime = instant.atOffset(ZoneOffset.UTC).toLocalDateTime();
        DateTimeFormatter unused2 = DateTimeFormatter.ISO_LOCAL_DATE;
        return localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public final synchronized t2.e c(t2.b bVar, String str) {
        for (Map.Entry entry : bVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return ya.e.B(((t2.e) entry.getKey()).f33403a);
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void d(t2.b bVar, String str) {
        try {
            t2.e key = c(bVar, str);
            if (key == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) a0.e.h(bVar, key, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                bVar.d(key);
            } else {
                Intrinsics.checkNotNullParameter(key, "key");
                bVar.f(key, hashSet);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean e(t2.e key, long j10) {
        mj.a aVar;
        long jLongValue;
        od.b bVar = this.f35248a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        aVar = null;
        jLongValue = ((Long) c0.p(new cx0(bVar, key, aVar, 8))).longValue();
        synchronized (this) {
        }
        if (b(jLongValue).equals(b(j10))) {
            return false;
        }
        od.b bVar2 = this.f35248a;
        Long lValueOf = Long.valueOf(j10);
        bVar2.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        return true;
    }
}
