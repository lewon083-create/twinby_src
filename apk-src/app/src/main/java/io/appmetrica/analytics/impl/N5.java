package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class N5 extends BaseRequestConfig.ComponentLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SafePackageManager f22718a;

    public N5(@NonNull Context context, @NonNull String str) {
        this(context, str, new SafePackageManager());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* JADX INFO: renamed from: a */
    public O5 load(@NonNull M5 m52) {
        O5 o52 = (O5) super.load(m52);
        String packageName = getContext().getPackageName();
        ApplicationInfo applicationInfo = this.f22718a.getApplicationInfo(getContext(), getPackageName(), 0);
        if (applicationInfo != null) {
            int i = applicationInfo.flags;
            o52.f22771a = (i & 2) != 0 ? "1" : CommonUrlParts.Values.FALSE_INTEGER;
            o52.f22772b = (i & 1) == 0 ? CommonUrlParts.Values.FALSE_INTEGER : "1";
        } else if (TextUtils.equals(packageName, getPackageName())) {
            o52.f22771a = (getContext().getApplicationInfo().flags & 2) != 0 ? "1" : CommonUrlParts.Values.FALSE_INTEGER;
            o52.f22772b = (getContext().getApplicationInfo().flags & 1) == 0 ? CommonUrlParts.Values.FALSE_INTEGER : "1";
        } else {
            o52.f22771a = CommonUrlParts.Values.FALSE_INTEGER;
            o52.f22772b = CommonUrlParts.Values.FALSE_INTEGER;
        }
        C0140em c0140em = m52.f22651a;
        o52.f22773c = c0140em;
        o52.setRetryPolicyConfig(c0140em.f23803t);
        return o52;
    }

    public N5(@NonNull Context context, @NonNull String str, @NonNull SafePackageManager safePackageManager) {
        super(context, str);
        this.f22718a = safePackageManager;
    }
}
