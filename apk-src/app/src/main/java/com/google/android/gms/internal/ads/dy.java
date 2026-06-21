package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.SentryBaseEvent;
import io.sentry.protocol.Device;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class dy {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final boolean f4723r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u9.a f4726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cl f4727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final el f4728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d1.b f4729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long[] f4730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String[] f4731h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4732j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4733k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4734l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4735m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public sx f4736n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4737o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4738p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f4739q;

    static {
        f4723r = q9.r.f31959g.f31964e.nextInt(100) < ((Integer) q9.s.f31967e.f31970c.a(al.Ud)).intValue();
    }

    public dy(Context context, u9.a aVar, String str, el elVar, cl clVar) {
        t9.q qVar = new t9.q();
        qVar.b("min_1", Double.MIN_VALUE, 1.0d);
        qVar.b("1_5", 1.0d, 5.0d);
        qVar.b("5_10", 5.0d, 10.0d);
        qVar.b("10_20", 10.0d, 20.0d);
        qVar.b("20_30", 20.0d, 30.0d);
        qVar.b("30_max", 30.0d, Double.MAX_VALUE);
        this.f4729f = new d1.b(qVar);
        this.i = false;
        this.f4732j = false;
        this.f4733k = false;
        this.f4734l = false;
        this.f4739q = -1L;
        this.f4724a = context;
        this.f4726c = aVar;
        this.f4725b = str;
        this.f4728e = elVar;
        this.f4727d = clVar;
        String str2 = (String) q9.s.f31967e.f31970c.a(al.f2933b0);
        if (str2 == null) {
            this.f4731h = new String[0];
            this.f4730g = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, StringUtils.COMMA);
        int length = strArrSplit.length;
        this.f4731h = new String[length];
        this.f4730g = new long[length];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                this.f4730g[i] = Long.parseLong(strArrSplit[i]);
            } catch (NumberFormatException e3) {
                u9.i.i("Unable to parse frame hash target time number.", e3);
                this.f4730g[i] = -1;
            }
        }
    }

    public final void a(sx sxVar) {
        cl clVar = this.f4727d;
        el elVar = this.f4728e;
        c80.g(elVar, clVar, "vpc2");
        this.i = true;
        elVar.c("vpn", sxVar.d());
        this.f4736n = sxVar;
    }

    public final void b() {
        Bundle bundleE;
        if (!f4723r || this.f4737o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString(SentryBaseEvent.JsonKeys.REQUEST, this.f4725b);
        bundle.putString("player", this.f4736n.d());
        d1.b bVar = this.f4729f;
        String[] strArr = (String[]) bVar.f15508d;
        ArrayList<t9.p> arrayList = new ArrayList(strArr.length);
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            double[] dArr = (double[]) bVar.f15510f;
            double[] dArr2 = (double[]) bVar.f15509e;
            int[] iArr = (int[]) bVar.f15511g;
            double d10 = dArr[i];
            double d11 = dArr2[i];
            int i10 = iArr[i];
            arrayList.add(new t9.p(str, d10, d11, ((double) i10) / ((double) bVar.f15507c), i10));
            i++;
            bVar = bVar;
            strArr = strArr;
        }
        for (t9.p pVar : arrayList) {
            String str2 = pVar.f33637a;
            String strValueOf = String.valueOf(str2);
            bundle.putString("fps_c_".concat(strValueOf), Integer.toString(pVar.f33641e));
            String strValueOf2 = String.valueOf(str2);
            bundle.putString("fps_p_".concat(strValueOf2), Double.toString(pVar.f33640d));
        }
        int i11 = 0;
        while (true) {
            long[] jArr = this.f4730g;
            if (i11 >= jArr.length) {
                break;
            }
            String str3 = this.f4731h[i11];
            if (str3 != null) {
                Long lValueOf = Long.valueOf(jArr[i11]);
                new StringBuilder(lValueOf.toString().length() + 3);
                bundle.putString("fh_".concat(lValueOf.toString()), str3);
            }
            i11++;
        }
        final t9.g0 g0Var = p9.k.C.f31297c;
        String str4 = this.f4726c.f34365b;
        AtomicReference atomicReference = g0Var.f33599c;
        bundle.putString(Device.TYPE, t9.g0.Q());
        wk wkVar = al.f2915a;
        q9.s sVar = q9.s.f31967e;
        bundle.putString("eids", TextUtils.join(StringUtils.COMMA, sVar.f31968a.w()));
        boolean zIsEmpty = bundle.isEmpty();
        final Context context = this.f4724a;
        if (zIsEmpty) {
            u9.i.c("Empty or null bundle.");
        } else {
            final String str5 = (String) sVar.f31970c.a(al.Mb);
            if (!g0Var.f33600d.getAndSet(true)) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: t9.f0
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str6) {
                        g0Var.f33599c.set(com.google.android.gms.internal.auth.m.E(context, str5));
                    }
                };
                if (TextUtils.isEmpty(str5)) {
                    bundleE = Bundle.EMPTY;
                } else {
                    PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    bundleE = com.google.android.gms.internal.auth.m.E(context, str5);
                }
                atomicReference.set(bundleE);
            }
            bundle.putAll((Bundle) atomicReference.get());
        }
        u9.d dVar = q9.r.f31959g.f31960a;
        u9.d.a(context, str4, bundle, new r3.b(11, context, str4));
        this.f4737o = true;
    }

    public final void c(sx sxVar) {
        if (this.f4733k && !this.f4734l) {
            if (t9.c0.o() && !this.f4734l) {
                t9.c0.m("VideoMetricsMixin first frame");
            }
            c80.g(this.f4728e, this.f4727d, "vff2");
            this.f4734l = true;
        }
        p9.k.C.f31304k.getClass();
        long jNanoTime = System.nanoTime();
        if (this.f4735m && this.f4738p && this.f4739q != -1) {
            double nanos = TimeUnit.SECONDS.toNanos(1L) / (jNanoTime - this.f4739q);
            d1.b bVar = this.f4729f;
            bVar.f15507c++;
            int i = 0;
            while (true) {
                double[] dArr = (double[]) bVar.f15510f;
                if (i >= dArr.length) {
                    break;
                }
                double d10 = dArr[i];
                if (d10 <= nanos && nanos < ((double[]) bVar.f15509e)[i]) {
                    int[] iArr = (int[]) bVar.f15511g;
                    iArr[i] = iArr[i] + 1;
                }
                if (nanos < d10) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f4738p = this.f4735m;
        this.f4739q = jNanoTime;
        long jLongValue = ((Long) q9.s.f31967e.f31970c.a(al.f2949c0)).longValue();
        long jK = sxVar.k();
        int i10 = 0;
        while (true) {
            String[] strArr = this.f4731h;
            if (i10 >= strArr.length) {
                return;
            }
            if (strArr[i10] == null && jLongValue > Math.abs(jK - this.f4730g[i10])) {
                int i11 = 8;
                Bitmap bitmap = sxVar.getBitmap(8, 8);
                long j10 = 63;
                int i12 = 0;
                long j11 = 0;
                while (i12 < i11) {
                    int i13 = 0;
                    while (i13 < i11) {
                        int pixel = bitmap.getPixel(i13, i12);
                        j11 |= (Color.green(pixel) + (Color.red(pixel) + Color.blue(pixel)) > 128 ? 1L : 0L) << ((int) j10);
                        j10--;
                        i13++;
                        i11 = 8;
                    }
                    i12++;
                    i11 = 8;
                }
                strArr[i10] = String.format("%016X", Long.valueOf(j11));
                return;
            }
            i10++;
        }
    }

    public final void d() {
        this.f4735m = true;
        if (!this.f4732j || this.f4733k) {
            return;
        }
        c80.g(this.f4728e, this.f4727d, "vfp2");
        this.f4733k = true;
    }
}
