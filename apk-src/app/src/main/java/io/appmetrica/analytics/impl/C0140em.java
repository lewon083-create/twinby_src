package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.em, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0140em {
    public final Map A;
    public final C9 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0243im f23787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f23788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f23789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f23790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f23791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f23792h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f23793j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f23794k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f23795l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f23796m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0326m4 f23797n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f23798o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f23799p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f23800q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f23801r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0610xe f23802s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RetryPolicyConfig f23803t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f23804u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f23805v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f23806w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0121e3 f23807x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0349n2 f23808y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Bm f23809z;

    public C0140em(String str, String str2, C0243im c0243im) {
        this.f23785a = str;
        this.f23786b = str2;
        this.f23787c = c0243im;
        this.f23788d = c0243im.f24093a;
        this.f23789e = c0243im.f24094b;
        this.f23790f = c0243im.f24098f;
        this.f23791g = c0243im.f24099g;
        this.f23792h = c0243im.i;
        this.i = c0243im.f24095c;
        this.f23793j = c0243im.f24096d;
        this.f23794k = c0243im.f24101j;
        this.f23795l = c0243im.f24102k;
        this.f23796m = c0243im.f24103l;
        this.f23797n = c0243im.f24104m;
        this.f23798o = c0243im.f24105n;
        this.f23799p = c0243im.f24106o;
        this.f23800q = c0243im.f24107p;
        this.f23801r = c0243im.f24108q;
        this.f23802s = c0243im.f24110s;
        this.f23803t = c0243im.f24111t;
        this.f23804u = c0243im.f24112u;
        this.f23805v = c0243im.f24113v;
        this.f23806w = c0243im.f24114w;
        this.f23807x = c0243im.f24115x;
        this.f23808y = c0243im.f24116y;
        this.f23809z = c0243im.f24117z;
        this.A = c0243im.A;
        this.B = c0243im.B;
    }

    public final String a() {
        return this.f23785a;
    }

    public final String b() {
        return this.f23786b;
    }

    public final String c() {
        return this.f23788d;
    }

    public final String toString() {
        return "StartupState(deviceId=" + this.f23785a + ", deviceIdHash=" + this.f23786b + ", startupStateModel=" + this.f23787c + ')';
    }
}
