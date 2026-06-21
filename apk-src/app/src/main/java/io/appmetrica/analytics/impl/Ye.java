package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Ye extends AbstractC0634yd implements Ao {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Xe f23330d = new Xe("LOCATION_TRACKING_ENABLED", null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Xe f23331e = new Xe("PREF_KEY_OFFSET", null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Xe f23332f = new Xe("UNCHECKED_TIME", null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Xe f23333g = new Xe("STATISTICS_RESTRICTED_IN_MAIN", null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Xe f23334h = new Xe("LAST_IDENTITY_LIGHT_SEND_TIME", null);
    public static final Xe i = new Xe("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Xe f23335j = new Xe("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Xe f23336k = new Xe("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Xe f23337l = new Xe("LAST_REPORT_SEND_ATTEMPT_TIME", null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Xe f23338m = new Xe("LAST_LOCATION_SEND_ATTEMPT_TIME", null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Xe f23339n = new Xe("LAST_STARTUP_SEND_ATTEMPT_TIME", null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Xe f23340o = new Xe("SATELLITE_PRELOAD_INFO_CHECKED", null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Xe f23341p = new Xe("SATELLITE_CLIDS_CHECKED", null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Xe f23342q = new Xe("VITAL_DATA", null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Xe f23343r = new Xe("LAST_KOTLIN_VERSION_SEND_TIME", null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Xe f23344s = new Xe("ADV_IDENTIFIERS_TRACKING_ENABLED", null);

    public Ye(Ia ia2) {
        super(ia2);
    }

    public final long a(int i10) {
        return this.f23219a.getLong(f23331e.f23251b, i10);
    }

    public final boolean b(boolean z5) {
        return this.f23219a.getBoolean(f23332f.f23251b, z5);
    }

    public final Ye c(boolean z5) {
        return (Ye) b(f23333g.f23251b, z5);
    }

    public final Ye d(long j10) {
        return (Ye) b(f23331e.f23251b, j10);
    }

    public final boolean e() {
        return this.f23219a.getBoolean(f23330d.f23251b, false);
    }

    public final void f(boolean z5) {
        b(f23330d.f23251b, z5).b();
    }

    public final Ye g() {
        return (Ye) b(f23341p.f23251b, true);
    }

    public final Ye h() {
        return (Ye) b(f23340o.f23251b, true);
    }

    public final boolean i() {
        return this.f23219a.getBoolean(f23340o.f23251b, false);
    }

    public final boolean j() {
        return this.f23219a.getBoolean(f23341p.f23251b, false);
    }

    public final long a(long j10) {
        return this.f23219a.getLong(f23334h.f23251b, j10);
    }

    public final Ye b(long j10) {
        return (Ye) b(f23334h.f23251b, j10);
    }

    public final Ye c(long j10) {
        return (Ye) b(f23343r.f23251b, j10);
    }

    public final Ye d(boolean z5) {
        return (Ye) b(f23332f.f23251b, z5);
    }

    public final void e(boolean z5) {
        b(f23344s.f23251b, z5).b();
    }

    public final long f() {
        return this.f23219a.getLong(f23343r.f23251b, 0L);
    }

    @Override // io.appmetrica.analytics.impl.Ao
    public final String a() {
        return this.f23219a.getString(f23342q.f23251b, null);
    }

    public final Ye b(@NonNull Td td2, int i10) {
        Xe xe2;
        int iOrdinal = td2.ordinal();
        if (iOrdinal == 0) {
            xe2 = i;
        } else if (iOrdinal != 1) {
            xe2 = iOrdinal != 2 ? null : f23336k;
        } else {
            xe2 = f23335j;
        }
        return xe2 != null ? (Ye) b(xe2.f23251b, i10) : this;
    }

    @Override // io.appmetrica.analytics.impl.We
    @NonNull
    public final Set<String> c() {
        return this.f23219a.a();
    }

    public final Boolean d() {
        Xe xe2 = f23333g;
        if (!this.f23219a.a(xe2.f23251b)) {
            return null;
        }
        return Boolean.valueOf(this.f23219a.getBoolean(xe2.f23251b, true));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0634yd
    @NonNull
    public final String f(@NonNull String str) {
        return new Xe(str, null).f23251b;
    }

    @Override // io.appmetrica.analytics.impl.Ao
    public final void a(@NonNull String str) {
        b(f23342q.f23251b, str).b();
    }

    public final boolean a(boolean z5) {
        return this.f23219a.getBoolean(f23344s.f23251b, z5);
    }

    public final Ye b(@NonNull Td td2, long j10) {
        Xe xe2;
        int iOrdinal = td2.ordinal();
        if (iOrdinal == 0) {
            xe2 = f23337l;
        } else if (iOrdinal != 1) {
            xe2 = iOrdinal != 2 ? null : f23339n;
        } else {
            xe2 = f23338m;
        }
        return xe2 != null ? (Ye) b(xe2.f23251b, j10) : this;
    }

    public final int a(@NonNull Td td2, int i10) {
        Xe xe2;
        int iOrdinal = td2.ordinal();
        if (iOrdinal == 0) {
            xe2 = i;
        } else if (iOrdinal != 1) {
            xe2 = iOrdinal != 2 ? null : f23336k;
        } else {
            xe2 = f23335j;
        }
        if (xe2 == null) {
            return i10;
        }
        return this.f23219a.getInt(xe2.f23251b, i10);
    }

    public final long a(@NonNull Td td2, long j10) {
        Xe xe2;
        int iOrdinal = td2.ordinal();
        if (iOrdinal == 0) {
            xe2 = f23337l;
        } else if (iOrdinal != 1) {
            xe2 = iOrdinal != 2 ? null : f23339n;
        } else {
            xe2 = f23338m;
        }
        if (xe2 == null) {
            return j10;
        }
        return this.f23219a.getLong(xe2.f23251b, j10);
    }
}
