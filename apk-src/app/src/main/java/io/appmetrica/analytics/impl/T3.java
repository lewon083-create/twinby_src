package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class T3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IdentifiersResult f22986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IdentifiersResult f22987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentifiersResult f22988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IdentifiersResult f22989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IdentifiersResult f22990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IdentifiersResult f22991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IdentifiersResult f22992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final IdentifiersResult f22993h;
    public final IdentifiersResult i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IdentifiersResult f22994j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final IdentifiersResult f22995k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f22996l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f22997m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final W9 f22998n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Bundle f22999o;

    public T3(IdentifiersResult identifiersResult, IdentifiersResult identifiersResult2, IdentifiersResult identifiersResult3, IdentifiersResult identifiersResult4, IdentifiersResult identifiersResult5, IdentifiersResult identifiersResult6, IdentifiersResult identifiersResult7, IdentifiersResult identifiersResult8, IdentifiersResult identifiersResult9, IdentifiersResult identifiersResult10, IdentifiersResult identifiersResult11, long j10, long j11, W9 w92, Bundle bundle) {
        this.f22986a = identifiersResult;
        this.f22987b = identifiersResult2;
        this.f22988c = identifiersResult3;
        this.f22989d = identifiersResult4;
        this.f22990e = identifiersResult5;
        this.f22991f = identifiersResult6;
        this.f22992g = identifiersResult7;
        this.f22993h = identifiersResult8;
        this.i = identifiersResult9;
        this.f22994j = identifiersResult10;
        this.f22995k = identifiersResult11;
        this.f22996l = j10;
        this.f22997m = j11;
        this.f22998n = w92;
        this.f22999o = bundle;
    }

    public static IdentifiersResult a(Bundle bundle, String str) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle(str);
        ClassLoader classLoader = IdentifiersResult.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        IdentifiersResult identifiersResult = (IdentifiersResult) parcelable;
        return identifiersResult == null ? new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : identifiersResult;
    }

    public final void b(Bundle bundle) {
        IdentifiersResult identifiersResult = this.f22986a;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("value", identifiersResult);
        bundle.putBundle("Uuid", bundle2);
        IdentifiersResult identifiersResult2 = this.f22987b;
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("value", identifiersResult2);
        bundle.putBundle("DeviceId", bundle3);
        IdentifiersResult identifiersResult3 = this.f22988c;
        Bundle bundle4 = new Bundle();
        bundle4.putParcelable("value", identifiersResult3);
        bundle.putBundle("DeviceIdHash", bundle4);
        IdentifiersResult identifiersResult4 = this.f22989d;
        Bundle bundle5 = new Bundle();
        bundle5.putParcelable("value", identifiersResult4);
        bundle.putBundle("AdUrlReport", bundle5);
        IdentifiersResult identifiersResult5 = this.f22990e;
        Bundle bundle6 = new Bundle();
        bundle6.putParcelable("value", identifiersResult5);
        bundle.putBundle("AdUrlGet", bundle6);
        IdentifiersResult identifiersResult6 = this.f22991f;
        Bundle bundle7 = new Bundle();
        bundle7.putParcelable("value", identifiersResult6);
        bundle.putBundle("Clids", bundle7);
        IdentifiersResult identifiersResult7 = this.f22992g;
        Bundle bundle8 = new Bundle();
        bundle8.putParcelable("value", identifiersResult7);
        bundle.putBundle("RequestClids", bundle8);
        IdentifiersResult identifiersResult8 = this.f22993h;
        Bundle bundle9 = new Bundle();
        bundle9.putParcelable("value", identifiersResult8);
        bundle.putBundle("GAID", bundle9);
        IdentifiersResult identifiersResult9 = this.i;
        Bundle bundle10 = new Bundle();
        bundle10.putParcelable("value", identifiersResult9);
        bundle.putBundle("HOAID", bundle10);
        IdentifiersResult identifiersResult10 = this.f22994j;
        Bundle bundle11 = new Bundle();
        bundle11.putParcelable("value", identifiersResult10);
        bundle.putBundle("YANDEX_ADV_ID", bundle11);
        IdentifiersResult identifiersResult11 = this.f22995k;
        Bundle bundle12 = new Bundle();
        bundle12.putParcelable("value", identifiersResult11);
        bundle.putBundle("CUSTOM_SDK_HOSTS", bundle12);
        bundle.putLong("ServerTimeOffset", this.f22996l);
        bundle.putLong("NextStartupTime", this.f22997m);
        W9 w92 = this.f22998n;
        Bundle bundle13 = new Bundle();
        bundle13.putParcelable("value", w92);
        bundle.putBundle("features", bundle13);
        bundle.putBundle("module_configs", C0382oa.I.p().i());
    }

    public final String toString() {
        return "ClientIdentifiersHolder{mUuidData=" + this.f22986a + ", mDeviceIdData=" + this.f22987b + ", mDeviceIdHashData=" + this.f22988c + ", mReportAdUrlData=" + this.f22989d + ", mGetAdUrlData=" + this.f22990e + ", mResponseClidsData=" + this.f22991f + ", mClientClidsForRequestData=" + this.f22992g + ", mGaidData=" + this.f22993h + ", mHoaidData=" + this.i + ", yandexAdvIdData=" + this.f22994j + ", customSdkHostsData=" + this.f22995k + ", mServerTimeOffset=" + this.f22996l + ", nextStartupTime=" + this.f22997m + ", features=" + this.f22998n + ", modulesConfig=" + this.f22999o + '}';
    }

    public static W9 a(Bundle bundle) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle("features");
        ClassLoader classLoader = W9.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        W9 w92 = (W9) parcelable;
        return w92 == null ? new W9(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : w92;
    }

    public static IdentifiersResult a(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        return new IdentifiersResult(str, zIsEmpty ? IdentifierStatus.UNKNOWN : IdentifierStatus.OK, zIsEmpty ? "no identifier in startup state" : null);
    }

    public static W9 a(Boolean bool) {
        boolean z5 = bool != null;
        return new W9(bool, z5 ? IdentifierStatus.OK : IdentifierStatus.UNKNOWN, z5 ? null : "no identifier in startup state");
    }
}
