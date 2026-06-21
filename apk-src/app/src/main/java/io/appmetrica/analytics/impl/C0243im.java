package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.im, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0243im {
    public final Map A;
    public final C9 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f24094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f24097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f24098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f24099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f24100h;
    public final Map i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f24101j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f24102k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f24103l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0326m4 f24104m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f24105n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f24106o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f24107p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f24108q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Fm f24109r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0610xe f24110s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RetryPolicyConfig f24111t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f24112u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f24113v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f24114w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0121e3 f24115x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0349n2 f24116y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Bm f24117z;

    public C0243im(C0218hm c0218hm) {
        this.f24093a = c0218hm.f23999a;
        List list = c0218hm.f24000b;
        this.f24094b = list == null ? null : CollectionUtils.unmodifiableListCopy(list);
        this.f24095c = c0218hm.f24001c;
        this.f24096d = c0218hm.f24002d;
        this.f24097e = c0218hm.f24003e;
        List list2 = c0218hm.f24004f;
        this.f24098f = list2 == null ? null : CollectionUtils.unmodifiableListCopy(list2);
        List list3 = c0218hm.f24005g;
        this.f24099g = list3 == null ? null : CollectionUtils.unmodifiableListCopy(list3);
        List list4 = c0218hm.f24006h;
        this.f24100h = list4 == null ? null : CollectionUtils.unmodifiableListCopy(list4);
        Map map = c0218hm.i;
        this.i = map != null ? CollectionUtils.unmodifiableMapCopy(map) : null;
        this.f24101j = c0218hm.f24007j;
        this.f24102k = c0218hm.f24008k;
        this.f24104m = c0218hm.f24010m;
        this.f24110s = c0218hm.f24011n;
        this.f24105n = c0218hm.f24012o;
        this.f24106o = c0218hm.f24013p;
        this.f24103l = c0218hm.f24009l;
        this.f24107p = c0218hm.f24014q;
        this.f24108q = c0218hm.f24015r;
        this.f24109r = c0218hm.f24016s;
        this.f24112u = c0218hm.f24017t;
        this.f24113v = c0218hm.f24018u;
        this.f24114w = c0218hm.f24019v;
        RetryPolicyConfig retryPolicyConfig = c0218hm.f24020w;
        if (retryPolicyConfig == null) {
            C0568vm c0568vm = new C0568vm();
            this.f24111t = new RetryPolicyConfig(c0568vm.f24940w, c0568vm.f24941x);
        } else {
            this.f24111t = retryPolicyConfig;
        }
        this.f24115x = c0218hm.f24021x;
        this.f24116y = c0218hm.f24022y;
        this.f24117z = c0218hm.f24023z == null ? new Bm(J7.f22518b.f24815a) : c0218hm.f24023z;
        this.A = c0218hm.A == null ? Collections.EMPTY_MAP : c0218hm.A;
        this.B = c0218hm.B;
    }

    public final C0218hm a(C0326m4 c0326m4) {
        C0218hm c0218hm = new C0218hm(c0326m4);
        c0218hm.f23999a = this.f24093a;
        c0218hm.f24004f = this.f24098f;
        c0218hm.f24005g = this.f24099g;
        c0218hm.f24007j = this.f24101j;
        c0218hm.f24000b = this.f24094b;
        c0218hm.f24001c = this.f24095c;
        c0218hm.f24002d = this.f24096d;
        c0218hm.f24003e = this.f24097e;
        c0218hm.f24006h = this.f24100h;
        c0218hm.i = this.i;
        c0218hm.f24008k = this.f24102k;
        c0218hm.f24009l = this.f24103l;
        c0218hm.f24014q = this.f24107p;
        c0218hm.f24012o = this.f24105n;
        c0218hm.f24013p = this.f24106o;
        c0218hm.f24015r = this.f24108q;
        c0218hm.f24011n = this.f24110s;
        c0218hm.f24017t = this.f24112u;
        c0218hm.f24018u = this.f24113v;
        c0218hm.f24016s = this.f24109r;
        c0218hm.f24019v = this.f24114w;
        c0218hm.f24020w = this.f24111t;
        c0218hm.f24021x = this.f24115x;
        c0218hm.f24022y = this.f24116y;
        c0218hm.f24023z = this.f24117z;
        c0218hm.A = this.A;
        c0218hm.B = this.B;
        return c0218hm;
    }

    public final String toString() {
        return "StartupStateModel{uuid='" + this.f24093a + "', reportUrls=" + this.f24094b + ", getAdUrl='" + this.f24095c + "', reportAdUrl='" + this.f24096d + "', certificateUrl='" + this.f24097e + "', hostUrlsFromStartup=" + this.f24098f + ", hostUrlsFromClient=" + this.f24099g + ", diagnosticUrls=" + this.f24100h + ", customSdkHosts=" + this.i + ", encodedClidsFromResponse='" + this.f24101j + "', lastClientClidsForStartupRequest='" + this.f24102k + "', lastChosenForRequestClids='" + this.f24103l + "', collectingFlags=" + this.f24104m + ", obtainTime=" + this.f24105n + ", hadFirstStartup=" + this.f24106o + ", startupDidNotOverrideClids=" + this.f24107p + ", countryInit='" + this.f24108q + "', statSending=" + this.f24109r + ", permissionsCollectingConfig=" + this.f24110s + ", retryPolicyConfig=" + this.f24111t + ", obtainServerTime=" + this.f24112u + ", firstStartupServerTime=" + this.f24113v + ", outdated=" + this.f24114w + ", cacheControl=" + this.f24115x + ", attributionConfig=" + this.f24116y + ", startupUpdateConfig=" + this.f24117z + ", modulesRemoteConfigs=" + this.A + ", externalAttributionConfig=" + this.B + '}';
    }
}
